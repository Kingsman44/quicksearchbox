package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.h.f;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.af */
/* compiled from: PG */
public final /* synthetic */ class C76776af implements Function {

    /* renamed from: a */
    public final /* synthetic */ df f212152a;

    /* renamed from: b */
    public final /* synthetic */ Optional f212153b;

    public /* synthetic */ C76776af(df dfVar, Optional optional) {
        this.f212152a = dfVar;
        this.f212153b = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        f fVar = this.f212152a;
        Optional optional = this.f212153b;
        C58974d dVar = C76795ay.f212177a;
        return C80905at.m128757a(fVar.b, new C77367y((y) obj, optional));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
