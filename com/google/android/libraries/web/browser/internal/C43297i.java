package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43912g;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.i */
/* compiled from: PG */
public final class C43297i implements Function {

    /* renamed from: a */
    public static final C43297i f113113a = new C43297i();

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C43904a aVar = (C43904a) obj;
        C69664n.m101060f(aVar, "it");
        return Boolean.valueOf(C43912g.m77530a(aVar).mo46928c() != -1);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
