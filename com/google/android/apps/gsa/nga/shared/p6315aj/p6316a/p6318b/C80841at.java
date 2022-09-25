package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.at */
/* compiled from: PG */
public final /* synthetic */ class C80841at implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80841at f221773a = new C80841at();

    private /* synthetic */ C80841at() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return DesugarArrays.stream((T[]) C80845ax.values()).filter(new C80844aw(String.valueOf((CharSequence) obj))).findFirst();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
