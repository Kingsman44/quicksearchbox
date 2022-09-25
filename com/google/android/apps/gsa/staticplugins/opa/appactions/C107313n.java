package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107272c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.n */
/* compiled from: PG */
public final /* synthetic */ class C107313n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107272c f298653a;

    public /* synthetic */ C107313n(C107272c cVar) {
        this.f298653a = cVar;
    }

    public final void accept(Object obj) {
        C107272c cVar = this.f298653a;
        C63088z zVar = (C63088z) obj;
        cVar.copyOnWrite();
        C107273d dVar = (C107273d) cVar.instance;
        C107273d dVar2 = C107273d.f298572i;
        zVar.getClass();
        dVar.f298574a |= 4;
        dVar.f298577d = zVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
