package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dx */
/* compiled from: PG */
public final class C82403dx extends C82633mk {

    /* renamed from: a */
    private final String f225132a = "NGA_OPA_HANDOVER_VIOLATIONS_DEVICE_TIER";

    /* renamed from: b */
    private final String f225133b;

    /* renamed from: c */
    private final String f225134c;

    public C82403dx(String str, String str2, String str3) {
        this.f225133b = str2;
        this.f225134c = str3;
    }

    /* renamed from: b */
    public final String mo76051b() {
        return this.f225134c;
    }

    /* renamed from: c */
    public final String mo76052c() {
        return this.f225133b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225132a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82633mk) {
            C82633mk mkVar = (C82633mk) obj;
            return this.f225132a.equals(mkVar.mo75583d()) && this.f225133b.equals(mkVar.mo76052c()) && this.f225134c.equals(mkVar.mo76051b());
        }
    }

    public final int hashCode() {
        return ((((this.f225132a.hashCode() ^ 1000003) * 1000003) ^ this.f225133b.hashCode()) * 1000003) ^ this.f225134c.hashCode();
    }

    public final String toString() {
        String str = this.f225132a;
        String str2 = this.f225133b;
        String str3 = this.f225134c;
        return "NgaOpaHandoverViolationsDeviceTierEvent{token=" + str + ", violation=" + str2 + ", deviceRamGb=" + str3 + "}";
    }
}
