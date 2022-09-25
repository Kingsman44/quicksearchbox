package com.google.android.apps.gsa.nga.shared.p6328ap;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.h */
/* compiled from: PG */
final class C80988h extends C80986f {

    /* renamed from: a */
    private final String f222005a;

    /* renamed from: b */
    private final boolean f222006b;

    public C80988h(String str, boolean z) {
        if (str != null) {
            this.f222005a = str;
            this.f222006b = z;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo74763a() {
        return this.f222005a;
    }

    /* renamed from: b */
    public final boolean mo74764b() {
        return this.f222006b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80986f) {
            C80986f fVar = (C80986f) obj;
            return this.f222005a.equals(fVar.mo74763a()) && this.f222006b == fVar.mo74764b();
        }
    }

    public final int hashCode() {
        return ((this.f222005a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f222006b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f222005a;
        boolean z = this.f222006b;
        return "TopActivityInfo{packageName=" + str + ", isLauncher=" + z + "}";
    }
}
