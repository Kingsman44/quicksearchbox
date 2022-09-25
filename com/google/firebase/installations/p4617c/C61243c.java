package com.google.firebase.installations.p4617c;

/* renamed from: com.google.firebase.installations.c.c */
/* compiled from: PG */
final class C61243c extends C61249i {

    /* renamed from: a */
    public String f165664a;

    /* renamed from: b */
    public int f165665b;

    /* renamed from: c */
    private long f165666c;

    /* renamed from: d */
    private byte f165667d;

    /* renamed from: a */
    public final C61250j mo57848a() {
        if (this.f165667d == 1) {
            return new C61244d(this.f165664a, this.f165666c, this.f165665b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    /* renamed from: b */
    public final void mo57849b(long j) {
        this.f165666c = j;
        this.f165667d = 1;
    }
}
