package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.aj */
/* compiled from: PG */
public final /* synthetic */ class C10011aj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10011aj f34210a = new C10011aj();

    private /* synthetic */ C10011aj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58485gu) ((IntStream) obj).mapToObj(C10013al.f34212a).filter(C10014am.f34213a).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
