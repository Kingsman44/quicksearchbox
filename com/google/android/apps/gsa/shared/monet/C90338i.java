package com.google.android.apps.gsa.shared.monet;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.shared.monet.i */
/* compiled from: PG */
public final /* synthetic */ class C90338i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90347r f252290a;

    public /* synthetic */ C90338i(C90347r rVar) {
        this.f252290a = rVar;
    }

    public final void run() {
        C90347r rVar = this.f252290a;
        C58838bb.m90884s(rVar.f252325s == C90346q.RESUMED, "onShow() called before onResume.");
        rVar.f252310d.mo84015g();
        rVar.f252325s = C90346q.SHOWN;
    }
}
