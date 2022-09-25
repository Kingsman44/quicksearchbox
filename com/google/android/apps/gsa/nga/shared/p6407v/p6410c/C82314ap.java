package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ap */
/* compiled from: PG */
public final class C82314ap extends C82543jb {

    /* renamed from: a */
    private final String f224847a = "MIC_OPEN_LATENCY";

    /* renamed from: b */
    private final Double f224848b;

    /* renamed from: c */
    private final String f224849c;

    /* renamed from: d */
    private final boolean f224850d;

    public C82314ap(String str, Double d, String str2, boolean z) {
        this.f224848b = d;
        this.f224849c = str2;
        this.f224850d = z;
    }

    /* renamed from: b */
    public final Double mo75654b() {
        return this.f224848b;
    }

    /* renamed from: c */
    public final String mo75655c() {
        return this.f224849c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224847a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82543jb) {
            C82543jb jbVar = (C82543jb) obj;
            return this.f224847a.equals(jbVar.mo75583d()) && this.f224848b.equals(jbVar.mo75654b()) && this.f224849c.equals(jbVar.mo75655c()) && !jbVar.mo75657f() && this.f224850d == jbVar.mo75658g();
        }
    }

    /* renamed from: f */
    public final boolean mo75657f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo75658g() {
        return this.f224850d;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f224847a.hashCode() ^ 1000003) * 1000003) ^ this.f224848b.hashCode()) * 1000003) ^ this.f224849c.hashCode()) * 1000003) ^ 1237) * 1000003;
        if (true == this.f224850d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f224847a;
        Double d = this.f224848b;
        String str2 = this.f224849c;
        boolean z = this.f224850d;
        return "MicOpenLatencyEvent{token=" + str + ", value=" + d + ", sessionType=" + str2 + ", isContinuousMode=false, onDeviceEnabled=" + z + "}";
    }
}
