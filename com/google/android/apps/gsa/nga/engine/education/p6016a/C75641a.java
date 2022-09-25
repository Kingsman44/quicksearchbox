package com.google.android.apps.gsa.nga.engine.education.p6016a;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.a */
/* compiled from: PG */
final class C75641a extends C75652c {

    /* renamed from: a */
    private final int f209986a;

    public C75641a(int i) {
        this.f209986a = i;
    }

    /* renamed from: a */
    public final int mo71779a() {
        return this.f209986a;
    }

    /* renamed from: b */
    public final int mo71780b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C75649ah) {
            C75649ah ahVar = (C75649ah) obj;
            if (ahVar.mo71780b() == 2 && this.f209986a == ahVar.mo71779a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f209986a;
    }

    public final String toString() {
        int i = this.f209986a;
        return "Text{resourceId=" + i + "}";
    }
}
