package com.google.android.apps.gsa.sidekick.main.optin;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.g */
/* compiled from: PG */
final class C91562g implements AccountManagerCallback {

    /* renamed from: a */
    final /* synthetic */ OptInActivity f255403a;

    public C91562g(OptInActivity optInActivity) {
        this.f255403a = optInActivity;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            this.f255403a.f255383o = bundle != null ? bundle.getString("authAccount") : null;
            this.f255403a.mo85942z(13);
            this.f255403a.f255392x.mo79680n();
            OptInActivity optInActivity = this.f255403a;
            optInActivity.f255392x.mo79686t(optInActivity.f255383o);
            this.f255403a.f255393z.mo79151n();
            this.f255403a.mo85938F();
        } catch (OperationCanceledException unused) {
            this.f255403a.mo85942z(40);
            this.f255403a.mo85937E(0, 4);
        } catch (Exception unused2) {
            this.f255403a.mo85942z(14);
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
