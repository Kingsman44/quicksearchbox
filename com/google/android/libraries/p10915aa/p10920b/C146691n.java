package com.google.android.libraries.p10915aa.p10920b;

/* renamed from: com.google.android.libraries.aa.b.n */
/* compiled from: PG */
final class C146691n extends C146694q {

    /* renamed from: a */
    private final C146668ap f396122a;

    public C146691n(C146668ap apVar) {
        this.f396122a = apVar;
    }

    /* renamed from: b */
    public final int mo123446b() {
        return 4;
    }

    /* renamed from: d */
    public final C146668ap mo123448d() {
        return this.f396122a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146668ap) {
            C146668ap apVar = (C146668ap) obj;
            if (apVar.mo123446b() != 4 || !this.f396122a.equals(apVar.mo123448d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396122a.hashCode();
    }

    public final String toString() {
        String obj = this.f396122a.toString();
        return "ProcessedScreenConditions{negateConditions=" + obj + "}";
    }
}
