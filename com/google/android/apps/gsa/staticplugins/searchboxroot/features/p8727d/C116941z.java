package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88566q;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.z */
/* compiled from: PG */
public final class C116941z implements C88566q {

    /* renamed from: a */
    private final C86338r f324666a;

    public C116941z(C86338r rVar) {
        this.f324666a = rVar;
    }

    /* renamed from: a */
    public final void mo82239a(C54231at atVar) {
        if ((atVar.f142361a & 67108864) != 0) {
            C86337q b = this.f324666a.mo80076b();
            b.mo80072g("gsa_server_response_timestamp", atVar.f142374n);
            b.apply();
            return;
        }
        C86337q b2 = this.f324666a.mo80076b();
        b2.mo80075j("gsa_server_response_timestamp");
        b2.apply();
    }
}
