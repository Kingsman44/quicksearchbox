package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class OrbDrawable extends Drawable {

    /* renamed from: a */
    public int f241001a = PrivateKeyType.INVALID;

    /* renamed from: b */
    public int f241002b = 0;

    /* renamed from: c */
    public float f241003c;

    /* renamed from: d */
    public float f241004d;

    /* renamed from: e */
    public int f241005e;

    /* renamed from: f */
    public int f241006f;

    /* renamed from: g */
    public float f241007g;

    /* renamed from: h */
    public int f241008h;

    /* renamed from: i */
    public float f241009i;

    /* renamed from: j */
    private final ValueAnimator f241010j;

    /* renamed from: k */
    private final ValueAnimator f241011k;

    /* renamed from: l */
    private final Paint f241012l;

    /* renamed from: m */
    private final Paint f241013m;

    /* renamed from: n */
    private float f241014n = 1.0f;

    /* renamed from: o */
    private final ArgbEvaluator f241015o;

    public OrbDrawable() {
        Paint paint = new Paint(1);
        this.f241012l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f241006f = 0;
        Paint paint2 = new Paint(1);
        this.f241013m = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f241003c = 0.0f;
        this.f241004d = 0.0f;
        this.f241005e = PrivateKeyType.INVALID;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f241010j = ofFloat;
        ofFloat.addUpdateListener(new C88962g(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f241011k = ofFloat2;
        ofFloat2.addUpdateListener(new C88963h(this));
        this.f241015o = new ArgbEvaluator();
    }

    public void draw(Canvas canvas) {
        this.f241012l.setColor(((Integer) this.f241015o.evaluate(((float) this.f241001a) / 255.0f, -1, Integer.valueOf(this.f241002b))).intValue());
        this.f241012l.setAlpha(PrivateKeyType.INVALID);
        canvas.drawCircle((float) getBounds().centerX(), (float) getBounds().centerY(), this.f241014n, this.f241012l);
        if (this.f241003c != this.f241004d) {
            this.f241013m.setColor(this.f241006f);
            this.f241013m.setAlpha(this.f241005e);
            float f = (this.f241004d - this.f241003c) * this.f241014n;
            this.f241013m.setStrokeWidth(f);
            canvas.drawCircle((float) getBounds().centerX(), (float) getBounds().centerY(), (this.f241004d * this.f241014n) - (f / 2.0f), this.f241013m);
        }
    }

    public void expandToShowColor(int i, float f, int i2, TimeInterpolator timeInterpolator, long j) {
        int i3 = this.f241002b;
        if (i3 != i) {
            setColorWithoutAnimation(i3);
            this.f241004d = 1.0f;
            int i4 = this.f241002b;
            this.f241006f = i4;
            this.f241005e = Color.alpha(i4);
            this.f241002b = i;
            this.f241007g = f;
            this.f241008h = i2;
            this.f241011k.setFloatValues(new float[]{0.0f, 1.0f});
            this.f241011k.setInterpolator(timeInterpolator);
            this.f241011k.setDuration(j);
            this.f241011k.start();
        }
    }

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i) {
        this.f241001a = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f241012l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorWithoutAnimation(int i) {
        this.f241010j.cancel();
        this.f241011k.cancel();
        this.f241004d = 0.0f;
        this.f241003c = 0.0f;
        this.f241002b = i;
        setAlpha(Color.alpha(i));
        invalidateSelf();
    }

    public void setRadius(float f) {
        if (this.f241014n != f) {
            this.f241014n = f;
            invalidateSelf();
        }
    }

    public void shrinkToShowColor(int i, float f, TimeInterpolator timeInterpolator, long j) {
        int i2 = this.f241002b;
        if (i2 != i) {
            setColorWithoutAnimation(i2);
            this.f241004d = 1.0f;
            int i3 = this.f241002b;
            this.f241006f = i3;
            this.f241005e = Color.alpha(i3);
            this.f241002b = i;
            this.f241009i = f;
            this.f241010j.setFloatValues(new float[]{1.0f, 0.0f});
            this.f241010j.setInterpolator(timeInterpolator);
            this.f241010j.setDuration(j);
            this.f241010j.start();
        }
    }
}
