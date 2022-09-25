package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4552o.p4553a.C59497bu;
import com.google.common.p4552o.p4553a.C59498bv;
import com.google.common.p4552o.p4553a.C59499bw;
import com.google.common.p4552o.p4553a.C59500bx;
import com.google.common.p4552o.p4553a.C59525cv;
import com.google.common.p4552o.p4553a.C59527cx;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62995dn;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.l */
/* compiled from: PG */
public abstract class C112145l {

    /* renamed from: q */
    public static final C121511c f311417q = C121511c.m200805a("Tapas/SuggestionsAdjuster", C121511c.f337208a);

    /* renamed from: a */
    public abstract C48667ab mo99422a();

    /* renamed from: i */
    public abstract C60870cx mo99416i(C113405ep epVar, Map map);

    /* renamed from: k */
    public final C113415ez mo99423k(C113415ez ezVar, double d) {
        C113414ey h = ezVar.mo100208h();
        h.mo100163h(d);
        C59525cv cvVar = (C59525cv) ezVar.mo100214n().toBuilder();
        int i = mo99422a().f125795r;
        C59497bu buVar = (C59497bu) C59500bx.f157874c.createBuilder();
        C59498bv bvVar = (C59498bv) C59499bw.f157869d.createBuilder();
        double a = ezVar.mo100201a();
        bvVar.copyOnWrite();
        C59499bw bwVar = (C59499bw) bvVar.instance;
        bwVar.f157871a |= 1;
        bwVar.f157872b = a;
        bvVar.copyOnWrite();
        C59499bw bwVar2 = (C59499bw) bvVar.instance;
        bwVar2.f157871a |= 2;
        bwVar2.f157873c = d;
        buVar.copyOnWrite();
        C59500bx bxVar = (C59500bx) buVar.instance;
        C59499bw bwVar3 = (C59499bw) bvVar.build();
        bwVar3.getClass();
        bxVar.f157877b = bwVar3;
        bxVar.f157876a |= 1;
        C59500bx bxVar2 = (C59500bx) buVar.build();
        bxVar2.getClass();
        cvVar.copyOnWrite();
        C59527cx cxVar = (C59527cx) cvVar.instance;
        C62995dn dnVar = cxVar.f157957i;
        if (!dnVar.f170058b) {
            cxVar.f157957i = dnVar.mo58980a();
        }
        cxVar.f157957i.put(Integer.valueOf(i), bxVar2);
        h.mo100160e((C59527cx) cvVar.build());
        return h.mo100156a();
    }
}
