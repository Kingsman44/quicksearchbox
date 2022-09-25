package com.google.android.apps.gsa.search.core.state.p6872d;

import android.databinding.C0118a;
import com.google.android.apps.gsa.search.core.p6519al.p6546am.C84710b;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.ad */
/* compiled from: PG */
public final class C86910ad extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234703a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.ad");

    /* renamed from: b */
    public final C84710b f234704b;

    /* renamed from: c */
    public final Map f234705c = new HashMap();

    /* renamed from: d */
    private final C22871g f234706d;

    public C86910ad(C84710b bVar, C22871g gVar, C68214a aVar) {
        super(aVar, 7);
        this.f234704b = bVar;
        this.f234706d = gVar;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.GCM_MESSAGE_RECEIVED};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GcmState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C59071e eVar = f234703a;
        C0118a.m108p(eVar.mo56224b(), "Step 2: GcsmState:handleClientEvent", 9121, C58975e.f156826a, "NotificationFullFlow");
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a != C87739bu.GCM_MESSAGE_RECEIVED) {
            C59052c cVar = (C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(9123);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar.mo56389s("Unrecognized client event received: %s", a2);
            return;
        }
        C62940bt btVar = C87841fo.f237662g;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r1 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r1);
        if (!bwVar.f169962ag.mo58857o(r1.f169971d)) {
            ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(9122)).mo56386p("Client event missing extension");
            return;
        }
        C62940bt btVar2 = C87841fo.f237662g;
        C87741bw bwVar2 = clientEventData.f236955a;
        C62940bt r0 = C62942bv.checkIsLite(btVar2);
        bwVar2.mo58887l(r0);
        Object l = bwVar2.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C90873ag agVar = new C90873ag(this.f234704b.mo78435b((C87841fo) obj), this.f234706d, "GcmState.eventProcessed", new C86974z(this, j));
        agVar.mo85224b(IllegalStateException.class, new C86907aa(this, j));
        agVar.mo85224b(NullPointerException.class, new C86908ab(this, j));
        agVar.mo85223a(new C86909ac(this, j));
    }
}
