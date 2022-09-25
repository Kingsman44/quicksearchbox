package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.b */
/* compiled from: PG */
public final /* synthetic */ class C79431b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79431b f218096a = new C79431b();

    private /* synthetic */ C79431b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79570b a = C79570b.m127648a(((C79574f) obj).f218349c);
        return a == null ? C79570b.CONTEXT_TYPE_UNSPECIFIED : a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
