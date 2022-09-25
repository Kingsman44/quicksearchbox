package com.google.android.gms.libs.p10829a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.os.Handler;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.gms.libs.a.a */
/* compiled from: PG */
public final class C144832a {

    /* renamed from: a */
    private final AccountManager f391669a;

    private C144832a(AccountManager accountManager) {
        this.f391669a = accountManager;
    }

    /* renamed from: a */
    public static C144832a m235378a(Context context) {
        return new C144832a(AccountManager.get(context));
    }

    /* renamed from: b */
    public final AccountManagerFuture mo120246b(String[] strArr) {
        C47558bi a = C47831fm.m85006a("AccountManager.getAccountsByTypeAndFeatures");
        try {
            AccountManagerFuture<Account[]> accountsByTypeAndFeatures = this.f391669a.getAccountsByTypeAndFeatures("com.google", strArr, (AccountManagerCallback) null, (Handler) null);
            a.close();
            return accountsByTypeAndFeatures;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
