package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b */
/* compiled from: PG */
final class C111836b extends C111824ao {

    /* renamed from: a */
    private final C48672ag f310803a;

    /* renamed from: b */
    private final C60870cx f310804b;

    public C111836b(C48672ag agVar, C60870cx cxVar) {
        this.f310803a = agVar;
        this.f310804b = cxVar;
    }

    /* renamed from: a */
    public final C48672ag mo99255a() {
        return this.f310803a;
    }

    /* renamed from: b */
    public final C60870cx mo99256b() {
        return this.f310804b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111824ao) {
            C111824ao aoVar = (C111824ao) obj;
            return this.f310803a.equals(aoVar.mo99255a()) && this.f310804b.equals(aoVar.mo99256b());
        }
    }

    public final int hashCode() {
        return ((this.f310803a.hashCode() ^ 1000003) * 1000003) ^ this.f310804b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f310803a.f125915O);
        String obj = this.f310804b.toString();
        return "ResponseWrapper{sourceType=" + num + ", responseFuture=" + obj + "}";
    }
}
