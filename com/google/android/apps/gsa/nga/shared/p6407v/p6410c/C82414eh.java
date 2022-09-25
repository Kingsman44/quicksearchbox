package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.eh */
/* compiled from: PG */
public final class C82414eh extends C82643mu {

    /* renamed from: a */
    private final String f225165a = "NGA_QUERY_TRACKER_STATUS";

    /* renamed from: b */
    private final String f225166b;

    public C82414eh(String str, String str2) {
        this.f225166b = str2;
    }

    /* renamed from: b */
    public final String mo76107b() {
        return this.f225166b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225165a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82643mu) {
            C82643mu muVar = (C82643mu) obj;
            return this.f225165a.equals(muVar.mo75583d()) && this.f225166b.equals(muVar.mo76107b());
        }
    }

    public final int hashCode() {
        return ((this.f225165a.hashCode() ^ 1000003) * 1000003) ^ this.f225166b.hashCode();
    }

    public final String toString() {
        String str = this.f225165a;
        String str2 = this.f225166b;
        return "NgaQueryTrackerStatusEvent{token=" + str + ", returnedEndEvent=" + str2 + "}";
    }
}
