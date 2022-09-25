package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hb */
/* compiled from: PG */
public final /* synthetic */ class C112911hb implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C112911hb f312933a = new C112911hb();

    private /* synthetic */ C112911hb() {
    }

    public final void accept(Object obj) {
        C60870cx cxVar = (C60870cx) obj;
        if (!cxVar.isDone()) {
            cxVar.cancel(true);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
