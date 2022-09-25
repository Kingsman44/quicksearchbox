package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.database.Cursor;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.f */
/* compiled from: PG */
public final /* synthetic */ class C35738f implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C35738f f93665a = new C35738f();

    private /* synthetic */ C35738f() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Cursor) obj).getInt(((Integer) obj2).intValue()));
    }
}
