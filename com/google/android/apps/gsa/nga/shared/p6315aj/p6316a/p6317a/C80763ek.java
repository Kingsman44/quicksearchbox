package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ek */
/* compiled from: PG */
public final /* synthetic */ class C80763ek implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80763ek f221676a = new C80763ek();

    private /* synthetic */ C80763ek() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return ((String) entry.getKey()) + "," + ((String) entry.getValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
