package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C79748ay implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ long f218646a;

    public /* synthetic */ C79748ay(long j) {
        this.f218646a = j;
    }

    public final void accept(Object obj) {
        long j = this.f218646a;
        C79813di diVar = (C79813di) obj;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C79814dj djVar2 = C79814dj.f218834O;
        djVar.f218851a |= 65536;
        djVar.f218848M = j;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
