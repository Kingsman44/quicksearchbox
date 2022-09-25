package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C34850m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C34850m f92422a = new C34850m();

    private /* synthetic */ C34850m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (BundledMessageNotification) ((Optional) obj).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
