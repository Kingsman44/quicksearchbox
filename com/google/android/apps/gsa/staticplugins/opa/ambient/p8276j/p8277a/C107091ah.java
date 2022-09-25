package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C107091ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C107097an f298150a;

    public /* synthetic */ C107091ah(C107097an anVar) {
        this.f298150a = anVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C107097an anVar = this.f298150a;
        String str = (String) obj;
        ((C58970a) ((C58970a) anVar.f298159c.mo56224b()).mo56372aa(23500)).mo56389s("Removing chip id: %s ", str);
        C60870cx l = anVar.f298160d.mo77130l(str);
        C80905at.m128763g(l, new C107093aj(anVar, str));
        return l;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
