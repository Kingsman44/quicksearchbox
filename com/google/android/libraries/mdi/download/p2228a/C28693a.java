package com.google.android.libraries.mdi.download.p2228a;

import android.accounts.AccountManager;
import android.content.Context;

/* renamed from: com.google.android.libraries.mdi.download.a.a */
/* compiled from: PG */
public final class C28693a {

    /* renamed from: a */
    public final String f77963a;

    /* renamed from: b */
    public final AccountManager f77964b;

    public C28693a(Context context) {
        this.f77963a = context.getPackageName();
        this.f77964b = AccountManager.get(context);
    }
}
