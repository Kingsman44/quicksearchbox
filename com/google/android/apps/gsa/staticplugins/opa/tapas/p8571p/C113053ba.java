package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.assistant.p3781ad.p3789d.p3791b.C48720ca;
import com.google.assistant.p3781ad.p3789d.p3791b.C48721cb;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.ba */
/* compiled from: PG */
public final /* synthetic */ class C113053ba implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C48720ca f313257a;

    public /* synthetic */ C113053ba(C48720ca caVar) {
        this.f313257a = caVar;
    }

    public final void accept(Object obj) {
        C48720ca caVar = this.f313257a;
        int intValue = ((Integer) obj).intValue();
        caVar.copyOnWrite();
        C48721cb cbVar = (C48721cb) caVar.instance;
        C48721cb cbVar2 = C48721cb.f126055m;
        cbVar.f126057a |= 128;
        cbVar.f126065i = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
