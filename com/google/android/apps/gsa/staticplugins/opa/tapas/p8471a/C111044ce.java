package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ce */
/* compiled from: PG */
public final /* synthetic */ class C111044ce implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111053cn f309249a;

    public /* synthetic */ C111044ce(C111053cn cnVar) {
        this.f309249a = cnVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C110972aj ajVar = (C110972aj) this.f309249a.f309266d.mo27525b();
        C54773u uVar = ((C54759g) obj).f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        return C60922j.m93044g(ajVar.f309147d, new C110967ae(uVar.f143706a), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
