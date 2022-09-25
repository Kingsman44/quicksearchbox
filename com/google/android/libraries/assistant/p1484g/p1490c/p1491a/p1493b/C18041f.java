package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.f */
/* compiled from: PG */
final class C18041f extends C17970af {

    /* renamed from: a */
    private final Optional f51493a;

    public C18041f(Optional optional) {
        this.f51493a = optional;
    }

    /* renamed from: a */
    public final Optional mo23547a() {
        return this.f51493a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17970af) {
            return this.f51493a.equals(((C17970af) obj).mo23547a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f51493a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51493a);
        return "Arguments{experimentIds=" + valueOf + "}";
    }
}
