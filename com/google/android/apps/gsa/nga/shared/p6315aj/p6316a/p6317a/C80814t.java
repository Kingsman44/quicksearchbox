package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.t */
/* compiled from: PG */
final class C80814t extends C80818x {

    /* renamed from: b */
    private final C80751dz f221736b;

    public C80814t(C80751dz dzVar) {
        this.f221736b = dzVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.LEGAL_NOTICE;
    }

    /* renamed from: e */
    public final C80751dz mo74647e() {
        return this.f221736b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.LEGAL_NOTICE != doVar.mo74643a() || !this.f221736b.equals(doVar.mo74647e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221736b.hashCode();
    }

    public final String toString() {
        String obj = this.f221736b.toString();
        return "SingleContent{legalNotice=" + obj + "}";
    }
}
