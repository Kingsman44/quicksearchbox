package com.google.android.apps.search.googleapp.accounts.p10123a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;

/* renamed from: com.google.android.apps.search.googleapp.accounts.a.b */
/* compiled from: PG */
public final class C133151b {
    /* renamed from: a */
    public static Intent m216105a(Context context, AccountId accountId) {
        Intent component = new Intent().setComponent(new ComponentName(context, "com.google.android.apps.search.googleapp.accounts.ui.AccountMenuActivity"));
        C45963aa.m82131a(component, accountId);
        return component.putExtra("AGSA_CLASSIC_INTENT_EXTRA", true);
    }
}
