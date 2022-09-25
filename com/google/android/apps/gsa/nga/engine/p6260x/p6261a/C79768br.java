package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.aen;
import com.google.common.p4552o.ahg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.br */
/* compiled from: PG */
public final /* synthetic */ class C79768br implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ aen f218699a;

    public /* synthetic */ C79768br(aen aen) {
        this.f218699a = aen;
    }

    public final void accept(Object obj) {
        aen aen = this.f218699a;
        int intValue = ((Integer) obj).intValue();
        aen.copyOnWrite();
        ahg ahg = (ahg) aen.instance;
        ahg ahg2 = ahg.f158704D;
        ahg.f158712a |= 128;
        ahg.f158722k = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
