package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.f */
/* compiled from: PG */
final class C102698f implements C22868d {

    /* renamed from: a */
    final /* synthetic */ MediaBrowserSessionController f286661a;

    public C102698f(MediaBrowserSessionController mediaBrowserSessionController) {
        this.f286661a = mediaBrowserSessionController;
    }

    /* renamed from: c */
    public final void mo17702gm(MediaSessionCompat.Token token) {
        if (this.f286661a.f286638d == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C87684al alVar = new C87684al(C88244um.MEDIA_BROWSER_FETCHED_MEDIA_SESSION_TOKEN);
        if (token != null) {
            alVar.mo81966c(token);
        }
        C86697a aVar = this.f286661a.f286638d;
        aVar.getClass();
        ((C86775r) aVar).f234383e.mo80379b(alVar.mo81964a());
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = MediaBrowserSessionController.f286636a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MBSessionController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20944)).mo56386p("No active media session found or created!");
        mo17702gm((MediaSessionCompat.Token) null);
    }
}
