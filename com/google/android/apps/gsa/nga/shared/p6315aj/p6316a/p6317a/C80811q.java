package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.q */
/* compiled from: PG */
final class C80811q extends C80818x {

    /* renamed from: b */
    private final C80787fh f221733b;

    public C80811q(C80787fh fhVar) {
        this.f221733b = fhVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.CHIPS;
    }

    /* renamed from: b */
    public final C80787fh mo74644b() {
        return this.f221733b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.CHIPS != doVar.mo74643a() || !this.f221733b.equals(doVar.mo74644b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221733b.hashCode();
    }

    public final String toString() {
        String obj = this.f221733b.toString();
        return "SingleContent{chips=" + obj + "}";
    }
}
