package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113246a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113501m;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.o */
/* compiled from: PG */
public final /* synthetic */ class C111065o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113501m f309286a;

    public /* synthetic */ C111065o(C113501m mVar) {
        this.f309286a = mVar;
    }

    public final void accept(Object obj) {
        ((C113246a) this.f309286a).f313595e = Optional.m71637of((Drawable) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
