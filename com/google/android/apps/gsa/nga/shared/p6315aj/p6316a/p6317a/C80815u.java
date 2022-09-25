package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.u */
/* compiled from: PG */
final class C80815u extends C80818x {

    /* renamed from: b */
    private final C80775ew f221737b;

    public C80815u(C80775ew ewVar) {
        this.f221737b = ewVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.STATIC_TEXT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.STATIC_TEXT != doVar.mo74643a() || !this.f221737b.equals(doVar.mo74648f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C80775ew mo74648f() {
        return this.f221737b;
    }

    public final int hashCode() {
        return this.f221737b.hashCode();
    }

    public final String toString() {
        String obj = this.f221737b.toString();
        return "SingleContent{staticText=" + obj + "}";
    }
}
