package com.google.android.apps.gsa.sidekick.main.p7201d;

import android.accounts.Account;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.d.a */
/* compiled from: PG */
public final class C91284a {
    /* renamed from: a */
    public static String m149219a(Account account) {
        try {
            String str = account.type + "|" + account.name;
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(str.getBytes());
            return Base64.encodeToString(instance.digest(), 3);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError("SHA1 unsupported");
        }
    }
}
