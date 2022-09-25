package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bw */
/* compiled from: PG */
public final class C82348bw extends C82578kj {

    /* renamed from: a */
    private final String f224951a = "NGA_FILE_PROVIDER_WRAPPER_LATENCY";

    /* renamed from: b */
    private final Double f224952b;

    /* renamed from: c */
    private final int f224953c;

    /* renamed from: d */
    private final int f224954d;

    public C82348bw(String str, Double d, int i, int i2) {
        this.f224952b = d;
        this.f224953c = i;
        this.f224954d = i2;
    }

    /* renamed from: b */
    public final int mo75805b() {
        return this.f224953c;
    }

    /* renamed from: c */
    public final int mo75806c() {
        return this.f224954d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224951a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82578kj) {
            C82578kj kjVar = (C82578kj) obj;
            return this.f224951a.equals(kjVar.mo75583d()) && this.f224952b.equals(kjVar.mo75808f()) && this.f224953c == kjVar.mo75805b() && this.f224954d == kjVar.mo75806c();
        }
    }

    /* renamed from: f */
    public final Double mo75808f() {
        return this.f224952b;
    }

    public final int hashCode() {
        return ((((((this.f224951a.hashCode() ^ 1000003) * 1000003) ^ this.f224952b.hashCode()) * 1000003) ^ this.f224953c) * 1000003) ^ this.f224954d;
    }

    public final String toString() {
        String str = this.f224951a;
        Double d = this.f224952b;
        int i = this.f224953c;
        int i2 = this.f224954d;
        return "NgaFileProviderWrapperLatency{token=" + str + ", value=" + d + ", fileProviderSource=" + i + ", groupId=" + i2 + "}";
    }
}
