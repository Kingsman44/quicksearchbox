package com.google.android.apps.search.podcasts.widgets.p10619a;

import com.google.android.apps.search.podcasts.widgets.p10619a.C141193i;
import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.widgets.a.h */
/* compiled from: PG */
public final /* synthetic */ class C141192h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C141193i.C141194a f383319a;

    public /* synthetic */ C141192h(C141193i.C141194a aVar) {
        this.f383319a = aVar;
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
        return ((C46108a) obj).mo50209a().equals(this.f383319a.f383333a);
    }
}
