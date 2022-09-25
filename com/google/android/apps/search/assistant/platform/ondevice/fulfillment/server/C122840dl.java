package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dl */
/* compiled from: PG */
public final /* synthetic */ class C122840dl implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340234a;

    public /* synthetic */ C122840dl(C122870ea eaVar) {
        this.f340234a = eaVar;
    }

    public final void accept(Object obj) {
        ((C59052c) ((C59052c) this.f340234a.f340302c.mo105766e().mo56382g((Throwable) obj)).mo56372aa(34864)).mo56386p("Prewarming of webref group failed");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
