package com.google.android.apps.gsa.nga.shared.p6362r;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.r.a */
/* compiled from: PG */
public final /* synthetic */ class C81450a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81450a f222862a = new C81450a();

    private /* synthetic */ C81450a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Locale.forLanguageTag((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
