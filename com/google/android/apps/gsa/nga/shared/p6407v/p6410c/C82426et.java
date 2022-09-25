package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.et */
/* compiled from: PG */
public final class C82426et extends C82656ng {

    /* renamed from: a */
    private final String f225211a = "NGA_SENSOR_DID_TRIGGERING_RULES";

    /* renamed from: b */
    private final String f225212b;

    /* renamed from: c */
    private final boolean f225213c;

    /* renamed from: d */
    private final String f225214d;

    public C82426et(String str, String str2, boolean z, String str3) {
        this.f225212b = str2;
        this.f225213c = z;
        this.f225214d = str3;
    }

    /* renamed from: b */
    public final String mo76168b() {
        return this.f225214d;
    }

    /* renamed from: c */
    public final String mo76169c() {
        return this.f225212b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225211a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82656ng) {
            C82656ng ngVar = (C82656ng) obj;
            return this.f225211a.equals(ngVar.mo75583d()) && this.f225212b.equals(ngVar.mo76169c()) && this.f225213c == ngVar.mo76171f() && this.f225214d.equals(ngVar.mo76168b());
        }
    }

    /* renamed from: f */
    public final boolean mo76171f() {
        return this.f225213c;
    }

    public final int hashCode() {
        return ((((((this.f225211a.hashCode() ^ 1000003) * 1000003) ^ this.f225212b.hashCode()) * 1000003) ^ (true != this.f225213c ? 1237 : 1231)) * 1000003) ^ this.f225214d.hashCode();
    }

    public final String toString() {
        String str = this.f225211a;
        String str2 = this.f225212b;
        boolean z = this.f225213c;
        String str3 = this.f225214d;
        return "NgaSensorDidTriggeringRulesEvent{token=" + str + ", ruleId=" + str2 + ", isTriggered=" + z + ", nextState=" + str3 + "}";
    }
}
