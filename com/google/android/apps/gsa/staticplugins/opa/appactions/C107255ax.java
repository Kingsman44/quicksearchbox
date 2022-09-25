package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.view.View;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ax */
/* compiled from: PG */
public final /* synthetic */ class C107255ax implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107263bb f298538a;

    public /* synthetic */ C107255ax(C107263bb bbVar) {
        this.f298538a = bbVar;
    }

    public final void accept(Object obj) {
        this.f298538a.f298548e.showSoftInput((View) obj, 1);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
