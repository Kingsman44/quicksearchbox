package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ef */
/* compiled from: PG */
public final class C82412ef extends C82641ms {

    /* renamed from: a */
    private final String f225153a = "NGA_PIE_TRIGGER_FAILURE";

    /* renamed from: b */
    private final String f225154b;

    /* renamed from: c */
    private final String f225155c;

    /* renamed from: d */
    private final String f225156d;

    public C82412ef(String str, String str2, String str3, String str4) {
        this.f225154b = str2;
        this.f225155c = str3;
        this.f225156d = str4;
    }

    /* renamed from: b */
    public final String mo76090b() {
        return this.f225154b;
    }

    /* renamed from: c */
    public final String mo76091c() {
        return this.f225156d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225153a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82641ms) {
            C82641ms msVar = (C82641ms) obj;
            return this.f225153a.equals(msVar.mo75583d()) && this.f225154b.equals(msVar.mo76090b()) && this.f225155c.equals(msVar.mo76093f()) && this.f225156d.equals(msVar.mo76091c());
        }
    }

    /* renamed from: f */
    public final String mo76093f() {
        return this.f225155c;
    }

    public final int hashCode() {
        return ((((((this.f225153a.hashCode() ^ 1000003) * 1000003) ^ this.f225154b.hashCode()) * 1000003) ^ this.f225155c.hashCode()) * 1000003) ^ this.f225156d.hashCode();
    }

    public final String toString() {
        String str = this.f225153a;
        String str2 = this.f225154b;
        String str3 = this.f225155c;
        String str4 = this.f225156d;
        return "NgaPieTriggerFailureEvent{token=" + str + ", failureCause=" + str2 + ", triggerSource=" + str3 + ", flowId=" + str4 + "}";
    }
}
