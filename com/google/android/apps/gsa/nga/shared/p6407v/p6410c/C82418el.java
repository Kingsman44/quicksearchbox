package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.el */
/* compiled from: PG */
public final class C82418el extends C82647my {

    /* renamed from: a */
    private final String f225175a = "NGA_RELIABILITY_START";

    /* renamed from: b */
    private final String f225176b;

    /* renamed from: c */
    private final String f225177c;

    /* renamed from: d */
    private final String f225178d;

    public C82418el(String str, String str2, String str3, String str4) {
        this.f225176b = str2;
        this.f225177c = str3;
        this.f225178d = str4;
    }

    /* renamed from: b */
    public final String mo76122b() {
        return this.f225176b;
    }

    /* renamed from: c */
    public final String mo76123c() {
        return this.f225177c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225175a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82647my) {
            C82647my myVar = (C82647my) obj;
            return this.f225175a.equals(myVar.mo75583d()) && this.f225176b.equals(myVar.mo76122b()) && this.f225177c.equals(myVar.mo76123c()) && this.f225178d.equals(myVar.mo76125f());
        }
    }

    /* renamed from: f */
    public final String mo76125f() {
        return this.f225178d;
    }

    public final int hashCode() {
        return ((((((this.f225175a.hashCode() ^ 1000003) * 1000003) ^ this.f225176b.hashCode()) * 1000003) ^ this.f225177c.hashCode()) * 1000003) ^ this.f225178d.hashCode();
    }

    public final String toString() {
        String str = this.f225175a;
        String str2 = this.f225176b;
        String str3 = this.f225177c;
        String str4 = this.f225178d;
        return "NgaReliabilityStartEvent{token=" + str + ", previousState=" + str2 + ", state=" + str3 + ", triggerType=" + str4 + "}";
    }
}
