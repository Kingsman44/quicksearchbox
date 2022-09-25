package com.google.android.libraries.appactions.p11035a;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.a.s */
/* compiled from: PG */
public final /* synthetic */ class C147851s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147851s f398875a = new C147851s();

    private /* synthetic */ C147851s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).toLowerCase(Locale.US);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
