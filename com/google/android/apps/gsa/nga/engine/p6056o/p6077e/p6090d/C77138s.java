package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.s */
/* compiled from: PG */
public final /* synthetic */ class C77138s implements Function {

    /* renamed from: a */
    public final /* synthetic */ af f212895a;

    /* renamed from: b */
    public final /* synthetic */ Optional f212896b;

    public /* synthetic */ C77138s(af afVar, Optional optional) {
        this.f212895a = afVar;
        this.f212896b = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Long l = (Long) obj;
        return new C77082d(new C77128i((String) this.f212896b.get(), this.f212895a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
