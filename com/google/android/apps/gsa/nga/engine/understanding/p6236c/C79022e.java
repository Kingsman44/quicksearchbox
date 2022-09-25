package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.b.a.f;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.e */
/* compiled from: PG */
public final /* synthetic */ class C79022e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79022e f217314a = new C79022e();

    private /* synthetic */ C79022e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C79028k.f217326a;
        return Collection.EL.stream(((f) obj).a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
