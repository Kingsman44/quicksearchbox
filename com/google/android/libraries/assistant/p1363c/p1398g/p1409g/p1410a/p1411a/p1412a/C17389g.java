package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C17389g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17393k f50270a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f50271b;

    public /* synthetic */ C17389g(C17393k kVar, Throwable th) {
        this.f50270a = kVar;
        this.f50271b = th;
    }

    public final void run() {
        C17393k kVar = this.f50270a;
        Throwable th = this.f50271b;
        if (kVar.f50280c) {
            C59104x d = C17399q.f50291a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS.Server");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42694)).mo56386p("s3RequestStreamObserver onError");
            kVar.f50279b.mo20122b(Status.f186913k.mo61678e(th).asException());
            kVar.f50280c = false;
        }
    }
}
