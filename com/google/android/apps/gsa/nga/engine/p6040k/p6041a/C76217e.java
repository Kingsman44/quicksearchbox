package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.e */
/* compiled from: PG */
public final /* synthetic */ class C76217e implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f211226a;

    public /* synthetic */ C76217e(Locale locale) {
        this.f211226a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).toLowerCase(this.f211226a).trim();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
