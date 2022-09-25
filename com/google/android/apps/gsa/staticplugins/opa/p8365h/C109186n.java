package com.google.android.apps.gsa.staticplugins.opa.p8365h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.n */
/* compiled from: PG */
public final /* synthetic */ class C109186n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109191s f304014a;

    public /* synthetic */ C109186n(C109191s sVar) {
        this.f304014a = sVar;
    }

    public final void run() {
        C109191s sVar = this.f304014a;
        C109189q qVar = sVar.f304028j;
        if (qVar != null) {
            sVar.f304023e.unbindService(qVar);
            sVar.f304028j = null;
            sVar.f304029k = null;
        }
    }
}
