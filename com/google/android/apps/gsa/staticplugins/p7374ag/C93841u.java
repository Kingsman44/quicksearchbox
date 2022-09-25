package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.accounts.Account;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.u */
/* compiled from: PG */
final class C93841u extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ String f262099a;

    /* renamed from: b */
    final /* synthetic */ C93809aa f262100b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93841u(C93809aa aaVar, String str) {
        super("Log logged-in status", 2, 16);
        this.f262100b = aaVar;
        this.f262099a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C93806a aVar = (C93806a) this.f262100b.f262042h.mo27525b();
        if (aVar.mo88178b(this.f262099a)) {
            aVar.mo88177a(C118569b.SEARCH_COOKIE_LOGGED_OUT_WITH_ACCOUNT_WITH_EXCEPTION_COUNT);
            aVar.mo88177a(C118569b.SEARCH_COOKIE_TOTAL_COUNT);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118569b bVar;
        C93806a aVar = (C93806a) this.f262100b.f262042h.mo27525b();
        String str = this.f262099a;
        boolean i = C93809aa.m154809i((String) obj);
        if (aVar.mo88178b(str)) {
            Account a = aVar.f262031b.mo79668a();
            if (a == null) {
                bVar = C118569b.SEARCH_COOKIE_LOGGED_OUT_WITHOUT_ACCOUNT_COUNT;
            } else {
                if (!i) {
                    if (aVar.f262031b.mo79658E(a, "oauth2:https://www.google.com/accounts/OAuthLogin", aVar.f262030a.mo79743a(C90120fr.f250828at)) == null) {
                        bVar = C118569b.SEARCH_COOKIE_LOGGED_OUT_WITH_ACCOUNT_WITHOUT_AUTH_TOKEN_COUNT;
                    } else {
                        bVar = C118569b.SEARCH_COOKIE_LOGGED_OUT_WITH_ACCOUNT_WITH_AUTH_TOKEN_COUNT;
                    }
                }
                aVar.mo88177a(C118569b.SEARCH_COOKIE_TOTAL_COUNT);
            }
            aVar.mo88177a(bVar);
            aVar.mo88177a(C118569b.SEARCH_COOKIE_TOTAL_COUNT);
        }
    }
}
