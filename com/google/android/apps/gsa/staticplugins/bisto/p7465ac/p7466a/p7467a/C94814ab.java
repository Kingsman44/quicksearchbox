package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ab */
/* compiled from: PG */
public final class C94814ab extends C94819ag {

    /* renamed from: c */
    private static final C59071e f265124c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ab");

    /* renamed from: d */
    private final C94828c f265125d;

    public C94814ab(C94828c cVar) {
        this.f265125d = cVar;
    }

    /* renamed from: a */
    public final C94841p call() {
        C95013d dVar = (C95013d) this.f265125d.f265162c.mo56111f();
        if (dVar == null) {
            return C94841p.FATAL_ERROR;
        }
        dVar.mo88921c();
        C59104x b = f265124c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsGattReleaseRequest");
        ((C59052c) ((C59052c) b).mo56372aa(17524)).mo56389s("[%s] GATT released", C94876ay.m156555d(dVar));
        C94812a aVar = new C94812a();
        aVar.mo88623b(C94841p.GATT_DISCONNECTED);
        mo88628b(aVar.mo88622a());
        return C94841p.ERROR_NOT_SPECIFIED;
    }

    /* renamed from: b */
    public final void mo88628b(C94823ak akVar) {
        C59104x b = f265124c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsGattReleaseRequest");
        ((C59052c) ((C59052c) b).mo56372aa(17525)).mo56389s("Request completed with response code %s", akVar.mo88640a());
        super.mo88628b(akVar);
    }
}
