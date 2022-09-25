package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51557mc;
import com.google.assistant.p3897e.p3917i.p3918a.C51560mf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.x */
/* compiled from: PG */
public final /* synthetic */ class C111201x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51557mc f309497a;

    public /* synthetic */ C111201x(C51557mc mcVar) {
        this.f309497a = mcVar;
    }

    public final void accept(Object obj) {
        C51557mc mcVar = this.f309497a;
        long longValue = ((Long) obj).longValue();
        mcVar.copyOnWrite();
        C51560mf mfVar = (C51560mf) mcVar.instance;
        C51560mf mfVar2 = C51560mf.f134382g;
        mfVar.f134384a |= 4;
        mfVar.f134387d = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
