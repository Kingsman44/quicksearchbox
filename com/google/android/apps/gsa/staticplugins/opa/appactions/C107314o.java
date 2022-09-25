package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107272c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d;
import com.google.assistant.p3861at.C49845bc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.o */
/* compiled from: PG */
public final /* synthetic */ class C107314o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107272c f298654a;

    public /* synthetic */ C107314o(C107272c cVar) {
        this.f298654a = cVar;
    }

    public final void accept(Object obj) {
        C107272c cVar = this.f298654a;
        C49845bc bcVar = (C49845bc) obj;
        cVar.copyOnWrite();
        C107273d dVar = (C107273d) cVar.instance;
        C107273d dVar2 = C107273d.f298572i;
        bcVar.getClass();
        dVar.f298580g = bcVar;
        dVar.f298574a |= 32;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
