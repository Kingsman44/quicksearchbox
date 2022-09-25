package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.k */
/* compiled from: PG */
final class C80805k extends C80809o {

    /* renamed from: b */
    private final C80787fh f221729b;

    public C80805k(C80787fh fhVar) {
        this.f221729b = fhVar;
    }

    /* renamed from: b */
    public final C80739dn mo74638b() {
        return C80739dn.CHIPS;
    }

    /* renamed from: c */
    public final C80787fh mo74639c() {
        return this.f221729b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80738dm) {
            C80738dm dmVar = (C80738dm) obj;
            if (C80739dn.CHIPS != dmVar.mo74638b() || !this.f221729b.equals(dmVar.mo74639c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221729b.hashCode();
    }

    public final String toString() {
        String obj = this.f221729b.toString();
        return "DoubleContent{chips=" + obj + "}";
    }
}
