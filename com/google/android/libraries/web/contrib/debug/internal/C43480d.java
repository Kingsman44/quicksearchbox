package com.google.android.libraries.web.contrib.debug.internal;

import p3186j$.time.ZoneId;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.d */
/* compiled from: PG */
public final /* synthetic */ class C43480d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C43480d f113582a = new C43480d();

    private /* synthetic */ C43480d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((C43501y) obj).mo46565d().atZone(ZoneId.systemDefault()).toLocalTime().toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
