package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a;

import com.google.assistant.p4008y.p4009a.C53556ap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a.b */
/* compiled from: PG */
public final /* synthetic */ class C109367b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f304651a;

    public /* synthetic */ C109367b(List list) {
        this.f304651a = list;
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
        return Collection.EL.stream(this.f304651a).anyMatch(new C109366a((C53556ap) obj));
    }
}
