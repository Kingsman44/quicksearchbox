package com.google.android.libraries.lens.view.session;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.at */
/* compiled from: PG */
public final /* synthetic */ class C27757at implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C27757at f75760a = new C27757at();

    private /* synthetic */ C27757at() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C27761ax.f75765b;
        return Collection.EL.stream(((C56233an) obj).f149778b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
