package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.db */
/* compiled from: PG */
final class C82381db extends C82610lo {

    /* renamed from: a */
    private final String f225070a;

    /* renamed from: b */
    private final Double f225071b;

    /* renamed from: c */
    private final boolean f225072c;

    /* renamed from: d */
    private final boolean f225073d;

    /* renamed from: e */
    private final String f225074e;

    public C82381db(String str, Double d, boolean z, boolean z2, String str2) {
        this.f225070a = str;
        this.f225071b = d;
        this.f225072c = z;
        this.f225073d = z2;
        this.f225074e = str2;
    }

    /* renamed from: b */
    public final Double mo75952b() {
        return this.f225071b;
    }

    /* renamed from: c */
    public final String mo75953c() {
        return this.f225074e;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225070a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82610lo) {
            C82610lo loVar = (C82610lo) obj;
            return this.f225070a.equals(loVar.mo75583d()) && this.f225071b.equals(loVar.mo75952b()) && this.f225072c == loVar.mo75955f() && this.f225073d == loVar.mo75956g() && this.f225074e.equals(loVar.mo75953c());
        }
    }

    /* renamed from: f */
    public final boolean mo75955f() {
        return this.f225072c;
    }

    /* renamed from: g */
    public final boolean mo75956g() {
        return this.f225073d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f225070a.hashCode() ^ 1000003) * 1000003) ^ this.f225071b.hashCode()) * 1000003) ^ (true != this.f225072c ? 1237 : 1231)) * 1000003;
        if (true == this.f225073d) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f225074e.hashCode();
    }

    public final String toString() {
        String str = this.f225070a;
        Double d = this.f225071b;
        boolean z = this.f225072c;
        boolean z2 = this.f225073d;
        String str2 = this.f225074e;
        return "NgaLifecycleStatusEvent{token=" + str + ", value=" + d + ", firstLifecycle=" + z + ", lifecycleSucceeded=" + z2 + ", failedComponent=" + str2 + "}";
    }
}
