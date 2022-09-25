package com.google.android.libraries.lens.view.p2078at;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.google.common.base.C58833ax;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.lens.view.at.ax */
/* compiled from: PG */
public final class C25518ax {

    /* renamed from: a */
    public final PointF f69479a;

    /* renamed from: b */
    public final float f69480b;

    /* renamed from: c */
    private final float f69481c;

    /* renamed from: d */
    private final float f69482d;

    public C25518ax(PointF pointF, float f, float f2) {
        this.f69479a = pointF;
        this.f69480b = f <= 0.0f ? f2 : f;
        this.f69481c = f2;
        this.f69482d = 8.0f;
    }

    /* renamed from: c */
    public static C25518ax m46996c(C25518ax axVar, float f, float f2, float f3, float f4, float f5) {
        float max = Math.max(Math.min(axVar.f69480b * f, 8.0f), axVar.f69481c);
        float f6 = max / axVar.f69480b;
        float f7 = (axVar.f69479a.x * f6) + m46998f(f6, f2, f4);
        return new C25518ax(new PointF(Math.signum(f7) * Math.min(Math.abs(f7), Math.abs(max < 1.0f ? 0.0f : (max / 2.0f) - 8.0f)), (axVar.f69479a.y * f6) + m46998f(f6, f3, f5)), max, axVar.f69481c);
    }

    /* renamed from: e */
    public static void m46997e(C58833ax axVar, View view) {
        if (axVar.mo56113h()) {
            C25518ax axVar2 = (C25518ax) axVar.mo56107c();
            view.setTranslationX(axVar2.f69479a.x * ((float) view.getWidth()));
            view.setTranslationY(axVar2.f69479a.y * ((float) view.getHeight()));
            view.setScaleX(axVar2.f69480b);
            view.setScaleY(axVar2.f69480b);
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    /* renamed from: f */
    private static float m46998f(float f, float f2, float f3) {
        return ((f2 - 8.0f) * (1.0f - f)) + f3;
    }

    /* renamed from: a */
    public final RectF mo30546a(RectF rectF) {
        return new RectF(((rectF.left - 8.0f) * this.f69480b) + 0.5f + this.f69479a.x, ((rectF.top - 8.0f) * this.f69480b) + 0.5f + this.f69479a.y, ((rectF.right - 8.0f) * this.f69480b) + 0.5f + this.f69479a.x, ((rectF.bottom - 8.0f) * this.f69480b) + 0.5f + this.f69479a.y);
    }

    /* renamed from: b */
    public final C25518ax mo30547b(float f, PointF pointF) {
        return m46996c(this, f, pointF.x, pointF.y, 0.0f, 0.0f);
    }

    /* renamed from: d */
    public final C25518ax mo30548d(PointF pointF) {
        return m46996c(this, 1.0f, 0.5f, 0.5f, pointF.x, pointF.y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25518ax) {
            C25518ax axVar = (C25518ax) obj;
            if (this.f69480b == axVar.f69480b && this.f69479a.x == axVar.f69479a.x && this.f69479a.y == axVar.f69479a.y && this.f69481c == axVar.f69481c) {
                float f = axVar.f69482d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new float[]{this.f69480b, this.f69479a.x, this.f69479a.y, this.f69481c, 8.0f});
    }

    public final String toString() {
        String obj = this.f69479a.toString();
        float f = this.f69480b;
        float f2 = this.f69481c;
        return "ViewTransformation{translation=" + obj + ", zoomScale=" + f + ", minScale=" + f2 + ", maxScale=8.0}";
    }
}
