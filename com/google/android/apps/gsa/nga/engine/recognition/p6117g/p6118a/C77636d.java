package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80557b;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C77636d implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ Function f213854a;

    public /* synthetic */ C77636d(Function function) {
        this.f213854a = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C80557b) this.f213854a.apply((C80557b) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
