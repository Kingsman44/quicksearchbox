package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.m */
/* compiled from: PG */
final class C80807m extends C80809o {

    /* renamed from: b */
    private final C80722cx f221731b;

    public C80807m(C80722cx cxVar) {
        this.f221731b = cxVar;
    }

    /* renamed from: b */
    public final C80739dn mo74638b() {
        return C80739dn.FRE_SUGGESTION;
    }

    /* renamed from: e */
    public final C80722cx mo74641e() {
        return this.f221731b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80738dm) {
            C80738dm dmVar = (C80738dm) obj;
            if (C80739dn.FRE_SUGGESTION != dmVar.mo74638b() || !this.f221731b.equals(dmVar.mo74641e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221731b.hashCode();
    }

    public final String toString() {
        String obj = this.f221731b.toString();
        return "DoubleContent{freSuggestion=" + obj + "}";
    }
}
