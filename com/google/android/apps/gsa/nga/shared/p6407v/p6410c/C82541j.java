package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.j */
/* compiled from: PG */
final class C82541j extends C82406e {

    /* renamed from: a */
    private final String f225467a;

    /* renamed from: b */
    private final String f225468b;

    /* renamed from: c */
    private final String f225469c;

    public C82541j(String str, String str2, String str3) {
        this.f225467a = str;
        this.f225468b = str2;
        this.f225469c = str3;
    }

    /* renamed from: c */
    public final String mo76065c() {
        return this.f225469c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225467a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82406e) {
            C82406e eVar = (C82406e) obj;
            return this.f225467a.equals(eVar.mo75583d()) && this.f225468b.equals(eVar.mo76066f()) && this.f225469c.equals(eVar.mo76065c());
        }
    }

    /* renamed from: f */
    public final String mo76066f() {
        return this.f225468b;
    }

    public final int hashCode() {
        return ((((this.f225467a.hashCode() ^ 1000003) * 1000003) ^ this.f225468b.hashCode()) * 1000003) ^ this.f225469c.hashCode();
    }

    public final String toString() {
        String str = this.f225467a;
        String str2 = this.f225468b;
        String str3 = this.f225469c;
        return "AudioRouteLostReasonEvent{token=" + str + ", routeType=" + str2 + ", reason=" + str3 + "}";
    }
}
