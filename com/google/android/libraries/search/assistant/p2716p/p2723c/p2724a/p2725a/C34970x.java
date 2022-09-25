package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C34970x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C34942ap f92654a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f92655b;

    public /* synthetic */ C34970x(C34942ap apVar, C58485gu guVar) {
        this.f92654a = apVar;
        this.f92655b = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C34942ap apVar = this.f92654a;
        C58485gu guVar = this.f92655b;
        long longValue = ((Long) obj).longValue();
        C60870cx c = apVar.f92612c.mo39815c(longValue);
        C60870cx e = apVar.f92612c.mo39817e(longValue, Optional.empty());
        C60870cx d = apVar.f92612c.mo39816d(longValue);
        C60870cx b = apVar.f92612c.mo39814b(longValue);
        return C47638k.m84751b(c, e, d, b).mo51521b(new C34951e(apVar, e, d, c, b, longValue, guVar), apVar.f92611b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
