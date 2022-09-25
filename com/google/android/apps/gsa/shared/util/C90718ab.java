package com.google.android.apps.gsa.shared.util;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.shared.util.ab */
/* compiled from: PG */
public final class C90718ab {
    /* renamed from: a */
    public static String m148168a(AccountManager accountManager) {
        C58838bb.m90883r(accountManager != null);
        String str = null;
        for (Account account : accountManager.getAccountsByType("com.google")) {
            if (account.name.endsWith("@google.com")) {
                if (str != null) {
                    return null;
                }
                str = account.name;
            }
        }
        return str;
    }
}
