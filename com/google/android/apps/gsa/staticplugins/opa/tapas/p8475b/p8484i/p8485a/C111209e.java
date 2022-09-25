package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8484i.p8485a;

import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.common.p4522b.C58528ij;
import java.util.AbstractMap;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.i.a.e */
/* compiled from: PG */
public final /* synthetic */ class C111209e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111209e f309506a = new C111209e();

    private /* synthetic */ C111209e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), C58528ij.m90006F(C89988b.m146551d((String) entry.getValue())));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
