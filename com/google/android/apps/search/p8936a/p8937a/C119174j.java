package com.google.android.apps.search.p8936a.p8937a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C119174j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119165a f332367a;

    public /* synthetic */ C119174j(C119165a aVar) {
        this.f332367a = aVar;
    }

    public final void accept(Object obj) {
        C119165a aVar = this.f332367a;
        int parseInt = Integer.parseInt((String) obj);
        aVar.copyOnWrite();
        C119168d dVar = (C119168d) aVar.instance;
        C119168d dVar2 = C119168d.f332348m;
        dVar.f332350a |= 8;
        dVar.f332354e = parseInt;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
