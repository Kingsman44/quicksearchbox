package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fj */
/* compiled from: PG */
public final class C82443fj extends C82672nw {

    /* renamed from: a */
    private final String f225271a = "NGA_UI_SUGGESTION_INVOCATION_COLLECTION_TIME";

    /* renamed from: b */
    private final Double f225272b;

    public C82443fj(String str, Double d) {
        this.f225272b = d;
    }

    /* renamed from: b */
    public final Double mo76247b() {
        return this.f225272b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225271a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82672nw) {
            C82672nw nwVar = (C82672nw) obj;
            return this.f225271a.equals(nwVar.mo75583d()) && this.f225272b.equals(nwVar.mo76247b());
        }
    }

    public final int hashCode() {
        return ((this.f225271a.hashCode() ^ 1000003) * 1000003) ^ this.f225272b.hashCode();
    }

    public final String toString() {
        String str = this.f225271a;
        Double d = this.f225272b;
        return "NgaUiSuggestionInvocationCollectionTimeEvent{token=" + str + ", value=" + d + "}";
    }
}
