package com.google.android.libraries.search.p2904c.p2916e.p2925c;

import android.media.audiofx.NoiseSuppressor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.c.e.c.e */
/* compiled from: PG */
public final /* synthetic */ class C37547e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C37547e f99759a = new C37547e();

    private /* synthetic */ C37547e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return NoiseSuppressor.create(((Integer) obj).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
