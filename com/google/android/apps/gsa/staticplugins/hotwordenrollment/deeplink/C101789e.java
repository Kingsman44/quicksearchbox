package com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.deeplink.e */
/* compiled from: PG */
public final /* synthetic */ class C101789e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101793i f283930a;

    public /* synthetic */ C101789e(C101793i iVar) {
        this.f283930a = iVar;
    }

    public final void onClick(View view) {
        this.f283930a.startActivityForResult(AccountManager.newChooseAccountIntent((Account) null, (ArrayList) null, new String[]{"com.google"}, false, (String) null, (String) null, (String[]) null, (Bundle) null), 456);
    }
}
