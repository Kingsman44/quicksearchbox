package com.google.android.libraries.p1704e;

import com.google.android.libraries.p1733g.C21407a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.e.a */
/* compiled from: PG */
public final class C20675a {

    /* renamed from: a */
    private static volatile boolean f57959a;

    /* renamed from: a */
    public static String m38858a(String str, String str2) {
        if (str == null || str2 == null || f57959a) {
            return null;
        }
        try {
            String format = String.format(Locale.US, "%s:%d:%s", new Object[]{str, 1, str2});
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(format.getBytes("UTF-8"));
            return C21407a.m40530a(instance.digest()).toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException unused) {
            f57959a = true;
            throw new Exception("No SHA-256 algorithm");
        }
    }

    /* renamed from: b */
    public static String m38859b(String str) {
        if (str == null) {
            return null;
        }
        return String.format(Locale.US, "%016x", new Object[]{Long.valueOf(Long.parseLong(str) & -2)});
    }
}
