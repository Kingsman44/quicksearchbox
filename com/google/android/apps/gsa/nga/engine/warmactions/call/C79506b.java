package com.google.android.apps.gsa.nga.engine.warmactions.call;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.b */
/* compiled from: PG */
final class C79506b extends C79504ab {

    /* renamed from: a */
    private final long f218207a;

    /* renamed from: b */
    private final int f218208b;

    /* renamed from: c */
    private final Optional f218209c;

    /* renamed from: d */
    private final Optional f218210d;

    public C79506b(long j, int i, Optional optional, Optional optional2) {
        this.f218207a = j;
        this.f218208b = i;
        this.f218209c = optional;
        this.f218210d = optional2;
    }

    /* renamed from: a */
    public final int mo74103a() {
        return this.f218208b;
    }

    /* renamed from: b */
    public final long mo74104b() {
        return this.f218207a;
    }

    /* renamed from: c */
    public final Optional mo74105c() {
        return this.f218209c;
    }

    /* renamed from: d */
    public final Optional mo74106d() {
        return this.f218210d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79504ab) {
            C79504ab abVar = (C79504ab) obj;
            return this.f218207a == abVar.mo74104b() && this.f218208b == abVar.mo74103a() && this.f218209c.equals(abVar.mo74105c()) && this.f218210d.equals(abVar.mo74106d());
        }
    }

    public final int hashCode() {
        long j = this.f218207a;
        return this.f218210d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f218208b) * 1000003) ^ this.f218209c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f218207a;
        int i = this.f218208b;
        String valueOf = String.valueOf(this.f218209c);
        String valueOf2 = String.valueOf(this.f218210d);
        return "IncomingCall{id=" + j + ", callState=" + i + ", caller=" + valueOf + ", handle=" + valueOf2 + "}";
    }
}
