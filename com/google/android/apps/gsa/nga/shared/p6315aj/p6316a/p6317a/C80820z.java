package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.z */
/* compiled from: PG */
public final class C80820z extends C80646ab {

    /* renamed from: b */
    private final C80703ce f221740b;

    public C80820z(C80703ce ceVar) {
        this.f221740b = ceVar;
    }

    /* renamed from: a */
    public final C80703ce mo74399a() {
        return this.f221740b;
    }

    /* renamed from: b */
    public final int mo74394b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C80742dq) {
            C80742dq dqVar = (C80742dq) obj;
            if (dqVar.mo74394b() != 1 || !this.f221740b.equals(dqVar.mo74399a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f221740b.hashCode();
    }

    public final String toString() {
        String obj = this.f221740b.toString();
        return "TopContent{empty=" + obj + "}";
    }
}
