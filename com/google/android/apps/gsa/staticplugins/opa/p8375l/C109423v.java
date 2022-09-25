package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.v */
/* compiled from: PG */
public final /* synthetic */ class C109423v implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C109423v f304746a = new C109423v();

    private /* synthetic */ C109423v() {
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
