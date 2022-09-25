package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.j */
/* compiled from: PG */
public final /* synthetic */ class C26691j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26701t f72769a;

    /* renamed from: b */
    public final /* synthetic */ int f72770b;

    public /* synthetic */ C26691j(C26701t tVar, int i) {
        this.f72769a = tVar;
        this.f72770b = i;
    }

    public final void run() {
        C26701t tVar = this.f72769a;
        int i = this.f72770b;
        int i2 = tVar.f72781A;
        if (i != i2) {
            if (i == 1 && i2 != 1) {
                tVar.f72812y.mo31954a();
            }
            tVar.f72781A = i;
            if (i - 1 != 0) {
                tVar.mo32005a();
                tVar.f72792e.mo32015b();
                return;
            }
            tVar.f72792e.mo32014a();
        }
    }
}
