package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.nga.api.br;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;
import com.google.android.apps.gsa.search.core.p6513aj.C84534as;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.bi */
/* compiled from: PG */
public final class C102927bi {

    /* renamed from: a */
    public static final C59071e f287420a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.a.a.bi");

    /* renamed from: b */
    public final Executor f287421b;

    /* renamed from: c */
    public final Optional f287422c;

    /* renamed from: d */
    public final Optional f287423d;

    /* renamed from: e */
    private final C84534as f287424e;

    /* renamed from: f */
    private final bq f287425f;

    public C102927bi(C84534as asVar, Executor executor, bq bqVar, Optional optional, Optional optional2) {
        this.f287424e = asVar;
        this.f287421b = executor;
        this.f287425f = bqVar;
        this.f287422c = optional;
        this.f287423d = optional2;
    }

    /* renamed from: a */
    public final void mo93535a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        br brVar = z ? br.b : br.c;
        if (this.f287424e.mo85398c("GsaPrefs.nga_location_access", br.a.d) != brVar.d) {
            C84533ar a = this.f287424e.mo78241a();
            a.mo78238d("GsaPrefs.nga_location_access", brVar.d);
            a.mo78236b();
            this.f287425f.n();
        }
    }
}
