package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.assistant.p3858ar.p3859a.C49713c;
import com.google.assistant.p3858ar.p3859a.C49714d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.v */
/* compiled from: PG */
public final /* synthetic */ class C112714v implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C49713c f312455a;

    public /* synthetic */ C112714v(C49713c cVar) {
        this.f312455a = cVar;
    }

    public final void accept(Object obj) {
        C49713c cVar = this.f312455a;
        long longValue = ((Long) obj).longValue();
        cVar.copyOnWrite();
        C49714d dVar = (C49714d) cVar.instance;
        C49714d dVar2 = C49714d.f128299g;
        dVar.f128301a |= 2;
        dVar.f128304d = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
