package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: com.google.android.material.progressindicator.w */
/* compiled from: PG */
public final class C44865w extends C44862t {

    /* renamed from: a */
    public final C44863u f117067a;

    /* renamed from: b */
    public final C44864v f117068b;

    public C44865w(Context context, C44849g gVar, C44863u uVar, C44864v vVar) {
        super(context, gVar);
        this.f117067a = uVar;
        uVar.f117063b = this;
        this.f117068b = vVar;
        vVar.f117064j = this;
    }

    /* renamed from: j */
    public static C44865w m79636j(Context context, C44856n nVar) {
        return new C44865w(context, nVar, new C44850h(nVar), new C44855m(nVar));
    }

    /* renamed from: a */
    public final boolean mo48304a(boolean z, boolean z2, boolean z3) {
        boolean a = super.mo48304a(z, z2, z3);
        if (!isRunning()) {
            this.f117068b.mo48257a();
        }
        C44836a.m79572a(this.f117055d.getContentResolver());
        if (z && z3) {
            this.f117068b.mo48260d();
        }
        return a;
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f117067a.mo48329f(canvas, getBounds(), mo48314b());
            this.f117067a.mo48297e(canvas, this.f117059h);
            int i = 0;
            while (true) {
                C44864v vVar = this.f117068b;
                int[] iArr = vVar.f117066l;
                if (i < iArr.length) {
                    C44863u uVar = this.f117067a;
                    Paint paint = this.f117059h;
                    float[] fArr = vVar.f117065k;
                    int i2 = i + i;
                    uVar.mo48296d(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public final int getIntrinsicHeight() {
        return this.f117067a.mo48293a();
    }

    public final int getIntrinsicWidth() {
        return this.f117067a.mo48294b();
    }
}
