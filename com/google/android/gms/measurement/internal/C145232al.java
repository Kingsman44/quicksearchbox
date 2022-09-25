package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.core.content.C1882h;
import com.google.android.gms.common.util.C144006f;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.al */
/* compiled from: PG */
public final class C145232al extends C145381fz {

    /* renamed from: a */
    public long f392585a;

    /* renamed from: b */
    public String f392586b;

    /* renamed from: c */
    public Boolean f392587c;

    /* renamed from: d */
    public long f392588d;

    /* renamed from: e */
    private AccountManager f392589e;

    public C145232al(C145361ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo120833a() {
        mo120904g();
        C144006f fVar = this.f393011w.f392924A;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f392588d > 86400000) {
            this.f392587c = null;
        }
        Boolean bool = this.f392587c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C1882h.m5137c(this.f393011w.f392931a, "android.permission.GET_ACCOUNTS") != 0) {
            this.f393011w.mo120965ar().f392799g.mo120894a("Permission error checking for dasher/unicorn accounts");
            this.f392588d = currentTimeMillis;
            this.f392587c = false;
            return false;
        }
        if (this.f392589e == null) {
            this.f392589e = AccountManager.get(this.f393011w.f392931a);
        }
        try {
            Account[] result = this.f392589e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f392589e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f392587c = true;
                    this.f392588d = currentTimeMillis;
                    return true;
                }
                this.f392588d = currentTimeMillis;
                this.f392587c = false;
                return false;
            }
            this.f392587c = true;
            this.f392588d = currentTimeMillis;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f393011w.mo120965ar().f392796d.mo120895b("Exception checking account types", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo120834b() {
        Calendar instance = Calendar.getInstance();
        this.f392585a = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        this.f392586b = lowerCase + "-" + lowerCase2;
        return false;
    }
}
