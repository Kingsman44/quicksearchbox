package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6731f.C85465a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88153rc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88155re;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88175ry;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88178sa;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.k */
/* compiled from: PG */
public final class C86959k extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234883a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.k");

    /* renamed from: b */
    private final C85465a f234884b;

    /* renamed from: c */
    private final C22871g f234885c;

    public C86959k(C68214a aVar, C85465a aVar2, C22871g gVar) {
        super(aVar, 8);
        this.f234884b = aVar2;
        this.f234885c = gVar;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.AMP_VIEWER_SUPPORT_REQUEST, C87739bu.PRERENDER_AMP_DOCUMENT, C87739bu.PRERENDER_AMP_VIEWER, C87739bu.OPEN_AMP_DOCUMENT, C87739bu.OPEN_AMP_VIEWER};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AmpState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
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
        switch (a.ordinal()) {
            case 51:
                C62940bt btVar = C88178sa.f238369f;
                C87741bw bwVar = clientEventData.f236955a;
                C62940bt r3 = C62942bv.checkIsLite(btVar);
                bwVar.mo58887l(r3);
                if (bwVar.f169962ag.mo58857o(r3.f169971d)) {
                    C85465a aVar = this.f234884b;
                    C62940bt btVar2 = C88178sa.f238369f;
                    C87741bw bwVar2 = clientEventData.f236955a;
                    C62940bt r4 = C62942bv.checkIsLite(btVar2);
                    bwVar2.mo58887l(r4);
                    Object l = bwVar2.f169962ag.mo58854l(r4.f169971d);
                    if (l == null) {
                        obj = r4.f169969b;
                    } else {
                        obj = r4.mo58889c(l);
                    }
                    cxVar = aVar.mo78992d((C88178sa) obj);
                    break;
                } else {
                    ((C59052c) ((C59052c) f234883a.mo56226d()).mo56372aa(9094)).mo56386p("PRERENDER_AMP_VIEWER requires a PrerenderAmpViewerEventData proto.");
                    int i = C90755l.f253831a;
                    return;
                }
            case 52:
                C62940bt btVar3 = C88155re.f238307j;
                C87741bw bwVar3 = clientEventData.f236955a;
                C62940bt r32 = C62942bv.checkIsLite(btVar3);
                bwVar3.mo58887l(r32);
                if (bwVar3.f169962ag.mo58857o(r32.f169971d)) {
                    C85465a aVar2 = this.f234884b;
                    C62940bt btVar4 = C88155re.f238307j;
                    C87741bw bwVar4 = clientEventData.f236955a;
                    C62940bt r42 = C62942bv.checkIsLite(btVar4);
                    bwVar4.mo58887l(r42);
                    Object l2 = bwVar4.f169962ag.mo58854l(r42.f169971d);
                    if (l2 == null) {
                        obj2 = r42.f169969b;
                    } else {
                        obj2 = r42.mo58889c(l2);
                    }
                    cxVar = aVar2.mo78990b((C88155re) obj2);
                    break;
                } else {
                    ((C59052c) ((C59052c) f234883a.mo56226d()).mo56372aa(9096)).mo56386p("OPEN_AMP_VIEWER requires an OpenAmpViewerEventData proto.");
                    int i2 = C90755l.f253831a;
                    return;
                }
            case 55:
                C62940bt btVar5 = C88175ry.f238361f;
                C87741bw bwVar5 = clientEventData.f236955a;
                C62940bt r33 = C62942bv.checkIsLite(btVar5);
                bwVar5.mo58887l(r33);
                if (bwVar5.f169962ag.mo58857o(r33.f169971d)) {
                    C85465a aVar3 = this.f234884b;
                    C62940bt btVar6 = C88175ry.f238361f;
                    C87741bw bwVar6 = clientEventData.f236955a;
                    C62940bt r43 = C62942bv.checkIsLite(btVar6);
                    bwVar6.mo58887l(r43);
                    Object l3 = bwVar6.f169962ag.mo58854l(r43.f169971d);
                    if (l3 == null) {
                        obj3 = r43.f169969b;
                    } else {
                        obj3 = r43.mo58889c(l3);
                    }
                    cxVar = aVar3.mo78991c((C88175ry) obj3);
                    break;
                } else {
                    ((C59052c) ((C59052c) f234883a.mo56226d()).mo56372aa(9093)).mo56386p("PRERENDER_AMP_DOCUMENT requires a PrerenderAmpDocumentEventData proto.");
                    int i3 = C90755l.f253831a;
                    return;
                }
            case 56:
                C62940bt btVar7 = C88153rc.f238295k;
                C87741bw bwVar7 = clientEventData.f236955a;
                C62940bt r34 = C62942bv.checkIsLite(btVar7);
                bwVar7.mo58887l(r34);
                if (bwVar7.f169962ag.mo58857o(r34.f169971d)) {
                    C85465a aVar4 = this.f234884b;
                    C62940bt btVar8 = C88153rc.f238295k;
                    C87741bw bwVar8 = clientEventData.f236955a;
                    C62940bt r44 = C62942bv.checkIsLite(btVar8);
                    bwVar8.mo58887l(r44);
                    Object l4 = bwVar8.f169962ag.mo58854l(r44.f169971d);
                    if (l4 == null) {
                        obj4 = r44.f169969b;
                    } else {
                        obj4 = r44.mo58889c(l4);
                    }
                    cxVar = aVar4.mo78989a((C88153rc) obj4);
                    break;
                } else {
                    ((C59052c) ((C59052c) f234883a.mo56226d()).mo56372aa(9095)).mo56386p("OPEN_AMP_DOCUMENT requires an OpenAmpDocumentEventData proto.");
                    int i4 = C90755l.f253831a;
                    return;
                }
            case 57:
                cxVar = this.f234884b.mo78993e(j);
                break;
            default:
                C59052c cVar = (C59052c) ((C59052c) f234883a.mo56226d()).mo56372aa(9092);
                C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a2 == null) {
                    a2 = C87739bu.UNKNOWN;
                }
                cVar.mo56389s("Unsupported event id: %s", a2);
                int i5 = C90755l.f253831a;
                return;
        }
        C90873ag agVar = new C90873ag(cxVar, this.f234885c, "AmpState.handleGenericClientEvent", new C86956h());
        agVar.mo85224b(CancellationException.class, new C86957i());
        agVar.mo85223a(C86958j.f234882a);
    }
}
