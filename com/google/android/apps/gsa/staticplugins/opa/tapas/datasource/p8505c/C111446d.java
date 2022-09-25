package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.d */
/* compiled from: PG */
final class C111446d extends C111444b {

    /* renamed from: a */
    private final C60870cx f310049a;

    /* renamed from: b */
    private final Double f310050b;

    public C111446d(C60870cx cxVar, Double d) {
        this.f310049a = cxVar;
        this.f310050b = d;
    }

    /* renamed from: b */
    public final C60870cx mo99152b() {
        return this.f310049a;
    }

    /* renamed from: c */
    public final Double mo99153c() {
        return this.f310050b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111444b) {
            C111444b bVar = (C111444b) obj;
            return this.f310049a.equals(bVar.mo99152b()) && this.f310050b.equals(bVar.mo99153c());
        }
    }

    public final int hashCode() {
        return ((this.f310049a.hashCode() ^ 1000003) * 1000003) ^ this.f310050b.hashCode();
    }

    public final String toString() {
        String obj = this.f310049a.toString();
        Double d = this.f310050b;
        return "AppShortcutInfo{appNameFuture=" + obj + ", score=" + d + "}";
    }
}
