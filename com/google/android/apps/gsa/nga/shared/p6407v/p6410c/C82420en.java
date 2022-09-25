package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.en */
/* compiled from: PG */
final class C82420en extends C82650na {

    /* renamed from: a */
    private final String f225187a;

    /* renamed from: b */
    private final String f225188b;

    /* renamed from: c */
    private final String f225189c;

    /* renamed from: d */
    private final String f225190d;

    /* renamed from: e */
    private final boolean f225191e;

    /* renamed from: f */
    private final boolean f225192f;

    /* renamed from: g */
    private final String f225193g;

    public C82420en(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this.f225187a = str;
        this.f225188b = str2;
        this.f225189c = str3;
        this.f225190d = str4;
        this.f225191e = z;
        this.f225192f = z2;
        this.f225193g = str5;
    }

    /* renamed from: b */
    public final String mo76135b() {
        return this.f225190d;
    }

    /* renamed from: c */
    public final String mo76136c() {
        return this.f225188b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225187a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82650na) {
            C82650na naVar = (C82650na) obj;
            return this.f225187a.equals(naVar.mo75583d()) && this.f225188b.equals(naVar.mo76136c()) && this.f225189c.equals(naVar.mo76138f()) && this.f225190d.equals(naVar.mo76135b()) && this.f225191e == naVar.mo76142i() && this.f225192f == naVar.mo76140h() && this.f225193g.equals(naVar.mo76139g());
        }
    }

    /* renamed from: f */
    public final String mo76138f() {
        return this.f225189c;
    }

    /* renamed from: g */
    public final String mo76139g() {
        return this.f225193g;
    }

    /* renamed from: h */
    public final boolean mo76140h() {
        return this.f225192f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.f225187a.hashCode() ^ 1000003) * 1000003) ^ this.f225188b.hashCode()) * 1000003) ^ this.f225189c.hashCode()) * 1000003) ^ this.f225190d.hashCode()) * 1000003) ^ (true != this.f225191e ? 1237 : 1231)) * 1000003;
        if (true == this.f225192f) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f225193g.hashCode();
    }

    /* renamed from: i */
    public final boolean mo76142i() {
        return this.f225191e;
    }

    public final String toString() {
        String str = this.f225187a;
        String str2 = this.f225188b;
        String str3 = this.f225189c;
        String str4 = this.f225190d;
        boolean z = this.f225191e;
        boolean z2 = this.f225192f;
        String str5 = this.f225193g;
        return "NgaResourceGroupUpdateEvent{token=" + str + ", resourceGroupName=" + str2 + ", stage=" + str3 + ", clientFileGroup=" + str4 + ", success=" + z + ", finished=" + z2 + ", webrefVersion=" + str5 + "}";
    }
}
