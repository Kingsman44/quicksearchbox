package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.a */
/* compiled from: PG */
final class C77281a extends C77300t {

    /* renamed from: a */
    private final String f213157a;

    /* renamed from: b */
    private final int f213158b;

    public C77281a(String str, int i) {
        this.f213157a = str;
        this.f213158b = i;
    }

    /* renamed from: a */
    public final int mo72492a() {
        return this.f213158b;
    }

    /* renamed from: b */
    public final String mo72493b() {
        return this.f213157a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77300t) {
            C77300t tVar = (C77300t) obj;
            return this.f213157a.equals(tVar.mo72493b()) && this.f213158b == tVar.mo72492a();
        }
    }

    public final int hashCode() {
        return ((this.f213157a.hashCode() ^ 1000003) * 1000003) ^ this.f213158b;
    }

    public final String toString() {
        String str = this.f213157a;
        int i = this.f213158b;
        return "ToggleCardSetting{uri=" + str + ", displayNameStringId=" + i + "}";
    }
}
