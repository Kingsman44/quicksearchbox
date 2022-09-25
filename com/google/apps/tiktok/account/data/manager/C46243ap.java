package com.google.apps.tiktok.account.data.manager;

import android.content.SharedPreferences;
import com.google.apps.tiktok.account.AccountId;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.data.manager.ap */
/* compiled from: PG */
public final class C46243ap {

    /* renamed from: a */
    public final SharedPreferences f121218a;

    /* renamed from: b */
    public final ArrayList f121219b = new ArrayList();

    public C46243ap(SharedPreferences sharedPreferences) {
        this.f121218a = sharedPreferences;
    }

    /* renamed from: c */
    public static String m82506c(int i, String str) {
        return i + "." + str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo50296a() {
        return this.f121218a.getInt("count", 0);
    }

    /* renamed from: b */
    public final String mo50297b(AccountId accountId, String str) {
        return this.f121218a.getString(m82506c(accountId.mo50068a(), str), (String) null);
    }

    /* renamed from: d */
    public final boolean mo50298d(AccountId accountId, String str) {
        return this.f121218a.getBoolean(m82506c(accountId.mo50068a(), str), false);
    }
}
