package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d;

import p3186j$.time.Instant;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.d.g */
/* compiled from: PG */
final class C130506g implements BinaryOperator {

    /* renamed from: a */
    public static final C130506g f357503a = new C130506g();

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        Instant instant = (Instant) obj;
        Instant instant2 = (Instant) obj2;
        return instant2.isAfter(instant.plus(C130508i.f357505a)) ? instant2 : instant;
    }
}
