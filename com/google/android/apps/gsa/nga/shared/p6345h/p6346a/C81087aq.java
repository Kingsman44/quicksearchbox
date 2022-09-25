package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C81087aq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81087aq f222206a = new C81087aq();

    private /* synthetic */ C81087aq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream(((C81297ca) ((Map.Entry) obj).getValue()).f222542a).map(C81224o.f222366a).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
