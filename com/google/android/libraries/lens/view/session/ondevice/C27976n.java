package com.google.android.libraries.lens.view.session.ondevice;

import com.google.p4172bg.p4174b.C55721j;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.n */
/* compiled from: PG */
public final /* synthetic */ class C27976n implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f76137a;

    public /* synthetic */ C27976n(List list) {
        this.f76137a = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C55721j) this.f76137a.get(((Integer) obj).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
