package com.google.apps.tiktok.account.data.device;

import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.account.data.device.e */
/* compiled from: PG */
public final class C46201e {

    /* renamed from: a */
    public final AccountManager f121136a;

    /* renamed from: b */
    public final C46428ao f121137b;

    /* renamed from: c */
    private final Executor f121138c;

    public C46201e(AccountManager accountManager, Executor executor, C46428ao aoVar) {
        this.f121136a = accountManager;
        this.f121137b = aoVar;
        this.f121138c = executor;
    }

    /* renamed from: b */
    static /* synthetic */ void m82437b(SettableFuture settableFuture, AccountManagerFuture accountManagerFuture) {
        try {
            C58838bb.m90883r(accountManagerFuture.isDone());
            settableFuture.mo57356n(accountManagerFuture.getResult());
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            settableFuture.mo57357o(e);
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
        }
    }

    /* renamed from: a */
    public final C60870cx mo50258a(C46200d dVar) {
        return C60856cj.m92905n(C47810es.m84965e(new C46199c(this, dVar)), this.f121138c);
    }
}
