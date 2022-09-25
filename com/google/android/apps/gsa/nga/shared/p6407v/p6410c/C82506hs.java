package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hs */
/* compiled from: PG */
public final class C82506hs extends C82736qf {

    /* renamed from: a */
    private final String f225447a = "UNINTENDED_QUERY_SUPPRESSION_SERVER_EXECUTION_COUNT";

    /* renamed from: b */
    private final String f225448b;

    /* renamed from: c */
    private final int f225449c;

    /* renamed from: d */
    private final boolean f225450d;

    /* renamed from: e */
    private final boolean f225451e;

    /* renamed from: f */
    private final boolean f225452f;

    /* renamed from: g */
    private final boolean f225453g;

    /* renamed from: h */
    private final boolean f225454h;

    /* renamed from: i */
    private final boolean f225455i;

    public C82506hs(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f225448b = str2;
        this.f225449c = i;
        this.f225450d = z;
        this.f225451e = z2;
        this.f225452f = z3;
        this.f225453g = z4;
        this.f225454h = z5;
        this.f225455i = z6;
    }

    /* renamed from: b */
    public final int mo76526b() {
        return this.f225449c;
    }

    /* renamed from: c */
    public final String mo76527c() {
        return this.f225448b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82736qf) {
            C82736qf qfVar = (C82736qf) obj;
            return this.f225447a.equals(qfVar.mo75583d()) && this.f225448b.equals(qfVar.mo76527c()) && this.f225449c == qfVar.mo76526b() && this.f225450d == qfVar.mo76533i() && this.f225451e == qfVar.mo76534j() && this.f225452f == qfVar.mo76535k() && this.f225453g == qfVar.mo76530g() && this.f225454h == qfVar.mo76531h() && this.f225455i == qfVar.mo76529f();
        }
    }

    /* renamed from: f */
    public final boolean mo76529f() {
        return this.f225455i;
    }

    /* renamed from: g */
    public final boolean mo76530g() {
        return this.f225453g;
    }

    /* renamed from: h */
    public final boolean mo76531h() {
        return this.f225454h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((this.f225447a.hashCode() ^ 1000003) * 1000003) ^ this.f225448b.hashCode()) * 1000003) ^ this.f225449c) * 1000003) ^ (true != this.f225450d ? 1237 : 1231)) * 1000003) ^ (true != this.f225451e ? 1237 : 1231)) * 1000003) ^ (true != this.f225452f ? 1237 : 1231)) * 1000003) ^ (true != this.f225453g ? 1237 : 1231)) * 1000003) ^ (true != this.f225454h ? 1237 : 1231)) * 1000003;
        if (true == this.f225455i) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo76533i() {
        return this.f225450d;
    }

    /* renamed from: j */
    public final boolean mo76534j() {
        return this.f225451e;
    }

    /* renamed from: k */
    public final boolean mo76535k() {
        return this.f225452f;
    }

    public final String toString() {
        String str = this.f225447a;
        String str2 = this.f225448b;
        int i = this.f225449c;
        boolean z = this.f225450d;
        boolean z2 = this.f225451e;
        boolean z3 = this.f225452f;
        boolean z4 = this.f225453g;
        boolean z5 = this.f225454h;
        boolean z6 = this.f225455i;
        return "UnintendedQuerySuppressionServerExecutionCountEvent{token=" + str + ", language=" + str2 + ", cloudHandoverReason=" + i + ", suppressedByPqrnn=" + z + ", suppressedByRanklab=" + z2 + ", suppressedBySpeechAwareModel=" + z3 + ", suppressedByHotword=" + z4 + ", suppressedByLph=" + z5 + ", supportsHotwordValidation=" + z6 + "}";
    }
}
