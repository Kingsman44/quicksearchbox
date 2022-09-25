package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bk */
/* compiled from: PG */
final class C82336bk extends C82565jx {

    /* renamed from: a */
    private final String f224925a;

    /* renamed from: b */
    private final String f224926b;

    public C82336bk(String str, String str2) {
        this.f224925a = str;
        this.f224926b = str2;
    }

    /* renamed from: b */
    public final String mo75764b() {
        return this.f224926b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224925a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82565jx) {
            C82565jx jxVar = (C82565jx) obj;
            return this.f224925a.equals(jxVar.mo75583d()) && this.f224926b.equals(jxVar.mo75764b());
        }
    }

    public final int hashCode() {
        return ((this.f224925a.hashCode() ^ 1000003) * 1000003) ^ this.f224926b.hashCode();
    }

    public final String toString() {
        String str = this.f224925a;
        String str2 = this.f224926b;
        return "NgaDataForcedResultEvent{token=" + str + ", exception=" + str2 + "}";
    }
}
