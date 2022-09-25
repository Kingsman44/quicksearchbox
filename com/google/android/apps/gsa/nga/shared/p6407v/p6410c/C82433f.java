package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.f */
/* compiled from: PG */
public final class C82433f extends C82298a {

    /* renamed from: a */
    private final String f225234a = "ASSIST_DATA_C_D_C_LATENCY";

    /* renamed from: b */
    private final Double f225235b;

    /* renamed from: c */
    private final String f225236c;

    /* renamed from: d */
    private final boolean f225237d;

    public C82433f(String str, Double d, String str2, boolean z) {
        this.f225235b = d;
        this.f225236c = str2;
        this.f225237d = z;
    }

    /* renamed from: b */
    public final Double mo75581b() {
        return this.f225235b;
    }

    /* renamed from: c */
    public final String mo75582c() {
        return this.f225236c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225234a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82298a) {
            C82298a aVar = (C82298a) obj;
            return this.f225234a.equals(aVar.mo75583d()) && this.f225235b.equals(aVar.mo75581b()) && this.f225236c.equals(aVar.mo75582c()) && this.f225237d == aVar.mo75585f();
        }
    }

    /* renamed from: f */
    public final boolean mo75585f() {
        return this.f225237d;
    }

    public final int hashCode() {
        return ((((((this.f225234a.hashCode() ^ 1000003) * 1000003) ^ this.f225235b.hashCode()) * 1000003) ^ this.f225236c.hashCode()) * 1000003) ^ (true != this.f225237d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f225234a;
        Double d = this.f225235b;
        String str2 = this.f225236c;
        boolean z = this.f225237d;
        return "AssistDataCDCLatencyEvent{token=" + str + ", value=" + d + ", assistDataType=" + str2 + ", succeeded=" + z + "}";
    }
}
