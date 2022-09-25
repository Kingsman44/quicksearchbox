package com.google.apps.tiktok.contrib.work.p3631b;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.contrib.work.b.an */
/* compiled from: PG */
public final class C46528an {
    /* renamed from: a */
    public static AccountId m82961a(Set set) {
        Iterator it = set.iterator();
        Integer num = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("account_id_")) {
                C58838bb.m90884s(num == null, "Account ID already found. This work is tagged for two accounts.");
                num = Integer.valueOf(Integer.parseInt(str.replace("account_id_", BuildConfig.FLAVOR)));
            }
        }
        if (num != null && num.intValue() != -1) {
            return AccountId.m82057b(num.intValue());
        }
        throw new IllegalArgumentException("Input set had no valid account in it.");
    }

    /* renamed from: b */
    public static String m82962b(AccountId accountId, String str) {
        String c = m82963c(accountId);
        return "unique_" + str + c;
    }

    /* renamed from: c */
    static String m82963c(AccountId accountId) {
        C58838bb.m90868c(accountId.mo50068a() != -1);
        int a = accountId.mo50068a();
        return "account_id_" + a;
    }
}
