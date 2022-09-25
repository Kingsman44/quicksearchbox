package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80005cz;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.u */
/* compiled from: PG */
public final /* synthetic */ class C111156u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80005cz f309431a;

    public /* synthetic */ C111156u(C80005cz czVar) {
        this.f309431a = czVar;
    }

    public final void accept(Object obj) {
        C80005cz czVar = this.f309431a;
        int intValue = ((Integer) obj).intValue();
        czVar.copyOnWrite();
        C80007da daVar = (C80007da) czVar.instance;
        C80007da daVar2 = C80007da.f219520C;
        daVar.f219524a |= 33554432;
        daVar.f219546w = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
