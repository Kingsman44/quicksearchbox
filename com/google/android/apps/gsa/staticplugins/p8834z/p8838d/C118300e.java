package com.google.android.apps.gsa.staticplugins.p8834z.p8838d;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6765w.C85608a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.z.d.e */
/* compiled from: PG */
public final class C118300e extends C86734a implements C85608a {

    /* renamed from: a */
    public final C145748z f328376a;

    /* renamed from: b */
    public final C42876ab f328377b;

    /* renamed from: c */
    private final C84474e f328378c;

    public C118300e(C145748z zVar, C84474e eVar, C42876ab abVar) {
        super(C118575h.WORKER_CHROME_EXPERIMENT_SYNC, "chromeexperimentsyncer");
        this.f328376a = zVar;
        this.f328378c = eVar;
        this.f328377b = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo79093a() {
        C58485gu d = this.f328378c.mo78115d();
        C58976aa aaVar = C58975e.f156826a;
        return C118826c.m197213c(C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(C60922j.m93044g(C60838bs.m92859i(this.f328377b.mo46042d()), new C118299d(d), C60826bg.f164896a)), new C118297b(this, d), C60826bg.f164896a), new C118298c(this, d), C60826bg.f164896a));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
