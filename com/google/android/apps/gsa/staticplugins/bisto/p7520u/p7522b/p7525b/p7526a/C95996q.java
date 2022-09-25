package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.q */
/* compiled from: PG */
public final class C95996q extends C95980a implements C89495cg {

    /* renamed from: c */
    private static final C59071e f268766c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.q");

    /* renamed from: d */
    private final C95355bf f268767d;

    /* renamed from: e */
    private final C89496ch f268768e;

    /* renamed from: f */
    private final C96023bs f268769f;

    public C95996q(C96023bs bsVar, C95447t tVar, C89496ch chVar, C95850a aVar) {
        super(bsVar, "WiredOobeState", tVar, aVar);
        this.f268767d = tVar;
        this.f268768e = chVar;
        this.f268769f = bsVar;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f268767d.mo89270k()) && set.contains(27)) {
            C59104x b = f268766c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredOobeState");
            ((C59052c) ((C59052c) b).mo56372aa(16001)).mo56389s("New OOBE state: %s", dVar.mo106520r());
            C124633az azVar = C124633az.OOBE_STATE_UNKNOWN;
            int ordinal = dVar.mo106520r().ordinal();
            if (ordinal == 1) {
                mo89847j("WiredReadyNoAudioState", (Intent) null);
            } else if (ordinal == 2) {
                mo89847j("WiredDisconnectingState", (Intent) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268769f.mo89831a();
        this.f268769f.mo89840j(true);
        this.f268768e.mo83360B(new C58759qy(27), this);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268768e.mo83379U(this);
    }
}
