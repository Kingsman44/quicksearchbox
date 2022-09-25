package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.r */
/* compiled from: PG */
public final /* synthetic */ class C130877r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130877r f358156a = new C130877r();

    private /* synthetic */ C130877r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Collector collector = C130881v.f358160a;
        return Collection.EL.stream((C58485gu) ((Map.Entry) obj).getValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
