package com.android.p247a.p249b.p253c;

import java.nio.ByteBuffer;

/* renamed from: com.android.a.b.c.c */
/* compiled from: PG */
public final class C5007c {
    static {
        ByteBuffer.allocate(0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0192 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m13793a(com.android.p247a.p249b.p252b.C5002c r25, com.android.p247a.p249b.p253c.C5005a r26, long r27) {
        /*
            r0 = r26
            r1 = r27
            java.lang.String r3 = "Unexpected size of uncompressed data of "
            java.lang.String r4 = "Data of entry "
            long r5 = r0.f15858e
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x02d0
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r5)
            com.android.a.b.b.a r12 = new com.android.a.b.b.a
            r12.<init>(r6)
            java.lang.String r6 = r0.f15860g
            int r7 = r0.f15861h
            int r8 = r7 + 30
            long r9 = r0.f15859f
            long r13 = (long) r8
            long r13 = r13 + r9
            java.lang.String r11 = ", CD start: "
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 > 0) goto L_0x02ac
            r15 = r25
            java.nio.ByteBuffer r8 = r15.mo9959a(r9, r8)     // Catch:{ IOException -> 0x029e }
            java.nio.ByteOrder r13 = java.nio.ByteOrder.LITTLE_ENDIAN
            r8.order(r13)
            int r13 = r8.getInt()
            r14 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r13 != r14) goto L_0x0277
            r13 = 6
            short r13 = r8.getShort(r13)
            r13 = r13 & 8
            if (r13 == 0) goto L_0x004c
            r13 = 1
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            short r14 = r0.f15854a
            r14 = r14 & 8
            if (r14 == 0) goto L_0x0055
            r14 = 1
            goto L_0x0056
        L_0x0055:
            r14 = 0
        L_0x0056:
            java.lang.String r15 = ", CD: "
            r16 = r11
            java.lang.String r11 = ". LFH: "
            if (r13 != r14) goto L_0x0257
            r22 = r4
            r23 = r5
            long r4 = r0.f15856c
            long r1 = r0.f15857d
            r17 = r9
            long r9 = r0.f15858e
            if (r13 != 0) goto L_0x00eb
            r13 = 14
            long r13 = com.android.p247a.p249b.p253c.C5008d.m13795b(r8, r13)
            int r19 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r19 != 0) goto L_0x00cb
            r4 = 18
            long r4 = com.android.p247a.p249b.p253c.C5008d.m13795b(r8, r4)
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x00ab
            r4 = 22
            long r4 = com.android.p247a.p249b.p253c.C5008d.m13795b(r8, r4)
            int r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x008b
            goto L_0x00eb
        L_0x008b:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Uncompressed size mismatch between Local File Header and Central Directory for entry "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r11)
            r1.append(r4)
            r1.append(r15)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Compressed size mismatch between Local File Header and Central Directory for entry "
            r3.<init>(r7)
            r3.append(r6)
            r3.append(r11)
            r3.append(r4)
            r3.append(r15)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x00cb:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CRC-32 mismatch between Local File Header and Central Directory for entry "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r11)
            r1.append(r13)
            r1.append(r15)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00eb:
            r4 = 26
            short r4 = r8.getShort(r4)
            char r4 = (char) r4
            java.lang.String r5 = " bytes"
            if (r4 > r7) goto L_0x0232
            r7 = 30
            java.lang.String r11 = com.android.p247a.p249b.p253c.C5005a.m13789a(r8, r7, r4)
            boolean r13 = r6.equals(r11)
            if (r13 == 0) goto L_0x0211
            r11 = 28
            short r8 = r8.getShort(r11)
            char r8 = (char) r8
            r13 = 30
            long r13 = r17 + r13
            r19 = r1
            long r1 = (long) r4
            long r13 = r13 + r1
            long r1 = (long) r8
            long r13 = r13 + r1
            short r0 = r0.f15855b
            if (r0 == 0) goto L_0x0119
            r1 = 1
            goto L_0x011a
        L_0x0119:
            r1 = 0
        L_0x011a:
            if (r0 == 0) goto L_0x011e
            r11 = r8
            goto L_0x0121
        L_0x011e:
            r11 = r8
            r19 = r9
        L_0x0121:
            long r7 = r13 + r19
            r24 = r3
            r2 = r27
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01e5
            r0 = 30
            int r4 = r4 + r0
            int r4 = r4 + r11
            long r2 = (long) r4
            long r17 = r17 + r2
            if (r1 == 0) goto L_0x01b6
            com.android.a.b.c.b r2 = new com.android.a.b.c.b     // Catch:{ IOException -> 0x0193 }
            r2.<init>(r12)     // Catch:{ IOException -> 0x0193 }
            r16 = r25
            r21 = r2
            r16.mo9960c(r17, r19, r21)     // Catch:{ all -> 0x0172 }
            long r3 = r2.f15862a     // Catch:{ all -> 0x0172 }
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x014b
            r2.close()     // Catch:{ IOException -> 0x0193 }
            goto L_0x01bf
        L_0x014b:
            com.android.a.d.a r0 = new com.android.a.d.a     // Catch:{ all -> 0x0172 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0172 }
            r8 = r24
            r7.<init>(r8)     // Catch:{ all -> 0x0172 }
            r7.append(r6)     // Catch:{ all -> 0x0172 }
            java.lang.String r8 = ". Expected: "
            r7.append(r8)     // Catch:{ all -> 0x0172 }
            r7.append(r9)     // Catch:{ all -> 0x0172 }
            java.lang.String r8 = " bytes, actual: "
            r7.append(r8)     // Catch:{ all -> 0x0172 }
            r7.append(r3)     // Catch:{ all -> 0x0172 }
            r7.append(r5)     // Catch:{ all -> 0x0172 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0172 }
            r0.<init>(r3)     // Catch:{ all -> 0x0172 }
            throw r0     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch:{ all -> 0x0178 }
            goto L_0x0192
        L_0x0178:
            r0 = move-exception
            r2 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0192 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x0192 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r7, r0)     // Catch:{ Exception -> 0x0192 }
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0192 }
            r7[r5] = r2     // Catch:{ Exception -> 0x0192 }
            r0.invoke(r3, r7)     // Catch:{ Exception -> 0x0192 }
        L_0x0192:
            throw r3     // Catch:{ IOException -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ IOException -> 0x01c0 }
            boolean r2 = r2 instanceof java.util.zip.DataFormatException     // Catch:{ IOException -> 0x01c0 }
            if (r2 == 0) goto L_0x01b5
            com.android.a.d.a r2 = new com.android.a.d.a     // Catch:{ IOException -> 0x01c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01c0 }
            r4 = r22
            r3.<init>(r4)     // Catch:{ IOException -> 0x01c0 }
            r3.append(r6)     // Catch:{ IOException -> 0x01c0 }
            java.lang.String r4 = " malformed"
            r3.append(r4)     // Catch:{ IOException -> 0x01c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x01c0 }
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x01c0 }
            throw r2     // Catch:{ IOException -> 0x01c0 }
        L_0x01b5:
            throw r0     // Catch:{ IOException -> 0x01c0 }
        L_0x01b6:
            r7 = r25
            r8 = r17
            r10 = r19
            r7.mo9960c(r8, r10, r12)     // Catch:{ IOException -> 0x01c0 }
        L_0x01bf:
            return r23
        L_0x01c0:
            r0 = move-exception
            r2 = 1
            if (r2 == r1) goto L_0x01c7
            java.lang.String r1 = "uncompressed"
            goto L_0x01c9
        L_0x01c7:
            java.lang.String r1 = "compressed"
        L_0x01c9:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to read data of "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " entry "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x01e5:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Local File Header data of "
            r1.<init>(r4)
            r1.append(r6)
            java.lang.String r4 = " overlaps with Central Directory. LFH data start: "
            r1.append(r4)
            r1.append(r13)
            java.lang.String r4 = ", LFH data end: "
            r1.append(r4)
            r1.append(r7)
            r4 = r16
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0211:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Name mismatch between Local File Header and Central Directory. LFH: \""
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = "\", CD: \""
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = "\""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0232:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Name mismatch between Local File Header and Central Directory for entry"
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r11)
            r1.append(r4)
            java.lang.String r2 = " bytes, CD: "
            r1.append(r2)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0257:
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Data Descriptor presence mismatch between Local File Header and Central Directory for entry "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r11)
            r1.append(r13)
            r1.append(r15)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0277:
            com.android.a.d.a r0 = new com.android.a.d.a
            long r1 = (long) r13
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Not a Local File Header record for entry "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = ". Signature: 0x"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x029e:
            r0 = move-exception
            r1 = r0
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Failed to read Local File Header of "
            java.lang.String r2 = r2.concat(r6)
            r0.<init>(r2, r1)
            throw r0
        L_0x02ac:
            r2 = r1
            r4 = r11
            com.android.a.d.a r0 = new com.android.a.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Local File Header of "
            r1.<init>(r5)
            r1.append(r6)
            java.lang.String r5 = " extends beyond start of Central Directory. LFH end: "
            r1.append(r5)
            r1.append(r13)
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02d0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = r0.f15860g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " too large: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p247a.p249b.p253c.C5007c.m13793a(com.android.a.b.b.c, com.android.a.b.c.a, long):byte[]");
    }
}
