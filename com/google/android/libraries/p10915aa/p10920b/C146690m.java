package com.google.android.libraries.p10915aa.p10920b;

/* renamed from: com.google.android.libraries.aa.b.m */
/* compiled from: PG */
final class C146690m extends C146694q {

    /* renamed from: a */
    private final C146663ak f396121a;

    public C146690m(C146663ak akVar) {
        this.f396121a = akVar;
    }

    /* renamed from: b */
    public final int mo123446b() {
        return 5;
    }

    /* renamed from: c */
    public final C146663ak mo123447c() {
        return this.f396121a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146668ap) {
            C146668ap apVar = (C146668ap) obj;
            if (apVar.mo123446b() != 5 || !this.f396121a.equals(apVar.mo123447c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396121a.hashCode();
    }

    public final String toString() {
        String obj = this.f396121a.toString();
        return "ProcessedScreenConditions{condition=" + obj + "}";
    }
}
