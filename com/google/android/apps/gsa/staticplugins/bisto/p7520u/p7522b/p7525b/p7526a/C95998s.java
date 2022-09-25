package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import android.media.MediaRouter;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.s */
/* compiled from: PG */
public final class C95998s extends C95980a {

    /* renamed from: c */
    private static final C59071e f268773c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.s");

    /* renamed from: d */
    private final C96023bs f268774d;

    /* renamed from: e */
    private final C95447t f268775e;

    public C95998s(C96023bs bsVar, C95447t tVar, C95850a aVar) {
        super(bsVar, "WiredReadyNoAudioState", tVar, aVar);
        this.f268774d = bsVar;
        this.f268775e = tVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268774d.mo89831a();
        this.f268774d.mo89840j(true);
    }

    /* renamed from: io */
    public final void mo89849io(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f268775e.mo89310v(z, z2, z3)) {
            mo89847j("WiredReadyState", (Intent) null);
            return;
        }
        C59104x b = f268773c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WiredReadyNoAudioState");
        ((C59052c) ((C59052c) b).mo56372aa(16005)).mo56386p("Incorrect audio route; staying in READY_NO_AUDIO_WIRED");
    }
}
