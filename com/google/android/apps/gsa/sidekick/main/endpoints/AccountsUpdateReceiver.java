package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7182r.C91086a;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import dagger.C68214a;

/* compiled from: PG */
public class AccountsUpdateReceiver extends C91293g {

    /* renamed from: a */
    public C68214a f254771a;

    /* renamed from: b */
    public C68214a f254772b;

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(25);
        mo85576a(context);
        String stringExtra = intent.getStringExtra("old_account_name");
        String stringExtra2 = intent.getStringExtra("account_name");
        ((C90929bz) this.f254771a.mo27525b()).mo85139d(new C91287a(context.getApplicationContext(), stringExtra2, stringExtra));
        if (stringExtra == null && stringExtra2 != null && !C91086a.m148806a(context)) {
            ((C118561t) this.f254772b.mo27525b()).mo103754e(C118522by.REFRESH_NOW_CONFIGURATION, C118472ag.f328819i);
        }
    }
}
