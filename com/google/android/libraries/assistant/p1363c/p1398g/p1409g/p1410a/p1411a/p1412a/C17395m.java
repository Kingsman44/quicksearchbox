package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C17395m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17398p f50284a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f50285b;

    public /* synthetic */ C17395m(C17398p pVar, Throwable th) {
        this.f50284a = pVar;
        this.f50285b = th;
    }

    public final void run() {
        C17398p pVar = this.f50284a;
        Throwable th = this.f50285b;
        C59104x b = C17399q.f50291a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(42700)).mo56386p("S3ResponseObserver#onError");
        pVar.f155056f.mo54590g(th);
        pVar.mo23344d();
    }
}
