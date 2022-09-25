package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.w */
/* compiled from: PG */
public final /* synthetic */ class C79839w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Long f218910a;

    public /* synthetic */ C79839w(Long l) {
        this.f218910a = l;
    }

    public final void accept(Object obj) {
        C79813di diVar = (C79813di) obj;
        long longValue = this.f218910a.longValue();
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        C79814dj djVar2 = C79814dj.f218834O;
        djVar.f218851a |= 65536;
        djVar.f218848M = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
