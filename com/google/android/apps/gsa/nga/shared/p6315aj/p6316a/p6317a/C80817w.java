package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.w */
/* compiled from: PG */
final class C80817w extends C80818x {

    /* renamed from: b */
    private final C80792fm f221739b;

    public C80817w(C80792fm fmVar) {
        this.f221739b = fmVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.TRY_SAYING;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.TRY_SAYING != doVar.mo74643a() || !this.f221739b.equals(doVar.mo74650h())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final C80792fm mo74650h() {
        return this.f221739b;
    }

    public final int hashCode() {
        return this.f221739b.hashCode();
    }

    public final String toString() {
        String obj = this.f221739b.toString();
        return "SingleContent{trySaying=" + obj + "}";
    }
}
