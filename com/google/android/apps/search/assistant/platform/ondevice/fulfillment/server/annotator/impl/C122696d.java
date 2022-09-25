package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.d */
/* compiled from: PG */
public final /* synthetic */ class C122696d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122696d f339957a = new C122696d();

    private /* synthetic */ C122696d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Optional) obj).stream();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
