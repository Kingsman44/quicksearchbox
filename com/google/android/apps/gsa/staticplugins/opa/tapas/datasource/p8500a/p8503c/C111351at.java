package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.p4129b.p4136c.C54761i;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.at */
/* compiled from: PG */
public final /* synthetic */ class C111351at implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111351at f309851a = new C111351at();

    private /* synthetic */ C111351at() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49301bt btVar = (C49301bt) obj;
        int i = C111366bh.f309874k;
        C54761i iVar = btVar.f127429e;
        if (iVar == null) {
            iVar = C54761i.f143683c;
        }
        return Collection.EL.stream(iVar.f143685a).map(new C111362bd(btVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
