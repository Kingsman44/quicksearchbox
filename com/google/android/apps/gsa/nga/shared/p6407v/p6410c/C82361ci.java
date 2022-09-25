package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ci */
/* compiled from: PG */
public final class C82361ci extends C82590kv {

    /* renamed from: a */
    private final String f224997a = "NGA_GELLER_SYNC_STALE";

    /* renamed from: b */
    private final boolean f224998b;

    public C82361ci(String str, boolean z) {
        this.f224998b = z;
    }

    /* renamed from: b */
    public final boolean mo75864b() {
        return this.f224998b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224997a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82590kv) {
            C82590kv kvVar = (C82590kv) obj;
            return this.f224997a.equals(kvVar.mo75583d()) && this.f224998b == kvVar.mo75864b();
        }
    }

    public final int hashCode() {
        return ((this.f224997a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f224998b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224997a;
        boolean z = this.f224998b;
        return "NgaGellerSyncStaleEvent{token=" + str + ", stale=" + z + "}";
    }
}
