package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.common.p4522b.C58528ij;
import java.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.r */
/* compiled from: PG */
public final /* synthetic */ class C77978r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Collection f214739a;

    public /* synthetic */ C77978r(Collection collection) {
        this.f214739a = collection;
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
        return ((C58528ij) obj).containsAll(this.f214739a);
    }
}
