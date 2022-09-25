package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.r */
/* compiled from: PG */
public final class C80812r extends C80818x {

    /* renamed from: b */
    private final C80703ce f221734b;

    public C80812r(C80703ce ceVar) {
        this.f221734b = ceVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.EMPTY;
    }

    /* renamed from: c */
    public final C80703ce mo74645c() {
        return this.f221734b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.EMPTY != doVar.mo74643a() || !this.f221734b.equals(doVar.mo74645c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221734b.hashCode();
    }

    public final String toString() {
        String obj = this.f221734b.toString();
        return "SingleContent{empty=" + obj + "}";
    }
}
