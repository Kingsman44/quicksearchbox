package com.google.android.apps.p8928i.p8932c.p8933a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.i.c.a.b */
/* compiled from: PG */
final class C119151b extends C119155f {

    /* renamed from: a */
    private final C119158i f332321a;

    /* renamed from: b */
    private final boolean f332322b;

    /* renamed from: c */
    private final C58833ax f332323c;

    public C119151b(C119158i iVar, boolean z, C58833ax axVar) {
        this.f332321a = iVar;
        this.f332322b = z;
        this.f332323c = axVar;
    }

    /* renamed from: a */
    public final C119158i mo104211a() {
        return this.f332321a;
    }

    /* renamed from: b */
    public final C58833ax mo104212b() {
        return this.f332323c;
    }

    /* renamed from: c */
    public final boolean mo104213c() {
        return this.f332322b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119155f) {
            C119155f fVar = (C119155f) obj;
            return this.f332321a.equals(fVar.mo104211a()) && this.f332322b == fVar.mo104213c() && this.f332323c.equals(fVar.mo104212b());
        }
    }

    public final int hashCode() {
        return ((((this.f332321a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f332322b ? 1237 : 1231)) * 1000003) ^ this.f332323c.hashCode();
    }

    public final String toString() {
        String obj = this.f332321a.toString();
        boolean z = this.f332322b;
        String valueOf = String.valueOf(this.f332323c);
        return "CallActionRequest{calleeId=" + obj + ", isAudioOnly=" + z + ", targetedCall=" + valueOf + "}";
    }
}
