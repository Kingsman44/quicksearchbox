package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.p6487s3.C84335x;
import com.google.android.apps.gsa.p6487s3.producers.C84299a;
import com.google.android.apps.gsa.p6487s3.producers.C84304c;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118934q;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.shared.logger.C89837aa;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4453d.C57960f;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57986e;
import com.google.p4449cd.p4456g.p4459c.C58002f;
import com.google.protobuf.C62940bt;
import com.google.speech.p5224k.p5225a.C67226d;
import com.google.speech.p5224k.p5225a.C67227e;
import dagger.p5295b.C68283d;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.ct */
/* compiled from: PG */
public final class C103584ct {

    /* renamed from: a */
    public static final C118928k f288582a;

    static {
        C62940bt btVar = C67227e.f182707d;
        C67226d dVar = (C67226d) C67227e.f182706c.createBuilder();
        dVar.copyOnWrite();
        C67227e eVar = (C67227e) dVar.instance;
        eVar.f182710b = 2;
        eVar.f182709a |= 1;
        f288582a = new C118928k(C58833ax.m90834k((C67227e) dVar.build()), btVar);
    }

    /* renamed from: a */
    static C58833ax m171559a(C57981b bVar, C69464a aVar, Query query, C69464a aVar2, C89859i iVar, C89837aa aaVar) {
        if (!query.mo84363bw("android.opa.extra.NGA_NON_VOICE") && (!query.mo84386cS() || ((query.mo84324bI() && (!query.mo84411cr() || !((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f251716o))) || (!((C74713bn) aVar2.mo17428b()).mo71078c() && ((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f250999aY))))) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(new C58002f(bVar, new C103582cr(iVar, aVar, aaVar)));
    }

    /* renamed from: b */
    static C60870cx m171560b(C57981b bVar, C85133a aVar, C57960f fVar, Executor executor, C69464a aVar2) {
        C58833ax axVar;
        fVar.mo54567b(new C103581cq(executor, bVar));
        C58833ax k = C58833ax.m90834k(fVar);
        if (((C90021c) aVar2.mo17428b()).mo79746e(C90126fx.f251442ir)) {
            axVar = C58833ax.m90834k(new C84335x());
        } else {
            axVar = C58836b.f156633a;
        }
        return aVar.mo78728b(bVar, k, axVar);
    }

    /* renamed from: c */
    static C57981b m171561c(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C68283d dVar, Executor executor) {
        ArrayList arrayList = new ArrayList();
        if (axVar.mo56113h()) {
            arrayList.add((C57981b) axVar.mo56107c());
        }
        if (axVar2.mo56113h()) {
            arrayList.add((C57981b) axVar2.mo56107c());
        }
        if (axVar3.mo56113h()) {
            arrayList.add((C57981b) axVar3.mo56107c());
        }
        return new C118934q(executor, dVar.mo60297gq(), new C57986e(arrayList));
    }

    /* renamed from: d */
    static C58833ax m171562d(C84299a aVar, Query query) {
        return k.a(query) ? C58833ax.m90834k(new C84304c(aVar, query)) : C58836b.f156633a;
    }
}
