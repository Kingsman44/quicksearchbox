package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fi */
/* compiled from: PG */
public final class C82442fi extends C82671nv {

    /* renamed from: a */
    private final String f225267a = "NGA_TRIGGERING";

    /* renamed from: b */
    private final String f225268b;

    /* renamed from: c */
    private final String f225269c;

    /* renamed from: d */
    private final String f225270d;

    public C82442fi(String str, String str2, String str3, String str4) {
        this.f225268b = str2;
        this.f225269c = str3;
        this.f225270d = str4;
    }

    /* renamed from: b */
    public final String mo76241b() {
        return this.f225270d;
    }

    /* renamed from: c */
    public final String mo76242c() {
        return this.f225268b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225267a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82671nv) {
            C82671nv nvVar = (C82671nv) obj;
            return this.f225267a.equals(nvVar.mo75583d()) && this.f225268b.equals(nvVar.mo76242c()) && this.f225269c.equals(nvVar.mo76244f()) && this.f225270d.equals(nvVar.mo76241b());
        }
    }

    /* renamed from: f */
    public final String mo76244f() {
        return this.f225269c;
    }

    public final int hashCode() {
        return ((((((this.f225267a.hashCode() ^ 1000003) * 1000003) ^ this.f225268b.hashCode()) * 1000003) ^ this.f225269c.hashCode()) * 1000003) ^ this.f225270d.hashCode();
    }

    public final String toString() {
        String str = this.f225267a;
        String str2 = this.f225268b;
        String str3 = this.f225269c;
        String str4 = this.f225270d;
        return "NgaTriggeringEvent{token=" + str + ", eventType=" + str2 + ", triggerType=" + str3 + ", endState=" + str4 + "}";
    }
}
