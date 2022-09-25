package com.google.p3723ar.imp.view;

import android.view.Choreographer;

/* renamed from: com.google.ar.imp.view.e */
/* compiled from: PG */
final class C47989e implements Choreographer.FrameCallback {

    /* renamed from: a */
    private final C47993i f124202a;

    public C47989e(C47993i iVar) {
        this.f124202a = iVar;
    }

    public final void doFrame(long j) {
        C47993i iVar = this.f124202a;
        iVar.mo53096b();
        C48011u uVar = iVar.f124209e;
        uVar.getClass();
        long j2 = iVar.f124208d;
        if (j2 != 0) {
            iVar.f124208d = j;
        } else {
            j2 = j;
        }
        long a = uVar.f124248a.mo53089a(j2);
        if (a >= 0 && iVar.f124208d == 0) {
            iVar.f124208d = j;
            iVar.f124205a.mo53092a().postDelayed(iVar.f124207c, Math.max(a, 2));
        }
        Choreographer.getInstance().postFrameCallback(iVar.f124206b);
    }
}
