package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.ViewGroup;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.at */
/* compiled from: PG */
public final /* synthetic */ class C113945at implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315567a;

    public /* synthetic */ C113945at(C114071eg egVar) {
        this.f315567a = egVar;
    }

    public final void accept(Object obj) {
        C114071eg egVar = this.f315567a;
        ((ViewGroup) obj).removeAllViews();
        egVar.f315853ak.mo100787k();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
