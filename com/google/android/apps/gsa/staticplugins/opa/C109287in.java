package com.google.android.apps.gsa.staticplugins.opa;

import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3994s.p3995a.C53430np;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.in */
/* compiled from: PG */
public final /* synthetic */ class C109287in implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C109287in f304439a = new C109287in();

    private /* synthetic */ C109287in() {
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
        C53430np npVar = (C53430np) obj;
        if (npVar.f140225b.size() <= 0) {
            return false;
        }
        C51133hp a = C51133hp.m86035a(npVar.f140226c);
        if (a == null) {
            a = C51133hp.DEFAULT;
        }
        return a == C51133hp.TRY_SAYING;
    }
}
