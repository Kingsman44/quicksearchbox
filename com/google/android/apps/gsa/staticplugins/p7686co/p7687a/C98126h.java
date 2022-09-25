package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.h */
/* compiled from: PG */
final class C98126h extends C98110ck {

    /* renamed from: a */
    private final long f274018a;

    /* renamed from: b */
    private final long f274019b;

    /* renamed from: c */
    private final long f274020c;

    public C98126h(long j, long j2, long j3) {
        this.f274018a = j;
        this.f274019b = j2;
        this.f274020c = j3;
    }

    /* renamed from: a */
    public final long mo90965a() {
        return this.f274018a;
    }

    /* renamed from: b */
    public final long mo90966b() {
        return this.f274019b;
    }

    /* renamed from: c */
    public final long mo90967c() {
        return this.f274020c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98110ck) {
            C98110ck ckVar = (C98110ck) obj;
            return this.f274018a == ckVar.mo90965a() && this.f274019b == ckVar.mo90966b() && this.f274020c == ckVar.mo90967c();
        }
    }

    public final int hashCode() {
        long j = this.f274018a;
        long j2 = this.f274019b;
        return ((int) this.f274020c) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f274018a;
        long j2 = this.f274019b;
        long j3 = this.f274020c;
        return "EntryData{entryUpdateId=" + j + ", timestamp=" + j2 + ", type=" + j3 + "}";
    }
}
