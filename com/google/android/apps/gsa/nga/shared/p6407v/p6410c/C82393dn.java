package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dn */
/* compiled from: PG */
public final class C82393dn extends C82623ma {

    /* renamed from: a */
    private final String f225110a = "NGA_NETWORK_STATUS";

    /* renamed from: b */
    private final String f225111b;

    /* renamed from: c */
    private final String f225112c;

    public C82393dn(String str, String str2, String str3) {
        this.f225111b = str2;
        this.f225112c = str3;
    }

    /* renamed from: b */
    public final String mo76009b() {
        return this.f225111b;
    }

    /* renamed from: c */
    public final String mo76010c() {
        return this.f225112c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225110a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82623ma) {
            C82623ma maVar = (C82623ma) obj;
            return this.f225110a.equals(maVar.mo75583d()) && this.f225111b.equals(maVar.mo76009b()) && this.f225112c.equals(maVar.mo76010c());
        }
    }

    public final int hashCode() {
        return ((((this.f225110a.hashCode() ^ 1000003) * 1000003) ^ this.f225111b.hashCode()) * 1000003) ^ this.f225112c.hashCode();
    }

    public final String toString() {
        String str = this.f225110a;
        String str2 = this.f225111b;
        String str3 = this.f225112c;
        return "NgaNetworkStatusEvent{token=" + str + ", deviceModel=" + str2 + ", status=" + str3 + "}";
    }
}
