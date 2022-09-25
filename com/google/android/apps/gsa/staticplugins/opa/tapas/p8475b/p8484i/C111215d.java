package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8484i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3825an.p3830c.p3831a.C49333j;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.i.d */
/* compiled from: PG */
public final class C111215d extends C112473ar {

    /* renamed from: b */
    private static final C121537f f309510b = C121537f.m200840b("AppDonationSignalFetcher", C121511c.f337208a);

    /* renamed from: a */
    public final C21370a f309511a;

    /* renamed from: c */
    private final C22871g f309512c;

    /* renamed from: d */
    private final C68214a f309513d;

    /* renamed from: e */
    private final C86124t f309514e;

    public C111215d(C22871g gVar, C21370a aVar, C68214a aVar2, C86124t tVar) {
        this.f309512c = gVar;
        this.f309511a = aVar;
        this.f309513d = aVar2;
        this.f309514e = tVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return this.f309514e.mo79743a(C90063do.f249235H);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        C22871g gVar = this.f309512c;
        C111204a aVar = (C111204a) this.f309513d.mo27525b();
        C60870cx j = gVar.mo28210j(aVar.f309500a.mo83617a((C49333j) aVar.f309501b.mo17428b()), "FetchFromIcing", new C111214c(this));
        f309510b.mo105244m("fetchSuggestions", j);
        return j;
    }
}
