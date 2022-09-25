package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import com.google.android.apps.gsa.n.e.d;
import com.google.android.apps.gsa.n.e.e;
import com.google.android.apps.gsa.p5879n.p5880e.C74662f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.i */
/* compiled from: PG */
public final /* synthetic */ class C114291i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114294l f316919a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f316920b;

    public /* synthetic */ C114291i(C114294l lVar, C65753ak akVar) {
        this.f316919a = lVar;
        this.f316920b = akVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C114294l lVar = this.f316919a;
        C65753ak akVar = this.f316920b;
        Void voidR = (Void) obj;
        d createBuilder = e.h.createBuilder();
        C65813cq cqVar = C65813cq.ON_DEMAND;
        createBuilder.copyOnWrite();
        e eVar = createBuilder.instance;
        eVar.f = cqVar.f178923h;
        eVar.a |= 2;
        createBuilder.copyOnWrite();
        e eVar2 = createBuilder.instance;
        eVar2.a |= 1;
        eVar2.e = "agsa";
        createBuilder.b(akVar);
        if (lVar.f316924b.mo79746e(C90025cd.f248150h)) {
            createBuilder.b(C65753ak.ASSISTANT_ACTION_INTERACTION_EVENT);
        }
        C118561t tVar = lVar.f316925c;
        C118522by byVar = C118522by.GELLER_ASSISTANT_ACTION_HISTORY_SYNC_TASK;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328824d = 1;
        agVar.f328821a |= 4;
        long millis = TimeUnit.SECONDS.toMillis(3);
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = millis;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        ajVar.mo58885m(C74662f.f208847a, createBuilder.build());
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        C118476ak akVar2 = (C118476ak) ajVar.build();
        akVar2.getClass();
        agVar3.f328827g = akVar2;
        agVar3.f328821a |= 32;
        if (!tVar.mo103754e(byVar, (C118472ag) afVar.build())) {
            ((C59052c) ((C59052c) C114294l.f316923a.mo56225c()).mo56372aa(28908)).mo56386p("Unable to upload the provided Geller element.");
        }
        return C118826c.f331422a;
    }
}
