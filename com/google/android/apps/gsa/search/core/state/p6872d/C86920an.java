package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6556ar.C84725a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.aah;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.an */
/* compiled from: PG */
public final class C86920an extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234732a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.an");

    /* renamed from: b */
    public final BitFlags f234733b = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: c */
    public final C84725a f234734c;

    /* renamed from: d */
    public C60870cx f234735d;

    /* renamed from: e */
    private final C22871g f234736e;

    public C86920an(C68214a aVar, C22871g gVar, C84725a aVar2) {
        super(aVar, 26);
        this.f234736e = gVar;
        this.f234734c = aVar2;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.VOICE_SEARCH_HANDS_FREE};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HandsFreeState");
        fVar.mo85279c("Flags").mo85276a(C90752i.m148229c(this.f234733b.mo85048b()));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 70) {
            C62940bt btVar = aah.f237074a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (bwVar.f169962ag.mo58857o(r2.f169971d)) {
                C84725a aVar = this.f234734c;
                C62940bt btVar2 = aah.f237074a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r3 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r3);
                Object l = bwVar2.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj = r3.f169969b;
                } else {
                    obj = r3.mo58889c(l);
                }
                C60870cx a2 = aVar.mo78443a((aaj) obj);
                this.f234735d = a2;
                C90875ai.m148465b(new C86918al(this), a2, this.f234736e, "handle voice search hands free").mo85223a(new C86919am(this));
                mo80591ar();
                return;
            }
            ((C59052c) ((C59052c) f234732a.mo56225c()).mo56372aa(9135)).mo56386p("handleVSHFEvent(): No event data");
        }
    }

    public final String toString() {
        return String.format("HandsFreeState: flags: %s", new Object[]{this.f234733b.mo85048b()});
    }
}
