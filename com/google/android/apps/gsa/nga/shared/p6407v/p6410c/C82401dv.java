package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dv */
/* compiled from: PG */
public final class C82401dv extends C82631mi {

    /* renamed from: a */
    private final String f225129a = "NGA_OPA_HANDOVER_QUERIES_DEVICE_TIER";

    /* renamed from: b */
    private final String f225130b;

    public C82401dv(String str, String str2) {
        this.f225130b = str2;
    }

    /* renamed from: b */
    public final String mo76044b() {
        return this.f225130b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225129a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82631mi) {
            C82631mi miVar = (C82631mi) obj;
            return this.f225129a.equals(miVar.mo75583d()) && this.f225130b.equals(miVar.mo76044b());
        }
    }

    public final int hashCode() {
        return ((this.f225129a.hashCode() ^ 1000003) * 1000003) ^ this.f225130b.hashCode();
    }

    public final String toString() {
        String str = this.f225129a;
        String str2 = this.f225130b;
        return "NgaOpaHandoverQueriesDeviceTierEvent{token=" + str + ", deviceRamGb=" + str2 + "}";
    }
}
