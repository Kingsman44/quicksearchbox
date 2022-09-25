package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.google.common.i.f */
/* compiled from: PG */
abstract class C59281f extends C59277b {
    /* renamed from: a */
    public final C59289n mo56759a(CharSequence charSequence, Charset charset) {
        byte[] bytes = charSequence.toString().getBytes(charset);
        return mo56761d(bytes, bytes.length);
    }

    /* renamed from: b */
    public final C59289n mo56760b(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer order = ByteBuffer.allocate(length + length).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            order.putChar(charSequence.charAt(i));
        }
        byte[] array = order.array();
        return mo56761d(array, array.length);
    }

    /* renamed from: c */
    public final C59291p mo56765c(int i) {
        C58838bb.m90868c(i >= 0);
        return new C59279d(this, i);
    }

    /* renamed from: e */
    public final C59291p mo56748e() {
        return mo56765c(32);
    }
}
