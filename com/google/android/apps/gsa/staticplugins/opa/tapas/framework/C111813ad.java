package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ad */
/* compiled from: PG */
public final /* synthetic */ class C111813ad implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C111813ad f310742a = new C111813ad();

    private /* synthetic */ C111813ad() {
    }

    public final void accept(Object obj) {
        int i = C111823an.f310757e;
        ((C60870cx) obj).cancel(true);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
