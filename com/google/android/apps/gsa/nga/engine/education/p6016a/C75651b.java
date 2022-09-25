package com.google.android.apps.gsa.nga.engine.education.p6016a;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.b */
/* compiled from: PG */
final class C75651b extends C75652c {

    /* renamed from: a */
    private final String f209994a;

    public C75651b(String str) {
        this.f209994a = str;
    }

    /* renamed from: b */
    public final int mo71780b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo71796c() {
        return this.f209994a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C75649ah) {
            C75649ah ahVar = (C75649ah) obj;
            if (ahVar.mo71780b() != 1 || !this.f209994a.equals(ahVar.mo71796c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f209994a.hashCode();
    }

    public final String toString() {
        String str = this.f209994a;
        return "Text{text=" + str + "}";
    }
}
