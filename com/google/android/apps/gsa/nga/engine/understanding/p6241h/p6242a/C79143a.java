package com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C79143a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f217553a;

    public /* synthetic */ C79143a(C58528ij ijVar) {
        this.f217553a = ijVar;
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
        int i = C79149g.f217559b;
        return !this.f217553a.contains((String) obj);
    }
}
