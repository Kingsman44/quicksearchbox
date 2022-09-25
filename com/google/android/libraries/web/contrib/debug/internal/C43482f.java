package com.google.android.libraries.web.contrib.debug.internal;

import com.google.android.libraries.web.p3353c.C43369n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.f */
/* compiled from: PG */
public final /* synthetic */ class C43482f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C43482f f113584a = new C43482f();

    private /* synthetic */ C43482f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C43369n a = C43369n.m76519a(((C43501y) obj).mo46564c().f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        return a.name();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
