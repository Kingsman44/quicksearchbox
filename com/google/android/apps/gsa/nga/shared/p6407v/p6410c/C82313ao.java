package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ao */
/* compiled from: PG */
public final class C82313ao extends C82542ja {

    /* renamed from: a */
    private final String f224843a = "MIC_DURATION2";

    /* renamed from: b */
    private final Double f224844b;

    /* renamed from: c */
    private final boolean f224845c;

    /* renamed from: d */
    private final String f224846d;

    public C82313ao(String str, Double d, boolean z, String str2) {
        this.f224844b = d;
        this.f224845c = z;
        this.f224846d = str2;
    }

    /* renamed from: b */
    public final Double mo75647b() {
        return this.f224844b;
    }

    /* renamed from: c */
    public final String mo75648c() {
        return this.f224846d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224843a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82542ja) {
            C82542ja jaVar = (C82542ja) obj;
            return this.f224843a.equals(jaVar.mo75583d()) && this.f224844b.equals(jaVar.mo75647b()) && this.f224845c == jaVar.mo75651g() && this.f224846d.equals(jaVar.mo75648c()) && !jaVar.mo75650f();
        }
    }

    /* renamed from: f */
    public final boolean mo75650f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo75651g() {
        return this.f224845c;
    }

    public final int hashCode() {
        return ((((((((this.f224843a.hashCode() ^ 1000003) * 1000003) ^ this.f224844b.hashCode()) * 1000003) ^ (true != this.f224845c ? 1237 : 1231)) * 1000003) ^ this.f224846d.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.f224843a;
        Double d = this.f224844b;
        boolean z = this.f224845c;
        String str2 = this.f224846d;
        return "MicDurationEvent{token=" + str + ", value=" + d + ", onDeviceEnabled=" + z + ", sessionType=" + str2 + ", isContinuousMode=false}";
    }
}
