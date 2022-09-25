package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bn */
/* compiled from: PG */
final class C82339bn extends C82569ka {

    /* renamed from: a */
    private final String f224931a;

    /* renamed from: b */
    private final String f224932b;

    public C82339bn(String str, String str2) {
        this.f224931a = str;
        this.f224932b = str2;
    }

    /* renamed from: b */
    public final String mo75773b() {
        return this.f224932b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224931a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82569ka) {
            C82569ka kaVar = (C82569ka) obj;
            return this.f224931a.equals(kaVar.mo75583d()) && this.f224932b.equals(kaVar.mo75773b());
        }
    }

    public final int hashCode() {
        return ((this.f224931a.hashCode() ^ 1000003) * 1000003) ^ this.f224932b.hashCode();
    }

    public final String toString() {
        String str = this.f224931a;
        String str2 = this.f224932b;
        return "NgaEndstateEdgeCaseEvent{token=" + str + ", caseName=" + str2 + "}";
    }
}
