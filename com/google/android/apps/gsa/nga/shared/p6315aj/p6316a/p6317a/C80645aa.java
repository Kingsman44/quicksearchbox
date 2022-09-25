package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.aa */
/* compiled from: PG */
final class C80645aa extends C80646ab {

    /* renamed from: b */
    private final C80731df f221401b;

    public C80645aa(C80731df dfVar) {
        this.f221401b = dfVar;
    }

    /* renamed from: b */
    public final int mo74394b() {
        return 2;
    }

    /* renamed from: c */
    public final C80731df mo74395c() {
        return this.f221401b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80742dq) {
            C80742dq dqVar = (C80742dq) obj;
            if (dqVar.mo74394b() != 2 || !this.f221401b.equals(dqVar.mo74395c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221401b.hashCode();
    }

    public final String toString() {
        String obj = this.f221401b.toString();
        return "TopContent{greeting=" + obj + "}";
    }
}
