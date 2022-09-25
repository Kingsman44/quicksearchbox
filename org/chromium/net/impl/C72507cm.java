package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* renamed from: org.chromium.net.impl.cm */
/* compiled from: PG */
public final class C72507cm {
    /* renamed from: a */
    public static void m107214a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    /* renamed from: b */
    public static void m107215b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
