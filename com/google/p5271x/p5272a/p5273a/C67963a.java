package com.google.p5271x.p5272a.p5273a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.x.a.a.a */
/* compiled from: PG */
public final class C67963a {

    /* renamed from: a */
    private static final Charset f184181a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Long m98221a(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f184181a));
            return Long.valueOf(ByteBuffer.wrap(instance.digest()).getLong());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
