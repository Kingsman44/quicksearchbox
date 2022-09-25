package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.media.audiofx.AcousticEchoCanceler;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.c.e.c.f */
/* compiled from: PG */
public final /* synthetic */ class C37548f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37548f f99760a = new C37548f();

    private /* synthetic */ C37548f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return AcousticEchoCanceler.create(((Integer) obj).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
