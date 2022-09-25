package com.google.android.apps.search.googleapp.customtabs.features.partialcct;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.partialcct.i */
/* compiled from: PG */
public final class C133916i {
    /* renamed from: a */
    public static Intent m217203a(Context context, AccountId accountId) {
        Intent intent = new Intent();
        intent.setClass(context, PartialCctScrimActivity.class);
        intent.addFlags(67108864);
        C45963aa.m82131a(intent, accountId);
        return intent;
    }

    /* renamed from: b */
    public static Intent m217204b(Intent intent) {
        return (Intent) intent.getParcelableExtra("EXTRA_INTENT");
    }
}
