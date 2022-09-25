package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.an */
/* compiled from: PG */
public final class C82312an extends C82540iz {

    /* renamed from: a */
    private final String f224841a = "INVOCATION_MANAGER_REJECTION";

    /* renamed from: b */
    private final String f224842b;

    public C82312an(String str, String str2) {
        this.f224842b = str2;
    }

    /* renamed from: b */
    public final String mo75643b() {
        return this.f224842b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224841a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82540iz) {
            C82540iz izVar = (C82540iz) obj;
            return this.f224841a.equals(izVar.mo75583d()) && this.f224842b.equals(izVar.mo75643b());
        }
    }

    public final int hashCode() {
        return ((this.f224841a.hashCode() ^ 1000003) * 1000003) ^ this.f224842b.hashCode();
    }

    public final String toString() {
        String str = this.f224841a;
        String str2 = this.f224842b;
        return "InvocationManagerRejectionEvent{token=" + str + ", status=" + str2 + "}";
    }
}
