package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cf */
/* compiled from: PG */
final class C82358cf extends C82587ks {

    /* renamed from: a */
    private final String f224991a;

    /* renamed from: b */
    private final int f224992b;

    public C82358cf(String str, int i) {
        this.f224991a = str;
        this.f224992b = i;
    }

    /* renamed from: b */
    public final int mo75852b() {
        return this.f224992b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224991a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82587ks) {
            C82587ks ksVar = (C82587ks) obj;
            return this.f224991a.equals(ksVar.mo75583d()) && this.f224992b == ksVar.mo75852b();
        }
    }

    public final int hashCode() {
        return ((this.f224991a.hashCode() ^ 1000003) * 1000003) ^ this.f224992b;
    }

    public final String toString() {
        String str = this.f224991a;
        int i = this.f224992b;
        return "NgaFulfillmentStatusEvent{token=" + str + ", status=" + i + "}";
    }
}
