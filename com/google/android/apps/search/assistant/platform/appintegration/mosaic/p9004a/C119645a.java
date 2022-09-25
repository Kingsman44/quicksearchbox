package com.google.android.apps.search.assistant.platform.appintegration.mosaic.p9004a;

import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.function.Consumer;
import p5488io.grpc.binder.C70225e;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.mosaic.a.a */
/* compiled from: PG */
public final /* synthetic */ class C119645a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C70225e f333430a;

    public /* synthetic */ C119645a(C70225e eVar) {
        this.f333430a = eVar;
    }

    public final void accept(Object obj) {
        this.f333430a.f187197a.mo62290e((ScheduledExecutorService) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
