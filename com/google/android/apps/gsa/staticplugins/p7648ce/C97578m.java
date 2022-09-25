package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.libraries.search.assistant.p2497ab.C32371am;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.m */
/* compiled from: PG */
public final /* synthetic */ class C97578m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C97578m f272595a = new C97578m();

    private /* synthetic */ C97578m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C32371am amVar = (C32371am) obj;
        return String.format(Locale.US, "%s - %.2f", new Object[]{amVar.f86784c, Double.valueOf(amVar.f86788g)});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
