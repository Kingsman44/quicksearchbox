package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130696a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.assistant.p3860as.C49784bt;
import com.google.common.p4535g.C59203do;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.n */
/* compiled from: PG */
public final /* synthetic */ class C130784n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130784n f358005a = new C130784n();

    private /* synthetic */ C130784n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130701b bVar = (C130701b) obj;
        C49784bt d = bVar.mo109793d();
        double d2 = (d.f128556c + d.f128557d) * 10.0d;
        double d3 = C59203do.f157270a;
        double max = Math.max(C59203do.f157270a, d.f128558e - 44.8d);
        double d4 = d.f128559f;
        if (d4 != C59203do.f157270a) {
            d2 += d.f128555b + max + d4;
        }
        if (!d.f128561h && max >= 1.0E-6d) {
            d3 = d2;
        }
        C130696a c = bVar.mo109792c();
        c.mo109787c(d3);
        c.mo109788d(C49784bt.f128552i);
        return c.mo109785a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
