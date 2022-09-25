package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.aen;
import com.google.common.p4552o.ahg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C79769bs implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ aen f218700a;

    public /* synthetic */ C79769bs(aen aen) {
        this.f218700a = aen;
    }

    public final void accept(Object obj) {
        aen aen = this.f218700a;
        String str = (String) obj;
        aen.copyOnWrite();
        ahg ahg = (ahg) aen.instance;
        ahg ahg2 = ahg.f158704D;
        str.getClass();
        ahg.f158712a |= 256;
        ahg.f158723l = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
