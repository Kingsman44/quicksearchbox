package com.google.android.apps.gsa.opa;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bn;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.opa.a */
/* compiled from: PG */
public final class C83562a extends C86052m {

    /* renamed from: a */
    private final Context f227871a;

    /* renamed from: b */
    private final C68214a f227872b;

    /* renamed from: c */
    private final C68214a f227873c;

    /* renamed from: d */
    private final C68214a f227874d;

    /* renamed from: e */
    private final C58833ax f227875e;

    public C83562a(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C58833ax axVar) {
        this.f227871a = context;
        this.f227872b = aVar;
        this.f227873c = aVar2;
        this.f227874d = aVar3;
        this.f227875e = axVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        if (((C86124t) this.f227873c.mo27525b()).mo79746e(C90014bt.f247174cF)) {
            ((bm) this.f227874d.mo27525b()).c(this.f227871a);
            if (account != null) {
                ((bn) ((C58847bk) this.f227875e).f156646a).a(account.name);
                if (((C86124t) this.f227873c.mo27525b()).mo79746e(C90014bt.f247177cI) && ((SharedPreferences) this.f227872b.mo27525b()).getBoolean("decouple_assistant_languages_changed_prefix:".concat(String.valueOf(account.name)), false)) {
                    ((SharedPreferences) this.f227872b.mo27525b()).edit().putInt("assistant_language_reconfiguring_notification_state", 2).putBoolean("decouple_assistant_languages_changed_prefix:".concat(String.valueOf(account.name)), false).apply();
                }
            }
        }
    }
}
