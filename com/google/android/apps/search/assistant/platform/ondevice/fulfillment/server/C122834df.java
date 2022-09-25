package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.df */
/* compiled from: PG */
public final /* synthetic */ class C122834df implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340216a;

    public /* synthetic */ C122834df(C122870ea eaVar) {
        this.f340216a = eaVar;
    }

    public final void accept(Object obj) {
        ((C59052c) ((C59052c) this.f340216a.f340302c.mo105766e().mo56382g((Throwable) obj)).mo56372aa(34863)).mo56386p("Prewarming TextAnnotator failed");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
