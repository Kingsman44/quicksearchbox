package com.google.android.apps.search.p8936a.p8937a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C119179o implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119165a f332372a;

    public /* synthetic */ C119179o(C119165a aVar) {
        this.f332372a = aVar;
    }

    public final void accept(Object obj) {
        C119165a aVar = this.f332372a;
        int parseInt = Integer.parseInt((String) obj);
        aVar.copyOnWrite();
        C119168d dVar = (C119168d) aVar.instance;
        C119168d dVar2 = C119168d.f332348m;
        dVar.f332350a |= 512;
        dVar.f332360k = parseInt;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
