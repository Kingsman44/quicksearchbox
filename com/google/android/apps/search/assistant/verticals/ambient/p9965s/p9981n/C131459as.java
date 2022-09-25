package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.as */
/* compiled from: PG */
public final /* synthetic */ class C131459as implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131465ay f359289a;

    public /* synthetic */ C131459as(C131465ay ayVar) {
        this.f359289a = ayVar;
    }

    public final C60870cx apply(Object obj) {
        C131465ay ayVar = this.f359289a;
        C123746bm bmVar = (C123746bm) obj;
        ((C58970a) ((C58970a) ayVar.f359295a.mo56224b()).mo56372aa(39280)).mo56387q("PCP response size is: %d", bmVar.f341820a.size());
        C60870cx e = C60856cj.m92896e((C58485gu) Collection.EL.stream(bmVar.f341820a).filter(C131460at.f359290a).map(C131461au.f359291a).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C131462av.f359292a))).map(new C131463aw(ayVar)).collect(C58370cn.f155946a));
        C131464ax axVar = new C131464ax(ayVar);
        return C60922j.m93044g(e, C47810es.m84963c(axVar), ayVar.f359297c);
    }
}
