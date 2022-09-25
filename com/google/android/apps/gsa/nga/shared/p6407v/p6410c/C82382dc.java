package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dc */
/* compiled from: PG */
public final class C82382dc extends C82611lp {

    /* renamed from: a */
    private final String f225075a = "NGA_LIFECYCLE_STATUS_WHEN_FULL_LISTENING";

    /* renamed from: b */
    private final boolean f225076b;

    public C82382dc(String str, boolean z) {
        this.f225076b = z;
    }

    /* renamed from: b */
    public final boolean mo75959b() {
        return this.f225076b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225075a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82611lp) {
            C82611lp lpVar = (C82611lp) obj;
            return this.f225075a.equals(lpVar.mo75583d()) && this.f225076b == lpVar.mo75959b();
        }
    }

    public final int hashCode() {
        return ((this.f225075a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225076b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225075a;
        boolean z = this.f225076b;
        return "NgaLifecycleStatusWhenFullListeningEvent{token=" + str + ", inLifecycle=" + z + "}";
    }
}
