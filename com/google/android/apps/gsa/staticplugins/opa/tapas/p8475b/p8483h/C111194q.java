package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.q */
/* compiled from: PG */
public final /* synthetic */ class C111194q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51446i f309490a;

    public /* synthetic */ C111194q(C51446i iVar) {
        this.f309490a = iVar;
    }

    public final void accept(Object obj) {
        C51446i iVar = this.f309490a;
        String str = (String) obj;
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        C51473j jVar2 = C51473j.f134090i;
        str.getClass();
        jVar.f134092a |= 64;
        jVar.f134099h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
