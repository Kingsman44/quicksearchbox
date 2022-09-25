package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.o */
/* compiled from: PG */
public final /* synthetic */ class C75996o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C75996o f210820a = new C75996o();

    private /* synthetic */ C75996o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).trim().toLowerCase(Locale.US);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
