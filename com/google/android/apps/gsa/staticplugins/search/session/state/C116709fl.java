package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88096p;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88150r;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fl */
/* compiled from: PG */
public final class C116709fl implements C87143ik {

    /* renamed from: a */
    private final C116708fk f323662a;

    /* renamed from: b */
    private final C86842bk f323663b;

    /* renamed from: c */
    private final C86842bk f323664c;

    public C116709fl(C116708fk fkVar, C68214a aVar, C68214a aVar2) {
        this.f323662a = fkVar;
        this.f323663b = new C86842bk(aVar);
        this.f323664c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323662a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        ClientEventData e;
        Object obj;
        this.f323663b.mo80534b(icVar);
        this.f323664c.mo80534b(icVar);
        C86842bk bkVar = this.f323663b;
        boolean z = bkVar.f234552a;
        if (z || this.f323664c.f234552a) {
            C116708fk fkVar = this.f323662a;
            C86842bk bkVar2 = this.f323664c;
            if (z && ((C116569ag) bkVar.mo80533a()).mo102773i() && fkVar.f323660d != ((C116569ag) bkVar.mo80533a()).f323268b) {
                fkVar.f323660d = ((C116569ag) bkVar.mo80533a()).f323268b;
                if (((C116569ag) bkVar.mo80533a()).f323267a.mo81895m()) {
                    C88158rh rhVar = fkVar.f323659c;
                    if (rhVar != null) {
                        ((C59052c) ((C59052c) C116708fk.f323657a.mo56224b()).mo56372aa(32101)).mo56386p("There is a new client and it does support opt-in. Starting opt-in.");
                        fkVar.f323658b.mo78659e(rhVar, 2);
                        fkVar.f323659c = null;
                    }
                } else {
                    ((C59052c) ((C59052c) C116708fk.f323657a.mo56224b()).mo56372aa(32100)).mo56386p("There is a new client and it does not support opt-in. Dropping request.");
                    fkVar.f323659c = null;
                }
            }
            if (bkVar2.f234552a && (e = ((C116575am) bkVar2.mo80533a()).mo102781e(2)) != null) {
                C62940bt btVar = C88096p.f238183a;
                C87741bw bwVar = e.f236955a;
                C62940bt r0 = C62942bv.checkIsLite(btVar);
                bwVar.mo58887l(r0);
                if (!bwVar.f169962ag.mo58857o(r0.f169971d)) {
                    ((C59052c) ((C59052c) C116708fk.f323657a.mo56226d()).mo56372aa(32099)).mo56386p("ACTIVITY_COMPLETED_WITH_RESULT client event received with the wrong extension.");
                    int i = C90755l.f253831a;
                    return;
                }
                C62940bt btVar2 = C88096p.f238183a;
                C87741bw bwVar2 = e.f236955a;
                C62940bt r02 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r02);
                Object l = bwVar2.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                if (((C88150r) obj).f238284b == 2) {
                    fkVar.f323658b.mo78658c(e);
                }
            }
        }
    }
}
