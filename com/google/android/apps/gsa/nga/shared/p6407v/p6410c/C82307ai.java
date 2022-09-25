package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ai */
/* compiled from: PG */
public final class C82307ai extends C82535iu {

    /* renamed from: a */
    private final String f224827a = "HOTWORD_VERIFICATION_LATENCY";

    /* renamed from: b */
    private final Double f224828b;

    public C82307ai(String str, Double d) {
        this.f224828b = d;
    }

    /* renamed from: b */
    public final Double mo75622b() {
        return this.f224828b;
    }

    /* renamed from: c */
    public final boolean mo75623c() {
        return true;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224827a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82535iu) {
            C82535iu iuVar = (C82535iu) obj;
            return this.f224827a.equals(iuVar.mo75583d()) && this.f224828b.equals(iuVar.mo75622b()) && iuVar.mo75623c();
        }
    }

    public final int hashCode() {
        return ((((this.f224827a.hashCode() ^ 1000003) * 1000003) ^ this.f224828b.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        String str = this.f224827a;
        Double d = this.f224828b;
        return "HotwordVerificationLatencyEvent{token=" + str + ", value=" + d + ", isBisto=true}";
    }
}
