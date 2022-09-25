package com.google.android.libraries.gcoreclient.p1757e.p1758a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.C142916p;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21493b;
import com.google.android.libraries.gcoreclient.p1757e.C21494c;
import com.google.android.libraries.gcoreclient.p1757e.C21495d;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.e.a.a */
/* compiled from: PG */
class C21490a implements C21493b {

    /* renamed from: a */
    protected final Context f59919a;

    static {
        TimeUnit.SECONDS.toMillis(2);
    }

    public C21490a(Context context) {
        this.f59919a = context;
    }

    /* renamed from: a */
    public final String mo26965a(String str) {
        try {
            return C142914n.m231858f(this.f59919a, str);
        } catch (UserRecoverableAuthException e) {
            throw new C21495d(e.getMessage(), e.mo117772a(), e);
        } catch (C142903e e2) {
            throw new C21489a((Throwable) e2);
        }
    }

    /* renamed from: b */
    public final String mo26966b(String str, String str2) {
        try {
            return C142914n.m231859g(this.f59919a, new Account(str, "com.google"), str2);
        } catch (C142916p e) {
            throw new C21494c(e.getMessage(), e.mo117772a(), e);
        } catch (UserRecoverableAuthException e2) {
            throw new C21495d(e2.getMessage(), e2.mo117772a());
        } catch (C142903e e3) {
            throw new C21489a((Throwable) e3);
        }
    }

    /* renamed from: c */
    public final String mo26967c(String str, String str2, Bundle bundle) {
        try {
            return C142914n.m231861i(this.f59919a, str, str2, bundle);
        } catch (C142916p e) {
            throw new C21494c(e.getMessage(), e.mo117772a(), e);
        } catch (UserRecoverableAuthException e2) {
            throw new C21495d(e2.getMessage(), e2.mo117772a());
        } catch (C142903e e3) {
            throw new C21489a((Throwable) e3);
        }
    }

    /* renamed from: d */
    public String mo26968d(Account account, String str, Bundle bundle) {
        throw null;
    }

    /* renamed from: e */
    public final void mo26969e(String str) {
        try {
            C142914n.m231867o(this.f59919a, str);
        } catch (C142903e e) {
            throw new IOException(e);
        }
    }
}
