package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.common.p4552o.C59672bz;
import com.google.common.p4552o.C59686ca;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.n */
/* compiled from: PG */
public final /* synthetic */ class C79556n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59672bz f218276a;

    public /* synthetic */ C79556n(C59672bz bzVar) {
        this.f218276a = bzVar;
    }

    public final void accept(Object obj) {
        C59672bz bzVar = this.f218276a;
        bzVar.copyOnWrite();
        C59686ca caVar = (C59686ca) bzVar.instance;
        C59686ca caVar2 = C59686ca.f160028e;
        caVar.f160031b = ((C79570b) obj).f218339o;
        caVar.f160030a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
