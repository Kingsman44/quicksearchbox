package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ev */
/* compiled from: PG */
public final /* synthetic */ class C104030ev implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C104030ev f289474a = new C104030ev();

    private /* synthetic */ C104030ev() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return String.format("%s-%s", new Object[]{entry.getKey(), Integer.valueOf(((C8476as) entry.getValue()).f29419d)});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
