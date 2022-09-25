package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.g */
/* compiled from: PG */
public final class C95986g extends C95980a {

    /* renamed from: c */
    public static final C59071e f268733c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.g");

    /* renamed from: d */
    public boolean f268734d;

    /* renamed from: e */
    private final C95355bf f268735e;

    /* renamed from: f */
    private final C22871g f268736f;

    /* renamed from: g */
    private final C96023bs f268737g;

    public C95986g(C96023bs bsVar, C95447t tVar, C22871g gVar, C95850a aVar) {
        super(bsVar, "WiredDisconnectingState", tVar, aVar);
        this.f268735e = tVar;
        this.f268736f = gVar;
        this.f268737g = bsVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268737g.mo89831a();
        this.f268737g.mo89840j(false);
        this.f268734d = false;
        C90875ai.m148465b(new C95984e(this), this.f268735e.mo89265f("DisconnectingState"), this.f268736f, "Disconnect complete").mo85223a(new C95985f(this));
    }

    /* renamed from: ip */
    public final void mo89286ip(String str, boolean z) {
        C59104x b = f268733c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WiredDisconnectingState");
        ((C59052c) ((C59052c) b).mo56372aa(15987)).mo56389s("onConnectionChange: %b", Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final boolean mo89848l(Intent intent) {
        if (!"ACTION_OOBE_STATUS_UPDATED".equals(intent.getAction())) {
            return super.mo89848l(intent);
        }
        this.f268734d = true;
        return true;
    }
}
