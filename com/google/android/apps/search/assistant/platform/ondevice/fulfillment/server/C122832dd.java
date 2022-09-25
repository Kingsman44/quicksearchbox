package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dd */
/* compiled from: PG */
public final /* synthetic */ class C122832dd implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340213a;

    public /* synthetic */ C122832dd(C122870ea eaVar) {
        this.f340213a = eaVar;
    }

    public final void accept(Object obj) {
        ((C59052c) ((C59052c) this.f340213a.f340302c.mo105766e().mo56382g((Throwable) obj)).mo56372aa(34862)).mo56386p("Prewarming PopWrapper failed");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
