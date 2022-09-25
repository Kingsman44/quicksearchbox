package com.google.android.apps.search.googleapp.compliance.p10146c;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;

/* renamed from: com.google.android.apps.search.googleapp.compliance.c.a */
/* compiled from: PG */
public final class C133623a {

    /* renamed from: a */
    private final Context f364011a;

    public C133623a(Context context) {
        this.f364011a = context;
    }

    /* renamed from: a */
    public final Intent mo111301a(AccountId accountId) {
        Intent intent = new Intent();
        intent.addFlags(8454144);
        intent.setClassName(this.f364011a, "com.google.android.apps.search.googleapp.compliance.ComplianceTransparentActivity");
        C45963aa.m82131a(intent, accountId);
        return intent;
    }
}
