package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dw */
/* compiled from: PG */
public final class C82402dw extends C82632mj {

    /* renamed from: a */
    private final String f225131a = "NGA_OPA_HANDOVER_QUERIES";

    public C82402dw(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225131a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82632mj) {
            return this.f225131a.equals(((C82632mj) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225131a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225131a;
        return "NgaOpaHandoverQueriesEvent{token=" + str + "}";
    }
}
