package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bd */
/* compiled from: PG */
public final /* synthetic */ class C136949bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136958bm f372712a;

    /* renamed from: b */
    public final /* synthetic */ C137009dj f372713b;

    public /* synthetic */ C136949bd(C136958bm bmVar, C137009dj djVar) {
        this.f372712a = bmVar;
        this.f372713b = djVar;
    }

    public final C60870cx apply(Object obj) {
        C136958bm bmVar = this.f372712a;
        C137009dj djVar = this.f372713b;
        C137041j jVar = (C137041j) obj;
        bmVar.mo113454k(C37182a.f97890cP.mo40779c());
        C137029x xVar = bmVar.f372756p;
        if (!xVar.f372912c) {
            xVar.f372914e = xVar.mo113480a(xVar.f372910a.f172286a);
            xVar.f372912c = true;
        }
        C60870cx b = xVar.mo113481b(jVar, djVar, xVar.f372914e);
        C137021p pVar = C137021p.f372903a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(pVar), xVar.f372911b);
        C136954bi biVar = new C136954bi(bmVar, jVar);
        return C60922j.m93044g(g, C47810es.m84963c(biVar), bmVar.f372748h);
    }
}
