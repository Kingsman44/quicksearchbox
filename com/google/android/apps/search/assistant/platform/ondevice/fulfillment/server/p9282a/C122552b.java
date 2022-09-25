package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.b */
/* compiled from: PG */
public final /* synthetic */ class C122552b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Throwable f339680a;

    public /* synthetic */ C122552b(Throwable th) {
        this.f339680a = th;
    }

    public final void accept(Object obj) {
        this.f339680a.initCause((Throwable) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
