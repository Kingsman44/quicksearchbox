package com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.b.c */
/* compiled from: PG */
public final /* synthetic */ class C85325c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C85325c f231097a = new C85325c();

    private /* synthetic */ C85325c() {
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
        int i = C85329g.f231101a;
        return !((String) ((Map.Entry) obj).getValue()).trim().isEmpty();
    }
}
