package com.google.android.libraries.lens.view.utils;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.utils.ae */
/* compiled from: PG */
public final /* synthetic */ class C28103ae implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C28103ae f76502a = new C28103ae();

    private /* synthetic */ C28103ae() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(((C56327y) obj).f150143f).filter(C28108aj.f76507a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
