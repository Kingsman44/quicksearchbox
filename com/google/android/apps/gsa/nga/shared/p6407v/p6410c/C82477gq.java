package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gq */
/* compiled from: PG */
public final class C82477gq extends C82707pd {

    /* renamed from: a */
    private final String f225361a = "NGA_WINNING_FULFILLER";

    /* renamed from: b */
    private final int f225362b;

    public C82477gq(String str, int i) {
        this.f225362b = i;
    }

    /* renamed from: b */
    public final int mo76399b() {
        return this.f225362b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225361a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82707pd) {
            C82707pd pdVar = (C82707pd) obj;
            return this.f225361a.equals(pdVar.mo75583d()) && this.f225362b == pdVar.mo76399b();
        }
    }

    public final int hashCode() {
        return ((this.f225361a.hashCode() ^ 1000003) * 1000003) ^ this.f225362b;
    }

    public final String toString() {
        String str = this.f225361a;
        int i = this.f225362b;
        return "NgaWinningFulfillerEvent{token=" + str + ", fulfiller=" + i + "}";
    }
}
