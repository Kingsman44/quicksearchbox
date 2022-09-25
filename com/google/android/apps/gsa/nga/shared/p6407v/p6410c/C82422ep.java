package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ep */
/* compiled from: PG */
public final class C82422ep extends C82652nc {

    /* renamed from: a */
    private final String f225196a = "NGA_SEARCH_PROCESS_DIED";

    public C82422ep(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225196a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82652nc) {
            return this.f225196a.equals(((C82652nc) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225196a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225196a;
        return "NgaSearchProcessDiedEvent{token=" + str + "}";
    }
}
