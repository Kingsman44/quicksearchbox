package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.d */
/* compiled from: PG */
final class C101764d extends C101777q {

    /* renamed from: a */
    private final int f283864a;

    public C101764d(int i) {
        this.f283864a = i;
    }

    /* renamed from: a */
    public final int mo92557a() {
        return this.f283864a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C101777q) && this.f283864a == ((C101777q) obj).mo92557a();
    }

    public final int hashCode() {
        return this.f283864a ^ 1000003;
    }

    public final String toString() {
        int i = this.f283864a;
        return "ExitEnrollmentEvent{enrollmentResult=" + i + "}";
    }
}
