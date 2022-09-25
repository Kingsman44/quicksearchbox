package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.view.View;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.az */
/* compiled from: PG */
public final /* synthetic */ class C107257az implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107263bb f298540a;

    public /* synthetic */ C107257az(C107263bb bbVar) {
        this.f298540a = bbVar;
    }

    public final void accept(Object obj) {
        this.f298540a.f298548e.hideSoftInputFromWindow(((View) obj).getWindowToken(), 0);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
