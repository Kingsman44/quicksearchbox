package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gy */
/* compiled from: PG */
public final class C82485gy extends C82715pl {

    /* renamed from: a */
    private final String f225384a = "PIE_MAPS_SIGNAL_NAVIGATION_LENGTH";

    /* renamed from: b */
    private final Double f225385b;

    public C82485gy(String str, Double d) {
        this.f225385b = d;
    }

    /* renamed from: b */
    public final Double mo76434b() {
        return this.f225385b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225384a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82715pl) {
            C82715pl plVar = (C82715pl) obj;
            return this.f225384a.equals(plVar.mo75583d()) && this.f225385b.equals(plVar.mo76434b());
        }
    }

    public final int hashCode() {
        return ((this.f225384a.hashCode() ^ 1000003) * 1000003) ^ this.f225385b.hashCode();
    }

    public final String toString() {
        String str = this.f225384a;
        Double d = this.f225385b;
        return "PieMapsSignalNavigationLengthEvent{token=" + str + ", value=" + d + "}";
    }
}
