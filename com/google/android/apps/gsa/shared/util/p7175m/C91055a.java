package com.google.android.apps.gsa.shared.util.p7175m;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.util.m.a */
/* compiled from: PG */
public final /* synthetic */ class C91055a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C91055a f254321a = new C91055a();

    private /* synthetic */ C91055a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Locale) obj).getLanguage();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
