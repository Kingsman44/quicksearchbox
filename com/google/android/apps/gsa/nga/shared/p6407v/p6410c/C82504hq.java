package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hq */
/* compiled from: PG */
public final class C82504hq extends C82734qd {

    /* renamed from: a */
    private final String f225436a = "UNINTENDED_QUERY_SUPPRESSION_EXECUTION_COUNT";

    /* renamed from: b */
    private final String f225437b;

    /* renamed from: c */
    private final boolean f225438c;

    /* renamed from: d */
    private final boolean f225439d;

    /* renamed from: e */
    private final int f225440e;

    /* renamed from: f */
    private final boolean f225441f;

    /* renamed from: g */
    private final boolean f225442g;

    /* renamed from: h */
    private final boolean f225443h;

    public C82504hq(String str, String str2, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5) {
        this.f225437b = str2;
        this.f225438c = z;
        this.f225439d = z2;
        this.f225440e = i;
        this.f225441f = true;
        this.f225442g = z4;
        this.f225443h = z5;
    }

    /* renamed from: b */
    public final int mo76511b() {
        return this.f225440e;
    }

    /* renamed from: c */
    public final String mo76512c() {
        return this.f225437b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225436a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82734qd) {
            C82734qd qdVar = (C82734qd) obj;
            return this.f225436a.equals(qdVar.mo75583d()) && this.f225437b.equals(qdVar.mo76512c()) && this.f225438c == qdVar.mo76516h() && this.f225439d == qdVar.mo76515g() && this.f225440e == qdVar.mo76511b() && qdVar.mo76514f() && this.f225442g == qdVar.mo76518i() && this.f225443h == qdVar.mo76519j();
        }
    }

    /* renamed from: f */
    public final boolean mo76514f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo76515g() {
        return this.f225439d;
    }

    /* renamed from: h */
    public final boolean mo76516h() {
        return this.f225438c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.f225436a.hashCode() ^ 1000003) * 1000003) ^ this.f225437b.hashCode()) * 1000003) ^ (true != this.f225438c ? 1237 : 1231)) * 1000003) ^ (true != this.f225439d ? 1237 : 1231)) * 1000003) ^ this.f225440e) * 1000003) ^ 1231) * 1000003) ^ (true != this.f225442g ? 1237 : 1231)) * 1000003;
        if (true == this.f225443h) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo76518i() {
        return this.f225442g;
    }

    /* renamed from: j */
    public final boolean mo76519j() {
        return this.f225443h;
    }

    public final String toString() {
        String str = this.f225436a;
        String str2 = this.f225437b;
        boolean z = this.f225438c;
        boolean z2 = this.f225439d;
        int i = this.f225440e;
        boolean z3 = this.f225442g;
        boolean z4 = this.f225443h;
        return "UnintendedQuerySuppressionExecutionCountEvent{token=" + str + ", language=" + str2 + ", isSuppressed=" + z + ", isCloudHandover=" + z2 + ", cloudHandoverReason=" + i + ", hasClientSuppressionSupport=true, supportsHotwordInvalidation=" + z3 + ", suppressedByClientHotword=" + z4 + "}";
    }
}
