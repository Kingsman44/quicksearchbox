package com.google.android.apps.gsa.sidekick.main.p7217l;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.l.b */
/* compiled from: PG */
public final /* synthetic */ class C91457b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C86054o f255105a;

    /* renamed from: b */
    public final /* synthetic */ Account f255106b;

    public /* synthetic */ C91457b(C86054o oVar, Account account) {
        this.f255105a = oVar;
        this.f255106b = account;
    }

    public final Object call() {
        C86054o oVar = this.f255105a;
        Account account = this.f255106b;
        C90748e.m148224b();
        try {
            return Boolean.valueOf(!((Boolean) C90877ak.m148472f(oVar.mo79670c(account, "HOSTED"))).booleanValue());
        } catch (InterruptedException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C91458c.f255107a.mo56225c()).mo56382g(e)).mo56372aa(11734)).mo56386p("Error getting account hosted information, assuming user has no core-service access");
            return false;
        }
    }
}
