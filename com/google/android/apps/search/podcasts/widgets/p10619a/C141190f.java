package com.google.android.apps.search.podcasts.widgets.p10619a;

import com.google.android.apps.gsa.h.b.b;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.podcasts.widgets.a.f */
/* compiled from: PG */
public final class C141190f extends C30282k {

    /* renamed from: a */
    private final b f383316a;

    /* renamed from: b */
    private final AccountId f383317b;

    public C141190f(b bVar, AccountId accountId) {
        this.f383316a = bVar;
        this.f383317b = accountId;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18106c(Object obj) {
        C46108a aVar = (C46108a) obj;
        if (aVar == null || !this.f383317b.equals(aVar.mo50209a())) {
            this.f383316a.mo41490e(b.b(Optional.ofNullable(aVar).map(C141189e.f383315a)));
        }
    }
}
