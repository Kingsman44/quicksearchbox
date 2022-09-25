package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b.C112189o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113115a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113178ci;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.w */
/* compiled from: PG */
public final class C111419w extends C113409et {

    /* renamed from: a */
    public static final C59071e f309980a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.w");

    /* renamed from: b */
    public final C22871g f309981b;

    /* renamed from: c */
    public final C86124t f309982c;

    /* renamed from: d */
    public final Context f309983d;

    /* renamed from: e */
    public final C113206m f309984e;

    /* renamed from: f */
    public final C112189o f309985f;

    /* renamed from: g */
    public final C113251ad f309986g;

    /* renamed from: h */
    public final C113178ci f309987h;

    /* renamed from: i */
    public final C113115a f309988i;

    /* renamed from: j */
    private final C22871g f309989j;

    public C111419w(C22871g gVar, C22871g gVar2, C86124t tVar, Context context, C113206m mVar, C112189o oVar, C113251ad adVar, C113178ci ciVar, C113115a aVar) {
        this.f309981b = gVar;
        this.f309989j = gVar2;
        this.f309982c = tVar;
        this.f309983d = context;
        this.f309984e = mVar;
        this.f309985f = oVar;
        this.f309986g = adVar;
        this.f309987h = ciVar;
        this.f309988i = aVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.USAGE_STATS_APPS;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        epVar.mo100033p();
        return this.f309981b.mo28210j(this.f309989j.mo28201a("fetchAppUsage", new C111408l(this)), "fetchSuggestionsFromUsageStatsManager", new C111414r(this, epVar));
    }
}
