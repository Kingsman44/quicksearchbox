package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dr */
/* compiled from: PG */
public final /* synthetic */ class C122846dr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340253a;

    public /* synthetic */ C122846dr(C122870ea eaVar) {
        this.f340253a = eaVar;
    }

    public final void run() {
        C122870ea eaVar = this.f340253a;
        if (!eaVar.f340316q.equals(C122854dz.FINISHED)) {
            ((C59052c) eaVar.f340302c.mo105764c().mo56372aa(34860)).mo56386p("Fulfillment stream finished successfully");
            eaVar.f340301b.mo20121a();
            eaVar.f340316q = C122854dz.FINISHED;
            eaVar.mo105770h();
        }
    }
}
