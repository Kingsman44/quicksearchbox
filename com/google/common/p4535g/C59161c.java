package com.google.common.p4535g;

import java.io.IOException;
import java.io.InputStream;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.common.g.c */
/* compiled from: PG */
public final class C59161c {
    /* renamed from: a */
    public static byte m91744a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (byte) (read & PrivateKeyType.INVALID);
        }
        throw new IOException("EOF");
    }
}
