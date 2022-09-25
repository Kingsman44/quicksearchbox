package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C79429ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79570b f218094a;

    public /* synthetic */ C79429ay(C79570b bVar) {
        this.f218094a = bVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((C79569ab) obj).f218319b.containsKey(Integer.valueOf(this.f218094a.f218339o)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
