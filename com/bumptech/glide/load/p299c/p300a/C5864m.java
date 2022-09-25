package com.bumptech.glide.load.p299c.p300a;

import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.c.a.m */
/* compiled from: PG */
final class C5864m {
    /* renamed from: a */
    static final int m15155a(int i, ByteBuffer byteBuffer) {
        if (m15157c(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    /* renamed from: b */
    static final short m15156b(int i, ByteBuffer byteBuffer) {
        if (m15157c(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return -1;
    }

    /* renamed from: c */
    private static final boolean m15157c(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
