package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.staticplugins.search.session.p8711c.p8712a.C116532a;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ij */
/* compiled from: PG */
public final /* synthetic */ class C116788ij implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116790il f324002a;

    /* renamed from: b */
    public final /* synthetic */ C116642cz f324003b;

    /* renamed from: c */
    public final /* synthetic */ C89356b f324004c;

    public /* synthetic */ C116788ij(C116790il ilVar, C116642cz czVar, C89356b bVar) {
        this.f324002a = ilVar;
        this.f324003b = czVar;
        this.f324004c = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116790il ilVar = this.f324002a;
        C116642cz czVar = this.f324003b;
        C89356b bVar = this.f324004c;
        PlaybackStatus playbackStatus = czVar.f323508g;
        czVar.f323508g = null;
        C116532a a = ilVar.f324014g.mo102746a(playbackStatus);
        C85202a aVar = ilVar.f324013f;
        C116819jn jnVar = (C116819jn) ilVar.f324015h.mo27525b();
        jnVar.mo102960o();
        return aVar.mo78788c(bVar, a, jnVar.f324151N);
    }
}
