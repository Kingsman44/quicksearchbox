package com.google.apps.tiktok.account.data;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.apps.tiktok.account.data.ba */
/* compiled from: PG */
public final class C46182ba {

    /* renamed from: a */
    private final Context f121110a;

    /* renamed from: b */
    private final String f121111b = "com.google.android.apps.gsa.nga.permissions.EDIT_PREFERENCES";

    public C46182ba(Context context) {
        this.f121110a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50252a() {
        Intent intent = new Intent("com.google.apps.tiktok.account.data.tiktok_account_data_source_changed");
        intent.setPackage(this.f121110a.getPackageName());
        this.f121110a.sendBroadcast(intent, this.f121111b);
    }
}
