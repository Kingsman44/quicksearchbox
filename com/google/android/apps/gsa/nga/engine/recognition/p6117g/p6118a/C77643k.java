package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.k */
/* compiled from: PG */
public final /* synthetic */ class C77643k implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ Function f213862a;

    public /* synthetic */ C77643k(Function function) {
        this.f213862a = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C80563h) this.f213862a.apply((C80563h) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
