package com.google.android.apps.search.podcasts.p10576l;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.podcasts.l.h */
/* compiled from: PG */
final class C140496h implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ AccountId f381592a;

    public C140496h(AccountId accountId) {
        this.f381592a = accountId;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C140438a aVar = (C140438a) ((C140465b) obj).toBuilder();
        int a = this.f381592a.mo50068a();
        aVar.copyOnWrite();
        ((C140465b) aVar.instance).f381545a = a;
        return (C140465b) aVar.build();
    }
}
