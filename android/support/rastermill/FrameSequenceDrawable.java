package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.rastermill.FrameSequence;

/* compiled from: PG */
public class FrameSequenceDrawable extends Drawable implements Animatable, Runnable {
    private static final long DEFAULT_DELAY_MS = 100;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_FINITE = 1;
    public static final int LOOP_INF = 2;
    @Deprecated
    public static final int LOOP_ONCE = 1;
    private static final long MIN_DELAY_MS = 20;
    private static final int STATE_DECODING = 2;
    private static final int STATE_READY_TO_SWAP = 4;
    private static final int STATE_SCHEDULED = 1;
    private static final int STATE_WAITING_TO_SWAP = 3;
    private static final String TAG = "FrameSequence";
    private static BitmapProvider sAllocatingBitmapProvider = new BitmapProvider() {
        public Bitmap acquireBitmap(int i, int i2) {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }

        public void releaseBitmap(Bitmap bitmap) {
        }
    };
    private static HandlerThread sDecodingThread;
    private static Handler sDecodingThreadHandler;
    private static final Object sLock = new Object();
    /* access modifiers changed from: private */
    public static final Handler sMainHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public Bitmap mBackBitmap;
    private BitmapShader mBackBitmapShader;
    /* access modifiers changed from: private */
    public final BitmapProvider mBitmapProvider;
    private boolean mCircleMaskEnabled;
    private int mCornerRadiusPx;
    private int mCurrentLoop;
    private final Runnable mDecodeRunnable;
    /* access modifiers changed from: private */
    public boolean mDestroyed;
    private final Runnable mFinishedCallbackRunnable;
    private final FrameSequence mFrameSequence;
    /* access modifiers changed from: private */
    public final FrameSequence.State mFrameSequenceState;
    private Bitmap mFrontBitmap;
    private BitmapShader mFrontBitmapShader;
    /* access modifiers changed from: private */
    public long mLastSwap;
    /* access modifiers changed from: private */
    public final Object mLock;
    private int mLoopBehavior;
    private int mLoopCount;
    /* access modifiers changed from: private */
    public int mNextFrameToDecode;
    /* access modifiers changed from: private */
    public long mNextSwap;
    /* access modifiers changed from: private */
    public OnFinishedListener mOnFinishedListener;
    private final Paint mPaint;
    private final Rect mSrcRect;
    /* access modifiers changed from: private */
    public int mState;
    private final RectF mTempRectF;
    /* access modifiers changed from: private */
    public final Runnable mUiScheduleRunnable;

    /* compiled from: PG */
    public interface BitmapProvider {
        Bitmap acquireBitmap(int i, int i2);

        void releaseBitmap(Bitmap bitmap);
    }

    /* compiled from: PG */
    public interface OnFinishedListener {
        void onFinished(FrameSequenceDrawable frameSequenceDrawable);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence) {
        this(frameSequence, sAllocatingBitmapProvider);
    }

    private static Bitmap acquireAndValidateBitmap(BitmapProvider bitmapProvider, int i, int i2) {
        Bitmap acquireBitmap = bitmapProvider.acquireBitmap(i, i2);
        if (acquireBitmap.getWidth() >= i && acquireBitmap.getHeight() >= i2 && acquireBitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return acquireBitmap;
        }
        throw new IllegalArgumentException("Invalid bitmap provided");
    }

    private void checkDestroyedLocked() {
        if (this.mDestroyed) {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        }
    }

    private static void initializeDecodingThread() {
        synchronized (sLock) {
            if (sDecodingThread == null) {
                HandlerThread handlerThread = new HandlerThread("FrameSequence decoding thread", 10);
                sDecodingThread = handlerThread;
                handlerThread.start();
                sDecodingThreadHandler = new Handler(sDecodingThread.getLooper());
            }
        }
    }

    private void scheduleDecodeLocked() {
        this.mState = 1;
        this.mNextFrameToDecode = (this.mNextFrameToDecode + 1) % this.mFrameSequence.getFrameCount();
        sDecodingThreadHandler.post(this.mDecodeRunnable);
    }

    public void destroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.mBitmapProvider != null) {
            synchronized (this.mLock) {
                checkDestroyedLocked();
                bitmap = this.mFrontBitmap;
                bitmap2 = null;
                this.mFrontBitmap = null;
                if (this.mState != 2) {
                    Bitmap bitmap3 = this.mBackBitmap;
                    this.mBackBitmap = null;
                    bitmap2 = bitmap3;
                }
                this.mDestroyed = true;
            }
            this.mBitmapProvider.releaseBitmap(bitmap);
            if (bitmap2 != null) {
                this.mBitmapProvider.releaseBitmap(bitmap2);
                return;
            }
            return;
        }
        throw new IllegalStateException("BitmapProvider must be non-null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r1 == r10.mFrameSequence.getDefaultLoopCount()) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.mLock
            monitor-enter(r0)
            r10.checkDestroyedLocked()     // Catch:{ all -> 0x0105 }
            int r1 = r10.mState     // Catch:{ all -> 0x0105 }
            r2 = 4
            r3 = 0
            r5 = 3
            if (r1 != r5) goto L_0x001b
            long r6 = r10.mNextSwap     // Catch:{ all -> 0x0105 }
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0105 }
            long r6 = r6 - r8
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x001b
            r10.mState = r2     // Catch:{ all -> 0x0105 }
        L_0x001b:
            boolean r1 = r10.isRunning()     // Catch:{ all -> 0x0105 }
            if (r1 == 0) goto L_0x0069
            int r1 = r10.mState     // Catch:{ all -> 0x0105 }
            if (r1 != r2) goto L_0x0069
            android.graphics.Bitmap r1 = r10.mBackBitmap     // Catch:{ all -> 0x0105 }
            android.graphics.Bitmap r2 = r10.mFrontBitmap     // Catch:{ all -> 0x0105 }
            r10.mBackBitmap = r2     // Catch:{ all -> 0x0105 }
            r10.mFrontBitmap = r1     // Catch:{ all -> 0x0105 }
            android.graphics.BitmapShader r1 = r10.mBackBitmapShader     // Catch:{ all -> 0x0105 }
            android.graphics.BitmapShader r2 = r10.mFrontBitmapShader     // Catch:{ all -> 0x0105 }
            r10.mBackBitmapShader = r2     // Catch:{ all -> 0x0105 }
            r10.mFrontBitmapShader = r1     // Catch:{ all -> 0x0105 }
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0105 }
            r10.mLastSwap = r1     // Catch:{ all -> 0x0105 }
            int r1 = r10.mNextFrameToDecode     // Catch:{ all -> 0x0105 }
            android.support.rastermill.FrameSequence r2 = r10.mFrameSequence     // Catch:{ all -> 0x0105 }
            int r2 = r2.getFrameCount()     // Catch:{ all -> 0x0105 }
            int r2 = r2 + -1
            if (r1 != r2) goto L_0x0066
            int r1 = r10.mCurrentLoop     // Catch:{ all -> 0x0105 }
            r2 = 1
            int r1 = r1 + r2
            r10.mCurrentLoop = r1     // Catch:{ all -> 0x0105 }
            int r6 = r10.mLoopBehavior     // Catch:{ all -> 0x0105 }
            if (r6 != r2) goto L_0x0056
            int r2 = r10.mLoopCount     // Catch:{ all -> 0x0105 }
            if (r1 == r2) goto L_0x0060
            goto L_0x0066
        L_0x0056:
            if (r6 != r5) goto L_0x0066
            android.support.rastermill.FrameSequence r2 = r10.mFrameSequence     // Catch:{ all -> 0x0105 }
            int r2 = r2.getDefaultLoopCount()     // Catch:{ all -> 0x0105 }
            if (r1 != r2) goto L_0x0066
        L_0x0060:
            java.lang.Runnable r1 = r10.mFinishedCallbackRunnable     // Catch:{ all -> 0x0105 }
            r10.scheduleSelf(r1, r3)     // Catch:{ all -> 0x0105 }
            goto L_0x0069
        L_0x0066:
            r10.scheduleDecodeLocked()     // Catch:{ all -> 0x0105 }
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            boolean r0 = r10.mCircleMaskEnabled
            if (r0 != 0) goto L_0x0087
            int r0 = r10.mCornerRadiusPx
            if (r0 <= 0) goto L_0x0073
            goto L_0x0087
        L_0x0073:
            android.graphics.Paint r0 = r10.mPaint
            r1 = 0
            r0.setShader(r1)
            android.graphics.Bitmap r0 = r10.mFrontBitmap
            android.graphics.Rect r1 = r10.mSrcRect
            android.graphics.Rect r2 = r10.getBounds()
            android.graphics.Paint r3 = r10.mPaint
            r11.drawBitmap(r0, r1, r2, r3)
            return
        L_0x0087:
            android.graphics.Rect r0 = r10.getBounds()
            int r1 = r10.getIntrinsicWidth()
            int r2 = r10.getIntrinsicHeight()
            float r1 = (float) r1
            int r3 = r0.width()
            float r3 = (float) r3
            float r3 = r3 / r1
            float r2 = (float) r2
            int r4 = r0.height()
            float r4 = (float) r4
            float r4 = r4 / r2
            r11.save()
            int r5 = r0.left
            float r5 = (float) r5
            int r6 = r0.top
            float r6 = (float) r6
            r11.translate(r5, r6)
            r11.scale(r3, r4)
            android.graphics.Paint r5 = r10.mPaint
            android.graphics.BitmapShader r6 = r10.mFrontBitmapShader
            r5.setShader(r6)
            boolean r5 = r10.mCircleMaskEnabled
            if (r5 == 0) goto L_0x00e4
            int r5 = r0.width()
            int r0 = r0.height()
            int r0 = java.lang.Math.min(r5, r0)
            float r0 = (float) r0
            float r3 = r0 / r3
            float r0 = r0 / r4
            android.graphics.RectF r4 = r10.mTempRectF
            float r5 = r1 - r3
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r7 = r2 - r0
            float r7 = r7 / r6
            float r1 = r1 + r3
            float r1 = r1 / r6
            float r2 = r2 + r0
            float r2 = r2 / r6
            r4.set(r5, r7, r1, r2)
            android.graphics.RectF r0 = r10.mTempRectF
            android.graphics.Paint r1 = r10.mPaint
            r11.drawOval(r0, r1)
            goto L_0x0101
        L_0x00e4:
            android.graphics.RectF r0 = r10.mTempRectF
            int r1 = r10.getIntrinsicWidth()
            float r1 = (float) r1
            int r2 = r10.getIntrinsicHeight()
            float r2 = (float) r2
            r5 = 0
            r0.set(r5, r5, r1, r2)
            int r0 = r10.mCornerRadiusPx
            float r0 = (float) r0
            android.graphics.RectF r1 = r10.mTempRectF
            float r2 = r0 / r3
            float r0 = r0 / r4
            android.graphics.Paint r3 = r10.mPaint
            r11.drawRoundRect(r1, r2, r0, r3)
        L_0x0101:
            r11.restore()
            return
        L_0x0105:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0105 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.rastermill.FrameSequenceDrawable.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            this.mFrameSequenceState.destroy();
        } finally {
            super.finalize();
        }
    }

    public final boolean getCircleMaskEnabled() {
        return this.mCircleMaskEnabled;
    }

    public int getIntrinsicHeight() {
        return this.mFrameSequence.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.mFrameSequence.getWidth();
    }

    public int getOpacity() {
        return this.mFrameSequence.isOpaque() ? -1 : -2;
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mDestroyed;
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0 && !this.mDestroyed) {
                z = true;
            }
        }
        return z;
    }

    public void run() {
        boolean z;
        synchronized (this.mLock) {
            z = false;
            if (this.mNextFrameToDecode >= 0 && this.mState == 3) {
                this.mState = 4;
                z = true;
            }
        }
        if (z) {
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public final void setCircleMaskEnabled(boolean z) {
        if (this.mCircleMaskEnabled != z) {
            this.mCircleMaskEnabled = z;
            this.mPaint.setAntiAlias(z);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public final void setCornerRadius(int i) {
        if (this.mCornerRadiusPx != i) {
            this.mCornerRadiusPx = i;
            invalidateSelf();
        }
    }

    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
    }

    public void setLoopBehavior(int i) {
        this.mLoopBehavior = i;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    public void setOnFinishedListener(OnFinishedListener onFinishedListener) {
        this.mOnFinishedListener = onFinishedListener;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (z2 || visible) {
            stop();
            start();
        }
        return visible;
    }

    public void start() {
        if (!isRunning()) {
            synchronized (this.mLock) {
                checkDestroyedLocked();
                if (this.mState != 1) {
                    this.mCurrentLoop = 0;
                    scheduleDecodeLocked();
                }
            }
        }
    }

    public void stop() {
        if (isRunning()) {
            unscheduleSelf(this);
        }
    }

    public void unscheduleSelf(Runnable runnable) {
        synchronized (this.mLock) {
            this.mNextFrameToDecode = -1;
            this.mState = 0;
        }
        super.unscheduleSelf(runnable);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, BitmapProvider bitmapProvider) {
        this.mLock = new Object();
        this.mDestroyed = false;
        this.mLoopBehavior = 3;
        this.mLoopCount = 1;
        this.mTempRectF = new RectF();
        this.mDecodeRunnable = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
                r3 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r0 = android.support.rastermill.FrameSequenceDrawable.m241064$$Nest$fgetmFrameSequenceState(r11.this$0).getFrame(r1, r2, r1 - 2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
                r2 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
                android.util.Log.e(android.support.rastermill.FrameSequenceDrawable.TAG, "exception during decode: ".concat(r0.toString()));
                r0 = 0;
                r2 = true;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r11 = this;
                    android.support.rastermill.FrameSequenceDrawable r0 = android.support.rastermill.FrameSequenceDrawable.this
                    java.lang.Object r0 = r0.mLock
                    monitor-enter(r0)
                    android.support.rastermill.FrameSequenceDrawable r1 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b9 }
                    boolean r1 = r1.mDestroyed     // Catch:{ all -> 0x00b9 }
                    if (r1 == 0) goto L_0x0011
                    monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
                    return
                L_0x0011:
                    android.support.rastermill.FrameSequenceDrawable r1 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b9 }
                    int r1 = r1.mNextFrameToDecode     // Catch:{ all -> 0x00b9 }
                    if (r1 >= 0) goto L_0x001b
                    monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
                    return
                L_0x001b:
                    android.support.rastermill.FrameSequenceDrawable r2 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b9 }
                    android.graphics.Bitmap r2 = r2.mBackBitmap     // Catch:{ all -> 0x00b9 }
                    android.support.rastermill.FrameSequenceDrawable r3 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b9 }
                    r4 = 2
                    r3.mState = r4     // Catch:{ all -> 0x00b9 }
                    monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
                    int r0 = r1 + -2
                    r3 = 1
                    r5 = 0
                    android.support.rastermill.FrameSequenceDrawable r6 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ Exception -> 0x0038 }
                    android.support.rastermill.FrameSequence$State r6 = r6.mFrameSequenceState     // Catch:{ Exception -> 0x0038 }
                    long r0 = r6.getFrame(r1, r2, r0)     // Catch:{ Exception -> 0x0038 }
                    r2 = 0
                    goto L_0x004b
                L_0x0038:
                    r0 = move-exception
                    java.lang.String r1 = "FrameSequence"
                    java.lang.String r2 = "exception during decode: "
                    java.lang.String r0 = r0.toString()
                    java.lang.String r0 = r2.concat(r0)
                    android.util.Log.e(r1, r0)
                    r0 = 0
                    r2 = 1
                L_0x004b:
                    r6 = 20
                    int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                    if (r8 >= 0) goto L_0x0053
                    r0 = 100
                L_0x0053:
                    android.support.rastermill.FrameSequenceDrawable r6 = android.support.rastermill.FrameSequenceDrawable.this
                    java.lang.Object r6 = r6.mLock
                    monitor-enter(r6)
                    android.support.rastermill.FrameSequenceDrawable r7 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    boolean r7 = r7.mDestroyed     // Catch:{ all -> 0x00b6 }
                    r8 = 0
                    if (r7 == 0) goto L_0x0070
                    android.support.rastermill.FrameSequenceDrawable r0 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    android.graphics.Bitmap r0 = r0.mBackBitmap     // Catch:{ all -> 0x00b6 }
                    android.support.rastermill.FrameSequenceDrawable r1 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    r1.mBackBitmap = r8     // Catch:{ all -> 0x00b6 }
                    r8 = r0
                    goto L_0x0099
                L_0x0070:
                    android.support.rastermill.FrameSequenceDrawable r7 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    int r7 = r7.mNextFrameToDecode     // Catch:{ all -> 0x00b6 }
                    if (r7 < 0) goto L_0x0099
                    android.support.rastermill.FrameSequenceDrawable r7 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    int r7 = r7.mState     // Catch:{ all -> 0x00b6 }
                    if (r7 != r4) goto L_0x0099
                    android.support.rastermill.FrameSequenceDrawable r4 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    if (r2 == 0) goto L_0x008a
                    r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    goto L_0x008f
                L_0x008a:
                    long r9 = r4.mLastSwap     // Catch:{ all -> 0x00b6 }
                    long r0 = r0 + r9
                L_0x008f:
                    r4.mNextSwap = r0     // Catch:{ all -> 0x00b6 }
                    android.support.rastermill.FrameSequenceDrawable r0 = android.support.rastermill.FrameSequenceDrawable.this     // Catch:{ all -> 0x00b6 }
                    r1 = 3
                    r0.mState = r1     // Catch:{ all -> 0x00b6 }
                    goto L_0x009a
                L_0x0099:
                    r3 = 0
                L_0x009a:
                    monitor-exit(r6)     // Catch:{ all -> 0x00b6 }
                    if (r3 == 0) goto L_0x00aa
                    android.os.Handler r0 = android.support.rastermill.FrameSequenceDrawable.sMainHandler
                    android.support.rastermill.FrameSequenceDrawable r1 = android.support.rastermill.FrameSequenceDrawable.this
                    java.lang.Runnable r1 = r1.mUiScheduleRunnable
                    r0.post(r1)
                L_0x00aa:
                    if (r8 == 0) goto L_0x00b5
                    android.support.rastermill.FrameSequenceDrawable r0 = android.support.rastermill.FrameSequenceDrawable.this
                    android.support.rastermill.FrameSequenceDrawable$BitmapProvider r0 = r0.mBitmapProvider
                    r0.releaseBitmap(r8)
                L_0x00b5:
                    return
                L_0x00b6:
                    r0 = move-exception
                    monitor-exit(r6)     // Catch:{ all -> 0x00b6 }
                    throw r0
                L_0x00b9:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.rastermill.FrameSequenceDrawable.C01492.run():void");
            }
        };
        this.mUiScheduleRunnable = new Runnable() {
            public void run() {
                FrameSequenceDrawable frameSequenceDrawable = FrameSequenceDrawable.this;
                FrameSequenceDrawable.super.unscheduleSelf(frameSequenceDrawable);
                FrameSequenceDrawable frameSequenceDrawable2 = FrameSequenceDrawable.this;
                frameSequenceDrawable2.scheduleSelf(frameSequenceDrawable2, frameSequenceDrawable2.mNextSwap);
            }
        };
        this.mFinishedCallbackRunnable = new Runnable() {
            public void run() {
                synchronized (FrameSequenceDrawable.this.mLock) {
                    FrameSequenceDrawable.this.mNextFrameToDecode = -1;
                    FrameSequenceDrawable.this.mState = 0;
                }
                if (FrameSequenceDrawable.this.mOnFinishedListener != null) {
                    FrameSequenceDrawable.this.mOnFinishedListener.onFinished(FrameSequenceDrawable.this);
                }
            }
        };
        if (frameSequence == null || bitmapProvider == null) {
            throw new IllegalArgumentException();
        }
        this.mFrameSequence = frameSequence;
        FrameSequence.State createState = frameSequence.createState();
        this.mFrameSequenceState = createState;
        int width = frameSequence.getWidth();
        int height = frameSequence.getHeight();
        this.mBitmapProvider = bitmapProvider;
        this.mFrontBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mBackBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mSrcRect = new Rect(0, 0, width, height);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setFilterBitmap(true);
        this.mFrontBitmapShader = new BitmapShader(this.mFrontBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mBackBitmapShader = new BitmapShader(this.mBackBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.mLastSwap = 0;
        this.mNextFrameToDecode = -1;
        createState.getFrame(0, this.mFrontBitmap, -1);
        initializeDecodingThread();
    }
}
