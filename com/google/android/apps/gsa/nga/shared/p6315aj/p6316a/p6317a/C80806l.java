package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.l */
/* compiled from: PG */
public final class C80806l extends C80809o {

    /* renamed from: b */
    private final C80703ce f221730b;

    public C80806l(C80703ce ceVar) {
        this.f221730b = ceVar;
    }

    /* renamed from: b */
    public final C80739dn mo74638b() {
        return C80739dn.EMPTY;
    }

    /* renamed from: d */
    public final C80703ce mo74640d() {
        return this.f221730b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80738dm) {
            C80738dm dmVar = (C80738dm) obj;
            if (C80739dn.EMPTY != dmVar.mo74638b() || !this.f221730b.equals(dmVar.mo74640d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221730b.hashCode();
    }

    public final String toString() {
        String obj = this.f221730b.toString();
        return "DoubleContent{empty=" + obj + "}";
    }
}
