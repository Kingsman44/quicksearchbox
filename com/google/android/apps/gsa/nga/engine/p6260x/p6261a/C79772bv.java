package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.aem;
import com.google.common.p4552o.aen;
import com.google.common.p4552o.ahg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bv */
/* compiled from: PG */
public final /* synthetic */ class C79772bv implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ aen f218703a;

    public /* synthetic */ C79772bv(aen aen) {
        this.f218703a = aen;
    }

    public final void accept(Object obj) {
        aen aen = this.f218703a;
        aem aem = (aem) obj;
        aen.copyOnWrite();
        ahg ahg = (ahg) aen.instance;
        ahg ahg2 = ahg.f158704D;
        aem.getClass();
        ahg.f158708C = aem;
        ahg.f158712a |= 67108864;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
