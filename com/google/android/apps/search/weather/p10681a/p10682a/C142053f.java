package com.google.android.apps.search.weather.p10681a.p10682a;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.weather.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C142053f implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C142053f f385415a = new C142053f();

    private /* synthetic */ C142053f() {
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
        C46108a aVar = (C46108a) obj;
        return !"pseudonymous".equals(aVar.mo50210b().f121165j) && !"incognito".equals(aVar.mo50210b().f121165j);
    }
}
