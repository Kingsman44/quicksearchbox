package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49744ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.x */
/* compiled from: PG */
public final /* synthetic */ class C130794x implements Function {

    /* renamed from: a */
    public final /* synthetic */ double f358027a;

    public /* synthetic */ C130794x(double d) {
        this.f358027a = d;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream(((C49744ag) obj).f128447b).filter(new C130737aa(this.f358027a)).map(C130788r.f358012a).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
