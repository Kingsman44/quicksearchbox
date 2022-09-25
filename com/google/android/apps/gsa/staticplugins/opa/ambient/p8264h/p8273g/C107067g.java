package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.g */
/* compiled from: PG */
public final /* synthetic */ class C107067g implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C107071k f298112a;

    public /* synthetic */ C107067g(C107071k kVar) {
        this.f298112a = kVar;
    }

    public final void onSystemUiVisibilityChange(int i) {
        C107071k kVar = this.f298112a;
        if ((i & 2) == 0) {
            kVar.f298117a.mo28213m("hideSystemUiDelayed", 3000, new C107066f(kVar));
        }
    }
}
