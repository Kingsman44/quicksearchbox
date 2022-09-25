package com.google.android.apps.gsa.staticplugins.opa.p8185ah;

import android.content.Intent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ah.e */
/* compiled from: PG */
public final /* synthetic */ class C106164e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f296289a;

    public /* synthetic */ C106164e(Intent intent) {
        this.f296289a = intent;
    }

    public final void accept(Object obj) {
        this.f296289a.putExtra("opa-query-string", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
