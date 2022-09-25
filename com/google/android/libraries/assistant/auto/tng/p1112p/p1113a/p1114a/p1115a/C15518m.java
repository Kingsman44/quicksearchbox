package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C15518m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15519n f46478a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f46479b;

    public /* synthetic */ C15518m(C15519n nVar, Throwable th) {
        this.f46478a = nVar;
        this.f46479b = th;
    }

    public final void run() {
        C15519n nVar = this.f46478a;
        Throwable th = this.f46479b;
        if (nVar.f46483d) {
            C59104x d = C15527v.f46501a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3ConnectionImpl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(46127)).mo56386p("s3RequestStreamObserver onError");
            C15527v.m32268b(nVar.f46481b, nVar.f46482c);
            nVar.f46481b.mo20122b(Status.f186913k.mo61678e(th).asException());
            nVar.f46483d = false;
        }
    }
}
