package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79580l;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79583o;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.q */
/* compiled from: PG */
public final /* synthetic */ class C79634q implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79634q f218446a = new C79634q();

    private /* synthetic */ C79634q() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79580l lVar = C79641x.f218453a;
        return Collection.EL.stream(((C79583o) obj).f218361b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
