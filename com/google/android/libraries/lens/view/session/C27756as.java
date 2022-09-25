package com.google.android.libraries.lens.view.session;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.as */
/* compiled from: PG */
public final /* synthetic */ class C27756as implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C27756as f75759a = new C27756as();

    private /* synthetic */ C27756as() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C27761ax.f75765b;
        return Collection.EL.stream(((C56235ap) obj).f149783b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
