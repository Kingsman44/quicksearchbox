package com.google.android.apps.gsa.search.core.p6814o;

import com.google.android.apps.gsa.search.core.p6519al.p6536ah.C84683a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87782dj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87784dl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87785dm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87787do;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.search.core.o.b */
/* compiled from: PG */
public final class C86187b {

    /* renamed from: a */
    public static final C59071e f232890a = C59071e.m91332i("com.google.android.apps.gsa.search.core.o.b");

    /* renamed from: b */
    public static final C58528ij f232891b = C58528ij.m90011K(C87739bu.ELEMENTS_LOG_CLICK, C87739bu.ELEMENTS_LOG_VISIBILITY_CHANGE);

    /* renamed from: c */
    private final C84683a f232892c;

    /* renamed from: d */
    private final C22871g f232893d;

    public C86187b(C84683a aVar, C22871g gVar) {
        this.f232892c = aVar;
        this.f232893d = gVar;
    }

    /* renamed from: b */
    private final void m138643b(C87739bu buVar, C60870cx cxVar) {
        this.f232893d.mo28211k(cxVar, "ElementsSessionHandler - logCallback", new C86185a(buVar));
    }

    /* renamed from: a */
    public final void mo79827a(ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.ELEMENTS_LOG_CLICK) {
            C62940bt btVar = C87782dj.f237560a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r1);
            if (bwVar.f169962ag.mo58857o(r1.f169971d)) {
                C62940bt btVar2 = C87782dj.f237560a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r12 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r12);
                Object l = bwVar2.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l);
                }
                C87784dl dlVar = (C87784dl) obj2;
                m138643b(a, this.f232892c.mo78417a(dlVar.f237564b, dlVar.f237565c));
                return;
            }
            C59104x d = f232890a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ElementsSessionH");
            ((C59052c) ((C59052c) d).mo56372aa(7717)).mo56389s("Elements log click event does not have extension data. Event = %s", clientEventData);
            int i = C90755l.f253831a;
        } else if (a == C87739bu.ELEMENTS_LOG_VISIBILITY_CHANGE) {
            C62940bt btVar3 = C87785dm.f237566a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r13 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r13);
            if (bwVar3.f169962ag.mo58857o(r13.f169971d)) {
                C62940bt btVar4 = C87785dm.f237566a;
                C87741bw bwVar4 = clientEventData.f236955a;
                C62940bt r14 = C62942bv.checkIsLite(btVar4);
                bwVar4.mo58887l(r14);
                Object l2 = bwVar4.f169962ag.mo58854l(r14.f169971d);
                if (l2 == null) {
                    obj = r14.f169969b;
                } else {
                    obj = r14.mo58889c(l2);
                }
                C87787do doVar = (C87787do) obj;
                m138643b(a, this.f232892c.mo78418b(doVar.f237570b, doVar.f237571c));
                return;
            }
            C59104x d2 = f232890a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ElementsSessionH");
            ((C59052c) ((C59052c) d2).mo56372aa(7716)).mo56389s("Elements log visibility event does not have extension data. Event = %s", clientEventData);
            int i2 = C90755l.f253831a;
        }
    }
}
