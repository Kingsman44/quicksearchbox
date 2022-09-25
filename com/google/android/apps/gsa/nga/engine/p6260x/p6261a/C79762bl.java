package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.agp;
import com.google.common.p4552o.agr;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C79762bl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ agp f218691a;

    public /* synthetic */ C79762bl(agp agp) {
        this.f218691a = agp;
    }

    public final void accept(Object obj) {
        agp agp = this.f218691a;
        int intValue = ((Integer) obj).intValue();
        agp.copyOnWrite();
        agr agr = (agr) agp.instance;
        agr agr2 = agr.f158661e;
        agr.f158663a |= 2;
        agr.f158664b = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
