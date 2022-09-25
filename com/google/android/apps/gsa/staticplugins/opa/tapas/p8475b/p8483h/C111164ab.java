package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.ab */
/* compiled from: PG */
public final /* synthetic */ class C111164ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51588ng f309447a;

    public /* synthetic */ C111164ab(C51588ng ngVar) {
        this.f309447a = ngVar;
    }

    public final void accept(Object obj) {
        C51588ng ngVar = this.f309447a;
        long longValue = ((Long) obj).longValue();
        ngVar.copyOnWrite();
        C51592nk nkVar = (C51592nk) ngVar.instance;
        C51592nk nkVar2 = C51592nk.f134462k;
        nkVar.f134464a |= 4;
        nkVar.f134469f = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
