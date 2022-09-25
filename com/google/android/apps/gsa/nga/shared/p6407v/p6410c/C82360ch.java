package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ch */
/* compiled from: PG */
public final class C82360ch extends C82589ku {

    /* renamed from: a */
    private final String f224995a = "NGA_GELLER_FOOTPRINTS_WRITE_COUNT";

    /* renamed from: b */
    private final int f224996b;

    public C82360ch(String str, int i) {
        this.f224996b = i;
    }

    /* renamed from: b */
    public final int mo75860b() {
        return this.f224996b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224995a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82589ku) {
            C82589ku kuVar = (C82589ku) obj;
            return this.f224995a.equals(kuVar.mo75583d()) && this.f224996b == kuVar.mo75860b();
        }
    }

    public final int hashCode() {
        return ((this.f224995a.hashCode() ^ 1000003) * 1000003) ^ this.f224996b;
    }

    public final String toString() {
        String str = this.f224995a;
        int i = this.f224996b;
        return "NgaGellerFootprintsWriteCountEvent{token=" + str + ", status=" + i + "}";
    }
}
