package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.j */
/* compiled from: PG */
final class C18045j extends C17988ax {

    /* renamed from: a */
    private final Optional f51507a;

    /* renamed from: b */
    private final String f51508b;

    public C18045j(Optional optional, String str) {
        this.f51507a = optional;
        this.f51508b = str;
    }

    /* renamed from: a */
    public final Optional mo23547a() {
        return this.f51507a;
    }

    /* renamed from: b */
    public final String mo23525b() {
        return this.f51508b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17988ax) {
            C17988ax axVar = (C17988ax) obj;
            return this.f51507a.equals(axVar.mo23547a()) && this.f51508b.equals(axVar.mo23525b());
        }
    }

    public final int hashCode() {
        return ((this.f51507a.hashCode() ^ 1000003) * 1000003) ^ this.f51508b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51507a);
        String str = this.f51508b;
        return "Arguments{experimentIds=" + valueOf + ", searchQuery=" + str + "}";
    }
}
