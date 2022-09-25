package com.google.p3723ar.imp.view;

/* renamed from: com.google.ar.imp.view.h */
/* compiled from: PG */
final class C47992h implements Runnable {

    /* renamed from: a */
    private final C47993i f124204a;

    public C47992h(C47993i iVar) {
        this.f124204a = iVar;
    }

    public final void run() {
        C47993i iVar = this.f124204a;
        iVar.mo53096b();
        C48011u uVar = iVar.f124209e;
        uVar.getClass();
        long j = iVar.f124208d;
        if (j != 0) {
            long a = uVar.f124248a.mo53089a(j);
            if (a < 0) {
                iVar.f124208d = 0;
                return;
            }
            iVar.f124205a.mo53092a().postDelayed(iVar.f124207c, Math.max(a, 2));
        }
    }
}
