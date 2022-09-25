package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import java.io.Closeable;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C122631ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f339836a;

    public /* synthetic */ C122631ak(Optional optional) {
        this.f339836a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Closeable closeable = (Closeable) obj;
        return this.f339836a.map(C122662r.f339911a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
