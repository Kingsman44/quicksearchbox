package com.google.apps.tiktok.contrib.p3629c;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.apps.tiktok.contrib.c.n */
/* compiled from: PG */
public final class C46493n {
    /* renamed from: a */
    public static void m82876a(Bundle bundle, AccountId accountId) {
        bundle.putInt("account_id", accountId.mo50068a());
        bundle.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", accountId.mo50068a());
    }

    /* renamed from: b */
    static void m82877b(C58833ax axVar, Bundle bundle) {
        m82876a(bundle, (AccountId) ((C58847bk) axVar).f156646a);
    }
}
