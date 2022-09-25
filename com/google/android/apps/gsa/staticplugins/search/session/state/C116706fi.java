package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6616bs.C85014a;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116532a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.fi */
/* compiled from: PG */
public final class C116706fi implements C87143ik {

    /* renamed from: a */
    private final C116705fh f323655a;

    /* renamed from: b */
    private final C68214a f323656b;

    public C116706fi(C116705fh fhVar, C68214a aVar) {
        this.f323655a = fhVar;
        this.f323656b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323655a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C116735gk) this.f323656b.mo27525b()).f235452J)) {
            C116705fh fhVar = this.f323655a;
            C116735gk gkVar = (C116735gk) this.f323656b.mo27525b();
            Query n = gkVar.f323784p.mo84376cI() ? gkVar.mo102901n("opatosrptransition") : null;
            if (n != null) {
                C89356b a = ((C84466a) fhVar.f323648d.mo27525b()).mo78025a("OpaToSrpTransition", 464, 464);
                long e = gkVar.mo102898e(n);
                C116642cz czVar = (C116642cz) fhVar.f323650f.mo27525b();
                PlaybackStatus playbackStatus = czVar.f323508g;
                czVar.f323508g = null;
                C116532a a2 = fhVar.f323649e.mo102746a(playbackStatus);
                C116819jn jnVar = (C116819jn) fhVar.f323651g.mo27525b();
                jnVar.mo102960o();
                ((C85014a) fhVar.f323645a.mo27525b()).mo78652a(n, e, (C86498a) fhVar.f323647c.mo27525b(), ((C85202a) fhVar.f323646b.mo27525b()).mo78788c(a, a2, jnVar.f324151N), a);
            }
            fhVar.f323652h = gkVar.f323784p;
        }
    }
}
