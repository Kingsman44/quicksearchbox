package com.google.android.apps.gsa.staticplugins.fedass.ipc.p7951a;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.a.k */
/* compiled from: PG */
public final /* synthetic */ class C100955k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100963s f282009a;

    /* renamed from: b */
    public final /* synthetic */ C100960p f282010b;

    /* renamed from: c */
    public final /* synthetic */ C100965u f282011c;

    public /* synthetic */ C100955k(C100963s sVar, C100960p pVar, C100965u uVar) {
        this.f282009a = sVar;
        this.f282010b = pVar;
        this.f282011c = uVar;
    }

    public final void run() {
        C100963s sVar = this.f282009a;
        C100960p pVar = this.f282010b;
        C100965u uVar = this.f282011c;
        synchronized (sVar) {
            sVar.f282023e.add(new C100962r(pVar, uVar));
            if (sVar.f282022d.get()) {
                if (sVar.f282021c.get() != null) {
                    sVar.mo92110h();
                    return;
                }
            }
            sVar.mo92111i();
        }
    }
}
