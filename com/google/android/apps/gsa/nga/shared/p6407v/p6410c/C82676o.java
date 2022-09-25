package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.o */
/* compiled from: PG */
public final class C82676o extends C82515ia {

    /* renamed from: a */
    private final String f225478a = "BLOCKING_OOBE_SHOWN";

    public C82676o(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225478a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82515ia) {
            return this.f225478a.equals(((C82515ia) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225478a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225478a;
        return "BlockingOobeShownEvent{token=" + str + "}";
    }
}
