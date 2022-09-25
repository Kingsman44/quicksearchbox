package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dk */
/* compiled from: PG */
public final class C82390dk extends C82619lx {

    /* renamed from: a */
    private final String f225098a = "NGA_NATIVE_CODE_LOADED";

    /* renamed from: b */
    private final boolean f225099b;

    /* renamed from: c */
    private final boolean f225100c;

    /* renamed from: d */
    private final boolean f225101d;

    public C82390dk(String str, boolean z, boolean z2, boolean z3) {
        this.f225099b = z;
        this.f225100c = z2;
        this.f225101d = z3;
    }

    /* renamed from: b */
    public final boolean mo75991b() {
        return this.f225100c;
    }

    /* renamed from: c */
    public final boolean mo75992c() {
        return this.f225099b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225098a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82619lx) {
            C82619lx lxVar = (C82619lx) obj;
            return this.f225098a.equals(lxVar.mo75583d()) && this.f225099b == lxVar.mo75992c() && this.f225100c == lxVar.mo75991b() && this.f225101d == lxVar.mo75994f();
        }
    }

    /* renamed from: f */
    public final boolean mo75994f() {
        return this.f225101d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f225098a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225099b ? 1237 : 1231)) * 1000003) ^ (true != this.f225100c ? 1237 : 1231)) * 1000003;
        if (true == this.f225101d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f225098a;
        boolean z = this.f225099b;
        boolean z2 = this.f225100c;
        boolean z3 = this.f225101d;
        return "NgaNativeCodeLoadedEvent{token=" + str + ", fromAssets=" + z + ", background=" + z2 + ", success=" + z3 + "}";
    }
}
