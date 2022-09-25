package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.common.p4552o.p4553a.C59545do;
import com.google.common.p4552o.p4553a.C59546dp;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.q */
/* compiled from: PG */
public final /* synthetic */ class C112947q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59545do f313003a;

    public /* synthetic */ C112947q(C59545do doVar) {
        this.f313003a = doVar;
    }

    public final void accept(Object obj) {
        C59545do doVar = this.f313003a;
        doVar.copyOnWrite();
        C59546dp dpVar = (C59546dp) doVar.instance;
        C59546dp dpVar2 = C59546dp.f158007d;
        dpVar.f158011b = ((C48582b) obj).f125574q;
        dpVar.f158010a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
