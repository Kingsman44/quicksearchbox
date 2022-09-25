package com.google.android.apps.gsa.search.core.google.gaia;

import android.content.SharedPreferences;
import com.google.android.libraries.search.p2476a.p2479c.C32165a;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.t */
/* compiled from: PG */
public final /* synthetic */ class C86059t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232638a;

    /* renamed from: b */
    public final /* synthetic */ C32165a f232639b;

    public /* synthetic */ C86059t(C86013ax axVar, C32165a aVar) {
        this.f232638a = axVar;
        this.f232639b = aVar;
    }

    public final Object apply(Object obj) {
        C86013ax axVar = this.f232638a;
        C32165a aVar = this.f232639b;
        AccountId accountId = (AccountId) obj;
        if (accountId != null) {
            ((SharedPreferences) axVar.f232560h.mo27525b()).edit().putInt("tik_tok_account_id", accountId.mo50068a()).apply();
        }
        return aVar;
    }
}
