package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cn */
/* compiled from: PG */
final class C82366cn extends C82596la {

    /* renamed from: a */
    private final String f225007a;

    /* renamed from: b */
    private final String f225008b;

    public C82366cn(String str, String str2) {
        this.f225007a = str;
        this.f225008b = str2;
    }

    /* renamed from: b */
    public final String mo75878b() {
        return this.f225008b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225007a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82596la) {
            C82596la laVar = (C82596la) obj;
            return this.f225007a.equals(laVar.mo75583d()) && this.f225008b.equals(laVar.mo75878b());
        }
    }

    public final int hashCode() {
        return ((this.f225007a.hashCode() ^ 1000003) * 1000003) ^ this.f225008b.hashCode();
    }

    public final String toString() {
        String str = this.f225007a;
        String str2 = this.f225008b;
        return "NgaGsaVisStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
