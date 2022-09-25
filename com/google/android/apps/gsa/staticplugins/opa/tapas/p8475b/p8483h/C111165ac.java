package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ac */
/* compiled from: PG */
public final /* synthetic */ class C111165ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51588ng f309448a;

    public /* synthetic */ C111165ac(C51588ng ngVar) {
        this.f309448a = ngVar;
    }

    public final void accept(Object obj) {
        C51588ng ngVar = this.f309448a;
        long longValue = ((Long) obj).longValue();
        ngVar.copyOnWrite();
        C51592nk nkVar = (C51592nk) ngVar.instance;
        C51592nk nkVar2 = C51592nk.f134462k;
        nkVar.f134465b = 4;
        nkVar.f134466c = Long.valueOf(longValue);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
