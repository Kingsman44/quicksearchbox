package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.d */
/* compiled from: PG */
public final /* synthetic */ class C110638d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f308308a;

    public /* synthetic */ C110638d(C58528ij ijVar) {
        this.f308308a = ijVar;
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
        return this.f308308a.contains(Long.valueOf(((C89776h) obj).f242982b));
    }
}
