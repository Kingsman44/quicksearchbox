package com.google.android.apps.search.googleapp.notifications.webuisettings;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;

/* renamed from: com.google.android.apps.search.googleapp.notifications.webuisettings.g */
/* compiled from: PG */
public final class C136808g {
    /* renamed from: a */
    public static Intent m222483a(Context context, String str, AccountId accountId) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.search.googleapp.notifications.webuisettings.WebUiSettingsActivity");
        intent.putExtra("EXTRA_ENDPOINT_URL", str);
        intent.putExtra("EXTRA_ENDPOINT_TYPE", true);
        C45963aa.m82131a(intent, accountId);
        return intent;
    }
}
