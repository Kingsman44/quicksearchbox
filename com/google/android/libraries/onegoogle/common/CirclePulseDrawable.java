package com.google.android.libraries.onegoogle.common;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1928a;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class CirclePulseDrawable extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public final Drawable f83305a;

    /* renamed from: b */
    public int f83306b;

    /* renamed from: c */
    private final RectF f83307c;

    /* renamed from: d */
    private final C30918e f83308d;

    /* renamed from: e */
    private final C30918e f83309e;

    /* renamed from: f */
    private final int f83310f;

    /* renamed from: g */
    private final int f83311g;

    public CirclePulseDrawable(Drawable drawable, int i, int i2) {
        this.f83305a = drawable;
        RectF rectF = new RectF(drawable.getBounds());
        this.f83307c = rectF;
        this.f83306b = (int) rectF.width();
        drawable.setCallback(this);
        this.f83308d = new C30918e(i);
        this.f83310f = Color.alpha(i);
        this.f83309e = new C30918e(i2);
        this.f83311g = Color.alpha(i2);
    }

    /* renamed from: b */
    private final void m57678b(C30918e eVar, int i) {
        eVar.f83348c = i;
        m57679c(eVar, this.f83307c);
        this.f83305a.invalidateSelf();
    }

    /* renamed from: c */
    private static void m57679c(C30918e eVar, RectF rectF) {
        float f = (float) eVar.f83348c;
        RectF rectF2 = new RectF(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f);
        eVar.f83347b.reset();
        eVar.f83347b.addOval(rectF2, Path.Direction.CW);
        eVar.f83347b.addOval(rectF, Path.Direction.CCW);
    }

    /* renamed from: a */
    public final void mo36571a() {
        Rect bounds = getBounds();
        int width = (getBounds().width() - this.f83306b) / 2;
        int height = (getBounds().height() - this.f83306b) / 2;
        this.f83305a.setBounds(bounds.left + width, bounds.top + height, bounds.right - width, bounds.bottom - height);
        this.f83307c.set(this.f83305a.getBounds());
        m57679c(this.f83308d, this.f83307c);
        m57679c(this.f83309e, this.f83307c);
    }

    public final void draw(Canvas canvas) {
        this.f83305a.draw(canvas);
        C30918e eVar = this.f83308d;
        canvas.drawPath(eVar.f83347b, eVar.f83346a);
        C30918e eVar2 = this.f83309e;
        canvas.drawPath(eVar2.f83347b, eVar2.f83346a);
    }

    public int getAlpha() {
        return C1928a.m5215a(this.f83305a);
    }

    public int getFirstPulseSize() {
        return this.f83308d.f83348c;
    }

    public final int getOpacity() {
        return this.f83305a.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.f83309e.f83348c;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo36571a();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f83308d.f83346a.setAlpha((this.f83310f * i) / PrivateKeyType.INVALID);
        this.f83309e.f83346a.setAlpha((this.f83311g * i) / PrivateKeyType.INVALID);
        this.f83305a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f83305a.setColorFilter(colorFilter);
    }

    public void setFirstPulseSize(int i) {
        m57678b(this.f83308d, i);
    }

    public void setSecondPulseSize(int i) {
        m57678b(this.f83309e, i);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
