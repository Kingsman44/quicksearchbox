package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.C107082a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.s */
/* compiled from: PG */
public final /* synthetic */ class C107008s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106989ao f298021a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f298022b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f298023c;

    public /* synthetic */ C107008s(C106989ao aoVar, C106596h hVar, C58485gu guVar) {
        this.f298021a = aoVar;
        this.f298022b = hVar;
        this.f298023c = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106989ao aoVar = this.f298021a;
        C107082a aVar = (C107082a) obj;
        C60870cx a = aVar.mo95785a(this.f298022b, this.f298023c);
        C80905at.m128763g(a, new C107015z(aoVar, aVar));
        return a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
