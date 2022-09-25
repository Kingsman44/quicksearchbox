package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.k */
/* compiled from: PG */
public final /* synthetic */ class C109634k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109636m f305311a;

    /* renamed from: b */
    public final /* synthetic */ Optional f305312b;

    public /* synthetic */ C109634k(C109636m mVar, Optional optional) {
        this.f305311a = mVar;
        this.f305312b = optional;
    }

    public final void run() {
        this.f305311a.f305323g.ifPresentOrElse(new C109630g(this.f305312b), C109631h.f305308a);
    }
}
