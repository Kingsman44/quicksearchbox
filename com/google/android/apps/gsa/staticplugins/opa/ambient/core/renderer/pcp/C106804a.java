package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.a */
/* compiled from: PG */
public final /* synthetic */ class C106804a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f297656a;

    public /* synthetic */ C106804a(List list) {
        this.f297656a = list;
    }

    public final void accept(Object obj) {
        ((C106818o) obj).mo95641c(this.f297656a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
