package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.by */
/* compiled from: PG */
public final /* synthetic */ class C113077by implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113083cd f313312a;

    public /* synthetic */ C113077by(C113083cd cdVar) {
        this.f313312a = cdVar;
    }

    public final void accept(Object obj) {
        Map.EL.putIfAbsent(this.f313312a.f313331l, (Integer) obj, new C113052b());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
