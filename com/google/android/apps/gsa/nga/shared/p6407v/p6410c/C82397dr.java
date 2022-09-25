package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dr */
/* compiled from: PG */
public final class C82397dr extends C82627me {

    /* renamed from: a */
    private final String f225121a = "NGA_OPA_CLIENT_DEACTIVATED";

    /* renamed from: b */
    private final String f225122b;

    public C82397dr(String str, String str2) {
        this.f225122b = str2;
    }

    /* renamed from: b */
    public final String mo76028b() {
        return this.f225122b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225121a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82627me) {
            C82627me meVar = (C82627me) obj;
            return this.f225121a.equals(meVar.mo75583d()) && this.f225122b.equals(meVar.mo76028b());
        }
    }

    public final int hashCode() {
        return ((this.f225121a.hashCode() ^ 1000003) * 1000003) ^ this.f225122b.hashCode();
    }

    public final String toString() {
        String str = this.f225121a;
        String str2 = this.f225122b;
        return "NgaOpaClientDeactivatedEvent{token=" + str + ", state=" + str2 + "}";
    }
}
