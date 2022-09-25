package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ec */
/* compiled from: PG */
public final class C82409ec extends C82638mp {

    /* renamed from: a */
    private final String f225143a = "NGA_PIE_FLOW_FAILURE";

    /* renamed from: b */
    private final String f225144b;

    /* renamed from: c */
    private final String f225145c;

    /* renamed from: d */
    private final String f225146d;

    /* renamed from: e */
    private final int f225147e;

    public C82409ec(String str, String str2, String str3, String str4, int i) {
        this.f225144b = str2;
        this.f225145c = str3;
        this.f225146d = str4;
        this.f225147e = i;
    }

    /* renamed from: b */
    public final int mo76074b() {
        return this.f225147e;
    }

    /* renamed from: c */
    public final String mo76075c() {
        return this.f225144b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225143a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82638mp) {
            C82638mp mpVar = (C82638mp) obj;
            return this.f225143a.equals(mpVar.mo75583d()) && this.f225144b.equals(mpVar.mo76075c()) && this.f225145c.equals(mpVar.mo76078g()) && this.f225146d.equals(mpVar.mo76077f()) && this.f225147e == mpVar.mo76074b();
        }
    }

    /* renamed from: f */
    public final String mo76077f() {
        return this.f225146d;
    }

    /* renamed from: g */
    public final String mo76078g() {
        return this.f225145c;
    }

    public final int hashCode() {
        return ((((((((this.f225143a.hashCode() ^ 1000003) * 1000003) ^ this.f225144b.hashCode()) * 1000003) ^ this.f225145c.hashCode()) * 1000003) ^ this.f225146d.hashCode()) * 1000003) ^ this.f225147e;
    }

    public final String toString() {
        String str = this.f225143a;
        String str2 = this.f225144b;
        String str3 = this.f225145c;
        String str4 = this.f225146d;
        int i = this.f225147e;
        return "NgaPieFlowFailureEvent{token=" + str + ", failureCause=" + str2 + ", triggerSource=" + str3 + ", flowId=" + str4 + ", step=" + i + "}";
    }
}
