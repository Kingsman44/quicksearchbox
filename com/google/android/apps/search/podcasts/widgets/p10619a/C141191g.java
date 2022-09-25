package com.google.android.apps.search.podcasts.widgets.p10619a;

import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.widgets.a.g */
/* compiled from: PG */
public final /* synthetic */ class C141191g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C141191g f383318a = new C141191g();

    private /* synthetic */ C141191g() {
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
