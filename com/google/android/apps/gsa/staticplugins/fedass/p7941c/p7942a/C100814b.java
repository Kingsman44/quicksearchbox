package com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7942a;

import com.google.android.libraries.geller.C21784f;
import com.google.android.libraries.geller.C21877g;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60890dd;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5130a.C65712ak;
import com.google.protos.p5129p.p5130a.C65713al;
import com.google.protos.p5129p.p5130a.C65716ao;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C100814b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C100815c f281763a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f281764b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f281765c;

    /* renamed from: d */
    public final /* synthetic */ C65712ak f281766d;

    public /* synthetic */ C100814b(C100815c cVar, C60870cx cxVar, C60870cx cxVar2, C65712ak akVar) {
        this.f281763a = cVar;
        this.f281764b = cxVar;
        this.f281765c = cxVar2;
        this.f281766d = akVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C100815c cVar = this.f281763a;
        C60870cx cxVar = this.f281764b;
        C60870cx cxVar2 = this.f281765c;
        C65712ak akVar = this.f281766d;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar);
        if (!axVar.mo56113h()) {
            C59104x d = C100815c.f281767a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NluCollAdapter");
            ((C59052c) ((C59052c) d).mo56372aa(19562)).mo56386p("Account name missing.");
            return C60856cj.m92900i(false);
        }
        C65713al alVar = (C65713al) C65716ao.f178536d.createBuilder();
        alVar.copyOnWrite();
        C65716ao aoVar = (C65716ao) alVar.instance;
        aoVar.f178539b = 4;
        aoVar.f178538a |= 1;
        String str = (String) axVar.mo56107c();
        alVar.copyOnWrite();
        C65716ao aoVar2 = (C65716ao) alVar.instance;
        str.getClass();
        aoVar2.f178538a |= 2;
        aoVar2.f178540c = str;
        C21784f fVar = new C21784f((Geller) C60856cj.m92909r(cxVar2), (C65716ao) alVar.build(), C65753ak.ASSISTANT_HISTORY, cVar.f281768b, new C60890dd());
        fVar.f60100f = akVar;
        cVar.f281769c = new C21877g(fVar);
        return C60856cj.m92900i(true);
    }
}
