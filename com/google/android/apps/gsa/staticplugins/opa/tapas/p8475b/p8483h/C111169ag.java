package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ag */
/* compiled from: PG */
public final /* synthetic */ class C111169ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C52402qk f309452a;

    public /* synthetic */ C111169ag(C52402qk qkVar) {
        this.f309452a = qkVar;
    }

    public final void accept(Object obj) {
        C52402qk qkVar = this.f309452a;
        int intValue = ((Integer) obj).intValue();
        qkVar.copyOnWrite();
        C52403ql qlVar = (C52403ql) qkVar.instance;
        C52403ql qlVar2 = C52403ql.f137512f;
        qlVar.f137514a |= 1;
        qlVar.f137515b = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
