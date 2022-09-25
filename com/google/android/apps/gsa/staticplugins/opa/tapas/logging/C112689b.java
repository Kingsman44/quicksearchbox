package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.b */
/* compiled from: PG */
final class C112689b extends C112704l {

    /* renamed from: a */
    private final long f312394a;

    /* renamed from: b */
    private final C60870cx f312395b;

    public C112689b(long j, C60870cx cxVar) {
        this.f312394a = j;
        if (cxVar != null) {
            this.f312395b = cxVar;
            return;
        }
        throw new NullPointerException("Null completionFuture");
    }

    /* renamed from: a */
    public final long mo99645a() {
        return this.f312394a;
    }

    /* renamed from: b */
    public final C60870cx mo99646b() {
        return this.f312395b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C112704l) {
            C112704l lVar = (C112704l) obj;
            return this.f312394a == lVar.mo99645a() && this.f312395b.equals(lVar.mo99646b());
        }
    }

    public final int hashCode() {
        long j = this.f312394a;
        return this.f312395b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f312394a;
        String obj = this.f312395b.toString();
        return "TimeoutLoggerTask{scheduledTimeMillis=" + j + ", completionFuture=" + obj + "}";
    }
}
