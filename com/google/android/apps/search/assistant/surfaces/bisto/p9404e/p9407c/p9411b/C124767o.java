package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124700dl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62912at;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.o */
/* compiled from: PG */
final class C124767o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f344181a;

    /* renamed from: b */
    final /* synthetic */ C124700dl f344182b;

    public C124767o(C70862aj ajVar, C124700dl dlVar) {
        this.f344181a = ajVar;
        this.f344182b = dlVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C124774v.f344195a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36289)).mo56389s("PR update failed %s", this.f344182b.f344022b);
        this.f344181a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f344181a.mo20123c(C62912at.f169862a);
        this.f344181a.mo20121a();
    }
}
