package com.google.android.apps.gsa.nga.shared.p6363s;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.s.a */
/* compiled from: PG */
public final /* synthetic */ class C81452a implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f222863a;

    public /* synthetic */ C81452a(Function function) {
        this.f222863a = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C60870cx) this.f222863a.apply(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
