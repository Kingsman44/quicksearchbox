package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.p */
/* compiled from: PG */
public final class C122964p {

    /* renamed from: a */
    Optional f340504a = Optional.empty();

    /* renamed from: b */
    private final C122965q f340505b;

    public C122964p(C122965q qVar) {
        this.f340505b = qVar;
    }

    /* renamed from: a */
    public final synchronized void mo105804a(Optional optional) {
        if (!this.f340504a.equals(optional)) {
            Optional optional2 = this.f340504a;
            C122965q qVar = this.f340505b;
            Objects.requireNonNull(qVar);
            optional2.ifPresent(new C122962n(qVar));
            C122965q qVar2 = this.f340505b;
            Objects.requireNonNull(qVar2);
            optional.ifPresent(new C122963o(qVar2));
            this.f340504a = optional;
        }
    }
}
