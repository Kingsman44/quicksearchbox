package com.google.android.libraries.storage.p3304a.p3305a;

import android.accounts.Account;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i;

/* renamed from: com.google.android.libraries.storage.a.a.a */
/* compiled from: PG */
public final class C42714a {

    /* renamed from: a */
    public static final Account f111955a = new Account("shared", "mobstore");

    /* renamed from: a */
    public static Account m75443a(String str) {
        if ("shared".equals(str)) {
            return f111955a;
        }
        int indexOf = str.indexOf(58);
        C42748i.m75526a(indexOf >= 0, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    /* renamed from: b */
    public static String m75444b(Account account) {
        boolean z = true;
        C42748i.m75526a(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        C42748i.m75526a(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) != -1) {
            z = false;
        }
        C42748i.m75526a(z, "Account name contains '/'.", new Object[0]);
        if (f111955a.equals(account)) {
            return "shared";
        }
        String str = account.type;
        String str2 = account.name;
        return str + ":" + str2;
    }

    /* renamed from: c */
    static boolean m75445c(String str) {
        return "shared".equals(str);
    }
}
