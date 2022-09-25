package com.android.p247a.p249b.p253c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.android.a.b.c.d */
/* compiled from: PG */
public final class C5008d {
    /* renamed from: a */
    public static long m13794a(ByteBuffer byteBuffer) {
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: b */
    public static long m13795b(ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    /* renamed from: c */
    public static void m13796c(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.android.p247a.p249b.p252b.C5004e m13797d(com.android.p247a.p249b.p252b.C5002c r9, int r10) {
        /*
            long r0 = r9.f15849c
            r2 = 22
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x000a
            return r4
        L_0x000a:
            long r2 = (long) r10
            r5 = -22
            long r5 = r5 + r0
            long r2 = java.lang.Math.min(r2, r5)
            int r10 = (int) r2
            r2 = 22
            int r10 = r10 + r2
            long r5 = (long) r10
            long r0 = r0 - r5
            java.nio.ByteBuffer r9 = r9.mo9959a(r0, r10)
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            r9.order(r10)
            m13796c(r9)
            int r10 = r9.capacity()
            r3 = -1
            if (r10 >= r2) goto L_0x002d
        L_0x002b:
            r6 = -1
            goto L_0x0051
        L_0x002d:
            int r10 = r10 + -22
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = java.lang.Math.min(r10, r2)
            r5 = 0
        L_0x0037:
            if (r5 > r2) goto L_0x002b
            int r6 = r10 - r5
            int r7 = r9.getInt(r6)
            r8 = 101010256(0x6054b50, float:2.506985E-35)
            if (r7 != r8) goto L_0x004e
            int r7 = r6 + 20
            short r7 = r9.getShort(r7)
            char r7 = (char) r7
            if (r7 != r5) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            int r5 = r5 + 1
            goto L_0x0037
        L_0x0051:
            if (r6 != r3) goto L_0x0054
            return r4
        L_0x0054:
            java.nio.Buffer r10 = r9.position(r6)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            java.nio.ByteBuffer r9 = r9.slice()
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
            r9.order(r10)
            long r2 = (long) r6
            long r0 = r0 + r2
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            com.android.a.b.b.e r0 = new com.android.a.b.b.e
            r0.<init>(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p247a.p249b.p253c.C5008d.m13797d(com.android.a.b.b.c, int):com.android.a.b.b.e");
    }
}
