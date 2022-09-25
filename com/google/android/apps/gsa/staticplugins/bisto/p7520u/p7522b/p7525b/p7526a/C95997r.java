package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95763ba;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95764bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.r */
/* compiled from: PG */
public final class C95997r extends C95980a implements C95763ba {

    /* renamed from: c */
    private static final C59071e f268770c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.r");

    /* renamed from: d */
    private final C96023bs f268771d;

    /* renamed from: e */
    private final C95764bb f268772e;

    public C95997r(C96023bs bsVar, C95447t tVar, C95764bb bbVar, C95850a aVar) {
        super(bsVar, "WiredPhoneCallState", tVar, aVar);
        this.f268771d = bsVar;
        this.f268772e = bbVar;
    }

    /* renamed from: d */
    public final void mo89753d(int i, int i2) {
        C59104x b = f268770c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WiredPhoneCallState");
        ((C59052c) ((C59052c) b).mo56372aa(16003)).mo56393w("Phone call state: %d -> %d", i, i2);
        if (i2 != i && i2 == 0) {
            mo89847j("WiredReadyNoAudioState", (Intent) null);
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268771d.mo89831a();
        this.f268771d.mo89840j(true);
        if (this.f268772e.f268131a == 0) {
            C59104x b = f268770c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WiredPhoneCallState");
            ((C59052c) ((C59052c) b).mo56372aa(16002)).mo56386p("Call is finished");
            mo89847j("WiredReadyNoAudioState", (Intent) null);
            return;
        }
        this.f268772e.mo89754a(this);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = false;
        this.f268772e.mo89756c(this);
    }
}
