package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.a */
/* compiled from: PG */
final class C61231a extends C61261m {

    /* renamed from: a */
    private final String f165628a;

    /* renamed from: b */
    private final long f165629b;

    /* renamed from: c */
    private final long f165630c;

    public C61231a(String str, long j, long j2) {
        this.f165628a = str;
        this.f165629b = j;
        this.f165630c = j2;
    }

    /* renamed from: a */
    public final long mo57804a() {
        return this.f165630c;
    }

    /* renamed from: b */
    public final long mo57805b() {
        return this.f165629b;
    }

    /* renamed from: c */
    public final String mo57806c() {
        return this.f165628a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61261m) {
            C61261m mVar = (C61261m) obj;
            return this.f165628a.equals(mVar.mo57806c()) && this.f165629b == mVar.mo57805b() && this.f165630c == mVar.mo57804a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f165628a.hashCode();
        long j = this.f165629b;
        long j2 = this.f165630c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f165628a;
        long j = this.f165629b;
        long j2 = this.f165630c;
        return "InstallationTokenResult{token=" + str + ", tokenExpirationTimestamp=" + j + ", tokenCreationTimestamp=" + j2 + "}";
    }
}
