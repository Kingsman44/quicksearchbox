package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d;

import android.accounts.AccountManager;
import android.content.Context;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.ac.d.b.b.d.k */
/* compiled from: PG */
public final class C147254k {

    /* renamed from: a */
    private final Context f397495a;

    public C147254k(Context context) {
        this.f397495a = context;
    }

    /* renamed from: a */
    public final C60870cx mo124056a() {
        return C60856cj.m92900i(Arrays.asList(AccountManager.get(this.f397495a).getAccountsByType("com.google")));
    }
}
