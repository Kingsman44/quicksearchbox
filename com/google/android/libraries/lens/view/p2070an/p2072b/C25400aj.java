package com.google.android.libraries.lens.view.p2070an.p2072b;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.an.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C25400aj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C25400aj f69221a = new C25400aj();

    private /* synthetic */ C25400aj() {
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
        int i = C25402al.f69223b;
        return Collection.EL.stream(((C56327y) obj).f150143f).noneMatch(C25401ak.f69222a);
    }
}
