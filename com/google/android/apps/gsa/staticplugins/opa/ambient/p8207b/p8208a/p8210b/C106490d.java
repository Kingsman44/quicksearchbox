package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8210b;

import com.google.android.apps.gsa.n.g.a;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106449ao;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131091a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.p3887a.C50686v;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.b.d */
/* compiled from: PG */
public final class C106490d implements C131091a {

    /* renamed from: a */
    public static final C59071e f296983a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.b.d");

    /* renamed from: b */
    public final u f296984b;

    /* renamed from: c */
    public final a f296985c;

    /* renamed from: d */
    public final C86054o f296986d;

    /* renamed from: e */
    public final C21370a f296987e;

    /* renamed from: f */
    public final C86124t f296988f;

    /* renamed from: g */
    public final C106449ao f296989g;

    /* renamed from: h */
    private final i f296990h;

    /* renamed from: i */
    private final C60888db f296991i;

    public C106490d(u uVar, i iVar, a aVar, C86054o oVar, C21370a aVar2, C60888db dbVar, C106449ao aoVar, C86124t tVar) {
        this.f296984b = uVar;
        this.f296990h = iVar;
        this.f296985c = aVar;
        this.f296986d = oVar;
        this.f296987e = aVar2;
        this.f296991i = dbVar;
        this.f296989g = aoVar;
        this.f296988f = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo95547a() {
        C60870cx cxVar;
        String F = this.f296986d.mo79659F();
        if (F == null) {
            cxVar = C60856cj.m92899h(new Exception("User not signed in."));
        } else {
            C60870cx a = this.f296990h.a(F, C65753ak.SMARTSPACE_HEADPHONE_LOGS, (String) null, C63662ac.f172144a, C50686v.f131861f);
            C106487a aVar = C106487a.f296980a;
            cxVar = C60922j.m93044g(a, C47810es.m84963c(aVar), this.f296991i);
        }
        C106489c cVar = new C106489c(this);
        return C60922j.m93044g(cxVar, C47810es.m84963c(cVar), this.f296991i);
    }
}
