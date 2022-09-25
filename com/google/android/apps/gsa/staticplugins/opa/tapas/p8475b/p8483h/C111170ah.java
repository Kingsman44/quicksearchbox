package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ah */
/* compiled from: PG */
public final /* synthetic */ class C111170ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52402qk f309453a;

    public /* synthetic */ C111170ah(C52402qk qkVar) {
        this.f309453a = qkVar;
    }

    public final void accept(Object obj) {
        C52402qk qkVar = this.f309453a;
        int intValue = ((Integer) obj).intValue();
        qkVar.copyOnWrite();
        C52403ql qlVar = (C52403ql) qkVar.instance;
        C52403ql qlVar2 = C52403ql.f137512f;
        qlVar.f137514a |= 2;
        qlVar.f137516c = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
