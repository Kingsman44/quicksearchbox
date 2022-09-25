package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.g */
/* compiled from: PG */
public final /* synthetic */ class C100868g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C100868g f281851a = new C100868g();

    private /* synthetic */ C100868g() {
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
        C58528ij ijVar = C100872k.f281856b;
        C49875cf a = C49875cf.m85755a(((C49879cj) obj).f129638i);
        if (a == null) {
            a = C49875cf.UNKNOWN;
        }
        return ijVar.contains(a);
    }
}
