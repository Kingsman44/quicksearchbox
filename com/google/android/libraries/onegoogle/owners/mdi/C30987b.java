package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import androidx.core.content.C1882h;
import com.google.android.libraries.onegoogle.owners.C30969d;
import com.google.android.libraries.onegoogle.owners.C30970e;
import com.google.android.libraries.onegoogle.owners.C30973h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.b */
/* compiled from: PG */
final class C30987b {

    /* renamed from: a */
    public boolean f83476a = false;

    /* renamed from: b */
    public final OnAccountsUpdateListener f83477b;

    /* renamed from: c */
    public final AccountManager f83478c;

    public C30987b(Context context, C30969d dVar, OnAccountsUpdateListener onAccountsUpdateListener) {
        this.f83477b = onAccountsUpdateListener;
        this.f83478c = AccountManager.get(context.getApplicationContext());
        if (C1882h.m5137c(context, "android.permission.GET_ACCOUNTS") != 0) {
            C30973h hVar = (C30973h) dVar;
            C30970e eVar = new C30970e(hVar);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(eVar), hVar.f83457c);
            C30979a aVar = new C30979a();
            C60856cj.m92911t(m, C47810es.m84974n(aVar), C60826bg.f164896a);
        }
    }
}
