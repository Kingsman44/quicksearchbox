package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.C22727l;
import com.google.android.libraries.gsa.conversation.p1852f.C22581h;
import com.google.android.libraries.gsa.conversation.p1855h.C22709m;

/* renamed from: com.google.android.libraries.gsa.conversation.g.bj */
/* compiled from: PG */
public final /* synthetic */ class C22650bj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22652bl f62387a;

    /* renamed from: b */
    public final /* synthetic */ C22581h f62388b;

    public /* synthetic */ C22650bj(C22652bl blVar, C22581h hVar) {
        this.f62387a = blVar;
        this.f62388b = hVar;
    }

    public final void run() {
        C22652bl blVar = this.f62387a;
        C22581h hVar = this.f62388b;
        if (!blVar.f62393c) {
            if (blVar.f62397g.f62413k == null || blVar.f62392b.isDone()) {
                blVar.mo27760g();
                return;
            }
            if (hVar.f62226b) {
                C22618ae aeVar = blVar.f62391a;
                ((C22727l) aeVar).f62547a.mo27700d(new C22709m(1));
            }
            blVar.f62396f = blVar.f62397g.f62409g.mo26872d();
            blVar.f62394d = blVar.mo27758e(hVar.f62225a);
            if (hVar.f62227c) {
                blVar.mo27759f(true);
            }
        }
    }
}
