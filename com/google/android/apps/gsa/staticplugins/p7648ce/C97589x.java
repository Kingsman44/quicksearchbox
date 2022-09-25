package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.contacts.ap;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.x */
/* compiled from: PG */
public final /* synthetic */ class C97589x implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C97589x f272608a = new C97589x();

    private /* synthetic */ C97589x() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ap apVar = (ap) obj;
        return String.format(Locale.US, "%s - %.2f", new Object[]{apVar.c, Double.valueOf(apVar.d)});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
