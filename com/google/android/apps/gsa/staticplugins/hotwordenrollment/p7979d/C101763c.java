package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.c */
/* compiled from: PG */
public final class C101763c extends C101776p {

    /* renamed from: a */
    private int f283862a;

    /* renamed from: b */
    private byte f283863b;

    /* renamed from: a */
    public final C101777q mo92555a() {
        if (this.f283863b == 1) {
            return new C101764d(this.f283862a);
        }
        throw new IllegalStateException("Missing required properties: enrollmentResult");
    }

    /* renamed from: b */
    public final void mo92556b(int i) {
        this.f283862a = i;
        this.f283863b = 1;
    }
}
