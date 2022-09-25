package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.n */
/* compiled from: PG */
final class C80808n extends C80809o {

    /* renamed from: b */
    private final C80731df f221732b;

    public C80808n(C80731df dfVar) {
        this.f221732b = dfVar;
    }

    /* renamed from: b */
    public final C80739dn mo74638b() {
        return C80739dn.GREETING;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80738dm) {
            C80738dm dmVar = (C80738dm) obj;
            if (C80739dn.GREETING != dmVar.mo74638b() || !this.f221732b.equals(dmVar.mo74642f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C80731df mo74642f() {
        return this.f221732b;
    }

    public final int hashCode() {
        return this.f221732b.hashCode();
    }

    public final String toString() {
        String obj = this.f221732b.toString();
        return "DoubleContent{greeting=" + obj + "}";
    }
}
