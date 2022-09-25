package org.chromium.net;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.base.C72382h;
import org.chromium.base.C72387m;
import p000J.C0000N;

/* renamed from: org.chromium.net.g */
/* compiled from: PG */
final class C72437g implements AccountManagerCallback {

    /* renamed from: a */
    public final C72438h f192657a;

    /* renamed from: b */
    final /* synthetic */ HttpNegotiateAuthenticator f192658b;

    public C72437g(HttpNegotiateAuthenticator httpNegotiateAuthenticator, C72438h hVar) {
        this.f192658b = httpNegotiateAuthenticator;
        this.f192657a = hVar;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (bundle.containsKey("intent")) {
                Context context = C72382h.f192527a;
                context.registerReceiver(new C72436f(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                return;
            }
            this.f192658b.processResult(bundle, this.f192657a);
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            C72387m.m107043d("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            C0000N.M0s8NeYn(this.f192657a.f192659a, this.f192658b, -9, (String) null);
        }
    }
}
