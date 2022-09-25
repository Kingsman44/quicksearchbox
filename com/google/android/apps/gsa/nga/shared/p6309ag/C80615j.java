package com.google.android.apps.gsa.nga.shared.p6309ag;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.j */
/* compiled from: PG */
public final /* synthetic */ class C80615j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80615j f221292a = new C80615j();

    private /* synthetic */ C80615j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C80627v) ((Map.Entry) obj).getKey();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
