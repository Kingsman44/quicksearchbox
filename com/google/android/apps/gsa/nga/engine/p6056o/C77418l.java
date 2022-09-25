package com.google.android.apps.gsa.nga.engine.p6056o;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.l */
/* compiled from: PG */
final class C77418l extends C76534ab {

    /* renamed from: a */
    private final Optional f213455a;

    /* renamed from: b */
    private final long f213456b;

    public C77418l(Optional optional, long j) {
        this.f213455a = optional;
        this.f213456b = j;
    }

    /* renamed from: a */
    public final long mo72225a() {
        return this.f213456b;
    }

    /* renamed from: b */
    public final Optional mo72226b() {
        return this.f213455a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76534ab) {
            C76534ab abVar = (C76534ab) obj;
            return this.f213455a.equals(abVar.mo72226b()) && this.f213456b == abVar.mo72225a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f213455a.hashCode();
        long j = this.f213456b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f213455a);
        long j = this.f213456b;
        return "Screenshot{bitmap=" + valueOf + ", timestamp=" + j + "}";
    }
}
