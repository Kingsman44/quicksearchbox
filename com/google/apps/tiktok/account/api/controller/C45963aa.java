package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.apps.tiktok.account.api.controller.aa */
/* compiled from: PG */
public final class C45963aa {

    /* renamed from: a */
    private static final C59071e f120800a = C59071e.m91332i("com.google.apps.tiktok.account.api.controller.aa");

    /* renamed from: a */
    public static void m82131a(Intent intent, AccountId accountId) {
        C58838bb.m90868c(accountId.mo50068a() != -1);
        intent.putExtra("account_id", accountId.mo50068a());
        intent.putExtra("$tiktok$account_id_owned", true);
    }

    /* renamed from: b */
    public static AccountId m82132b(Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
            ((C59052c) ((C59052c) f120800a.mo56225c()).mo56372aa(54683)).mo56386p("AccountId was manually propagated. Use AccountIntents instead.");
        }
        if (intExtra != -1) {
            return AccountId.m82057b(intExtra);
        }
        return null;
    }
}
