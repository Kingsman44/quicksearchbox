package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hh */
/* compiled from: PG */
public final class C82495hh extends C82724pu {

    /* renamed from: a */
    private final String f225408a = "SECONDARY_SCREEN_SHOWN";

    public C82495hh(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225408a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82724pu) {
            return this.f225408a.equals(((C82724pu) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225408a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225408a;
        return "SecondaryScreenShownEvent{token=" + str + "}";
    }
}
