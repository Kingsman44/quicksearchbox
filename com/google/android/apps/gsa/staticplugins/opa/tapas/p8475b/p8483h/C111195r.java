package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.r */
/* compiled from: PG */
public final /* synthetic */ class C111195r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51446i f309491a;

    public /* synthetic */ C111195r(C51446i iVar) {
        this.f309491a = iVar;
    }

    public final void accept(Object obj) {
        C51446i iVar = this.f309491a;
        long longValue = ((Long) obj).longValue();
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        jVar.f134092a |= 32;
        jVar.f134098g = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
