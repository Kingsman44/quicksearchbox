package com.google.android.apps.gsa.staticplugins.opa;

import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dx */
/* compiled from: PG */
public final /* synthetic */ class C108790dx implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C108797ea f302518a;

    public /* synthetic */ C108790dx(C108797ea eaVar) {
        this.f302518a = eaVar;
    }

    public final void accept(Object obj) {
        C108797ea eaVar = this.f302518a;
        ((LiveData) obj).mo5704e((C2391v) eaVar.f302536a.f303441f, new C108792dz(eaVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
