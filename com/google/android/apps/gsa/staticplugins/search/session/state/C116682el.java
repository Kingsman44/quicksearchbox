package com.google.android.apps.gsa.staticplugins.search.session.state;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.el */
/* compiled from: PG */
public final class C116682el implements C87143ik {

    /* renamed from: a */
    private final C116681ek f323602a;

    /* renamed from: b */
    private final C68214a f323603b;

    public C116682el(C116681ek ekVar, C68214a aVar) {
        this.f323602a = ekVar;
        this.f323603b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323602a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        if (icVar.mo80754a(((C116735gk) this.f323603b.mo27525b()).f235452J)) {
            C116681ek ekVar = this.f323602a;
            Query n = ((C116735gk) this.f323603b.mo27525b()).mo102901n("nonsearchpage");
            if (n != null) {
                ekVar.f323599i = n;
                C89356b a = ekVar.f323601k.mo78025a("NonSearchUrl", 457, 457);
                C116642cz czVar = (C116642cz) ekVar.f323596f.mo27525b();
                PlaybackStatus playbackStatus = czVar.f323508g;
                czVar.f323508g = null;
                C116532a a2 = ekVar.f323595e.mo102746a(playbackStatus);
                C85202a aVar = ekVar.f323594d;
                C116819jn jnVar = (C116819jn) ekVar.f323597g.mo27525b();
                jnVar.mo102960o();
                ekVar.f323600j = ekVar.f323592b.mo28209i(ekVar.f323593c.mo78558a(n, (C86498a) ekVar.f323591a.mo27525b(), a, aVar.mo78788c(a, a2, jnVar.f324151N)), "Update current SearchGraphRunner", new C116680ej(ekVar));
            }
        }
    }
}
