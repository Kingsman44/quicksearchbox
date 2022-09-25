package com.google.android.gms.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.common.util.a */
/* compiled from: PG */
public final class C143997a {

    /* renamed from: a */
    public static volatile int f390236a = -1;

    /* renamed from: a */
    public static MessageDigest m234179a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
