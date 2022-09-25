package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.search.core.p6519al.p6731f.C85465a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88155re;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88175ry;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88178sa;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.f */
/* compiled from: PG */
public final class C107902f implements C107874az {

    /* renamed from: a */
    public static final C59071e f300237a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.f");

    /* renamed from: b */
    private final C85465a f300238b;

    /* renamed from: c */
    private final C22871g f300239c;

    public C107902f(C85465a aVar, C22871g gVar) {
        this.f300238b = aVar;
        this.f300239c = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        C60870cx cxVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 51) {
            C62940bt btVar = C88178sa.f238369f;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            if (bwVar.f169962ag.mo58857o(r0.f169971d)) {
                C85465a aVar = this.f300238b;
                C62940bt btVar2 = C88178sa.f238369f;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r1 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r1);
                Object l = bwVar2.f169962ag.mo58854l(r1.f169971d);
                if (l == null) {
                    obj = r1.f169969b;
                } else {
                    obj = r1.mo58889c(l);
                }
                cxVar = aVar.mo78992d((C88178sa) obj);
            } else {
                ((C59052c) ((C59052c) f300237a.mo56226d()).mo56372aa(26214)).mo56386p("PRERENDER_AMP_VIEWER requires a PrerenderAmpViewerEventData proto.");
                int i = C90755l.f253831a;
                return true;
            }
        } else if (ordinal == 52) {
            C62940bt btVar3 = C88155re.f238307j;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r02 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r02);
            if (bwVar3.f169962ag.mo58857o(r02.f169971d)) {
                C85465a aVar2 = this.f300238b;
                C62940bt btVar4 = C88155re.f238307j;
                C87741bw bwVar4 = clientEventData.f236955a;
                C62940bt r12 = C62942bv.checkIsLite(btVar4);
                bwVar4.mo58887l(r12);
                Object l2 = bwVar4.f169962ag.mo58854l(r12.f169971d);
                if (l2 == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l2);
                }
                cxVar = aVar2.mo78990b((C88155re) obj2);
            } else {
                ((C59052c) ((C59052c) f300237a.mo56226d()).mo56372aa(26216)).mo56386p("OPEN_AMP_VIEWER requires an OpenAmpViewerEventData proto.");
                int i2 = C90755l.f253831a;
                return true;
            }
        } else if (ordinal == 55) {
            C62940bt btVar5 = C88175ry.f238361f;
            C87741bw bwVar5 = clientEventData.f236955a;
            C62940bt r03 = C62942bv.checkIsLite(btVar5);
            bwVar5.mo58887l(r03);
            if (bwVar5.f169962ag.mo58857o(r03.f169971d)) {
                C85465a aVar3 = this.f300238b;
                C62940bt btVar6 = C88175ry.f238361f;
                C87741bw bwVar6 = clientEventData.f236955a;
                C62940bt r13 = C62942bv.checkIsLite(btVar6);
                bwVar6.mo58887l(r13);
                Object l3 = bwVar6.f169962ag.mo58854l(r13.f169971d);
                if (l3 == null) {
                    obj3 = r13.f169969b;
                } else {
                    obj3 = r13.mo58889c(l3);
                }
                cxVar = aVar3.mo78991c((C88175ry) obj3);
            } else {
                ((C59052c) ((C59052c) f300237a.mo56226d()).mo56372aa(26213)).mo56386p("PRERENDER_AMP_DOCUMENT requires a PrerenderAmpDocumentEventData proto.");
                int i3 = C90755l.f253831a;
                return true;
            }
        } else if (ordinal != 56) {
            return true;
        } else {
            C62940bt btVar7 = C88153rc.f238295k;
            C87741bw bwVar7 = clientEventData.f236955a;
            C62940bt r04 = C62942bv.checkIsLite(btVar7);
            bwVar7.mo58887l(r04);
            if (bwVar7.f169962ag.mo58857o(r04.f169971d)) {
                C85465a aVar4 = this.f300238b;
                C62940bt btVar8 = C88153rc.f238295k;
                C87741bw bwVar8 = clientEventData.f236955a;
                C62940bt r14 = C62942bv.checkIsLite(btVar8);
                bwVar8.mo58887l(r14);
                Object l4 = bwVar8.f169962ag.mo58854l(r14.f169971d);
                if (l4 == null) {
                    obj4 = r14.f169969b;
                } else {
                    obj4 = r14.mo58889c(l4);
                }
                cxVar = aVar4.mo78989a((C88153rc) obj4);
            } else {
                ((C59052c) ((C59052c) f300237a.mo56226d()).mo56372aa(26215)).mo56386p("OPEN_AMP_DOCUMENT requires an OpenAmpDocumentEventData proto.");
                int i4 = C90755l.f253831a;
                return true;
            }
        }
        C90873ag agVar = new C90873ag(cxVar, this.f300239c, "AmpSubController.handleGenericClientEvent", new C107899c());
        agVar.mo85224b(CancellationException.class, new C107900d());
        agVar.mo85223a(C107901e.f300236a);
        return true;
    }
}
