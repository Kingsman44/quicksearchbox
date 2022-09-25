package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88156rf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fk */
/* compiled from: PG */
public final class C116708fk extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323657a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.fk");

    /* renamed from: b */
    public final C85022a f323658b;

    /* renamed from: c */
    public C88158rh f323659c;

    /* renamed from: d */
    public long f323660d = -1;

    /* renamed from: e */
    private final C68214a f323661e;

    public C116708fk(C68214a aVar, C68214a aVar2, C85022a aVar3) {
        super(aVar, 190);
        this.f323661e = aVar2;
        this.f323658b = aVar3;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.OPT_IN_REQUEST};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OptInState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 26) {
            C62940bt btVar = C88156rf.f238317a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (!bwVar.f169962ag.mo58857o(r2.f169971d)) {
                ((C59052c) ((C59052c) f323657a.mo56226d()).mo56372aa(32098)).mo56386p("An OPT_IN_REQUEST client event received with the wrong extension.");
                int i = C90755l.f253831a;
                return;
            }
            C62940bt btVar2 = C88156rf.f238317a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r22 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r22);
            Object l = bwVar2.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            C88158rh rhVar = (C88158rh) obj;
            if (!((C116569ag) this.f323661e.mo27525b()).mo102773i() || !((C116569ag) this.f323661e.mo27525b()).f323267a.mo81895m()) {
                ((C59052c) ((C59052c) f323657a.mo56224b()).mo56372aa(32097)).mo56386p("Either there's no active client or it doesn't support opt-in. Saving request.");
                this.f323659c = rhVar;
                return;
            }
            this.f323658b.mo78659e(rhVar, 2);
        }
    }
}
