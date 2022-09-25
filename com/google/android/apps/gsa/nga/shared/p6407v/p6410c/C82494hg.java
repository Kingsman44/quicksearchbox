package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hg */
/* compiled from: PG */
public final class C82494hg extends C82723pt {

    /* renamed from: a */
    private final String f225407a = "SECONDARY_SCREEN_HIDDEN";

    public C82494hg(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225407a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82723pt) {
            return this.f225407a.equals(((C82723pt) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f225407a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f225407a;
        return "SecondaryScreenHiddenEvent{token=" + str + "}";
    }
}
