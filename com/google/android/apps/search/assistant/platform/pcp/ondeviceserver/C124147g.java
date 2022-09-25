package com.google.android.apps.search.assistant.platform.pcp.ondeviceserver;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123736bc;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123737bd;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.g */
/* compiled from: PG */
final class C124147g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f342841a;

    public C124147g(C70862aj ajVar) {
        this.f342841a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C124150j.f342846a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.DataService");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(35349)).mo56386p("responseObserver onError");
        this.f342841a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C123746bm bmVar = (C123746bm) obj;
        C70862aj ajVar = this.f342841a;
        C123736bc bcVar = (C123736bc) C123737bd.f341788c.createBuilder();
        bcVar.copyOnWrite();
        C123737bd bdVar = (C123737bd) bcVar.instance;
        bmVar.getClass();
        bdVar.f341791b = bmVar;
        bdVar.f341790a |= 1;
        ajVar.mo20123c((C123737bd) bcVar.build());
        this.f342841a.mo20121a();
    }
}
