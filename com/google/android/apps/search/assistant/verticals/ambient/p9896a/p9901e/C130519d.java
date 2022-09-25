package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9901e;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.e.d */
/* compiled from: PG */
public final /* synthetic */ class C130519d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130531p f357544a;

    public /* synthetic */ C130519d(C130531p pVar) {
        this.f357544a = pVar;
    }

    public final Object apply(Object obj) {
        C130531p pVar = this.f357544a;
        C58485gu guVar = (C58485gu) obj;
        C50785ci ciVar = (C50785ci) C50819dp.f132330b.createBuilder();
        if (guVar.isEmpty()) {
            C131251t tVar = pVar.f357571g;
            C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
            cnVar.copyOnWrite();
            C50818do doVar = (C50818do) cnVar.instance;
            doVar.f132304a |= 1;
            doVar.f132305b = true;
            C50792cp cpVar = C50792cp.PRIMARY;
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            doVar2.f132306c = cpVar.f132174e;
            doVar2.f132304a |= 2;
            C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
            long epochMilli = tVar.f358897c.mo57444a().plus(C131251t.f358895a).toEpochMilli();
            csVar.copyOnWrite();
            C50796ct ctVar = (C50796ct) csVar.instance;
            ctVar.f132225a |= 1;
            ctVar.f132226b = epochMilli;
            cnVar.copyOnWrite();
            C50818do doVar3 = (C50818do) cnVar.instance;
            C50796ct ctVar2 = (C50796ct) csVar.build();
            ctVar2.getClass();
            doVar3.f132320q = ctVar2;
            doVar3.f132304a |= 32768;
            ciVar.mo53458c((C50818do) cnVar.build());
        } else {
            ciVar.mo53456a((C58485gu) Collection.EL.stream(guVar).map(new C130521f(pVar)).collect(C58370cn.f155946a));
        }
        return (C50819dp) ciVar.build();
    }
}
