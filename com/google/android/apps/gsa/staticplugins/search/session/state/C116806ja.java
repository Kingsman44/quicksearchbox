package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6519al.p6721dq.C85411a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116532a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ja */
/* compiled from: PG */
public final class C116806ja implements C87143ik {

    /* renamed from: a */
    private final C116804iz f324088a;

    /* renamed from: b */
    private final C68214a f324089b;

    public C116806ja(C116804iz izVar, C68214a aVar) {
        this.f324088a = izVar;
        this.f324089b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f324088a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C116735gk) this.f324089b.mo27525b()).f235452J)) {
            C116804iz izVar = this.f324088a;
            C116735gk gkVar = (C116735gk) this.f324089b.mo27525b();
            C58976aa aaVar = C58975e.f156826a;
            Query n = gkVar.f323784p.mo84469dx() ? gkVar.mo102901n("voice_access_to_srp_transition") : null;
            if (n != null) {
                C89356b a = ((C84466a) izVar.f324083d.mo27525b()).mo78025a("VoiceAccessToSrpTransition", 546, 546);
                long e = gkVar.mo102898e(n);
                C116642cz czVar = (C116642cz) izVar.f324085f.mo27525b();
                PlaybackStatus playbackStatus = czVar.f323508g;
                czVar.f323508g = null;
                C116532a a2 = izVar.f324084e.mo102746a(playbackStatus);
                C116819jn jnVar = (C116819jn) izVar.f324086g.mo27525b();
                jnVar.mo102960o();
                ((C85411a) izVar.f324080a.mo27525b()).mo78926a(n, e, (C86498a) izVar.f324082c.mo27525b(), ((C85202a) izVar.f324081b.mo27525b()).mo78788c(a, a2, jnVar.f324151N), a);
            }
        }
    }
}
