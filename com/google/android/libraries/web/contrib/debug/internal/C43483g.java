package com.google.android.libraries.web.contrib.debug.internal;

import com.google.android.libraries.web.p3353c.C43366k;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.g */
/* compiled from: PG */
public final /* synthetic */ class C43483g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C43483g f113585a = new C43483g();

    private /* synthetic */ C43483g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C43366k a = C43366k.m76517a(((C43501y) obj).mo46564c().f113332e);
        if (a == null) {
            a = C43366k.UNSPECIFIED;
        }
        return a.name();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
