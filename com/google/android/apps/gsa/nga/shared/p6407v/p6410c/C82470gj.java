package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gj */
/* compiled from: PG */
public final class C82470gj extends C82699ow {

    /* renamed from: a */
    private final String f225340a = "NGA_WARM_ACTIONS_SODA_INITIALIZATION_RESULT_COUNT";

    /* renamed from: b */
    private final String f225341b;

    public C82470gj(String str, String str2) {
        this.f225341b = str2;
    }

    /* renamed from: b */
    public final String mo76364b() {
        return this.f225341b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225340a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82699ow) {
            C82699ow owVar = (C82699ow) obj;
            return this.f225340a.equals(owVar.mo75583d()) && this.f225341b.equals(owVar.mo76364b());
        }
    }

    public final int hashCode() {
        return ((this.f225340a.hashCode() ^ 1000003) * 1000003) ^ this.f225341b.hashCode();
    }

    public final String toString() {
        String str = this.f225340a;
        String str2 = this.f225341b;
        return "NgaWarmActionsSodaInitializationResultCountEvent{token=" + str + ", result=" + str2 + "}";
    }
}
