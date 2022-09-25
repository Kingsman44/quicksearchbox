package com.google.android.apps.gsa.nga.shared.p6309ag;

import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.n */
/* compiled from: PG */
public final /* synthetic */ class C80619n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80619n f221300a = new C80619n();

    private /* synthetic */ C80619n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C80624s) DesugarArrays.stream((T[]) C80624s.values()).filter(new C80622q((String) obj)).findFirst().orElse(null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
