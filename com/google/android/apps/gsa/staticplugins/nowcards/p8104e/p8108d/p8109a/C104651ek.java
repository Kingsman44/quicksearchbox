package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.p375ai.p378b.C7664fj;
import com.google.p375ai.p378b.C7681g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.ek */
/* compiled from: PG */
public final /* synthetic */ class C104651ek implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C104651ek f291431a = new C104651ek();

    private /* synthetic */ C104651ek() {
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
        C7681g a = C7681g.m22802a(((C7664fj) obj).f26609g);
        if (a == null) {
            a = C7681g.INVALID;
        }
        return a.equals(C7681g.DISLIKE_CARD);
    }
}
