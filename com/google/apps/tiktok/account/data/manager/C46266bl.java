package com.google.apps.tiktok.account.data.manager;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.apps.tiktok.account.data.manager.bl */
/* compiled from: PG */
public final /* synthetic */ class C46266bl implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C46278bx f121250a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f121251b;

    public /* synthetic */ C46266bl(C46278bx bxVar, AccountId accountId) {
        this.f121250a = bxVar;
        this.f121251b = accountId;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f121250a.mo50301b(this.f121251b.mo50068a(), new C46272br(cVar));
        return "AccountSyncService#disable";
    }
}
