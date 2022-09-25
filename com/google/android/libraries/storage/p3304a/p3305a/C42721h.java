package com.google.android.libraries.storage.p3304a.p3305a;

import java.util.concurrent.CompletableFuture;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.storage.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C42721h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ CompletableFuture f111980a;

    public /* synthetic */ C42721h(CompletableFuture completableFuture) {
        this.f111980a = completableFuture;
    }

    public final void accept(Object obj) {
        this.f111980a.complete((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
