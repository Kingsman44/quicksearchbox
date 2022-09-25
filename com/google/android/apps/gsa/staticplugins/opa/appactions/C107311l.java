package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107272c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.l */
/* compiled from: PG */
public final /* synthetic */ class C107311l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107272c f298651a;

    public /* synthetic */ C107311l(C107272c cVar) {
        this.f298651a = cVar;
    }

    public final void accept(Object obj) {
        C107272c cVar = this.f298651a;
        String str = (String) obj;
        cVar.copyOnWrite();
        C107273d dVar = (C107273d) cVar.instance;
        C107273d dVar2 = C107273d.f298572i;
        str.getClass();
        dVar.f298574a |= 2;
        dVar.f298576c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
