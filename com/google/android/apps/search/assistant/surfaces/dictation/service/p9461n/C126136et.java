package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.et */
/* compiled from: PG */
public final /* synthetic */ class C126136et implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347580a;

    public /* synthetic */ C126136et(C126141ey eyVar) {
        this.f347580a = eyVar;
    }

    public final void accept(Object obj) {
        ((Optional) obj).ifPresent(new C126130en(this.f347580a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
