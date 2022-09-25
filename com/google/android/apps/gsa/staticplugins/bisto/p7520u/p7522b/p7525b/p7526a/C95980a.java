package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95447t;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96026d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.a */
/* compiled from: PG */
public class C95980a extends C96026d {

    /* renamed from: c */
    private final C95447t f268723c;

    public C95980a(C96023bs bsVar, String str, C95447t tVar, C95850a aVar) {
        super(bsVar, str, aVar);
        this.f268723c = tVar;
    }

    /* renamed from: ip */
    public void mo89286ip(String str, boolean z) {
        if (!z && !this.f268868a.equals("WiredIdleState") && !this.f268868a.equals("WiredDisconnectingState")) {
            mo89847j("WiredDisconnectingState", (Intent) null);
        }
    }

    /* renamed from: l */
    public boolean mo89848l(Intent intent) {
        if (super.mo89848l(intent)) {
            return true;
        }
        if (!this.f268723c.mo89303A(intent)) {
            return false;
        }
        mo89847j("WiredDisconnectingState", (Intent) null);
        return true;
    }
}
