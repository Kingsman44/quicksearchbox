package androidx.media3.exoplayer.p152l;

import androidx.media3.exoplayer.p151k.C3252r;

/* renamed from: androidx.media3.exoplayer.l.b */
/* compiled from: PG */
public final class C3263b implements C3252r {
    /* renamed from: b */
    public final void mo6996b() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:88|89|90|91|92|97|98) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4 = androidx.media3.exoplayer.p152l.C3264c.f9800b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0016, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3 = java.net.InetAddress.getByName("time.android.com");
        r4 = new java.net.DatagramSocket();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.setSoTimeout(10000);
        r8 = new byte[48];
        r9 = new java.net.DatagramPacket(r8, 48, r3, 123);
        r8[0] = 27;
        r10 = java.lang.System.currentTimeMillis();
        r12 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r10 != 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.util.Arrays.fill(r8, 40, 48, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r1 = r0;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r18 = r10 / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0057, code lost:
        java.lang.Long.signum(r18);
        r20 = r10 - (r18 * 1000);
        r14 = r18 + 2208988800L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r8[40] = (byte) ((int) (r14 >> 24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006d, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r8[41] = (byte) ((int) (r14 >> 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        r23 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r8[42] = (byte) ((int) (r14 >> 8));
        r8[43] = (byte) ((int) r14);
        r20 = (r20 * 4294967296L) / 1000;
        r8[44] = (byte) ((int) (r20 >> 24));
        r8[45] = (byte) ((int) (r20 >> 16));
        r8[46] = (byte) ((int) (r20 >> 8));
        r8[47] = (byte) ((int) (java.lang.Math.random() * 255.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r3.send(r9);
        r3.receive(new java.net.DatagramPacket(r8, 48));
        r4 = android.os.SystemClock.elapsedRealtime();
        r10 = r10 + (r4 - r12);
        r6 = r8[0];
        r9 = (r6 >> 6) & 3;
        r6 = r6 & 7;
        r13 = r8[1] & 255;
        r14 = androidx.media3.exoplayer.p152l.C3264c.m9496a(r8, 24);
        r17 = androidx.media3.exoplayer.p152l.C3264c.m9496a(r8, 32);
        r7 = androidx.media3.exoplayer.p152l.C3264c.m9496a(r8, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
        if (r9 == 3) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
        if (r6 == 4) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fb, code lost:
        if (r6 != 5) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        throw new java.io.IOException("SNTP: Untrusted mode: " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0110, code lost:
        if (r13 == 0) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0114, code lost:
        if (r13 > 15) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        if (r7 == 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0125, code lost:
        r10 = (r10 + (((r17 - r14) + (r7 - r10)) / 2)) - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r3.close();
        r1 = androidx.media3.exoplayer.p152l.C3264c.f9800b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x012d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        androidx.media3.exoplayer.p152l.C3264c.f9802d = r10;
        androidx.media3.exoplayer.p152l.C3264c.f9801c = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0140, code lost:
        throw new java.io.IOException("SNTP: Zero transmitTime");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0152, code lost:
        throw new java.io.IOException("SNTP: Untrusted stratum: " + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015a, code lost:
        throw new java.io.IOException("SNTP: Unsynchronized server");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x015e, code lost:
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0161, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0162, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0164, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0165, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x016b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016c, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", new java.lang.Class[]{java.lang.Throwable.class}).invoke(r1, new java.lang.Object[]{r3});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0185 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6997c() {
        /*
            r24 = this;
            java.lang.String r0 = "SNTP: Untrusted mode: "
            java.lang.String r1 = "SNTP: Untrusted stratum: "
            java.lang.Object r2 = androidx.media3.exoplayer.p152l.C3264c.f9799a
            monitor-enter(r2)
            java.lang.Object r3 = androidx.media3.exoplayer.p152l.C3264c.f9800b     // Catch:{ all -> 0x018c }
            monitor-enter(r3)     // Catch:{ all -> 0x018c }
            boolean r4 = androidx.media3.exoplayer.p152l.C3264c.f9801c     // Catch:{ all -> 0x0189 }
            if (r4 == 0) goto L_0x0011
            monitor-exit(r3)     // Catch:{ all -> 0x0189 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            return
        L_0x0011:
            monitor-exit(r3)     // Catch:{ all -> 0x0189 }
            java.lang.String r3 = "time.android.com"
            java.lang.Object r4 = androidx.media3.exoplayer.p152l.C3264c.f9800b     // Catch:{ all -> 0x018c }
            monitor-enter(r4)     // Catch:{ all -> 0x018c }
            monitor-exit(r4)     // Catch:{ all -> 0x0186 }
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch:{ all -> 0x018c }
            java.net.DatagramSocket r4 = new java.net.DatagramSocket     // Catch:{ all -> 0x018c }
            r4.<init>()     // Catch:{ all -> 0x018c }
            r5 = 10000(0x2710, float:1.4013E-41)
            r7 = 0
            r4.setSoTimeout(r5)     // Catch:{ all -> 0x0164 }
            r5 = 48
            byte[] r8 = new byte[r5]     // Catch:{ all -> 0x0164 }
            java.net.DatagramPacket r9 = new java.net.DatagramPacket     // Catch:{ all -> 0x0164 }
            r10 = 123(0x7b, float:1.72E-43)
            r9.<init>(r8, r5, r3, r10)     // Catch:{ all -> 0x0164 }
            r3 = 27
            r8[r7] = r3     // Catch:{ all -> 0x0164 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0164 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0164 }
            r14 = 0
            r3 = 24
            r6 = 40
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0053
            java.util.Arrays.fill(r8, r6, r5, r7)     // Catch:{ all -> 0x004e }
            r3 = r4
            goto L_0x00c2
        L_0x004e:
            r0 = move-exception
            r1 = r0
            r3 = r4
            goto L_0x0167
        L_0x0053:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r18 = r10 / r16
            java.lang.Long.signum(r18)
            long r20 = r18 * r16
            long r20 = r10 - r20
            r22 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r14 = r18 + r22
            long r5 = r14 >> r3
            int r6 = (int) r5
            byte r5 = (byte) r6
            r6 = 40
            r8[r6] = r5     // Catch:{ all -> 0x0164 }
            r5 = 16
            r6 = r4
            long r3 = r14 >> r5
            int r4 = (int) r3
            byte r3 = (byte) r4
            r4 = 41
            r8[r4] = r3     // Catch:{ all -> 0x0161 }
            r3 = 8
            r23 = r6
            long r5 = r14 >> r3
            int r6 = (int) r5
            byte r5 = (byte) r6
            r6 = 42
            r8[r6] = r5     // Catch:{ all -> 0x015d }
            int r5 = (int) r14     // Catch:{ all -> 0x015d }
            byte r5 = (byte) r5     // Catch:{ all -> 0x015d }
            r6 = 43
            r8[r6] = r5     // Catch:{ all -> 0x015d }
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            long r20 = r20 * r5
            long r20 = r20 / r16
            r5 = 24
            long r14 = r20 >> r5
            int r5 = (int) r14     // Catch:{ all -> 0x015d }
            byte r5 = (byte) r5     // Catch:{ all -> 0x015d }
            r6 = 44
            r8[r6] = r5     // Catch:{ all -> 0x015d }
            r4 = 16
            long r4 = r20 >> r4
            int r5 = (int) r4     // Catch:{ all -> 0x015d }
            byte r4 = (byte) r5     // Catch:{ all -> 0x015d }
            r5 = 45
            r8[r5] = r4     // Catch:{ all -> 0x015d }
            long r3 = r20 >> r3
            int r4 = (int) r3     // Catch:{ all -> 0x015d }
            byte r3 = (byte) r4     // Catch:{ all -> 0x015d }
            r4 = 46
            r8[r4] = r3     // Catch:{ all -> 0x015d }
            double r3 = java.lang.Math.random()     // Catch:{ all -> 0x015d }
            r5 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r3 = r3 * r5
            int r3 = (int) r3     // Catch:{ all -> 0x015d }
            byte r3 = (byte) r3     // Catch:{ all -> 0x015d }
            r4 = 47
            r8[r4] = r3     // Catch:{ all -> 0x015d }
            r3 = r23
        L_0x00c2:
            r3.send(r9)     // Catch:{ all -> 0x015b }
            java.net.DatagramPacket r4 = new java.net.DatagramPacket     // Catch:{ all -> 0x015b }
            r5 = 48
            r4.<init>(r8, r5)     // Catch:{ all -> 0x015b }
            r3.receive(r4)     // Catch:{ all -> 0x015b }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x015b }
            long r12 = r4 - r12
            long r10 = r10 + r12
            byte r6 = r8[r7]     // Catch:{ all -> 0x015b }
            int r9 = r6 >> 6
            r12 = 3
            r9 = r9 & r12
            r6 = r6 & 7
            r13 = 1
            byte r14 = r8[r13]     // Catch:{ all -> 0x015b }
            r13 = r14 & 255(0xff, float:3.57E-43)
            r14 = 24
            long r14 = androidx.media3.exoplayer.p152l.C3264c.m9496a(r8, r14)     // Catch:{ all -> 0x015b }
            r7 = 32
            long r17 = androidx.media3.exoplayer.p152l.C3264c.m9496a(r8, r7)     // Catch:{ all -> 0x015b }
            r7 = 40
            long r7 = androidx.media3.exoplayer.p152l.C3264c.m9496a(r8, r7)     // Catch:{ all -> 0x015b }
            if (r9 == r12) goto L_0x0153
            r9 = 4
            if (r6 == r9) goto L_0x0110
            r9 = 5
            if (r6 != r9) goto L_0x00fe
            goto L_0x0110
        L_0x00fe:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r4.<init>(r0)     // Catch:{ all -> 0x015b }
            r4.append(r6)     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x015b }
            r1.<init>(r0)     // Catch:{ all -> 0x015b }
            throw r1     // Catch:{ all -> 0x015b }
        L_0x0110:
            if (r13 == 0) goto L_0x0141
            r0 = 15
            if (r13 > r0) goto L_0x0141
            r19 = 0
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            long r17 = r17 - r14
            long r7 = r7 - r10
            long r17 = r17 + r7
            r0 = 2
            long r17 = r17 / r0
            long r10 = r10 + r17
            long r10 = r10 - r4
            r3.close()     // Catch:{ all -> 0x018c }
            java.lang.Object r1 = androidx.media3.exoplayer.p152l.C3264c.f9800b     // Catch:{ all -> 0x018c }
            monitor-enter(r1)     // Catch:{ all -> 0x018c }
            androidx.media3.exoplayer.p152l.C3264c.f9802d = r10     // Catch:{ all -> 0x0136 }
            r3 = 1
            androidx.media3.exoplayer.p152l.C3264c.f9801c = r3     // Catch:{ all -> 0x0136 }
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            return
        L_0x0136:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x0139:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015b }
            java.lang.String r1 = "SNTP: Zero transmitTime"
            r0.<init>(r1)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x0141:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015b }
            r4.<init>(r1)     // Catch:{ all -> 0x015b }
            r4.append(r13)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x015b }
            r0.<init>(r1)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x0153:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015b }
            java.lang.String r1 = "SNTP: Unsynchronized server"
            r0.<init>(r1)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x015b:
            r0 = move-exception
            goto L_0x0166
        L_0x015d:
            r0 = move-exception
            r3 = r23
            goto L_0x0166
        L_0x0161:
            r0 = move-exception
            r3 = r6
            goto L_0x0166
        L_0x0164:
            r0 = move-exception
            r3 = r4
        L_0x0166:
            r1 = r0
        L_0x0167:
            r3.close()     // Catch:{ all -> 0x016b }
            goto L_0x0185
        L_0x016b:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0185 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x0185 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x0185 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0185 }
            r4[r5] = r3     // Catch:{ Exception -> 0x0185 }
            r0.invoke(r1, r4)     // Catch:{ Exception -> 0x0185 }
        L_0x0185:
            throw r1     // Catch:{ all -> 0x018c }
        L_0x0186:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0186 }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x0189:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0189 }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p152l.C3263b.mo6997c():void");
    }
}
