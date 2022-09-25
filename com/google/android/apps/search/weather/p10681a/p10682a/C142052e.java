package com.google.android.apps.search.weather.p10681a.p10682a;

import com.google.android.apps.gsa.h.b.b;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.weather.a.a.e */
/* compiled from: PG */
public final class C142052e extends C30282k {

    /* renamed from: a */
    private final b f385413a;

    /* renamed from: b */
    private final AccountId f385414b;

    public C142052e(b bVar, AccountId accountId) {
        this.f385413a = bVar;
        this.f385414b = accountId;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18106c(Object obj) {
        C46108a aVar = (C46108a) obj;
        if (aVar == null || !this.f385414b.equals(aVar.mo50209a())) {
            this.f385413a.mo41490e(b.b(Optional.ofNullable(aVar).map(C142051d.f385412a)));
        }
    }
}
