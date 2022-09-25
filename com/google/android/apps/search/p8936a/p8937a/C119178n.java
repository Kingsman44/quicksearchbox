package com.google.android.apps.search.p8936a.p8937a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C119178n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119165a f332371a;

    public /* synthetic */ C119178n(C119165a aVar) {
        this.f332371a = aVar;
    }

    public final void accept(Object obj) {
        C119165a aVar = this.f332371a;
        String str = (String) obj;
        aVar.copyOnWrite();
        C119168d dVar = (C119168d) aVar.instance;
        C119168d dVar2 = C119168d.f332348m;
        str.getClass();
        dVar.f332350a |= 64;
        dVar.f332357h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
