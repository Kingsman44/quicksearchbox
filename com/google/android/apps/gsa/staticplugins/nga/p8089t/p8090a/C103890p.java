package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.common.p4522b.C58528ij;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.p */
/* compiled from: PG */
public final /* synthetic */ class C103890p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f289203a;

    public /* synthetic */ C103890p(C58528ij ijVar) {
        this.f289203a = ijVar;
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
        return this.f289203a.contains(((Map.Entry) obj).getKey());
    }
}
