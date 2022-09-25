package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C15524s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15526u f46492a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f46493b;

    public /* synthetic */ C15524s(C15526u uVar, Throwable th) {
        this.f46492a = uVar;
        this.f46493b = th;
    }

    public final void run() {
        Status.Code code;
        C15526u uVar = this.f46492a;
        Throwable th = this.f46493b;
        C59104x b = C15527v.f46501a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "S3ConnectionImpl");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(46137)).mo56386p("S3ResponseObserver#onError");
        if ((th instanceof C70761fa) && ((code = ((C70761fa) th).f188571a.getCode()) == Status.Code.UNAUTHENTICATED || code == Status.Code.INVALID_ARGUMENT)) {
            uVar.f46499d.mo22352b(C37179a.f97552cR);
        }
        uVar.f155056f.mo54590g(th);
        uVar.mo22391e();
    }
}
