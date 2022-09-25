package com.google.android.apps.gsa.sidekick.main.optin;

import android.accounts.Account;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.l */
/* compiled from: PG */
public final /* synthetic */ class C91567l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C91574s f255409a;

    /* renamed from: b */
    public final /* synthetic */ Account f255410b;

    public /* synthetic */ C91567l(C91574s sVar, Account account) {
        this.f255409a = sVar;
        this.f255410b = account;
    }

    public final void onClick(View view) {
        this.f255409a.f255418a.mo85936D(this.f255410b.name);
    }
}
