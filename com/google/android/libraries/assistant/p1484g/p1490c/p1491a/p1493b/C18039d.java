package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.d */
/* compiled from: PG */
final class C18039d extends C17966ab {

    /* renamed from: a */
    private final Optional f51491a;

    public C18039d(Optional optional) {
        this.f51491a = optional;
    }

    /* renamed from: a */
    public final Optional mo23547a() {
        return this.f51491a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17966ab) {
            return this.f51491a.equals(((C17966ab) obj).mo23547a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f51491a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51491a);
        return "Arguments{experimentIds=" + valueOf + "}";
    }
}
