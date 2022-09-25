package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.util.concurrent.C60826bg;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.bf */
/* compiled from: PG */
public final /* synthetic */ class C123012bf implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C123024br f340559a;

    public /* synthetic */ C123012bf(C123024br brVar) {
        this.f340559a = brVar;
    }

    public final void accept(Object obj) {
        C123024br brVar = this.f340559a;
        Duration a = ((C123023bq) obj).mo105829a();
        if (a.compareTo(Duration.ofMillis(1)) >= 0) {
            brVar.mo105832f(a);
        } else {
            C123047cn.m202382b(brVar.mo105823a(), C123018bl.f340565a, C60826bg.f164896a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
