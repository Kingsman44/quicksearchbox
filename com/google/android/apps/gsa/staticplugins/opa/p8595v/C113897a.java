package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.a */
/* compiled from: PG */
final class C113897a extends C113915s {

    /* renamed from: a */
    private final long f315351a;

    /* renamed from: b */
    private final C60870cx f315352b;

    public C113897a(long j, C60870cx cxVar) {
        this.f315351a = j;
        if (cxVar != null) {
            this.f315352b = cxVar;
            return;
        }
        throw new NullPointerException("Null completionFuture");
    }

    /* renamed from: a */
    public final long mo100752a() {
        return this.f315351a;
    }

    /* renamed from: b */
    public final C60870cx mo100753b() {
        return this.f315352b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C113915s) {
            C113915s sVar = (C113915s) obj;
            return this.f315351a == sVar.mo100752a() && this.f315352b.equals(sVar.mo100753b());
        }
    }

    public final int hashCode() {
        long j = this.f315351a;
        return this.f315352b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f315351a;
        String obj = this.f315352b.toString();
        return "TimeoutLoggerTask{scheduledTimeMillis=" + j + ", completionFuture=" + obj + "}";
    }
}
