package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.f */
/* compiled from: PG */
public final /* synthetic */ class C112855f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59545do f312811a;

    public /* synthetic */ C112855f(C59545do doVar) {
        this.f312811a = doVar;
    }

    public final void accept(Object obj) {
        C59545do doVar = this.f312811a;
        String str = (String) obj;
        doVar.copyOnWrite();
        C59546dp dpVar = (C59546dp) doVar.instance;
        C59546dp dpVar2 = C59546dp.f158007d;
        str.getClass();
        dpVar.f158010a |= 4;
        dpVar.f158012c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
