package com.google.android.libraries.web.webview.p3478d.p3479a;

import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.d.a.d */
/* compiled from: PG */
final class C44398d implements Function {

    /* renamed from: a */
    public static final C44398d f115412a = new C44398d();

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C43904a aVar = (C43904a) obj;
        C69664n.m101060f(aVar, "it");
        C43891f d = aVar.mo46411d(C44475p.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        return (C44475p) ((C43945v) d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
