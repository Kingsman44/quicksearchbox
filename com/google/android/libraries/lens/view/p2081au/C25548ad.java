package com.google.android.libraries.lens.view.p2081au;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.au.ad */
/* compiled from: PG */
public final /* synthetic */ class C25548ad implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C25548ad f69547a = new C25548ad();

    private /* synthetic */ C25548ad() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C25550af.f69549d;
        C56306df a = C56306df.m87964a(((C56278ce) obj).f149991d);
        if (a == null) {
            a = C56306df.UNKNOWN_FILTER_TYPE;
        }
        return a.name();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
