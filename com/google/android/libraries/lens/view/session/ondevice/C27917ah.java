package com.google.android.libraries.lens.view.session.ondevice;

import java.util.Locale;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.ah */
/* compiled from: PG */
public final /* synthetic */ class C27917ah implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C27917ah f76038a = new C27917ah();

    private /* synthetic */ C27917ah() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return String.format(Locale.US, "%s (%d occurrences)", new Object[]{entry.getKey(), entry.getValue()});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
