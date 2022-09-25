package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80005cz;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.t */
/* compiled from: PG */
public final /* synthetic */ class C111155t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80005cz f309430a;

    public /* synthetic */ C111155t(C80005cz czVar) {
        this.f309430a = czVar;
    }

    public final void accept(Object obj) {
        C80005cz czVar = this.f309430a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        czVar.copyOnWrite();
        C80007da daVar = (C80007da) czVar.instance;
        C80007da daVar2 = C80007da.f219520C;
        daVar.f219524a |= 16777216;
        daVar.f219545v = booleanValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
