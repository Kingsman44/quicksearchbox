package com.google.android.apps.gsa.search.core.state;

import android.util.SparseArray;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88096p;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88150r;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.ap */
/* compiled from: PG */
public final class C86819ap extends C86898ct {

    /* renamed from: b */
    private static final C59071e f234498b = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.ap");

    /* renamed from: a */
    public final SparseArray f234499a = new SparseArray();

    public C86819ap(C68214a aVar) {
        super(aVar, 76);
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.ACTIVITY_COMPLETED_WITH_RESULT};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        Object obj;
        fVar.mo85291r("ActivityCompletedWithResultState");
        for (int i = 0; i < this.f234499a.size(); i++) {
            ClientEventData clientEventData = (ClientEventData) this.f234499a.get(this.f234499a.keyAt(i));
            if (clientEventData != null) {
                C62940bt btVar = C88096p.f238183a;
                C87741bw bwVar = clientEventData.f236955a;
                C62940bt r2 = C62942bv.checkIsLite(btVar);
                bwVar.mo58887l(r2);
                Object l = bwVar.f169962ag.mo58854l(r2.f169971d);
                if (l == null) {
                    obj = r2.f169969b;
                } else {
                    obj = r2.mo58889c(l);
                }
                C88150r rVar = (C88150r) obj;
                if (rVar != null) {
                    fVar.mo85279c("Request Code").mo85276a(C90752i.m148230d(Integer.valueOf(rVar.f238284b)));
                    fVar.mo85279c("Result Code").mo85276a(C90752i.m148230d(Integer.valueOf(rVar.f238285c)));
                }
            }
        }
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 30) {
            C62940bt btVar = C88096p.f238183a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (!bwVar.f169962ag.mo58857o(r2.f169971d)) {
                C59104x d = f234498b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ActivityCompleted");
                ((C59052c) ((C59052c) d).mo56372aa(8651)).mo56386p("ACTIVITY_COMPLETED_WITH_RESULT client event received with the wrong extension.");
                int i = C90755l.f253831a;
                return;
            }
            C62940bt btVar2 = C88096p.f238183a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r22 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r22);
            Object l = bwVar2.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj = r22.f169969b;
            } else {
                obj = r22.mo58889c(l);
            }
            this.f234499a.put(((C88150r) obj).f238284b, clientEventData);
            mo80591ar();
        }
    }
}
