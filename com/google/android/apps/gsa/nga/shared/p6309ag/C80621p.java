package com.google.android.apps.gsa.nga.shared.p6309ag;

import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.p */
/* compiled from: PG */
public final /* synthetic */ class C80621p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80621p f221302a = new C80621p();

    private /* synthetic */ C80621p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C80624s) DesugarArrays.stream((T[]) C80624s.values()).filter(new C80623r((C80627v) obj)).findFirst().orElse(null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
