package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87984kw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87986ky;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.m */
/* compiled from: PG */
public final class C86961m extends C86898ct {

    /* renamed from: a */
    private final C85516a f234886a;

    public C86961m(C68214a aVar, C85516a aVar2) {
        super(aVar, 9);
        this.f234886a = aVar2;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.EXECUTE_MEDIA};
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AudioMessageState");
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() == 65) {
            C62940bt btVar = C87984kw.f237946a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r1);
            Object l = bwVar.f169962ag.mo58854l(r1.f169971d);
            if (l == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l);
            }
            C87986ky kyVar = (C87986ky) obj;
            int i = kyVar.f237950b;
            if (i == 5) {
                this.f234886a.mo79037c(kyVar.f237951c);
            } else if (i == 6) {
                this.f234886a.mo79036b();
            } else if (i == 7) {
                this.f234886a.mo79041g();
            } else if (i == 8) {
                this.f234886a.mo79042h();
            }
        }
    }
}
