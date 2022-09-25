package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.b */
/* compiled from: PG */
public final /* synthetic */ class C131902b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131902b f360173a = new C131902b();

    private /* synthetic */ C131902b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
