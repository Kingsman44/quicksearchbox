package com.google.android.apps.gsa.p8839t.p8844e;

import com.google.android.apps.gsa.contacts.ci;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123767cg;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123769ci;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.t.e.a */
/* compiled from: PG */
public final /* synthetic */ class C118352a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118356e f328501a;

    public /* synthetic */ C118352a(C118356e eVar) {
        this.f328501a = eVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118356e eVar = this.f328501a;
        int a = (int) eVar.f328508d.mo79743a(C90069du.f249722P);
        C58485gu j = C58485gu.m89842j(eVar.f328510f.e(ci.a, a, true));
        C58485gu j2 = C58485gu.m89842j(eVar.f328510f.e(ci.b, a, true));
        C58485gu j3 = C58485gu.m89842j(eVar.f328510f.e(ci.c, a, true));
        C123769ci ciVar = (C123769ci) C123770cj.f341899b.createBuilder();
        C123767cg cgVar = (C123767cg) C123768ch.f341894d.createBuilder();
        cgVar.mo106129a(eVar.mo103676a(j, C123762cb.AGGREGATE, eVar.f328513i));
        C123762cb cbVar = C123762cb.AGGREGATE;
        cgVar.copyOnWrite();
        C123768ch chVar = (C123768ch) cgVar.instance;
        chVar.f341898c = cbVar.f341879e;
        chVar.f341896a |= 1;
        ciVar.mo106130a(cgVar);
        C123767cg cgVar2 = (C123767cg) C123768ch.f341894d.createBuilder();
        cgVar2.mo106129a(eVar.mo103676a(j2, C123762cb.CALL, eVar.f328513i));
        C123762cb cbVar2 = C123762cb.CALL;
        cgVar2.copyOnWrite();
        C123768ch chVar2 = (C123768ch) cgVar2.instance;
        chVar2.f341898c = cbVar2.f341879e;
        chVar2.f341896a |= 1;
        ciVar.mo106130a(cgVar2);
        C123767cg cgVar3 = (C123767cg) C123768ch.f341894d.createBuilder();
        cgVar3.mo106129a(eVar.mo103676a(j3, C123762cb.TEXT, eVar.f328513i));
        C123762cb cbVar3 = C123762cb.TEXT;
        cgVar3.copyOnWrite();
        C123768ch chVar3 = (C123768ch) cgVar3.instance;
        chVar3.f341898c = cbVar3.f341879e;
        chVar3.f341896a |= 1;
        ciVar.mo106130a(cgVar3);
        C123770cj cjVar = (C123770cj) ciVar.build();
        eVar.f328509e.mo76943r(cjVar);
        C58833ax b = eVar.f328512h.mo103691b(cjVar);
        if (b.mo56113h()) {
            eVar.f328509e.mo76937l(8, (C118365g) b.mo56107c());
        }
        return cjVar;
    }
}
