package com.google.android.apps.gsa.nga.shared.p6344g;

import com.google.android.libraries.mdi.C28595b;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.g.b */
/* compiled from: PG */
public final /* synthetic */ class C81068b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f222184a;

    public /* synthetic */ C81068b(Map map) {
        this.f222184a = map;
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
        return !Boolean.TRUE.equals(Map.EL.putIfAbsent(this.f222184a, Optional.ofNullable(((C28595b) obj).f77799c), true));
    }
}
