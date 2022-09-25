package com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1493b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.g.c.a.b.b */
/* compiled from: PG */
final class C17991b extends C18057v {

    /* renamed from: a */
    private final Optional f51447a;

    public C17991b(Optional optional) {
        this.f51447a = optional;
    }

    /* renamed from: a */
    public final Optional mo23526a() {
        return this.f51447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18057v) {
            return this.f51447a.equals(((C18057v) obj).mo23526a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f51447a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f51447a);
        return "Arguments{experimentIds=" + valueOf + "}";
    }
}
