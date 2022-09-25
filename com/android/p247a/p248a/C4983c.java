package com.android.p247a.p248a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.android.a.a.c */
/* compiled from: PG */
public final class C4983c {
    /* renamed from: a */
    public static byte[] m13764a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 is not found", e);
        }
    }
}
