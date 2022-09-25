package com.google.android.libraries.search.logging.appflows;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.search.logging.appflows.h */
/* compiled from: PG */
final class C38785h extends C38792o {

    /* renamed from: b */
    private final C58528ij f102360b;

    public C38785h(C58528ij ijVar) {
        this.f102360b = ijVar;
    }

    /* renamed from: a */
    public final C58528ij mo41623a() {
        return this.f102360b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38792o) {
            return this.f102360b.equals(((C38792o) obj).mo41623a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f102360b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102360b);
        return "LoggerOptions{appFlowListeners=" + valueOf + "}";
    }
}
