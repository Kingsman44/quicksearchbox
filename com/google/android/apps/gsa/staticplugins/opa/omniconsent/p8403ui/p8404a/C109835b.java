package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.b */
/* compiled from: PG */
final class C109835b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C109836c f306056a;

    public C109835b(C109836c cVar) {
        this.f306056a = cVar;
    }

    public final void onClick(View view) {
        this.f306056a.startActivityForResult(AccountManager.newChooseAccountIntent((Account) null, (ArrayList) null, new String[]{"com.google"}, false, (String) null, (String) null, (String[]) null, (Bundle) null), 458);
    }
}
