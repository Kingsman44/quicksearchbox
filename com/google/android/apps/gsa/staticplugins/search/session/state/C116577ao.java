package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85476b;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88146qw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88173rw;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ao */
/* compiled from: PG */
public final class C116577ao extends C116780ib {

    /* renamed from: a */
    private static final C59071e f323298a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.ao");

    /* renamed from: b */
    private final C85476b f323299b;

    public C116577ao(C68214a aVar, C85476b bVar) {
        super(aVar, 194);
        this.f323299b = bVar;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.OPEN_AMP_ACTIONS_VIEWER, C87739bu.PRERENDER_AMP_ACTIONS_VIEWER};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AmpActionsState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 53) {
            C62940bt btVar = C88146qw.f238272c;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (bwVar.f169962ag.mo58857o(r2.f169971d)) {
                C85476b bVar = this.f323299b;
                C62940bt btVar2 = C88146qw.f238272c;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r3 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r3);
                Object l = bwVar2.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj = r3.f169969b;
                } else {
                    obj = r3.mo58889c(l);
                }
                acy acy = ((C88146qw) obj).f238274a;
                if (acy == null) {
                    acy = acy.f134860d;
                }
                bVar.mo78996c(acy, C116576an.f323297a);
                return;
            }
            C59104x d = f323298a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmpActionsState");
            ((C59052c) ((C59052c) d).mo56372aa(31971)).mo56386p("OPEN_AMP_ACTIONS_VIEWER requires an OpenAmpActionsViewerEventData proto.");
            int i = C90755l.f253831a;
        } else if (ordinal == 54) {
            C62940bt btVar3 = C88173rw.f238357c;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r22 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r22);
            if (bwVar3.f169962ag.mo58857o(r22.f169971d)) {
                C85476b bVar2 = this.f323299b;
                C62940bt btVar4 = C88173rw.f238357c;
                C87741bw bwVar4 = clientEventData.f236955a;
                C62940bt r32 = C62942bv.checkIsLite(btVar4);
                bwVar4.mo58887l(r32);
                Object l2 = bwVar4.f169962ag.mo58854l(r32.f169971d);
                if (l2 == null) {
                    obj2 = r32.f169969b;
                } else {
                    obj2 = r32.mo58889c(l2);
                }
                bVar2.mo78995a(((C88173rw) obj2).f238359a);
                return;
            }
            C59104x d2 = f323298a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AmpActionsState");
            ((C59052c) ((C59052c) d2).mo56372aa(31972)).mo56386p("PRERENDER_AMP_ACTIONS_VIEWER requires a PrerenderAmpActionsViewerEventData proto.");
            int i2 = C90755l.f253831a;
        }
    }
}
