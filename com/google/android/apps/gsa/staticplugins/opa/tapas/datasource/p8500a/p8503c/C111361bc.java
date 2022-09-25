package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.p4129b.p4136c.C54758f;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.bc */
/* compiled from: PG */
public final /* synthetic */ class C111361bc implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111366bh f309868a;

    public /* synthetic */ C111361bc(C111366bh bhVar) {
        this.f309868a = bhVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C111366bh bhVar = this.f309868a;
        C54758f fVar = ((C111369e) obj).mo99122b().f143682b;
        if (fVar == null) {
            fVar = C54758f.f143676b;
        }
        return Collection.EL.stream(fVar.f143678a).anyMatch(new C111352au(bhVar));
    }
}
