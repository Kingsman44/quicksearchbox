package com.google.android.apps.search.googleapp.p10370p;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.p.ad */
/* compiled from: PG */
public final /* synthetic */ class C136837ad implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C136879o f372459a;

    public /* synthetic */ C136837ad(C136879o oVar) {
        this.f372459a = oVar;
    }

    public final void accept(Object obj) {
        C136879o oVar = this.f372459a;
        long longValue = ((Long) obj).longValue();
        oVar.copyOnWrite();
        C136881q qVar = C136881q.f372552c;
        ((C136881q) oVar.instance).mo113422a().remove(Long.valueOf(longValue));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
