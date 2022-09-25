package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.shared.p7041h.C89770b;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.g */
/* compiled from: PG */
public final /* synthetic */ class C110641g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f308311a;

    public /* synthetic */ C110641g(C58528ij ijVar) {
        this.f308311a = ijVar;
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
        return this.f308311a.contains(Long.valueOf(((C89770b) obj).f242971b));
    }
}
