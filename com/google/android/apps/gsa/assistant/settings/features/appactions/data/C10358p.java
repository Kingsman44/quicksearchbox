package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.p */
/* compiled from: PG */
public final /* synthetic */ class C10358p implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Stream.Builder f35044a;

    public /* synthetic */ C10358p(Stream.Builder builder) {
        this.f35044a = builder;
    }

    public final void accept(Object obj) {
        this.f35044a.add((C10342bb) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
