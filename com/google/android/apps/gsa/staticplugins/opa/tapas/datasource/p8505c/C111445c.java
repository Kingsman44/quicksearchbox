package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.c */
/* compiled from: PG */
final class C111445c extends C111423a {

    /* renamed from: a */
    public C60870cx f310047a;

    /* renamed from: b */
    public Double f310048b;

    /* renamed from: a */
    public final C111444b mo99136a() {
        Double d;
        C60870cx cxVar = this.f310047a;
        if (cxVar != null && (d = this.f310048b) != null) {
            return new C111446d(cxVar, d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f310047a == null) {
            sb.append(" appNameFuture");
        }
        if (this.f310048b == null) {
            sb.append(" score");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo99137b(C60870cx cxVar) {
        if (cxVar != null) {
            this.f310047a = cxVar;
            return;
        }
        throw new NullPointerException("Null appNameFuture");
    }
}
