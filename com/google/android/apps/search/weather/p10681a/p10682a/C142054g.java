package com.google.android.apps.search.weather.p10681a.p10682a;

import com.google.android.apps.search.weather.p10681a.p10682a.C142055h;
import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.weather.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C142054g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C142055h.C142056a f385416a;

    public /* synthetic */ C142054g(C142055h.C142056a aVar) {
        this.f385416a = aVar;
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
        return ((C46108a) obj).mo50209a().equals(this.f385416a.f385431a);
    }
}
