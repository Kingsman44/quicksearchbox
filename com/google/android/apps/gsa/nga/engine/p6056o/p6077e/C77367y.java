package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.y */
/* compiled from: PG */
public final /* synthetic */ class C77367y implements Function {

    /* renamed from: a */
    public final /* synthetic */ y f213370a;

    /* renamed from: b */
    public final /* synthetic */ Optional f213371b;

    public /* synthetic */ C77367y(y yVar, Optional optional) {
        this.f213370a = yVar;
        this.f213371b = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        y yVar = this.f213370a;
        Optional optional = this.f213371b;
        C58974d dVar = C76795ay.f212177a;
        return yVar.c(((Long) obj).longValue(), optional);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
