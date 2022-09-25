package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.p */
/* compiled from: PG */
public final /* synthetic */ class C131998p implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C131998p f360335a = new C131998p();

    private /* synthetic */ C131998p() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        return Collection.EL.stream((List) obj2).map(new C131999q(((Boolean) obj).booleanValue()));
    }
}
