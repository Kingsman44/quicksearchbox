package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.au */
/* compiled from: PG */
public final /* synthetic */ class C119964au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119965av f334059a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334060b;

    /* renamed from: c */
    public final /* synthetic */ C119259a f334061c;

    public /* synthetic */ C119964au(C119965av avVar, C119259a aVar, Consumer consumer) {
        this.f334059a = avVar;
        this.f334061c = aVar;
        this.f334060b = consumer;
    }

    public final void run() {
        C119965av avVar = this.f334059a;
        C119259a aVar = this.f334061c;
        Consumer consumer = this.f334060b;
        Object obj = aVar.f332586a.get();
        if (!obj.equals(avVar.f334062a)) {
            avVar.f334062a = obj;
            consumer.accept(obj);
        }
    }
}
