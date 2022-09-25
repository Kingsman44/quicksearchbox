package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113302c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.common.base.C58881cr;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.av */
/* compiled from: PG */
public final /* synthetic */ class C111831av implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113407er f310796a;

    public /* synthetic */ C111831av(C113407er erVar) {
        this.f310796a = erVar;
    }

    public final void accept(Object obj) {
        ((C113302c) this.f310796a).f313771c = Optional.m71637of((C58881cr) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
