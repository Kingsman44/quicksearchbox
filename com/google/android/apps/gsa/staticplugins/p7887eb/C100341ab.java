package com.google.android.apps.gsa.staticplugins.p7887eb;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.ab */
/* compiled from: PG */
public final /* synthetic */ class C100341ab implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C100341ab f280598a = new C100341ab();

    private /* synthetic */ C100341ab() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Integer) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
