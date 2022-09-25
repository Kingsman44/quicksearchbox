package com.google.android.apps.search.p8936a.p8937a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C119177m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C119165a f332370a;

    public /* synthetic */ C119177m(C119165a aVar) {
        this.f332370a = aVar;
    }

    public final void accept(Object obj) {
        C119165a aVar = this.f332370a;
        String str = (String) obj;
        aVar.copyOnWrite();
        C119168d dVar = (C119168d) aVar.instance;
        C119168d dVar2 = C119168d.f332348m;
        str.getClass();
        dVar.f332350a |= 32;
        dVar.f332356g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
