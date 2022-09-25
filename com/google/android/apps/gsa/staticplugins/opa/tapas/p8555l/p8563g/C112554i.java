package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80017n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80018o;
import com.google.assistant.p3825an.p3830c.p3831a.C49348y;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.i */
/* compiled from: PG */
public final /* synthetic */ class C112554i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80017n f312144a;

    public /* synthetic */ C112554i(C80017n nVar) {
        this.f312144a = nVar;
    }

    public final void accept(Object obj) {
        C80017n nVar = this.f312144a;
        int number = ((C49348y) obj).getNumber();
        nVar.copyOnWrite();
        C80018o oVar = (C80018o) nVar.instance;
        C80018o oVar2 = C80018o.f219583i;
        oVar.f219585a |= 64;
        oVar.f219592h = number;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
