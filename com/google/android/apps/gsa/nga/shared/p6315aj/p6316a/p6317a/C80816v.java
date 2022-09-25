package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.v */
/* compiled from: PG */
final class C80816v extends C80818x {

    /* renamed from: b */
    private final C80790fk f221738b;

    public C80816v(C80790fk fkVar) {
        this.f221738b = fkVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.TRANSCRIPTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.TRANSCRIPTION != doVar.mo74643a() || !this.f221738b.equals(doVar.mo74649g())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final C80790fk mo74649g() {
        return this.f221738b;
    }

    public final int hashCode() {
        return this.f221738b.hashCode();
    }

    public final String toString() {
        String obj = this.f221738b.toString();
        return "SingleContent{transcription=" + obj + "}";
    }
}
