package com.facebook.litho;

import android.graphics.PathEffect;

/* renamed from: com.facebook.litho.d */
/* compiled from: PG */
public final class C6179d {

    /* renamed from: a */
    public final C6207e f18231a;

    /* renamed from: b */
    public C6268fk f18232b;

    /* renamed from: c */
    private final PathEffect[] f18233c = new PathEffect[2];

    public C6179d(C6411u uVar) {
        this.f18232b = uVar.f19013f;
        this.f18231a = new C6207e();
    }

    /* renamed from: a */
    public final void mo13151a() {
        if (this.f18232b == null) {
            throw new IllegalStateException("This builder has already been disposed / built!");
        }
    }

    /* renamed from: b */
    public final void mo13152b(int i, float f) {
        mo13151a();
        int a = this.f18232b.mo13257a(f);
        mo13151a();
        this.f18231a.f18352a[i] = (float) a;
    }

    /* renamed from: c */
    public final void mo13153c(int i, int i2) {
        mo13151a();
        C6207e.m16463c(this.f18231a.f18354c, 9, i2);
    }
}
