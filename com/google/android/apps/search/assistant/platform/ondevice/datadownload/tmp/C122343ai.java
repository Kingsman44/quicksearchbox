package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import p3186j$.util.OptionalLong;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.ai */
/* compiled from: PG */
public final /* synthetic */ class C122343ai implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C122343ai f339216a = new C122343ai();

    private /* synthetic */ C122343ai() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        OptionalLong optionalLong = (OptionalLong) obj;
        OptionalLong optionalLong2 = (OptionalLong) obj2;
        if (!optionalLong.isPresent() || !optionalLong2.isPresent()) {
            return OptionalLong.empty();
        }
        return OptionalLong.m71641of(optionalLong.getAsLong() + optionalLong2.getAsLong());
    }
}
