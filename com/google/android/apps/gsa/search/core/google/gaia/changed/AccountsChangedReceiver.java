package com.google.android.apps.gsa.search.core.google.gaia.changed;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class AccountsChangedReceiver extends C86042f {

    /* renamed from: c */
    private static final C59071e f232604c = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.gaia.changed.AccountsChangedReceiver");

    /* renamed from: a */
    public C86054o f232605a;

    /* renamed from: b */
    public C118561t f232606b;

    /* renamed from: b */
    private final void m138339b() {
        this.f232605a.mo79676j();
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(20);
        if (intent != null) {
            mo79701a(context);
            String action = intent.getAction();
            if ("com.google.android.googlequicksearchbox.ACCOUNT_CREDENTIAL_UPDATE".equals(action)) {
                m138339b();
            } else if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action)) {
                m138339b();
                this.f232606b.mo103754e(C118522by.PROCESS_ACCOUNT_CHANGE, C118472ag.f328819i);
            } else {
                ((C59052c) ((C59052c) f232604c.mo56226d()).mo56372aa(8070)).mo56389s("Received unexpected action: %s", action);
            }
        }
    }
}
