package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.b */
/* compiled from: PG */
final class C131467b {

    /* renamed from: a */
    public Optional f359300a = Optional.empty();

    /* renamed from: b */
    public Optional f359301b = Optional.empty();

    /* renamed from: c */
    private Optional f359302c = Optional.empty();

    /* renamed from: d */
    private C58485gu f359303d;

    /* renamed from: a */
    public final C131494bw mo110177a() {
        C58485gu guVar = this.f359303d;
        if (guVar != null) {
            return new C131497c(this.f359302c, this.f359300a, this.f359301b, guVar);
        }
        throw new IllegalStateException("Missing required properties: placesSupportingShoppingLists");
    }

    /* renamed from: b */
    public final void mo110178b(C58485gu guVar) {
        if (guVar != null) {
            this.f359303d = guVar;
            return;
        }
        throw new NullPointerException("Null placesSupportingShoppingLists");
    }

    /* renamed from: c */
    public final void mo110179c(Optional optional) {
        if (optional != null) {
            this.f359302c = optional;
            return;
        }
        throw new NullPointerException("Null suggestion");
    }
}
