package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.common.p4552o.C59672bz;
import com.google.common.p4552o.C59686ca;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.p */
/* compiled from: PG */
public final /* synthetic */ class C79558p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59672bz f218278a;

    public /* synthetic */ C79558p(C59672bz bzVar) {
        this.f218278a = bzVar;
    }

    public final void accept(Object obj) {
        C59672bz bzVar = this.f218278a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bzVar.copyOnWrite();
        C59686ca caVar = (C59686ca) bzVar.instance;
        C59686ca caVar2 = C59686ca.f160028e;
        caVar.f160030a |= 2;
        caVar.f160033d = booleanValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
