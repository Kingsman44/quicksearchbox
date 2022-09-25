package com.google.android.libraries.lens.view.session;

import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.au */
/* compiled from: PG */
public final /* synthetic */ class C27758au implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f75761a;

    /* renamed from: b */
    public final /* synthetic */ C25333i f75762b;

    public /* synthetic */ C27758au(List list, C25333i iVar) {
        this.f75761a = list;
        this.f75762b = iVar;
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
        return Collection.EL.stream(this.f75761a).anyMatch(new C27753ap((C56241av) obj, this.f75762b));
    }
}
