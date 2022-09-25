package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.common.p4580v.C60944c;
import com.google.speech.p5218j.C67095kw;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.av */
/* compiled from: PG */
public final /* synthetic */ class C79666av implements Function {

    /* renamed from: a */
    public final /* synthetic */ C67095kw f218488a;

    public /* synthetic */ C79666av(C67095kw kwVar) {
        this.f218488a = kwVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Duration) obj).plus(C60944c.m93092e(this.f218488a.f182404d));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
