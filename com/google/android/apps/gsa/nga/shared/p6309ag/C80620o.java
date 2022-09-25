package com.google.android.apps.gsa.nga.shared.p6309ag;

import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.o */
/* compiled from: PG */
public final /* synthetic */ class C80620o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80620o f221301a = new C80620o();

    private /* synthetic */ C80620o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C80624s) DesugarArrays.stream((T[]) C80624s.values()).filter(new C80618m((String) obj)).findFirst().orElse(null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
