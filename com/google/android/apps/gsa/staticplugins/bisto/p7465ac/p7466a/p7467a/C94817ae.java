package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95013d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ae */
/* compiled from: PG */
public final class C94817ae extends C94819ag {

    /* renamed from: c */
    private static final C59071e f265130c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.ae");

    /* renamed from: d */
    private static final Duration f265131d = Duration.ofSeconds(3);

    /* renamed from: e */
    private final C94828c f265132e;

    /* renamed from: f */
    private final C60888db f265133f;

    public C94817ae(C94828c cVar, C60888db dbVar) {
        this.f265132e = cVar;
        this.f265133f = dbVar;
    }

    /* renamed from: a */
    public final C94841p call() {
        C95013d dVar = (C95013d) this.f265132e.f265162c.mo56111f();
        if (dVar == null) {
            return C94841p.FATAL_ERROR;
        }
        try {
            dVar.mo88922d();
            C59104x b = f265130c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsRefreshRequest");
            ((C59052c) ((C59052c) b).mo56372aa(17531)).mo56386p("Schedule gatt refresh completion");
            this.f265133f.mo29164d(new C94816ad(this), f265131d.toMillis(), TimeUnit.MILLISECONDS);
            return C94841p.ERROR_NOT_SPECIFIED;
        } catch (Exception e) {
            C59104x c = f265130c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsRefreshRequest");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17532)).mo56386p("Fail to refresh");
            return C94841p.FATAL_ERROR;
        }
    }

    /* renamed from: b */
    public final void mo88628b(C94823ak akVar) {
        C59104x b = f265130c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsRefreshRequest");
        ((C59052c) ((C59052c) b).mo56372aa(17533)).mo56389s("Request completed with response code %s", akVar.mo88640a());
        super.mo88628b(akVar);
    }
}
