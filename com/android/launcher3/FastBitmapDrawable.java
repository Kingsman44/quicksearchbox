package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class FastBitmapDrawable extends Drawable {
    public static final TimeInterpolator CLICK_FEEDBACK_INTERPOLATOR = new TimeInterpolator() {
        public final float getInterpolation(float f) {
            if (f < 0.05f) {
                return f / 0.05f;
            }
            if (f < 0.3f) {
                return 1.0f;
            }
            return (1.0f - f) / 0.7f;
        }
    };
    private static final SparseArray sCachedFilter = new SparseArray();
    private static final ColorMatrix sTempBrightnessMatrix = new ColorMatrix();
    private static final ColorMatrix sTempFilterMatrix = new ColorMatrix();
    private int mAlpha = PrivateKeyType.INVALID;
    public final Bitmap mBitmap;
    private int mBrightness = 0;
    private int mDesaturation = 0;
    private final Paint mPaint = new Paint(2);
    private int mPrevUpdateKey = Integer.MAX_VALUE;
    private AnimatorSet mPropertyAnimator;
    public State mState = State.NORMAL;

    /* compiled from: PG */
    public enum State {
        NORMAL(0.0f, 0.0f, 1.0f, new DecelerateInterpolator()),
        PRESSED(0.0f, 0.39215687f, 1.0f, FastBitmapDrawable.CLICK_FEEDBACK_INTERPOLATOR),
        FAST_SCROLL_HIGHLIGHTED(0.0f, 0.0f, 1.15f, new DecelerateInterpolator()),
        FAST_SCROLL_UNHIGHLIGHTED(0.0f, 0.0f, 1.0f, new DecelerateInterpolator()),
        DISABLED(1.0f, 0.5f, 1.0f, new DecelerateInterpolator());
        
        public final float brightness;
        public final float desaturation;
        public final TimeInterpolator interpolator;
        public final float viewScale;

        private State(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
            this.desaturation = f;
            this.brightness = f2;
            this.viewScale = f3;
            this.interpolator = timeInterpolator;
        }
    }

    public FastBitmapDrawable(Bitmap bitmap) {
        this.mBitmap = bitmap;
        setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    private static final void cancelAnimator$ar$ds(AnimatorSet animatorSet) {
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
    }

    public static int getDurationForStateChange(State state, State state2) {
        State state3 = State.NORMAL;
        int ordinal = state2.ordinal();
        if (ordinal == 0) {
            int ordinal2 = state.ordinal();
            if (ordinal2 == 1) {
                return 0;
            }
            if (ordinal2 == 2 || ordinal2 == 3) {
                return 275;
            }
            return SimpleSnackbar.LENGTH_SHORT;
        } else if (ordinal == 1) {
            return SimpleSnackbar.LENGTH_SHORT;
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return 0;
                }
                if (state.ordinal() != 0) {
                    return 150;
                }
            }
            return 225;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateFilter() {
        /*
            r8 = this;
            int r0 = r8.mDesaturation
            r1 = -1
            r2 = 0
            if (r0 <= 0) goto L_0x000d
            int r0 = r0 << 16
            int r3 = r8.mBrightness
            r0 = r0 | r3
        L_0x000b:
            r3 = 0
            goto L_0x0018
        L_0x000d:
            int r0 = r8.mBrightness
            if (r0 <= 0) goto L_0x0016
            r3 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r3
            r3 = 1
            goto L_0x0018
        L_0x0016:
            r0 = -1
            goto L_0x000b
        L_0x0018:
            int r4 = r8.mPrevUpdateKey
            if (r0 != r4) goto L_0x001d
            return
        L_0x001d:
            r8.mPrevUpdateKey = r0
            if (r0 == r1) goto L_0x0084
            android.util.SparseArray r1 = sCachedFilter
            java.lang.Object r4 = r1.get(r0)
            android.graphics.ColorFilter r4 = (android.graphics.ColorFilter) r4
            if (r4 != 0) goto L_0x007e
            float r4 = r8.getBrightness()
            r5 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r4
            int r5 = (int) r5
            if (r3 == 0) goto L_0x0045
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r3 = 255(0xff, float:3.57E-43)
            int r3 = android.graphics.Color.argb(r5, r3, r3, r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.<init>(r3, r4)
        L_0x0043:
            r4 = r2
            goto L_0x007b
        L_0x0045:
            float r3 = r8.getDesaturation()
            android.graphics.ColorMatrix r6 = sTempFilterMatrix
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
            r6.setSaturation(r3)
            int r3 = r8.mBrightness
            if (r3 <= 0) goto L_0x0075
            float r7 = r7 - r4
            android.graphics.ColorMatrix r3 = sTempBrightnessMatrix
            float[] r4 = r3.getArray()
            r4[r2] = r7
            r2 = 6
            r4[r2] = r7
            r2 = 12
            r4[r2] = r7
            float r2 = (float) r5
            r5 = 4
            r4[r5] = r2
            r5 = 9
            r4[r5] = r2
            r5 = 14
            r4[r5] = r2
            r6.preConcat(r3)
        L_0x0075:
            android.graphics.ColorMatrixColorFilter r2 = new android.graphics.ColorMatrixColorFilter
            r2.<init>(r6)
            goto L_0x0043
        L_0x007b:
            r1.append(r0, r4)
        L_0x007e:
            android.graphics.Paint r0 = r8.mPaint
            r0.setColorFilter(r4)
            goto L_0x008a
        L_0x0084:
            android.graphics.Paint r0 = r8.mPaint
            r1 = 0
            r0.setColorFilter(r1)
        L_0x008a:
            r8.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FastBitmapDrawable.updateFilter():void");
    }

    public final boolean animateState(State state) {
        State state2 = this.mState;
        int i = 0;
        if (state2 == state) {
            return false;
        }
        this.mState = state;
        cancelAnimator$ar$ds(this.mPropertyAnimator);
        this.mPropertyAnimator = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.mPropertyAnimator = animatorSet;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this, "desaturation", new float[]{state.desaturation}), ObjectAnimator.ofFloat(this, "brightness", new float[]{state.brightness})});
        this.mPropertyAnimator.setInterpolator(state.interpolator);
        this.mPropertyAnimator.setDuration((long) getDurationForStateChange(state2, state));
        AnimatorSet animatorSet2 = this.mPropertyAnimator;
        if (state.ordinal() == 3 && state2.ordinal() == 0) {
            i = 37;
        }
        animatorSet2.setStartDelay((long) i);
        this.mPropertyAnimator.start();
        return true;
    }

    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.mBitmap, (Rect) null, getBounds(), this.mPaint);
    }

    public final int getAlpha() {
        return this.mAlpha;
    }

    public float getBrightness() {
        return ((float) this.mBrightness) / 48.0f;
    }

    public float getDesaturation() {
        return ((float) this.mDesaturation) / 48.0f;
    }

    public final int getIntrinsicHeight() {
        return this.mBitmap.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.mBitmap.getWidth();
    }

    public final int getMinimumHeight() {
        return getBounds().height();
    }

    public final int getMinimumWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.mAlpha = i;
        this.mPaint.setAlpha(i);
    }

    public void setBrightness(float f) {
        int floor = (int) Math.floor((double) (f * 48.0f));
        if (this.mBrightness != floor) {
            this.mBrightness = floor;
            updateFilter();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void setDesaturation(float f) {
        int floor = (int) Math.floor((double) (f * 48.0f));
        if (this.mDesaturation != floor) {
            this.mDesaturation = floor;
            updateFilter();
        }
    }

    public final void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
        this.mPaint.setAntiAlias(z);
    }

    public final boolean setState(State state) {
        if (this.mState == state) {
            return false;
        }
        this.mState = state;
        cancelAnimator$ar$ds(this.mPropertyAnimator);
        this.mPropertyAnimator = null;
        setDesaturation(state.desaturation);
        setBrightness(state.brightness);
        return true;
    }
}
