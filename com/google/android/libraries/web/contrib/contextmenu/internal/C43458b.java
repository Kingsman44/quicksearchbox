package com.google.android.libraries.web.contrib.contextmenu.internal;

import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C43458b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43461c f113530a;

    public /* synthetic */ C43458b(C43461c cVar) {
        this.f113530a = cVar;
    }

    public final void accept(Object obj) {
        C43446f fVar = (C43446f) obj;
        Consumer consumer = this.f113530a.f113533a;
        if (consumer != null) {
            consumer.accept(fVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
