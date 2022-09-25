package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.e */
/* compiled from: PG */
public final /* synthetic */ class C113308e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113318o f313798a;

    public /* synthetic */ C113308e(C113318o oVar) {
        this.f313798a = oVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113318o oVar = this.f313798a;
        C113304aa aaVar = (C113304aa) oVar.f313821i.mo27525b();
        C60870cx a = aaVar.f313792d.mo28201a("[NGA] ContactsHelper.findContactIdsByName", new C113329z(aaVar, (String) obj));
        SettableFuture settableFuture = new SettableFuture();
        new C90873ag(a, oVar.f313822j, "getting contact ids by name", new C113309f(settableFuture)).mo85223a(C113310g.f313800a);
        return settableFuture;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
