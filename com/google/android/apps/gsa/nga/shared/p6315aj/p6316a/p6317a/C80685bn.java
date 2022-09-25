package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bn */
/* compiled from: PG */
final class C80685bn extends C80775ew {

    /* renamed from: a */
    private final String f221530a;

    public C80685bn(String str) {
        this.f221530a = str;
    }

    /* renamed from: a */
    public final String mo74586a() {
        return this.f221530a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80775ew) {
            return this.f221530a.equals(((C80775ew) obj).mo74586a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f221530a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f221530a;
        return "StaticText{text=" + str + "}";
    }
}
