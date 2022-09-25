package com.google.assistant.p3838ao.p3839a.p3848h;

import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.h.f */
/* compiled from: PG */
final class C49651f extends C49659n {

    /* renamed from: a */
    private final Optional f128151a;

    /* renamed from: b */
    private final Optional f128152b;

    public C49651f(Optional optional, Optional optional2) {
        this.f128151a = optional;
        this.f128152b = optional2;
    }

    /* renamed from: a */
    public final Optional mo53298a() {
        return this.f128152b;
    }

    /* renamed from: b */
    public final Optional mo53299b() {
        return this.f128151a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C49659n) {
            C49659n nVar = (C49659n) obj;
            return this.f128151a.equals(nVar.mo53299b()) && this.f128152b.equals(nVar.mo53298a());
        }
    }

    public final int hashCode() {
        return ((this.f128151a.hashCode() ^ 1000003) * 1000003) ^ this.f128152b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f128151a);
        String valueOf2 = String.valueOf(this.f128152b);
        return "ScreenState{isUnlocked=" + valueOf + ", isOn=" + valueOf2 + "}";
    }
}
