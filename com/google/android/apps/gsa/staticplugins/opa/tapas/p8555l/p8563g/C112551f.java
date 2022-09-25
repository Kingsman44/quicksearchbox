package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80017n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80018o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.f */
/* compiled from: PG */
public final /* synthetic */ class C112551f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80017n f312141a;

    public /* synthetic */ C112551f(C80017n nVar) {
        this.f312141a = nVar;
    }

    public final void accept(Object obj) {
        C80017n nVar = this.f312141a;
        String str = (String) obj;
        nVar.copyOnWrite();
        C80018o oVar = (C80018o) nVar.instance;
        C80018o oVar2 = C80018o.f219583i;
        str.getClass();
        oVar.f219585a |= 1;
        oVar.f219586b = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
