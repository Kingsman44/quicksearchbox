package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.accounts.Account;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21628b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.d */
/* compiled from: PG */
public final /* synthetic */ class C91264d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C91266f f254712a;

    /* renamed from: b */
    public final /* synthetic */ Account f254713b;

    public /* synthetic */ C91264d(C91266f fVar, Account account) {
        this.f254712a = fVar;
        this.f254713b = account;
    }

    public final Object call() {
        C91266f fVar = this.f254712a;
        Account account = this.f254713b;
        return fVar.mo85540d((C21628b) fVar.f254718b.mo27028b(fVar.f253307n, account).mo26995b(30, TimeUnit.SECONDS), account);
    }
}
