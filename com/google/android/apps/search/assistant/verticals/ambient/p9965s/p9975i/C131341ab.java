package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131190h;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131191i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53702b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4157bd.p4158a.C55429a;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.ab */
/* compiled from: PG */
public final /* synthetic */ class C131341ab implements C131190h {

    /* renamed from: a */
    public final /* synthetic */ C131342ac f359055a;

    public /* synthetic */ C131341ab(C131342ac acVar) {
        this.f359055a = acVar;
    }

    /* renamed from: a */
    public final C60870cx mo110112a(List list, Object obj) {
        C60870cx cxVar;
        int i;
        C131342ac acVar = this.f359055a;
        Void voidR = (Void) obj;
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).map(C131364w.f359104a).filter(C131365x.f359105a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) acVar.f359056a.mo56224b()).mo56372aa(39220)).mo56386p("No stores nearby.");
            return C60856cj.m92900i(C131191i.m213695d());
        }
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C131366y(acVar)).collect(C58370cn.f155946a);
        if (guVar2.isEmpty()) {
            ((C58970a) ((C58970a) acVar.f359056a.mo56224b()).mo56372aa(39219)).mo56386p("No stores nearby that support loyalty cards.");
            return C60856cj.m92900i(C131191i.m213695d());
        }
        ((C58970a) ((C58970a) acVar.f359056a.mo56224b()).mo56372aa(39217)).mo56387q("%d supported places nearby.", guVar2.size());
        C58528ij ijVar = (C58528ij) Collection.EL.stream(guVar2).map(C131367z.f359107a).collect(C58370cn.f155947b);
        C131358q qVar = acVar.f359057b;
        if (!((Boolean) qVar.f359094e.orElseGet(new C131346e(qVar))).booleanValue()) {
            ((C58970a) ((C58970a) qVar.f359090a.mo56224b()).mo56372aa(39213)).mo56386p("Pay module is not available.");
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            ((C58970a) ((C58970a) qVar.f359090a.mo56224b()).mo56372aa(39209)).mo56386p("Fetching loyalty cards from Google Pay.");
            C58506ho hoVar = new C58506ho();
            int size = guVar2.size();
            int i2 = 0;
            while (i2 < size) {
                C53692aq aqVar = (C53692aq) guVar2.get(i2);
                C53702b bVar = aqVar.f140946h;
                if (bVar == null) {
                    bVar = C53702b.f140971f;
                }
                Iterator it = bVar.f140974b.iterator();
                while (true) {
                    i = i2 + 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    hoVar.mo55456j((Long) it.next(), aqVar);
                }
                i2 = i;
            }
            C58512hu g = hoVar.mo55453g();
            if (g.mo54954G()) {
                ((C58970a) ((C58970a) qVar.f359090a.mo56224b()).mo56372aa(39212)).mo56386p("No store chains.");
                cxVar = C60856cj.m92900i(C58485gu.m89845m());
            } else {
                ((C58970a) ((C58970a) qVar.f359090a.mo56224b()).mo56372aa(39210)).mo56387q("Nearby stores have %d chain MIDs.", g.size);
                C58480gp e = C58485gu.m89837e();
                C58800sl lA = g.map.keySet().iterator();
                while (lA.hasNext()) {
                    Long l = (Long) lA.next();
                    e.mo55395g(qVar.mo110151a(Optional.m71637of(C55429a.m87691a(l.longValue())), g.mo55423a(l)));
                }
                C60870cx e2 = C60856cj.m92896e(e.mo55394f());
                C131347f fVar = C131347f.f359073a;
                cxVar = C60922j.m93044g(e2, C47810es.m84963c(fVar), qVar.f359092c);
            }
        }
        C131340aa aaVar = new C131340aa(acVar, guVar2);
        return C60922j.m93044g(cxVar, C47810es.m84963c(aaVar), acVar.f359059d);
    }
}
