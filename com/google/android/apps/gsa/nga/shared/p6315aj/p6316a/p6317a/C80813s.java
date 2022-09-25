package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.s */
/* compiled from: PG */
final class C80813s extends C80818x {

    /* renamed from: b */
    private final C80731df f221735b;

    public C80813s(C80731df dfVar) {
        this.f221735b = dfVar;
    }

    /* renamed from: a */
    public final C80741dp mo74643a() {
        return C80741dp.GREETING;
    }

    /* renamed from: d */
    public final C80731df mo74646d() {
        return this.f221735b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80740do) {
            C80740do doVar = (C80740do) obj;
            if (C80741dp.GREETING != doVar.mo74643a() || !this.f221735b.equals(doVar.mo74646d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221735b.hashCode();
    }

    public final String toString() {
        String obj = this.f221735b.toString();
        return "SingleContent{greeting=" + obj + "}";
    }
}
