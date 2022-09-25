package com.google.apps.tiktok.nav;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.apps.tiktok.nav.d */
/* compiled from: PG */
public final class C47493d {

    /* renamed from: a */
    private final Context f123307a;

    /* renamed from: b */
    private final C58833ax f123308b;

    public C47493d(Context context, C58833ax axVar) {
        this.f123307a = context;
        this.f123308b = axVar;
    }

    /* renamed from: a */
    public final void mo51345a(Intent intent) {
        AccountId accountId = (AccountId) ((C58847bk) this.f123308b).f156646a;
        if (accountId.mo50068a() != -1) {
            C45963aa.m82131a(intent, accountId);
        }
        C47810es.m84979s(this.f123307a, intent);
    }
}
