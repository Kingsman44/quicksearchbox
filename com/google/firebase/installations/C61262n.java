package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.n */
/* compiled from: PG */
public final class C61262n {

    /* renamed from: a */
    public static final /* synthetic */ int f165701a = 0;

    /* renamed from: b */
    private static final byte f165702b = Byte.parseByte("01110000", 2);

    /* renamed from: c */
    private static final byte f165703c = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static final String m93742a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & f165703c) | f165702b);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
