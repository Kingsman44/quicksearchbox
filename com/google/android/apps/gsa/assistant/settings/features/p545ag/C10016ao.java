package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.ao */
/* compiled from: PG */
public final /* synthetic */ class C10016ao implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10016ao f34215a = new C10016ao();

    private /* synthetic */ C10016ao() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj).mapToInt(C10009ah.f34208a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
