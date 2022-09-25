package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124701dm;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124702dn;
import com.google.assistant.p3861at.C50376uu;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.n */
/* compiled from: PG */
final class C124766n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f344180a;

    public C124766n(C70862aj ajVar) {
        this.f344180a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C124774v.f344195a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36287)).mo56386p("Failed to get unicorn info");
        this.f344180a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        act act = (act) obj;
        if ((act.f128894a & 1048576) != 0) {
            C70862aj ajVar = this.f344180a;
            C124701dm dmVar = (C124701dm) C124702dn.f344024d.createBuilder();
            C50376uu uuVar = act.f128912s;
            if (uuVar == null) {
                uuVar = C50376uu.f131134d;
            }
            String str = uuVar.f131137b;
            dmVar.copyOnWrite();
            C124702dn dnVar = (C124702dn) dmVar.instance;
            str.getClass();
            dnVar.f344026a |= 1;
            dnVar.f344027b = str;
            C50376uu uuVar2 = act.f128912s;
            if (uuVar2 == null) {
                uuVar2 = C50376uu.f131134d;
            }
            String str2 = uuVar2.f131138c;
            dmVar.copyOnWrite();
            C124702dn dnVar2 = (C124702dn) dmVar.instance;
            str2.getClass();
            dnVar2.f344026a |= 2;
            dnVar2.f344028c = str2;
            ajVar.mo20123c((C124702dn) dmVar.build());
            this.f344180a.mo20121a();
            return;
        }
        C59104x d = C124774v.f344195a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) d).mo56372aa(36288)).mo56386p("Parent selector UI missing");
        this.f344180a.mo20121a();
    }
}
