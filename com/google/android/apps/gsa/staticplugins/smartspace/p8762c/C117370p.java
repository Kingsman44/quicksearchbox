package com.google.android.apps.gsa.staticplugins.smartspace.p8762c;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131596c;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.c.p */
/* compiled from: PG */
public final class C117370p implements C117356b {

    /* renamed from: a */
    public final Context f325827a;

    /* renamed from: b */
    public final C86124t f325828b;

    /* renamed from: c */
    public final C58974d f325829c;

    /* renamed from: d */
    public final C131596c f325830d;

    /* renamed from: e */
    private final C91189au f325831e;

    /* renamed from: f */
    private final C60888db f325832f;

    public C117370p(C83564a aVar, Context context, C86124t tVar, C91189au auVar, C90851k kVar, C131596c cVar) {
        this.f325827a = context;
        this.f325831e = auVar;
        this.f325828b = tVar;
        this.f325832f = kVar.mo85208a("backgroundExecutor");
        this.f325829c = aVar.mo76900a("WeatherCardConverter");
        this.f325830d = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo103276a(C83802r rVar) {
        return C92025g.m151037f(rVar, this.f325832f, this.f325831e, this.f325828b);
    }

    /* renamed from: b */
    public final C60870cx mo103277b(C92113i iVar) {
        return C60922j.m93044g(C92025g.m151036e(iVar, this.f325832f, this.f325831e, this.f325828b), new C117369o(this), this.f325832f);
    }
}
