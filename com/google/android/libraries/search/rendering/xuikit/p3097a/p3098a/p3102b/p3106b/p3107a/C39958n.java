package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a;

import com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3102b.p3106b.p3107a.C39959o;
import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.b.b.a.n */
/* compiled from: PG */
public final /* synthetic */ class C39958n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C39959o.C39960a f105041a;

    public /* synthetic */ C39958n(C39959o.C39960a aVar) {
        this.f105041a = aVar;
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
        return ((C46108a) obj).mo50209a().equals(this.f105041a.f105056a);
    }
}
