package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: com.google.android.material.progressindicator.u */
/* compiled from: PG */
abstract class C44863u {

    /* renamed from: a */
    final C44849g f117062a;

    /* renamed from: b */
    protected C44862t f117063b;

    public C44863u(C44849g gVar) {
        this.f117062a = gVar;
    }

    /* renamed from: a */
    public abstract int mo48293a();

    /* renamed from: b */
    public abstract int mo48294b();

    /* renamed from: c */
    public abstract void mo48295c(Canvas canvas, Rect rect, float f);

    /* renamed from: d */
    public abstract void mo48296d(Canvas canvas, Paint paint, float f, float f2, int i);

    /* renamed from: e */
    public abstract void mo48297e(Canvas canvas, Paint paint);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo48329f(Canvas canvas, Rect rect, float f) {
        this.f117062a.mo48266a();
        mo48295c(canvas, rect, f);
    }
}
