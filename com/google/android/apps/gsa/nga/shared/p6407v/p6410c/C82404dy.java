package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dy */
/* compiled from: PG */
public final class C82404dy extends C82634ml {

    /* renamed from: a */
    private final String f225135a = "NGA_OPA_HANDOVER_VIOLATIONS";

    /* renamed from: b */
    private final String f225136b;

    public C82404dy(String str, String str2) {
        this.f225136b = str2;
    }

    /* renamed from: b */
    public final String mo76056b() {
        return this.f225136b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225135a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82634ml) {
            C82634ml mlVar = (C82634ml) obj;
            return this.f225135a.equals(mlVar.mo75583d()) && this.f225136b.equals(mlVar.mo76056b());
        }
    }

    public final int hashCode() {
        return ((this.f225135a.hashCode() ^ 1000003) * 1000003) ^ this.f225136b.hashCode();
    }

    public final String toString() {
        String str = this.f225135a;
        String str2 = this.f225136b;
        return "NgaOpaHandoverViolationsEvent{token=" + str + ", violation=" + str2 + "}";
    }
}
