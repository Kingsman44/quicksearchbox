package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.e */
/* compiled from: PG */
public final /* synthetic */ class C95530e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C95532g f267334a;

    /* renamed from: b */
    public final /* synthetic */ String f267335b;

    public /* synthetic */ C95530e(C95532g gVar, String str) {
        this.f267334a = gVar;
        this.f267335b = str;
    }

    public final void accept(Object obj) {
        C95532g gVar = this.f267334a;
        gVar.f267339b.put(this.f267335b, new C95531f(((Integer) obj).intValue(), gVar.f267341d.mo26870b()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
