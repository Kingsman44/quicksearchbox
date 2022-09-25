package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import java.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ab */
/* compiled from: PG */
public final /* synthetic */ class C76772ab implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Collection f212148a;

    public /* synthetic */ C76772ab(Collection collection) {
        this.f212148a = collection;
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
        return this.f212148a.contains((y) obj);
    }
}
