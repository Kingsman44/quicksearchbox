package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.h */
/* compiled from: PG */
public final /* synthetic */ class C77261h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f213111a;

    public /* synthetic */ C77261h(C58528ij ijVar) {
        this.f213111a = ijVar;
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
        C58528ij ijVar = this.f213111a;
        C51473j jVar = (C51473j) obj;
        int i = C77276w.f213129a;
        return jVar.f134093b == 4 && C58528ij.m90006F(((C52397qf) jVar.f134094c).f137496d).equals(ijVar);
    }
}
