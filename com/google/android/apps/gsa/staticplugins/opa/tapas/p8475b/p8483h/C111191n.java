package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51563mi;
import com.google.assistant.p3897e.p3917i.p3918a.C51564mj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.n */
/* compiled from: PG */
public final /* synthetic */ class C111191n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51563mi f309487a;

    public /* synthetic */ C111191n(C51563mi miVar) {
        this.f309487a = miVar;
    }

    public final void accept(Object obj) {
        C51563mi miVar = this.f309487a;
        long longValue = ((Long) obj).longValue();
        miVar.copyOnWrite();
        C51564mj mjVar = (C51564mj) miVar.instance;
        C51564mj mjVar2 = C51564mj.f134396d;
        mjVar.f134398a |= 2;
        mjVar.f134400c = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
