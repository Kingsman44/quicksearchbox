package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.av */
/* compiled from: PG */
public final class C82320av extends C82550ji {

    /* renamed from: a */
    private final String f224875a = "NETWORK_DENYLIST";

    public C82320av(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224875a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82550ji) {
            return this.f224875a.equals(((C82550ji) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f224875a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f224875a;
        return "NetworkDenylistEvent{token=" + str + "}";
    }
}
