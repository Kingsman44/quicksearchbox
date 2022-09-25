package com.android.launcher3;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.ViewTreeObserver;
import com.android.launcher3.WallpaperPickerActivity;
import com.android.p271h.p272a.C5156d;
import com.android.p271h.p272a.C5160h;
import com.android.p271h.p272a.C5162j;

/* compiled from: PG */
public class CropView extends C5162j implements ScaleGestureDetector.OnScaleGestureListener {
    private float mCenterX;
    private float mCenterY;
    private float mFirstX;
    private float mFirstY;
    Matrix mInverseRotateMatrix;
    private float mLastX;
    private float mLastY;
    private float mMinScale;
    Matrix mRotateMatrix;
    private ScaleGestureDetector mScaleGestureDetector;
    private float[] mTempAdjustment;
    private float[] mTempCoef;
    public RectF mTempEdges;
    private float[] mTempImageDims;
    private float[] mTempPoint;
    private float[] mTempRendererCenter;
    WallpaperPickerActivity.C53992 mTouchCallback$ar$class_merging;
    private long mTouchDownTime;
    public boolean mTouchEnabled;

    public CropView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final float[] getImageDims() {
        int imageWidth = this.mRenderer.f16408e.getImageWidth();
        int imageHeight = this.mRenderer.f16408e.getImageHeight();
        float[] fArr = this.mTempImageDims;
        fArr[0] = (float) imageWidth;
        fArr[1] = (float) imageHeight;
        this.mRotateMatrix.mapPoints(fArr);
        fArr[0] = Math.abs(fArr[0]);
        fArr[1] = Math.abs(fArr[1]);
        return fArr;
    }

    private final void updateCenter() {
        this.mRenderer.f16405b = Math.round(this.mCenterX);
        this.mRenderer.f16406c = Math.round(this.mCenterY);
    }

    private final void updateMinScale(int i, int i2, C5156d dVar, boolean z) {
        float f;
        synchronized (this.mLock) {
            if (z) {
                try {
                    this.mRenderer.f16404a = 1.0f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (dVar != null) {
                float[] imageDims = getImageDims();
                float max = Math.max(((float) i) / imageDims[0], ((float) i2) / imageDims[1]);
                this.mMinScale = max;
                C5160h hVar = this.mRenderer;
                if (z) {
                    f = Float.MIN_VALUE;
                } else {
                    f = hVar.f16404a;
                }
                hVar.f16404a = Math.max(max, f);
            }
        }
    }

    public final PointF getCenter() {
        return new PointF(this.mCenterX, this.mCenterY);
    }

    public final void getEdgesHelper(RectF rectF) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float[] imageDims = getImageDims();
        float f = imageDims[0];
        float f2 = imageDims[1];
        int imageWidth = this.mRenderer.f16408e.getImageWidth();
        int imageHeight = this.mRenderer.f16408e.getImageHeight();
        float[] fArr = this.mTempRendererCenter;
        fArr[0] = this.mCenterX - (((float) imageWidth) / 2.0f);
        fArr[1] = this.mCenterY - (((float) imageHeight) / 2.0f);
        this.mRotateMatrix.mapPoints(fArr);
        float f3 = f / 2.0f;
        fArr[0] = fArr[0] + f3;
        float f4 = f2 / 2.0f;
        float f5 = fArr[1] + f4;
        fArr[1] = f5;
        float f6 = this.mRenderer.f16404a;
        float f7 = width / 2.0f;
        float f8 = (((f7 - fArr[0]) + ((f - width) / 2.0f)) * f6) + f7;
        float f9 = height / 2.0f;
        float f10 = (((f9 - f5) + ((f2 - height) / 2.0f)) * f6) + f9;
        float f11 = f3 * f6;
        float f12 = f4 * f6;
        rectF.left = f8 - f11;
        rectF.right = f8 + f11;
        rectF.top = f10 - f12;
        rectF.bottom = f10 + f12;
    }

    public final Point getSourceDimensions() {
        return new Point(this.mRenderer.f16408e.getImageWidth(), this.mRenderer.f16408e.getImageHeight());
    }

    public final void moveToLeft() {
        if (getWidth() == 0 || getHeight() == 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    CropView.this.moveToLeft();
                    CropView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
        RectF rectF = this.mTempEdges;
        getEdgesHelper(rectF);
        float f = this.mRenderer.f16404a;
        double d = (double) this.mCenterX;
        double ceil = Math.ceil((double) (rectF.left / f));
        Double.isNaN(d);
        this.mCenterX = (float) (d + ceil);
        updateCenter();
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.mRenderer.f16404a *= scaleGestureDetector.getScaleFactor();
        C5160h hVar = this.mRenderer;
        hVar.f16404a = Math.max(this.mMinScale, hVar.f16404a);
        super.invalOnVsync();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        updateMinScale(i, i2, this.mRenderer.f16408e, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r17.getActionMasked()
            r3 = 6
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            if (r3 == 0) goto L_0x0017
            int r6 = r17.getActionIndex()
            goto L_0x0018
        L_0x0017:
            r6 = -1
        L_0x0018:
            int r7 = r17.getPointerCount()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0020:
            if (r9 >= r7) goto L_0x0032
            if (r6 != r9) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            float r12 = r0.getX(r9)
            float r10 = r10 + r12
            float r12 = r0.getY(r9)
            float r11 = r11 + r12
        L_0x002f:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x0032:
            if (r3 == 0) goto L_0x0036
            int r7 = r7 + -1
        L_0x0036:
            float r3 = (float) r7
            float r10 = r10 / r3
            float r11 = r11 / r3
            r3 = 1061158912(0x3f400000, float:0.75)
            r6 = 150(0x96, double:7.4E-322)
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L_0x0093
            r1.mFirstX = r10
            r1.mFirstY = r11
            long r12 = java.lang.System.currentTimeMillis()
            r1.mTouchDownTime = r12
            com.android.launcher3.WallpaperPickerActivity$2 r12 = r1.mTouchCallback$ar$class_merging
            if (r12 == 0) goto L_0x010f
            android.view.ViewPropertyAnimator r13 = r12.mAnim
            if (r13 == 0) goto L_0x0056
            r13.cancel()
        L_0x0056:
            com.android.launcher3.WallpaperPickerActivity r13 = com.android.launcher3.WallpaperPickerActivity.this
            android.view.View r13 = r13.mWallpaperStrip
            float r13 = r13.getAlpha()
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0066
            com.android.launcher3.WallpaperPickerActivity r13 = com.android.launcher3.WallpaperPickerActivity.this
            r13.mIgnoreNextTap = r5
        L_0x0066:
            com.android.launcher3.WallpaperPickerActivity r13 = com.android.launcher3.WallpaperPickerActivity.this
            android.view.View r13 = r13.mWallpaperStrip
            android.view.ViewPropertyAnimator r13 = r13.animate()
            r12.mAnim = r13
            android.view.ViewPropertyAnimator r13 = r12.mAnim
            android.view.ViewPropertyAnimator r13 = r13.alpha(r8)
            android.view.ViewPropertyAnimator r6 = r13.setDuration(r6)
            com.android.launcher3.WallpaperPickerActivity$2$1 r7 = new com.android.launcher3.WallpaperPickerActivity$2$1
            r7.<init>()
            r6.withEndAction(r7)
            android.view.ViewPropertyAnimator r6 = r12.mAnim
            android.view.animation.AccelerateInterpolator r7 = new android.view.animation.AccelerateInterpolator
            r7.<init>(r3)
            r6.setInterpolator(r7)
            android.view.ViewPropertyAnimator r3 = r12.mAnim
            r3.start()
            goto L_0x010f
        L_0x0093:
            if (r2 != r5) goto L_0x010f
            android.content.Context r2 = r16.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            float r12 = r1.mFirstX
            float r12 = r12 - r10
            float r13 = r1.mFirstY
            float r13 = r13 - r11
            float r12 = r12 * r12
            float r13 = r13 * r13
            float r12 = r12 + r13
            int r13 = r2.getScaledTouchSlop()
            int r2 = r2.getScaledTouchSlop()
            int r13 = r13 * r2
            float r2 = (float) r13
            long r13 = java.lang.System.currentTimeMillis()
            com.android.launcher3.WallpaperPickerActivity$2 r15 = r1.mTouchCallback$ar$class_merging
            if (r15 == 0) goto L_0x010e
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0108
            long r5 = r1.mTouchDownTime
            int r2 = android.view.ViewConfiguration.getTapTimeout()
            long r8 = (long) r2
            long r5 = r5 + r8
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0108
            com.android.launcher3.WallpaperPickerActivity$2 r2 = r1.mTouchCallback$ar$class_merging
            com.android.launcher3.WallpaperPickerActivity r5 = com.android.launcher3.WallpaperPickerActivity.this
            boolean r6 = r5.mIgnoreNextTap
            r5.mIgnoreNextTap = r4
            if (r6 != 0) goto L_0x0108
            android.view.ViewPropertyAnimator r5 = r2.mAnim
            if (r5 == 0) goto L_0x00dc
            r5.cancel()
        L_0x00dc:
            com.android.launcher3.WallpaperPickerActivity r5 = com.android.launcher3.WallpaperPickerActivity.this
            android.view.View r5 = r5.mWallpaperStrip
            r5.setVisibility(r4)
            com.android.launcher3.WallpaperPickerActivity r5 = com.android.launcher3.WallpaperPickerActivity.this
            android.view.View r5 = r5.mWallpaperStrip
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r2.mAnim = r5
            android.view.ViewPropertyAnimator r5 = r2.mAnim
            r6 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
            r8 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r8)
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>(r3)
            r5.setInterpolator(r6)
            android.view.ViewPropertyAnimator r2 = r2.mAnim
            r2.start()
        L_0x0108:
            com.android.launcher3.WallpaperPickerActivity$2 r2 = r1.mTouchCallback$ar$class_merging
            com.android.launcher3.WallpaperPickerActivity r2 = com.android.launcher3.WallpaperPickerActivity.this
            r2.mIgnoreNextTap = r4
        L_0x010e:
            r2 = 1
        L_0x010f:
            boolean r3 = r1.mTouchEnabled
            if (r3 != 0) goto L_0x0115
            r3 = 1
            return r3
        L_0x0115:
            java.lang.Object r3 = r1.mLock
            monitor-enter(r3)
            android.view.ScaleGestureDetector r5 = r1.mScaleGestureDetector     // Catch:{ all -> 0x01f8 }
            r5.onTouchEvent(r0)     // Catch:{ all -> 0x01f8 }
            r0 = 2
            if (r2 == r0) goto L_0x0121
            goto L_0x014e
        L_0x0121:
            float[] r0 = r1.mTempPoint     // Catch:{ all -> 0x01f8 }
            float r2 = r1.mLastX     // Catch:{ all -> 0x01f8 }
            float r2 = r2 - r10
            com.android.h.a.h r5 = r1.mRenderer     // Catch:{ all -> 0x01f8 }
            float r5 = r5.f16404a     // Catch:{ all -> 0x01f8 }
            float r2 = r2 / r5
            r0[r4] = r2     // Catch:{ all -> 0x01f8 }
            float r2 = r1.mLastY     // Catch:{ all -> 0x01f8 }
            float r2 = r2 - r11
            float r2 = r2 / r5
            r5 = 1
            r0[r5] = r2     // Catch:{ all -> 0x01f8 }
            android.graphics.Matrix r2 = r1.mInverseRotateMatrix     // Catch:{ all -> 0x01f8 }
            r2.mapPoints(r0)     // Catch:{ all -> 0x01f8 }
            float r2 = r1.mCenterX     // Catch:{ all -> 0x01f8 }
            r5 = r0[r4]     // Catch:{ all -> 0x01f8 }
            float r2 = r2 + r5
            r1.mCenterX = r2     // Catch:{ all -> 0x01f8 }
            float r2 = r1.mCenterY     // Catch:{ all -> 0x01f8 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ all -> 0x01f8 }
            float r2 = r2 + r0
            r1.mCenterY = r2     // Catch:{ all -> 0x01f8 }
            r16.updateCenter()     // Catch:{ all -> 0x01f8 }
            super.invalOnVsync()     // Catch:{ all -> 0x01f8 }
        L_0x014e:
            com.android.h.a.h r0 = r1.mRenderer     // Catch:{ all -> 0x01f8 }
            com.android.h.a.d r0 = r0.f16408e     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01f1
            android.graphics.RectF r0 = r1.mTempEdges     // Catch:{ all -> 0x01f8 }
            r1.getEdgesHelper(r0)     // Catch:{ all -> 0x01f8 }
            com.android.h.a.h r2 = r1.mRenderer     // Catch:{ all -> 0x01f8 }
            float r2 = r2.f16404a     // Catch:{ all -> 0x01f8 }
            float[] r5 = r1.mTempCoef     // Catch:{ all -> 0x01f8 }
            r6 = 1065353216(0x3f800000, float:1.0)
            r5[r4] = r6     // Catch:{ all -> 0x01f8 }
            r8 = 1
            r5[r8] = r6     // Catch:{ all -> 0x01f8 }
            android.graphics.Matrix r6 = r1.mRotateMatrix     // Catch:{ all -> 0x01f8 }
            r6.mapPoints(r5)     // Catch:{ all -> 0x01f8 }
            float[] r6 = r1.mTempAdjustment     // Catch:{ all -> 0x01f8 }
            r7 = 0
            r6[r4] = r7     // Catch:{ all -> 0x01f8 }
            r6[r8] = r7     // Catch:{ all -> 0x01f8 }
            float r8 = r0.left     // Catch:{ all -> 0x01f8 }
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x017e
            float r8 = r0.left     // Catch:{ all -> 0x01f8 }
            float r8 = r8 / r2
            r6[r4] = r8     // Catch:{ all -> 0x01f8 }
            goto L_0x0194
        L_0x017e:
            float r8 = r0.right     // Catch:{ all -> 0x01f8 }
            int r9 = r16.getWidth()     // Catch:{ all -> 0x01f8 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f8 }
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0194
            float r8 = r0.right     // Catch:{ all -> 0x01f8 }
            int r9 = r16.getWidth()     // Catch:{ all -> 0x01f8 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f8 }
            float r8 = r8 - r9
            float r8 = r8 / r2
            r6[r4] = r8     // Catch:{ all -> 0x01f8 }
        L_0x0194:
            float r8 = r0.top     // Catch:{ all -> 0x01f8 }
            r7 = 0
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x01aa
            float r0 = r0.top     // Catch:{ all -> 0x01f8 }
            float r0 = r0 / r2
            double r8 = (double) r0     // Catch:{ all -> 0x01f8 }
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ all -> 0x01f8 }
            float r0 = (float) r8     // Catch:{ all -> 0x01f8 }
            r2 = 1
            r6[r2] = r0     // Catch:{ all -> 0x01f8 }
            r0 = 0
        L_0x01a8:
            r2 = 1
            goto L_0x01c4
        L_0x01aa:
            float r8 = r0.bottom     // Catch:{ all -> 0x01f8 }
            int r9 = r16.getHeight()     // Catch:{ all -> 0x01f8 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f8 }
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x01c2
            float r0 = r0.bottom     // Catch:{ all -> 0x01f8 }
            int r8 = r16.getHeight()     // Catch:{ all -> 0x01f8 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f8 }
            float r0 = r0 - r8
            float r0 = r0 / r2
            r2 = 1
            r6[r2] = r0     // Catch:{ all -> 0x01f8 }
            goto L_0x01c3
        L_0x01c2:
            r2 = 1
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            if (r0 > r2) goto L_0x01da
            r2 = r5[r0]     // Catch:{ all -> 0x01f8 }
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x01d7
            r2 = r6[r0]     // Catch:{ all -> 0x01f8 }
            double r8 = (double) r2     // Catch:{ all -> 0x01f8 }
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ all -> 0x01f8 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f8 }
            r6[r0] = r2     // Catch:{ all -> 0x01f8 }
        L_0x01d7:
            int r0 = r0 + 1
            goto L_0x01a8
        L_0x01da:
            android.graphics.Matrix r0 = r1.mInverseRotateMatrix     // Catch:{ all -> 0x01f8 }
            r0.mapPoints(r6)     // Catch:{ all -> 0x01f8 }
            float r0 = r1.mCenterX     // Catch:{ all -> 0x01f8 }
            r2 = r6[r4]     // Catch:{ all -> 0x01f8 }
            float r0 = r0 + r2
            r1.mCenterX = r0     // Catch:{ all -> 0x01f8 }
            float r0 = r1.mCenterY     // Catch:{ all -> 0x01f8 }
            r2 = 1
            r4 = r6[r2]     // Catch:{ all -> 0x01f8 }
            float r0 = r0 + r4
            r1.mCenterY = r0     // Catch:{ all -> 0x01f8 }
            r16.updateCenter()     // Catch:{ all -> 0x01f8 }
        L_0x01f1:
            monitor-exit(r3)     // Catch:{ all -> 0x01f8 }
            r1.mLastX = r10
            r1.mLastY = r11
            r0 = 1
            return r0
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01f8 }
            goto L_0x01fc
        L_0x01fb:
            throw r0
        L_0x01fc:
            goto L_0x01fb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.CropView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setScaleAndCenter(float f, float f2, float f3) {
        synchronized (this.mLock) {
            this.mRenderer.f16404a = f;
            this.mCenterX = f2;
            this.mCenterY = f3;
            updateCenter();
        }
    }

    public final void setTileSource$ar$ds(C5156d dVar) {
        synchronized (this.mLock) {
            C5160h hVar = this.mRenderer;
            hVar.f16408e = dVar;
            hVar.f16409f = null;
            int i = 0;
            hVar.f16405b = dVar != null ? dVar.getImageWidth() / 2 : 0;
            this.mRenderer.f16406c = dVar != null ? dVar.getImageHeight() / 2 : 0;
            C5160h hVar2 = this.mRenderer;
            if (dVar != null) {
                i = dVar.getRotation();
            }
            hVar2.f16407d = i;
            hVar2.f16404a = 0.0f;
            super.updateScaleIfNecessaryLocked(hVar2);
        }
        super.invalOnVsync();
        C5160h hVar3 = this.mRenderer;
        this.mCenterX = (float) hVar3.f16405b;
        this.mCenterY = (float) hVar3.f16406c;
        this.mRotateMatrix.reset();
        this.mRotateMatrix.setRotate((float) this.mRenderer.f16407d);
        this.mInverseRotateMatrix.reset();
        this.mInverseRotateMatrix.setRotate((float) (-this.mRenderer.f16407d));
        updateMinScale(getWidth(), getHeight(), dVar, true);
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTouchEnabled = true;
        this.mTempEdges = new RectF();
        this.mTempPoint = new float[]{0.0f, 0.0f};
        this.mTempCoef = new float[]{0.0f, 0.0f};
        this.mTempAdjustment = new float[]{0.0f, 0.0f};
        this.mTempImageDims = new float[]{0.0f, 0.0f};
        this.mTempRendererCenter = new float[]{0.0f, 0.0f};
        this.mScaleGestureDetector = new ScaleGestureDetector(context, this);
        this.mRotateMatrix = new Matrix();
        this.mInverseRotateMatrix = new Matrix();
    }
}
