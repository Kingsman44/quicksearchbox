package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v */
/* compiled from: PG */
final class C113896v extends C109353kp {

    /* renamed from: a */
    public C108232bc f315348a;

    /* renamed from: b */
    public Optional f315349b = Optional.empty();

    /* renamed from: c */
    private Optional f315350c = Optional.empty();

    public C113896v() {
    }

    /* renamed from: a */
    public final C109355kr mo97789a() {
        C108232bc bcVar = this.f315348a;
        if (bcVar != null) {
            return new C114162w(bcVar, this.f315349b, this.f315350c);
        }
        throw new IllegalStateException("Missing required properties: uiElement");
    }

    /* renamed from: b */
    public final void mo97790b(C109354kq kqVar) {
        this.f315350c = Optional.m71637of(kqVar);
    }

    /* renamed from: c */
    public final void mo97791c(C108232bc bcVar) {
        this.f315348a = bcVar;
    }

    public C113896v(C109355kr krVar) {
        C114162w wVar = (C114162w) krVar;
        this.f315348a = wVar.f316480a;
        this.f315349b = wVar.f316481b;
        this.f315350c = wVar.f316482c;
    }
}
