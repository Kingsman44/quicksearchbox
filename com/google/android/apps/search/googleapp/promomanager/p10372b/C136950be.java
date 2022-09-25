package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.be */
/* compiled from: PG */
public final /* synthetic */ class C136950be implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136958bm f372714a;

    /* renamed from: b */
    public final /* synthetic */ C137009dj f372715b;

    public /* synthetic */ C136950be(C136958bm bmVar, C137009dj djVar) {
        this.f372714a = bmVar;
        this.f372715b = djVar;
    }

    public final C60870cx apply(Object obj) {
        C136958bm bmVar = this.f372714a;
        C137009dj djVar = this.f372715b;
        C137041j jVar = (C137041j) obj;
        C60870cx cxVar = bmVar.f372757q;
        C136956bk bkVar = new C136956bk(bmVar, jVar, djVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(bkVar), bmVar.f372748h);
        if (!bmVar.f372752l) {
            return h;
        }
        C136957bl blVar = new C136957bl(bmVar, jVar, djVar);
        return C60922j.m93044g(h, C47810es.m84963c(blVar), bmVar.f372748h);
    }
}
