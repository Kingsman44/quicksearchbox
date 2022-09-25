package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50661x;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.g */
/* compiled from: PG */
public final /* synthetic */ class C113740g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C113740g f314986a = new C113740g();

    private /* synthetic */ C113740g() {
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
        int a = C50661x.m85874a(((C50662y) obj).f131786b);
        return a != 0 && a == 3;
    }
}
