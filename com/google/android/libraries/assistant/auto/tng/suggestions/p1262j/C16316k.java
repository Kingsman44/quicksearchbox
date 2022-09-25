package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.k */
/* compiled from: PG */
public final /* synthetic */ class C16316k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16325t f48005a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f48006b;

    public /* synthetic */ C16316k(C16325t tVar, Consumer consumer) {
        this.f48005a = tVar;
        this.f48006b = consumer;
    }

    public final void accept(Object obj) {
        C16325t tVar = this.f48005a;
        this.f48006b.accept(tVar.f48021a.mo22919e((String) obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
