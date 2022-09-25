package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.p4449cd.p4456g.C57996c;

/* renamed from: com.google.android.libraries.gsa.conversation.g.bh */
/* compiled from: PG */
public final /* synthetic */ class C22648bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22652bl f62381a;

    /* renamed from: b */
    public final /* synthetic */ C57996c f62382b;

    public /* synthetic */ C22648bh(C22652bl blVar, C57996c cVar) {
        this.f62381a = blVar;
        this.f62382b = cVar;
    }

    public final void run() {
        C22652bl blVar = this.f62381a;
        blVar.f62395e = this.f62382b;
        if (blVar.f62392b.isDone()) {
            blVar.mo27760g();
            return;
        }
        blVar.f62397g.mo27770l();
        blVar.f62397g.f62413k = C22668l.f62437a;
    }
}
