package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.y */
/* compiled from: PG */
public final class C94850y extends C94819ag {

    /* renamed from: c */
    private static final C59071e f265244c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.y");

    /* renamed from: d */
    private static final C58528ij f265245d = C58528ij.m90011K(C94841p.SERVICE_DISCOVERED, C94841p.GATT_ERROR);

    /* renamed from: e */
    private final C94828c f265246e;

    public C94850y(C94828c cVar) {
        this.f265246e = cVar;
    }

    /* renamed from: a */
    public final C94841p call() {
        C95013d dVar = (C95013d) this.f265246e.f265162c.mo56111f();
        if (dVar == null) {
            return C94841p.FATAL_ERROR;
        }
        this.f265246e.f265164e.mo88667a(this);
        if (dVar.mo88923e()) {
            return C94841p.ERROR_NOT_SPECIFIED;
        }
        this.f265246e.f265164e.mo88668b(this);
        return C94841p.FATAL_ERROR;
    }

    /* renamed from: b */
    public final void mo88628b(C94823ak akVar) {
        if (f265245d.contains(akVar.mo88640a())) {
            C59104x b = f265244c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsDiscoverServiceRequest");
            ((C59052c) ((C59052c) b).mo56372aa(17514)).mo56389s("Request completed with response code %s", akVar.mo88640a());
            this.f265246e.f265164e.mo88668b(this);
            super.mo88628b(akVar);
        }
    }
}
