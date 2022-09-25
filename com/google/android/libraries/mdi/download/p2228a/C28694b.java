package com.google.android.libraries.mdi.download.p2228a;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;

/* renamed from: com.google.android.libraries.mdi.download.a.b */
/* compiled from: PG */
public final class C28694b {
    /* renamed from: a */
    public static Account m53576a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            C29045l.m53936h("%s: Unable to parse Account with string = '%s'", "AccountUtil", str);
            return null;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (m53578c(substring2) && m53578c(substring)) {
            return new Account(substring2, substring);
        }
        C29045l.m53937i("%s: Unable to create Account with name = '%s', type = '%s'", "AccountUtil", substring2, substring);
        return null;
    }

    /* renamed from: b */
    public static String m53577b(Account account) {
        String str = account.type;
        String str2 = account.name;
        return str + ":" + str2;
    }

    /* renamed from: c */
    private static boolean m53578c(String str) {
        return str != null && !str.isEmpty() && !str.contains(":") && !str.contains("|");
    }
}
