package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6186k.p6187a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80753ea;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80754eb;
import com.google.android.apps.gsa.nga.shared.p6367t.C81512g;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.k.a.c */
/* compiled from: PG */
public final /* synthetic */ class C78614c implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C81512g f216433a;

    public /* synthetic */ C78614c(C81512g gVar) {
        this.f216433a = gVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C81512g gVar = this.f216433a;
        C80753ea eaVar = (C80753ea) C80754eb.f221656c.createBuilder();
        Optional a = C78816r.m126596a((C78815q) obj2);
        Objects.requireNonNull(eaVar);
        a.ifPresent(new C78613b(eaVar));
        gVar.mo74225j(a);
        if (((C78224b) obj).mo73148k(C89160q.DEMAND_STATE)) {
            eaVar.copyOnWrite();
            ((C80754eb) eaVar.instance).f221658a = 127013;
            return (C80754eb) eaVar.build();
        }
        eaVar.copyOnWrite();
        ((C80754eb) eaVar.instance).f221658a = 92605;
        return (C80754eb) eaVar.build();
    }
}
