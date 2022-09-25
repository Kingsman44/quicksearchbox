package com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9407c.p9411b;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124689da;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124690db;
import com.google.assistant.p3861at.C50131ls;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.e.c.b.m */
/* compiled from: PG */
final class C124765m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f344179a;

    public C124765m(C70862aj ajVar) {
        this.f344179a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C124774v.f344195a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoSearchService");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36285)).mo56386p("VoiceMatchDisabledByAdmin check failed");
        this.f344179a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C50131ls lsVar = ((act) obj).f128879F;
        if (lsVar == null) {
            lsVar = C50131ls.f130322b;
        }
        if (lsVar.f130324a) {
            C59104x b = C124774v.f344195a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BistoSearchService");
            ((C59052c) ((C59052c) b).mo56372aa(36286)).mo56386p("VM disallowed by GWFE");
            C70862aj ajVar = this.f344179a;
            C124689da daVar = (C124689da) C124690db.f343992c.createBuilder();
            daVar.copyOnWrite();
            C124690db dbVar = (C124690db) daVar.instance;
            dbVar.f343994a |= 1;
            dbVar.f343995b = 1;
            ajVar.mo20123c((C124690db) daVar.build());
        } else {
            C70862aj ajVar2 = this.f344179a;
            C124689da daVar2 = (C124689da) C124690db.f343992c.createBuilder();
            daVar2.copyOnWrite();
            C124690db dbVar2 = (C124690db) daVar2.instance;
            dbVar2.f343994a = 1 | dbVar2.f343994a;
            dbVar2.f343995b = 0;
            ajVar2.mo20123c((C124690db) daVar2.build());
        }
        this.f344179a.mo20121a();
    }
}
