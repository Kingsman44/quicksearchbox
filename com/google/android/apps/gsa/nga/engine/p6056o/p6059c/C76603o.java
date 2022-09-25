package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.o */
/* compiled from: PG */
public final /* synthetic */ class C76603o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C62917ay f211850a;

    public /* synthetic */ C76603o(C62917ay ayVar) {
        this.f211850a = ayVar;
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
        C61762x xVar = (C61762x) obj;
        C62940bt r0 = C62942bv.checkIsLite(this.f211850a);
        xVar.mo58887l(r0);
        return xVar.f169962ag.mo58857o(r0.f169971d);
    }
}
