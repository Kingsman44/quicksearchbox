package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.a */
/* compiled from: PG */
public final class C89129a extends C89131c {

    /* renamed from: a */
    private C89142n f241608a;

    /* renamed from: b */
    private Optional f241609b = Optional.empty();

    /* renamed from: a */
    public final C89132d mo83114a() {
        C89142n nVar = this.f241608a;
        if (nVar != null) {
            return new C89130b(nVar, this.f241609b);
        }
        throw new IllegalStateException("Missing required properties: taskCompletionState");
    }

    /* renamed from: b */
    public final void mo83115b(Optional optional) {
        if (optional != null) {
            this.f241609b = optional;
            return;
        }
        throw new NullPointerException("Null requestId");
    }

    /* renamed from: c */
    public final void mo83116c(C89142n nVar) {
        if (nVar != null) {
            this.f241608a = nVar;
            return;
        }
        throw new NullPointerException("Null taskCompletionState");
    }
}
