package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import java.io.IOException;
import org.chromium.base.C72382h;
import org.chromium.base.C72387m;
import org.chromium.base.ThreadUtils;
import p000J.C0000N;

/* renamed from: org.chromium.net.e */
/* compiled from: PG */
final class C72435e implements AccountManagerCallback {

    /* renamed from: a */
    final /* synthetic */ HttpNegotiateAuthenticator f192653a;

    /* renamed from: b */
    private final C72438h f192654b;

    public C72435e(HttpNegotiateAuthenticator httpNegotiateAuthenticator, C72438h hVar) {
        this.f192653a = httpNegotiateAuthenticator;
        this.f192654b = hVar;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            int length = accountArr.length;
            if (length == 0) {
                C72387m.m107043d("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                C0000N.M0s8NeYn(this.f192654b.f192659a, this.f192653a, NetError.ERR_MISSING_AUTH_CREDENTIALS, (String) null);
            } else if (length > 1) {
                C72387m.m107043d("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(length));
                C0000N.M0s8NeYn(this.f192654b.f192659a, this.f192653a, NetError.ERR_MISSING_AUTH_CREDENTIALS, (String) null);
            } else if (this.f192653a.lacksPermission(C72382h.f192527a, "android.permission.USE_CREDENTIALS", true)) {
                C72387m.m107041b("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                C0000N.M0s8NeYn(this.f192654b.f192659a, this.f192653a, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, (String) null);
            } else {
                C72438h hVar = this.f192654b;
                hVar.f192663e = accountArr[0];
                hVar.f192660b.getAuthToken(hVar.f192663e, hVar.f192662d, hVar.f192661c, true, new C72437g(this.f192653a, hVar), new Handler(ThreadUtils.m107028a().getLooper()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            C72387m.m107043d("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
            C0000N.M0s8NeYn(this.f192654b.f192659a, this.f192653a, -9, (String) null);
        }
    }
}
