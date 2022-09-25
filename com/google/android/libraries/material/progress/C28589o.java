package com.google.android.libraries.material.progress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.core.p098j.p100b.C2034a;
import com.google.android.libraries.material.p2205a.C28491d;

@Deprecated
/* renamed from: com.google.android.libraries.material.progress.o */
/* compiled from: PG */
public final class C28589o extends Drawable implements Animatable, C28575a {

    /* renamed from: a */
    public final AnimatorSet f77769a;

    /* renamed from: b */
    public boolean f77770b = isVisible();

    /* renamed from: c */
    public Runnable f77771c;

    /* renamed from: d */
    private final int f77772d;

    /* renamed from: e */
    private final boolean f77773e;

    /* renamed from: f */
    private int f77774f;

    /* renamed from: g */
    private int f77775g;

    /* renamed from: h */
    private int f77776h;

    /* renamed from: i */
    private int f77777i;

    /* renamed from: j */
    private final Paint f77778j;

    /* renamed from: k */
    private final ObjectAnimator f77779k;

    /* renamed from: l */
    private final ObjectAnimator f77780l;

    /* renamed from: m */
    private final float f77781m;

    /* renamed from: n */
    private float f77782n;

    /* renamed from: o */
    private float f77783o = 1.0f;

    /* renamed from: p */
    private float f77784p;

    /* renamed from: q */
    private float f77785q;

    /* renamed from: r */
    private float f77786r;

    /* renamed from: s */
    private float f77787s;

    /* renamed from: t */
    private float f77788t;

    /* renamed from: u */
    private final Rect f77789u;

    public C28589o(int i, int i2, int i3, float f, boolean z, int i4) {
        this.f77774f = i;
        this.f77776h = i2;
        this.f77772d = Math.round(f * 255.0f);
        this.f77773e = z;
        this.f77777i = i4;
        this.f77775g = i3;
        float f2 = 1.0f;
        Paint paint = new Paint();
        this.f77778j = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.1f, 0.1f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.1f, 0.8268492f});
        ofFloat2.setInterpolator(C2034a.m5471c(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", new float[]{0.8268492f, 0.1f});
        ofFloat3.setInterpolator(C2034a.m5471c(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617);
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", new float[]{-522.6f, 199.6f});
        ofFloat4.setInterpolator(C2034a.m5471c(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400);
        ofFloat4.setDuration(1600);
        animatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.1f, 0.55f});
        ofFloat5.setInterpolator(C2034a.m5471c(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat5.setDuration(352);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.55f, 0.90995026f});
        ofFloat6.setInterpolator(C2034a.m5471c(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat6.setDuration(532);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", new float[]{0.90995026f, 0.1f});
        ofFloat7.setInterpolator(C2034a.m5471c(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat7.setDuration(1116);
        animatorSet.playSequentially(new Animator[]{ofFloat5, ofFloat6, ofFloat7});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[]{-208.0f, 132.0f});
        ofFloat8.setInterpolator(C2034a.m5471c(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat8.setDuration(964);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", new float[]{132.0f, 422.6f});
        ofFloat9.setInterpolator(C2034a.m5471c(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat9.setDuration(1036);
        animatorSet.playSequentially(new Animator[]{ofFloat8, ofFloat9});
        animatorSet.addListener(new C28587m());
        boolean z2 = C28592r.f77792a;
        boolean z3 = C28592r.f77793b;
        C28491d.m53263b(animatorSet, (Runnable) null);
        this.f77769a = animatorSet;
        this.f77781m = 1.0f;
        this.f77782n = i4 != 2 ? 0.0f : f2;
        this.f77779k = C28586l.m53482a(this);
        ObjectAnimator b = C28586l.m53483b(this);
        b.addListener(new C28588n(this));
        this.f77780l = b;
        this.f77789u = new Rect();
        mo34246c();
    }

    /* renamed from: a */
    public final void mo34174a(Runnable runnable) {
        this.f77771c = runnable;
        setVisible(false, false);
    }

    /* renamed from: b */
    public final void mo34175b() {
        this.f77770b = false;
        if (super.setVisible(false, false)) {
            this.f77779k.cancel();
            this.f77780l.cancel();
            this.f77769a.cancel();
            Runnable runnable = this.f77771c;
            if (runnable != null) {
                ((C28590p) runnable).f77790a.mo34160c();
            }
        }
        this.f77771c = null;
    }

    /* renamed from: c */
    public final void mo34246c() {
        this.f77779k.cancel();
        this.f77780l.cancel();
        this.f77769a.cancel();
        this.f77784p = 0.1f;
        this.f77785q = -522.6f;
        this.f77786r = 0.1f;
        this.f77787s = -197.6f;
        this.f77788t = this.f77782n;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f77789u)) {
            canvas.save();
            float height = (float) this.f77789u.height();
            float f = (float) this.f77774f;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(((float) this.f77789u.width()) / 360.0f, ((float) this.f77774f) / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.f77788t < 1.0f) {
                if (this.f77777i == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.f77788t - 4.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.f77788t);
            }
            int i = this.f77775g;
            if (i != -1) {
                this.f77778j.setColor(i);
                this.f77778j.setAlpha((int) (this.f77783o * ((float) this.f77772d)));
            } else {
                this.f77778j.setColor(this.f77776h);
                this.f77778j.setAlpha((int) (this.f77783o * ((float) this.f77772d)));
            }
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.f77778j);
            this.f77778j.setColor(this.f77776h);
            if (this.f77773e) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.f77778j.setAlpha((int) (this.f77783o * 255.0f));
            canvas.save();
            canvas.translate(this.f77785q, 0.0f);
            canvas.scale(this.f77784p, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.f77778j);
            canvas.restore();
            canvas.save();
            canvas.translate(this.f77787s, 0.0f);
            canvas.scale(this.f77786r, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.f77778j);
            canvas.restore();
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.f77788t;
    }

    public int getIntrinsicHeight() {
        return this.f77774f;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.f77784p;
    }

    public float getRect1TranslationX() {
        return this.f77785q;
    }

    public float getRect2ScaleX() {
        return this.f77786r;
    }

    public float getRect2TranslationX() {
        return this.f77787s;
    }

    public final boolean isRunning() {
        return isVisible();
    }

    public void setAlpha(int i) {
        this.f77783o = (float) i;
        invalidateSelf();
    }

    public void setBarHeight(int i) {
        this.f77774f = i;
        invalidateSelf();
    }

    public void setColor(int i) {
        this.f77776h = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f77778j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowMode(int i) {
        this.f77777i = i;
        float f = i != 2 ? 0.0f : 1.0f;
        this.f77782n = f;
        this.f77780l.setFloatValues(new float[]{f});
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.f77788t = f;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f) {
        this.f77784p = f;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f) {
        this.f77785q = f;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f) {
        this.f77786r = f;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f) {
        this.f77787s = f;
        invalidateSelf();
    }

    public void setTrackColor(int i) {
        this.f77775g = i;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f77770b;
        if (!z3 && !z2) {
            return false;
        }
        this.f77770b = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                mo34246c();
            }
            this.f77780l.cancel();
            this.f77779k.setFloatValues(new float[]{this.f77781m});
            this.f77779k.start();
            if (!this.f77769a.isStarted()) {
                this.f77769a.start();
            }
            this.f77771c = null;
        } else if (z3) {
            this.f77779k.cancel();
            this.f77780l.setFloatValues(new float[]{this.f77782n});
            this.f77780l.start();
        }
        return z3;
    }

    public final void start() {
        setVisible(true, true);
    }

    public final void stop() {
        setVisible(false, false);
    }
}
