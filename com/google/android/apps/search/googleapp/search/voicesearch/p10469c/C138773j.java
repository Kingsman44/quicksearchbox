package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138716b;
import com.google.android.libraries.assistant.p1533o.C18457at;
import com.google.android.libraries.assistant.p1533o.C18458au;
import com.google.android.libraries.assistant.p1533o.C18459av;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.j */
/* compiled from: PG */
final class C138773j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f377464a;

    /* renamed from: b */
    final /* synthetic */ C138774k f377465b;

    public C138773j(C138774k kVar, C70862aj ajVar) {
        this.f377465b = kVar;
        this.f377464a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f377464a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C138716b bVar = (C138716b) obj;
        C18458au auVar = (C18458au) C18459av.f52376c.createBuilder();
        String c = bVar.mo114498c();
        auVar.copyOnWrite();
        c.getClass();
        ((C18459av) auVar.instance).f52378a = c;
        C138774k kVar = this.f377465b;
        if (!kVar.f377474i || (kVar.f377473h && kVar.f377475j)) {
            C58485gu a = bVar.mo114496a();
            auVar.copyOnWrite();
            C18459av avVar = (C18459av) auVar.instance;
            C62971cq cqVar = avVar.f52379b;
            if (!cqVar.mo58948c()) {
                avVar.f52379b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) a, (List) avVar.f52379b);
        }
        C70862aj ajVar = this.f377464a;
        C18457at atVar = (C18457at) this.f377465b.f377469d.toBuilder();
        atVar.copyOnWrite();
        C18460aw awVar = (C18460aw) atVar.instance;
        C18459av avVar2 = (C18459av) auVar.build();
        avVar2.getClass();
        awVar.f52387f = avVar2;
        awVar.f52382a |= 2;
        C138774k.m225430a(ajVar, (C18460aw) atVar.build());
    }
}
