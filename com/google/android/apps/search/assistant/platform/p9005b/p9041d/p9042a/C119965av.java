package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.apps.tiktok.tracing.C47810es;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.av */
/* compiled from: PG */
final class C119965av implements Consumer {

    /* renamed from: a */
    public Object f334062a;

    /* renamed from: b */
    final /* synthetic */ Consumer f334063b;

    /* renamed from: c */
    final /* synthetic */ C119966aw f334064c;

    /* renamed from: d */
    final /* synthetic */ C119259a f334065d;

    public C119965av(C119966aw awVar, C119259a aVar, Consumer consumer) {
        this.f334064c = awVar;
        this.f334065d = aVar;
        this.f334063b = consumer;
    }

    public final void accept(Object obj) {
        this.f334064c.f334071f.execute(C47810es.m84977q(new C119964au(this, this.f334065d, this.f334063b)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
