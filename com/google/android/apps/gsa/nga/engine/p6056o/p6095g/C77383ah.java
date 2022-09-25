package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61758t;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.ah */
/* compiled from: PG */
public final /* synthetic */ class C77383ah implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77383ah f213397a = new C77383ah();

    private /* synthetic */ C77383ah() {
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
        C61758t tVar;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 3) {
            tVar = (C61758t) jVar.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        return tVar.f166826a == 4;
    }
}
