package com.google.android.libraries.p1975k.p1980e;

import com.google.protos.p5066i.p5067a.C65471b;

/* renamed from: com.google.android.libraries.k.e.b */
/* compiled from: PG */
final class C24004b extends C24009g {

    /* renamed from: a */
    private final Long f65609a;

    /* renamed from: b */
    private final int f65610b;

    public C24004b(Long l, int i) {
        this.f65609a = l;
        this.f65610b = i;
    }

    /* renamed from: a */
    public final Long mo29405a() {
        return this.f65609a;
    }

    /* renamed from: b */
    public final int mo29406b() {
        return this.f65610b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24009g) {
            C24009g gVar = (C24009g) obj;
            return this.f65609a.equals(gVar.mo29405a()) && this.f65610b == gVar.mo29406b();
        }
    }

    public final int hashCode() {
        return ((this.f65609a.hashCode() ^ 1000003) * 1000003) ^ this.f65610b;
    }

    public final String toString() {
        Long l = this.f65609a;
        String num = Integer.toString(C65471b.m96686a(this.f65610b));
        return "VerificationFailureKey{protoId=" + l + ", verificationFailure=" + num + "}";
    }
}
