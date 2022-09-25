package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131190h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bs */
/* compiled from: PG */
public final /* synthetic */ class C131490bs implements C131190h {

    /* renamed from: a */
    public final /* synthetic */ C131495bx f359336a;

    public /* synthetic */ C131490bs(C131495bx bxVar) {
        this.f359336a = bxVar;
    }

    /* renamed from: a */
    public final C60870cx mo110112a(List list, Object obj) {
        C60870cx cxVar;
        C131495bx bxVar = this.f359336a;
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).map(C131482bk.f359324a).filter(C131485bn.f359329a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39298)).mo56386p("No stores nearby.");
            cxVar = C60856cj.m92900i(C131494bw.m213915e().mo110177a());
        } else {
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C131486bo.f359330a).collect(C58370cn.f155946a);
            if (guVar2.isEmpty()) {
                ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39297)).mo56386p("No stores nearby that support shopping lists.");
                cxVar = C60856cj.m92900i(C131494bw.m213915e().mo110177a());
            } else {
                ((C58970a) ((C58970a) bxVar.f359340a.mo56224b()).mo56372aa(39295)).mo56387q("%d supported places nearby.", guVar2.size());
                C58528ij ijVar = (C58528ij) Collection.EL.stream(guVar2).map(C131487bp.f359331a).collect(C58370cn.f155947b);
                C131481bj bjVar = bxVar.f359341b;
                C60870cx e = C60856cj.m92896e((C58485gu) Collection.EL.stream(bjVar.f359320b).map(C131472ba.f359309a).map(new C131473bb(bjVar)).collect(C58370cn.f155946a));
                C131474bc bcVar = new C131474bc(bjVar);
                C60870cx g = C60922j.m93044g(e, C47810es.m84963c(bcVar), bjVar.f359321c);
                C131488bq bqVar = new C131488bq(bxVar, guVar2);
                cxVar = C60922j.m93044g(g, C47810es.m84963c(bqVar), bxVar.f359342c);
            }
        }
        C131489br brVar = new C131489br(bxVar, (Optional) obj);
        return C60922j.m93044g(cxVar, C47810es.m84963c(brVar), bxVar.f359342c);
    }
}
