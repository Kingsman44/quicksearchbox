package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ee */
/* compiled from: PG */
public final class C82411ee extends C82640mr {

    /* renamed from: a */
    private final String f225151a = "NGA_PIE_TRIGGER_FAILURE_ELIGIBILITY";

    /* renamed from: b */
    private final String f225152b;

    public C82411ee(String str, String str2) {
        this.f225152b = str2;
    }

    /* renamed from: b */
    public final String mo76086b() {
        return this.f225152b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225151a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82640mr) {
            C82640mr mrVar = (C82640mr) obj;
            return this.f225151a.equals(mrVar.mo75583d()) && this.f225152b.equals(mrVar.mo76086b());
        }
    }

    public final int hashCode() {
        return ((this.f225151a.hashCode() ^ 1000003) * 1000003) ^ this.f225152b.hashCode();
    }

    public final String toString() {
        String str = this.f225151a;
        String str2 = this.f225152b;
        return "NgaPieTriggerFailureEligibilityEvent{token=" + str + ", eligibility=" + str2 + "}";
    }
}
