package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.material.internal.k */
/* compiled from: PG */
public final class C44751k extends Drawable {

    /* renamed from: a */
    private final Drawable f116678a;

    /* renamed from: b */
    private final Drawable f116679b;

    /* renamed from: c */
    private final float[] f116680c = new float[2];

    /* renamed from: d */
    private float f116681d;

    public C44751k(Drawable drawable, Drawable drawable2) {
        this.f116678a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f116679b = mutate;
        mutate.setAlpha(0);
    }

    /* renamed from: a */
    public final void mo48077a(float f) {
        if (this.f116681d != f) {
            this.f116681d = f;
            C44753m.m79358a(f, this.f116680c);
            this.f116678a.setAlpha((int) (this.f116680c[0] * 255.0f));
            this.f116679b.setAlpha((int) (this.f116680c[1] * 255.0f));
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        this.f116678a.draw(canvas);
        this.f116679b.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f116678a.getIntrinsicHeight(), this.f116679b.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f116678a.getIntrinsicWidth(), this.f116679b.getIntrinsicWidth());
    }

    public final int getMinimumHeight() {
        return Math.max(this.f116678a.getMinimumHeight(), this.f116679b.getMinimumHeight());
    }

    public final int getMinimumWidth() {
        return Math.max(this.f116678a.getMinimumWidth(), this.f116679b.getMinimumWidth());
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        return this.f116678a.isStateful() || this.f116679b.isStateful();
    }

    public final void setAlpha(int i) {
        if (this.f116681d <= 0.5f) {
            this.f116678a.setAlpha(i);
            this.f116679b.setAlpha(0);
        } else {
            this.f116678a.setAlpha(0);
            this.f116679b.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f116678a.setBounds(i, i2, i3, i4);
        this.f116679b.setBounds(i, i2, i3, i4);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f116678a.setColorFilter(colorFilter);
        this.f116679b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setState(int[] iArr) {
        return this.f116678a.setState(iArr) || this.f116679b.setState(iArr);
    }
}
