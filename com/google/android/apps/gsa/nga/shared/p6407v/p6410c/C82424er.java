package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.er */
/* compiled from: PG */
final class C82424er extends C82654ne {

    /* renamed from: a */
    private final String f225202a;

    /* renamed from: b */
    private final String f225203b;

    /* renamed from: c */
    private final boolean f225204c;

    /* renamed from: d */
    private final boolean f225205d;

    public C82424er(String str, String str2, boolean z, boolean z2) {
        this.f225202a = str;
        this.f225203b = str2;
        this.f225204c = z;
        this.f225205d = z2;
    }

    /* renamed from: b */
    public final String mo76155b() {
        return this.f225203b;
    }

    /* renamed from: c */
    public final boolean mo76156c() {
        return this.f225204c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225202a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82654ne) {
            C82654ne neVar = (C82654ne) obj;
            return this.f225202a.equals(neVar.mo75583d()) && this.f225203b.equals(neVar.mo76155b()) && this.f225204c == neVar.mo76156c() && this.f225205d == neVar.mo76158f();
        }
    }

    /* renamed from: f */
    public final boolean mo76158f() {
        return this.f225205d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f225202a.hashCode() ^ 1000003) * 1000003) ^ this.f225203b.hashCode()) * 1000003) ^ (true != this.f225204c ? 1237 : 1231)) * 1000003;
        if (true == this.f225205d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f225202a;
        String str2 = this.f225203b;
        boolean z = this.f225204c;
        boolean z2 = this.f225205d;
        return "NgaSearchProcessServiceBoundEvent{token=" + str + ", mobileAssistantExperience=" + str2 + ", searchProcessRunning=" + z + ", success=" + z2 + "}";
    }
}
