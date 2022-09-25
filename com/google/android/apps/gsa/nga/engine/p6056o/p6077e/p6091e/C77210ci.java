package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ci */
/* compiled from: PG */
public final /* synthetic */ class C77210ci implements C77193bs {

    /* renamed from: a */
    public final /* synthetic */ C77211cj f213035a;

    public /* synthetic */ C77210ci(C77211cj cjVar) {
        this.f213035a = cjVar;
    }

    /* renamed from: a */
    public final C60870cx mo72467a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        C77211cj cjVar = this.f213035a;
        if (!nVar.mo71328c().mo71266e()) {
            cjVar.f213036a.mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(23243);
        C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
        nlVar.mo53648b((C58485gu) Collection.EL.stream(guVar).map(C77208cg.f213033a).collect(C58370cn.f155946a));
        nlVar.copyOnWrite();
        C51594nm nmVar = (C51594nm) nlVar.instance;
        nmVar.f134476a |= 1;
        nmVar.f134478c = true;
        C81442m.m129557s(lVar, t.p("timer.UPDATE_TIMER", (C51594nm) nlVar.build()));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
