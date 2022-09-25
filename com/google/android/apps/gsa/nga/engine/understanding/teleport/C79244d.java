package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.d */
/* compiled from: PG */
public final /* synthetic */ class C79244d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79309g f217708a;

    public /* synthetic */ C79244d(C79309g gVar) {
        this.f217708a = gVar;
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
        C80047aa aaVar = (C80047aa) obj;
        C79317o oVar = (C79317o) this.f217708a;
        C79317o oVar2 = (C79317o) C79309g.m127241c(aaVar.f219660d, aaVar.f219661e);
        return oVar.f217816a <= oVar2.f217816a && oVar2.f217817b <= oVar.f217817b;
    }
}
