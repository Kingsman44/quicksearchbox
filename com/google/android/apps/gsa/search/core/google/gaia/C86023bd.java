package com.google.android.apps.gsa.search.core.google.gaia;

import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65804ch;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.bd */
/* compiled from: PG */
public final /* synthetic */ class C86023bd implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C86023bd f232583a = new C86023bd();

    private /* synthetic */ C86023bd() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65804ch chVar;
        C65798cb cbVar = (C65798cb) obj;
        if (cbVar.f178857b == 3) {
            chVar = (C65804ch) cbVar.f178858c;
        } else {
            chVar = C65804ch.f178869c;
        }
        return Boolean.valueOf(chVar.f178872b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
