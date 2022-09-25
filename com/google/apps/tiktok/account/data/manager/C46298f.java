package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.data.manager.f */
/* compiled from: PG */
public final /* synthetic */ class C46298f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f121282a;

    public /* synthetic */ C46298f(AccountId accountId) {
        this.f121282a = accountId;
    }

    public final Object apply(Object obj) {
        int a = C46161am.m82384a(C46301i.m82576b((C46222c) obj, this.f121282a).f121188d);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
