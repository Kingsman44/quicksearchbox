package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.f */
/* compiled from: PG */
class C84007f extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public final Drawable f228847a;

    /* renamed from: b */
    final int f228848b;

    /* renamed from: c */
    final int f228849c;

    /* renamed from: d */
    public final ValueAnimator f228850d;

    /* renamed from: e */
    public float f228851e = 0.0f;

    /* renamed from: f */
    public boolean f228852f = true;

    /* renamed from: g */
    private final Drawable f228853g;

    public C84007f(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable != null) {
            this.f228853g = drawable;
            this.f228847a = drawable2;
            drawable.setCallback(this);
            drawable2.setCallback(this);
            this.f228848b = i;
            this.f228849c = i2;
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 2.0f}).setDuration((long) (i + i2));
            this.f228850d = duration;
            duration.addUpdateListener(new C84006e(this));
            mo77453b(true);
            return;
        }
        throw new IllegalArgumentException("Front and back drawables must not be null.");
    }

    /* renamed from: a */
    public void mo77452a() {
        throw null;
    }

    /* renamed from: b */
    public void mo77453b(boolean z) {
        float f = this.f228851e;
        this.f228850d.cancel();
        float f2 = true != z ? 2.0f : 0.0f;
        this.f228851e = f2;
        this.f228852f = z;
        if (f2 != f) {
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (isVisible() && !bounds.isEmpty()) {
            int i = this.f228848b;
            int i2 = this.f228849c;
            float f = (float) (i + i2);
            float f2 = (f - ((float) i2)) / f;
            float f3 = this.f228851e / 2.0f;
            float f4 = 0.0f / f;
            float f5 = (f4 + f2) / 2.0f;
            if (f3 < f5) {
                drawable = this.f228853g;
            } else {
                drawable = this.f228847a;
            }
            float abs = (f3 > f4 && f3 < f2) ? Math.abs(f3 - f5) * (1.0f / (f5 - f4)) : 1.0f;
            canvas.save();
            canvas.scale(abs, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return resolveOpacity(this.f228853g.getOpacity(), -1);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.isEmpty()) {
            this.f228853g.setBounds(0, 0, 0, 0);
            this.f228847a.setBounds(0, 0, 0, 0);
            return;
        }
        this.f228853g.setBounds(rect);
        this.f228847a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        return this.f228853g.setLevel(i) || this.f228847a.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
        this.f228853g.setAlpha(i);
        ((C84005d) this.f228847a).f228840a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f228853g.setColorFilter(colorFilter);
        ((C84005d) this.f228847a).f228840a.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
