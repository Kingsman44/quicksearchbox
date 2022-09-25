package com.google.android.apps.gsa.nga.engine.p6040k.p6041a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g.C77321am;
import com.google.assistant.p3863av.p3876g.p3877a.p3878a.C50580b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.k.a.o */
/* compiled from: PG */
public final /* synthetic */ class C76227o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C76227o f211239a = new C76227o();

    private /* synthetic */ C76227o() {
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
        C50580b bVar = (C50580b) obj;
        if (C77321am.m124093a(bVar.f131625b)) {
            return true;
        }
        return C77321am.f213245a.contains(bVar.f131624a);
    }
}
