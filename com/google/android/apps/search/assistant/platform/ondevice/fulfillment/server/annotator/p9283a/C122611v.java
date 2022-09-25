package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.v */
/* compiled from: PG */
public final /* synthetic */ class C122611v implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C122611v f339782a = new C122611v();

    private /* synthetic */ C122611v() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Float.valueOf(Math.max(((Float) obj).floatValue(), ((Float) obj2).floatValue()));
    }
}
