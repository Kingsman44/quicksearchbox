package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.b */
/* compiled from: PG */
final class C16663b extends C16665d {

    /* renamed from: a */
    private final Optional f48814a;

    /* renamed from: b */
    private final Optional f48815b;

    public C16663b(Optional optional, Optional optional2) {
        this.f48814a = optional;
        this.f48815b = optional2;
    }

    /* renamed from: a */
    public final Optional mo22952a() {
        return this.f48814a;
    }

    /* renamed from: b */
    public final Optional mo22953b() {
        return this.f48815b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16665d) {
            C16665d dVar = (C16665d) obj;
            return this.f48814a.equals(dVar.mo22952a()) && this.f48815b.equals(dVar.mo22953b());
        }
    }

    public final int hashCode() {
        return ((this.f48814a.hashCode() ^ 1000003) * 1000003) ^ this.f48815b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48814a);
        String valueOf2 = String.valueOf(this.f48815b);
        return "ImmersiveArgsAdditionalData{smartActionCandidates=" + valueOf + ", suggestedTopContacts=" + valueOf2 + "}";
    }
}
