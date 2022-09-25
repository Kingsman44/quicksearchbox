package com.google.common.p4537i;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.common.i.ac */
/* compiled from: PG */
final class C59273ac extends C59282g {

    /* renamed from: a */
    private long f157391a = 0;

    /* renamed from: b */
    private long f157392b = 0;

    /* renamed from: c */
    private int f157393c = 0;

    /* renamed from: m */
    private static long m92030m(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* renamed from: n */
    private static long m92031n(long j) {
        return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
    }

    /* renamed from: o */
    private static long m92032o(long j) {
        return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C59289n mo56751h() {
        long j = this.f157391a;
        long j2 = (long) this.f157393c;
        long j3 = this.f157392b ^ j2;
        long j4 = (j ^ j2) + j3;
        this.f157391a = j4;
        long j5 = j3 + j4;
        this.f157392b = j5;
        long m = m92030m(j4);
        this.f157391a = m;
        long m2 = m92030m(j5);
        long j6 = m + m2;
        this.f157391a = j6;
        this.f157392b = m2 + j6;
        return C59289n.m92110g(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f157391a).putLong(this.f157392b).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo56752k(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long n = m92031n(j) ^ this.f157391a;
        this.f157391a = n;
        long rotateLeft = Long.rotateLeft(n, 27);
        long j3 = this.f157392b;
        this.f157391a = ((rotateLeft + j3) * 5) + 1390208809;
        long o = m92032o(j2) ^ j3;
        this.f157392b = o;
        this.f157392b = ((Long.rotateLeft(o, 31) + this.f157391a) * 5) + 944331445;
        this.f157393c += 16;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        r7 = r7 ^ ((long) (r14.get(8) & 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
        r0 = r14.getLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        r0 = (((long) (r14.get(5) & 255)) << 40) ^ r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        r0 = r0 ^ (((long) (r14.get(4) & 255)) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        r0 = r0 ^ (((long) (r14.get(3) & 255)) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        r0 = r0 ^ (((long) (r14.get(2) & 255)) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        r0 = r0 ^ (((long) (r14.get(1) & 255)) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
        r0 = r0 ^ ((long) (r14.get(0) & 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        r13.f157391a = m92031n(r0) ^ r13.f157391a;
        r13.f157392b ^= m92032o(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r7 = r7 ^ (((long) (r14.get(13) & 255)) << 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        r7 = r7 ^ (((long) (r14.get(12) & 255)) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        r7 = r7 ^ (((long) (r14.get(11) & 255)) << 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0052, code lost:
        r7 = r7 ^ (((long) (r14.get(10) & 255)) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005d, code lost:
        r7 = r7 ^ (((long) (r14.get(9) & 255)) << 8);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56753l(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            int r0 = r13.f157393c
            int r1 = r14.remaining()
            int r0 = r0 + r1
            r13.f157393c = r0
            int r0 = r14.remaining()
            r1 = 40
            r2 = 32
            r3 = 24
            r4 = 16
            r5 = 48
            r6 = 8
            r7 = 0
            switch(r0) {
                case 1: goto L_0x00bd;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00a5;
                case 4: goto L_0x0098;
                case 5: goto L_0x008c;
                case 6: goto L_0x007f;
                case 7: goto L_0x0075;
                case 8: goto L_0x0070;
                case 9: goto L_0x0068;
                case 10: goto L_0x005d;
                case 11: goto L_0x0052;
                case 12: goto L_0x0047;
                case 13: goto L_0x003c;
                case 14: goto L_0x0030;
                case 15: goto L_0x0026;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.AssertionError r14 = new java.lang.AssertionError
            java.lang.String r0 = "Should never get here."
            r14.<init>(r0)
            throw r14
        L_0x0026:
            r0 = 14
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r7 = (long) r0
            long r7 = r7 << r5
        L_0x0030:
            r0 = 13
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r9 = (long) r0
            long r0 = r9 << r1
            long r7 = r7 ^ r0
        L_0x003c:
            r0 = 12
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r2
            long r7 = r7 ^ r0
        L_0x0047:
            r0 = 11
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r3
            long r7 = r7 ^ r0
        L_0x0052:
            r0 = 10
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r4
            long r7 = r7 ^ r0
        L_0x005d:
            r0 = 9
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 << r6
            long r7 = r7 ^ r0
        L_0x0068:
            byte r0 = r14.get(r6)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r7 = r7 ^ r0
        L_0x0070:
            long r0 = r14.getLong()
            goto L_0x00c7
        L_0x0075:
            r0 = 6
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r9 = (long) r0
            long r9 = r9 << r5
            goto L_0x0080
        L_0x007f:
            r9 = r7
        L_0x0080:
            r0 = 5
            byte r0 = r14.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r11 = (long) r0
            long r0 = r11 << r1
            long r0 = r0 ^ r9
            goto L_0x008d
        L_0x008c:
            r0 = r7
        L_0x008d:
            r5 = 4
            byte r5 = r14.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r9 = (long) r5
            long r9 = r9 << r2
            long r0 = r0 ^ r9
            goto L_0x0099
        L_0x0098:
            r0 = r7
        L_0x0099:
            r2 = 3
            byte r2 = r14.get(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r9 = (long) r2
            long r2 = r9 << r3
            long r0 = r0 ^ r2
            goto L_0x00a6
        L_0x00a5:
            r0 = r7
        L_0x00a6:
            r2 = 2
            byte r2 = r14.get(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            long r2 = r2 << r4
            long r0 = r0 ^ r2
            goto L_0x00b2
        L_0x00b1:
            r0 = r7
        L_0x00b2:
            r2 = 1
            byte r2 = r14.get(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            long r2 = r2 << r6
            long r0 = r0 ^ r2
            goto L_0x00be
        L_0x00bd:
            r0 = r7
        L_0x00be:
            r2 = 0
            byte r14 = r14.get(r2)
            r14 = r14 & 255(0xff, float:3.57E-43)
            long r2 = (long) r14
            long r0 = r0 ^ r2
        L_0x00c7:
            long r2 = r13.f157391a
            long r0 = m92031n(r0)
            long r0 = r0 ^ r2
            r13.f157391a = r0
            long r0 = r13.f157392b
            long r2 = m92032o(r7)
            long r0 = r0 ^ r2
            r13.f157392b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4537i.C59273ac.mo56753l(java.nio.ByteBuffer):void");
    }
}
