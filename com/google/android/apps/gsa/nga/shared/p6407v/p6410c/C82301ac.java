package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ac */
/* compiled from: PG */
public final class C82301ac extends C82529io {

    /* renamed from: a */
    private final String f224813a = "FETCH_ASSIST_DATA_LATENCY";

    /* renamed from: b */
    private final Double f224814b;

    /* renamed from: c */
    private final String f224815c;

    /* renamed from: d */
    private final boolean f224816d;

    public C82301ac(String str, Double d, String str2, boolean z) {
        this.f224814b = d;
        this.f224815c = str2;
        this.f224816d = z;
    }

    /* renamed from: b */
    public final Double mo75599b() {
        return this.f224814b;
    }

    /* renamed from: c */
    public final String mo75600c() {
        return this.f224815c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224813a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82529io) {
            C82529io ioVar = (C82529io) obj;
            return this.f224813a.equals(ioVar.mo75583d()) && this.f224814b.equals(ioVar.mo75599b()) && this.f224815c.equals(ioVar.mo75600c()) && this.f224816d == ioVar.mo75602f();
        }
    }

    /* renamed from: f */
    public final boolean mo75602f() {
        return this.f224816d;
    }

    public final int hashCode() {
        return ((((((this.f224813a.hashCode() ^ 1000003) * 1000003) ^ this.f224814b.hashCode()) * 1000003) ^ this.f224815c.hashCode()) * 1000003) ^ (true != this.f224816d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f224813a;
        Double d = this.f224814b;
        String str2 = this.f224815c;
        boolean z = this.f224816d;
        return "FetchAssistDataLatencyEvent{token=" + str + ", value=" + d + ", assistDataRequiredType=" + str2 + ", succeeded=" + z + "}";
    }
}
