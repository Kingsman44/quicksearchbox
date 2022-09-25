package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.h */
/* compiled from: PG */
public final /* synthetic */ class C76596h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C76596h f211843a = new C76596h();

    private /* synthetic */ C76596h() {
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
        return ((C61746h) obj).f166796d.equals("duration");
    }
}
