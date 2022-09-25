package com.google.android.libraries.assistant.contexttrigger.p1465i;

import android.media.session.MediaController;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.i.b */
/* compiled from: PG */
public final /* synthetic */ class C17744b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C17744b f50967a = new C17744b();

    private /* synthetic */ C17744b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
