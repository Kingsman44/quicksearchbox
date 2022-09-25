package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107272c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107273d;
import com.google.assistant.p3861at.C49840ay;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.p */
/* compiled from: PG */
public final /* synthetic */ class C107315p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C107272c f298655a;

    public /* synthetic */ C107315p(C107272c cVar) {
        this.f298655a = cVar;
    }

    public final void accept(Object obj) {
        C107272c cVar = this.f298655a;
        C49840ay ayVar = (C49840ay) obj;
        cVar.copyOnWrite();
        C107273d dVar = (C107273d) cVar.instance;
        C107273d dVar2 = C107273d.f298572i;
        ayVar.getClass();
        dVar.f298581h = ayVar;
        dVar.f298574a |= 64;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
