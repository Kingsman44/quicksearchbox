package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ea */
/* compiled from: PG */
public final class C82407ea extends C82636mn {

    /* renamed from: a */
    private final String f225140a = "NGA_OPA_SHORT_RECREATION_TIME";

    public C82407ea(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225140a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82636mn) {
            return this.f225140a.equals(((C82636mn) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225140a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225140a;
        return "NgaOpaShortRecreationTimeEvent{token=" + str + "}";
    }
}
