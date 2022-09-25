package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.google.android.apps.gsa.shared.p7042i.C89784a;
import com.google.android.apps.gsa.shared.p7042i.C89785b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.an */
/* compiled from: PG */
final class C86003an implements AccountManagerCallback {

    /* renamed from: a */
    final /* synthetic */ C89784a f232526a;

    /* renamed from: b */
    final /* synthetic */ C86013ax f232527b;

    public C86003an(C86013ax axVar, C89784a aVar) {
        this.f232527b = axVar;
        this.f232526a = aVar;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            if (accountArr != null && (r2 = accountArr.length) > 0) {
                String F = this.f232527b.mo79659F();
                for (Account account : accountArr) {
                    if (account.name.equalsIgnoreCase(F)) {
                        ((C89785b) this.f232526a).f243013a.mo57356n(F);
                        return;
                    }
                }
                ((C89785b) this.f232526a).f243013a.mo57356n(accountArr[0].name);
                return;
            }
        } catch (OperationCanceledException e) {
            C59104x c = C86013ax.f232544a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(8032)).mo56386p("Retrieving Google accounts failed");
        } catch (AuthenticatorException e2) {
            C59104x c2 = C86013ax.f232544a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(8033)).mo56386p("Retrieving Google accounts failed");
        } catch (IOException e3) {
            C59104x c3 = C86013ax.f232544a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(8034)).mo56386p("Retrieving Google accounts failed");
        }
        ((C89785b) this.f232526a).f243013a.mo57356n((Object) null);
    }
}
