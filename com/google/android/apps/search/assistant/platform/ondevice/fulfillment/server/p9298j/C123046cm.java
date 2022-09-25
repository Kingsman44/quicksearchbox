package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cm */
/* compiled from: PG */
public final class C123046cm implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Consumer f340610a;

    /* renamed from: b */
    final /* synthetic */ Consumer f340611b;

    public C123046cm(Consumer consumer, Consumer consumer2) {
        this.f340610a = consumer;
        this.f340611b = consumer2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f340611b.accept(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f340610a.accept(obj);
    }
}
