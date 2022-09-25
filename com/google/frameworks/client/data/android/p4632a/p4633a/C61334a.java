package com.google.frameworks.client.data.android.p4632a.p4633a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.p1730f.C21370a;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import com.google.frameworks.client.data.android.p4632a.C61347h;
import com.google.frameworks.client.data.android.p4632a.C61352m;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.frameworks.client.data.android.a.a.a */
/* compiled from: PG */
public final class C61334a implements C61352m {

    /* renamed from: a */
    private final AccountManager f165866a;

    /* renamed from: b */
    private final C21370a f165867b;

    /* renamed from: c */
    private final Handler f165868c;

    /* renamed from: d */
    private final boolean f165869d;

    public C61334a(Context context, C21370a aVar, Handler handler, boolean z) {
        this.f165866a = AccountManager.get(context);
        this.f165867b = aVar;
        handler.getClass();
        this.f165868c = handler;
        this.f165869d = z;
    }

    /* renamed from: a */
    public final C61347h mo57905a(Account account, String str) {
        Long l;
        try {
            Bundle result = this.f165866a.getAuthToken(account, str, (Bundle) null, false, (AccountManagerCallback) null, this.f165868c).getResult(1, TimeUnit.MINUTES);
            String string = result.getString("authtoken");
            if (string != null) {
                long j = result.getLong("android.accounts.expiry");
                if (j == 0) {
                    l = null;
                } else {
                    l = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j));
                }
                return new C61347h(string, this.f165867b.mo26870b(), l);
            }
            String string2 = result.getString("errorMessage");
            Intent intent = (Intent) result.getParcelable("intent");
            if (intent == null) {
                int i = result.getInt("errorCode");
                if (this.f165869d) {
                    if (i == 1 || i == 3 || i == 4) {
                        throw new IOException(string2);
                    }
                    throw new C61346g(new C142903e(string2));
                } else if (i == 3) {
                    throw new IOException(string2);
                } else if (i != 5) {
                    throw new IllegalStateException("Unrecognized or missing error code: " + i);
                } else {
                    throw new C61346g(new C142903e(string2));
                }
            } else {
                throw new C61346g(new UserRecoverableAuthException(string2, intent));
            }
        } catch (AuthenticatorException e) {
            if (this.f165869d) {
                throw new C61346g(new C142903e((Throwable) e));
            }
            throw new C61346g(e);
        } catch (OperationCanceledException e2) {
            if (this.f165869d) {
                throw new IOException(e2);
            }
            throw new C61346g(e2);
        }
    }

    /* renamed from: b */
    public final void mo57906b(String str) {
        this.f165866a.invalidateAuthToken("com.google", str);
    }
}
