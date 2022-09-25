package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cw */
/* compiled from: PG */
public final class C82375cw extends C82605lj {

    /* renamed from: a */
    private final String f225047a = "NGA_INITIALIZATION";

    /* renamed from: b */
    private final String f225048b;

    /* renamed from: c */
    private final boolean f225049c;

    public C82375cw(String str, String str2, boolean z) {
        this.f225048b = str2;
        this.f225049c = z;
    }

    /* renamed from: b */
    public final String mo75922b() {
        return this.f225048b;
    }

    /* renamed from: c */
    public final boolean mo75923c() {
        return this.f225049c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225047a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82605lj) {
            C82605lj ljVar = (C82605lj) obj;
            return this.f225047a.equals(ljVar.mo75583d()) && this.f225048b.equals(ljVar.mo75922b()) && this.f225049c == ljVar.mo75923c();
        }
    }

    public final int hashCode() {
        return ((((this.f225047a.hashCode() ^ 1000003) * 1000003) ^ this.f225048b.hashCode()) * 1000003) ^ (true != this.f225049c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225047a;
        String str2 = this.f225048b;
        boolean z = this.f225049c;
        return "NgaInitializationEvent{token=" + str + ", deviceRamGb=" + str2 + ", success=" + z + "}";
    }
}
