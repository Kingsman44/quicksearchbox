package com.google.android.libraries.lens.view.p2085ax;

/* renamed from: com.google.android.libraries.lens.view.ax.c */
/* compiled from: PG */
final class C25601c extends C25615q {

    /* renamed from: a */
    public String f69649a;

    /* renamed from: b */
    public int f69650b;

    /* renamed from: c */
    public int f69651c;

    public C25601c() {
    }

    public C25601c(C25616r rVar) {
        C25602d dVar = (C25602d) rVar;
        this.f69650b = dVar.f69653b;
        this.f69651c = dVar.f69654c;
        this.f69649a = dVar.f69652a;
    }

    /* renamed from: a */
    public final C25616r mo30699a() {
        int i;
        int i2 = this.f69650b;
        if (i2 != 0 && (i = this.f69651c) != 0) {
            return new C25602d(i2, i, this.f69649a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f69650b == 0) {
            sb.append(" playbackState");
        }
        if (this.f69651c == 0) {
            sb.append(" errorState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo30700b(String str) {
        this.f69649a = str;
    }

    /* renamed from: c */
    public final void mo30701c(int i) {
        this.f69651c = i;
    }

    /* renamed from: d */
    public final void mo30702d(int i) {
        this.f69650b = i;
    }
}
