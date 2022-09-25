package com.google.common.p4535g;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.common.g.b */
/* compiled from: PG */
public final class C59134b {
    /* renamed from: a */
    public static int m91659a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: b */
    public static int m91660b(long j) {
        long j2 = j & 6148914691236517205L;
        long j3 = (j2 | (j2 >>> 1)) & 3689348814741910323L;
        long j4 = (j3 | (j3 >>> 2)) & 1085102592571150095L;
        long j5 = (j4 | (j4 >>> 4)) & 71777214294589695L;
        long j6 = (j5 | (j5 >>> 8)) & 281470681808895L;
        return (int) (j6 | (j6 >>> 16));
    }

    /* renamed from: c */
    public static long m91661c(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = C59161c.m91744a(inputStream);
            j |= ((long) (a & Byte.MAX_VALUE)) << i;
            if ((a & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint.");
    }
}
