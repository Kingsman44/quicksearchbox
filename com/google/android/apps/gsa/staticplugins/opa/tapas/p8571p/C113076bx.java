package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bx */
/* compiled from: PG */
public final /* synthetic */ class C113076bx implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C113083cd f313311a;

    public /* synthetic */ C113076bx(C113083cd cdVar) {
        this.f313311a = cdVar;
    }

    public final void accept(Object obj) {
        Map.EL.putIfAbsent(this.f313311a.f313330k, (String) obj, new C113052b());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
