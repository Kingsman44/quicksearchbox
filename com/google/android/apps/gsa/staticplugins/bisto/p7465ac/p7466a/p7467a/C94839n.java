package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.n */
/* compiled from: PG */
public final class C94839n extends C94819ag {

    /* renamed from: c */
    private static final C59071e f265202c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.n");

    /* renamed from: d */
    private static final C58528ij f265203d = C58528ij.m90011K(C94841p.GATT_CONNECTED, C94841p.GATT_DISCONNECTED);

    /* renamed from: e */
    private final C94828c f265204e;

    public C94839n(C94828c cVar) {
        this.f265204e = cVar;
    }

    /* renamed from: a */
    public final C94841p call() {
        this.f265204e.f265164e.mo88667a(this);
        C94828c cVar = this.f265204e;
        C95013d a = cVar.f265161b.mo88917a(cVar.f265163d, cVar.f265164e);
        cVar.f265162c = C58833ax.m90833j(a);
        if (a != null) {
            return C94841p.ERROR_NOT_SPECIFIED;
        }
        return C94841p.FATAL_ERROR;
    }

    /* renamed from: b */
    public final void mo88628b(C94823ak akVar) {
        if (!f265203d.contains(akVar.mo88640a())) {
            C59104x d = f265202c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GacsConnectionRequest");
            ((C59052c) ((C59052c) d).mo56372aa(17494)).mo56389s("Response code %s is not expected", akVar.mo88640a());
            return;
        }
        C59104x b = f265202c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsConnectionRequest");
        ((C59052c) ((C59052c) b).mo56372aa(17493)).mo56389s("Request completed with response code %s", akVar.mo88640a());
        this.f265204e.f265164e.mo88668b(this);
        super.mo88628b(akVar);
    }
}
