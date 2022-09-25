package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.v */
/* compiled from: PG */
public final /* synthetic */ class C106066v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106025ax f296107a;

    public /* synthetic */ C106066v(C106025ax axVar) {
        this.f296107a = axVar;
    }

    public final void accept(Object obj) {
        this.f296107a.f296018p.remove(((Map.Entry) obj).getKey());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
