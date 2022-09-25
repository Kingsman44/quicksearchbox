package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.n.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C59362ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59363ad f157563a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f157564b;

    public /* synthetic */ C59362ac(C59363ad adVar, BiConsumer biConsumer) {
        this.f157563a = adVar;
        this.f157564b = biConsumer;
    }

    public final void accept(Object obj) {
        C59363ad adVar = this.f157563a;
        this.f157564b.accept(adVar.f157566c.apply(obj), adVar.f157567d.apply(obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
