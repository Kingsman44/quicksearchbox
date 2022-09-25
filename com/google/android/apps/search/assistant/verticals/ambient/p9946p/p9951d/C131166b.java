package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d;

import com.google.common.p4535g.C59226t;
import java.util.ArrayList;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.d.b */
/* compiled from: PG */
public final /* synthetic */ class C131166b implements Function {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f358685a;

    public /* synthetic */ C131166b(ArrayList arrayList) {
        this.f358685a = arrayList;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        this.f358685a.add(str);
        return C59226t.m91922M(str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
