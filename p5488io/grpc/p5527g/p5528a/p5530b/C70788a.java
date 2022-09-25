package p5488io.grpc.p5527g.p5528a.p5530b;

/* renamed from: io.grpc.g.a.b.a */
/* compiled from: PG */
public final class C70788a {

    /* renamed from: a */
    public String f188774a;

    /* renamed from: b */
    public String f188775b;

    /* renamed from: c */
    public int f188776c = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        if ((r12 - r10) == 0) goto L_0x0090;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress m103538b(java.lang.String r16, int r17) {
        /*
            r0 = r16
            r1 = r17
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = -1
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000f:
            r11 = 0
            if (r7 >= r1) goto L_0x00c2
            if (r8 != r2) goto L_0x0015
            return r11
        L_0x0015:
            int r12 = r7 + 2
            r13 = 255(0xff, float:3.57E-43)
            if (r12 > r1) goto L_0x0032
            java.lang.String r15 = "::"
            r14 = 2
            boolean r14 = r0.regionMatches(r7, r15, r4, r14)
            if (r14 == 0) goto L_0x0032
            if (r9 == r5) goto L_0x0027
            return r11
        L_0x0027:
            int r8 = r8 + 2
            if (r12 != r1) goto L_0x002e
            r9 = r8
            goto L_0x00c2
        L_0x002e:
            r9 = r8
            r10 = r12
            goto L_0x0092
        L_0x0032:
            if (r8 == 0) goto L_0x0091
            java.lang.String r12 = ":"
            boolean r12 = r0.regionMatches(r7, r12, r4, r6)
            if (r12 == 0) goto L_0x003f
            int r7 = r7 + 1
            goto L_0x0091
        L_0x003f:
            java.lang.String r12 = "."
            boolean r6 = r0.regionMatches(r7, r12, r4, r6)
            if (r6 == 0) goto L_0x0090
            int r6 = r8 + -2
            r7 = r6
        L_0x004a:
            if (r10 >= r1) goto L_0x0089
            if (r7 != r2) goto L_0x004f
            goto L_0x0090
        L_0x004f:
            if (r7 == r6) goto L_0x005b
            char r12 = r0.charAt(r10)
            r14 = 46
            if (r12 != r14) goto L_0x0090
            int r10 = r10 + 1
        L_0x005b:
            r12 = r10
            r14 = 0
        L_0x005d:
            if (r12 >= r1) goto L_0x007c
            char r15 = r0.charAt(r12)
            r4 = 48
            if (r15 < r4) goto L_0x007c
            r4 = 57
            if (r15 <= r4) goto L_0x006c
            goto L_0x007c
        L_0x006c:
            if (r14 != 0) goto L_0x0071
            if (r10 != r12) goto L_0x0090
            r14 = 0
        L_0x0071:
            int r14 = r14 * 10
            int r14 = r14 + r15
            int r14 = r14 + -48
            if (r14 > r13) goto L_0x0090
            int r12 = r12 + 1
            r4 = 0
            goto L_0x005d
        L_0x007c:
            int r4 = r12 - r10
            if (r4 == 0) goto L_0x0090
            int r4 = r7 + 1
            byte r10 = (byte) r14
            r3[r7] = r10
            r7 = r4
            r10 = r12
            r4 = 0
            goto L_0x004a
        L_0x0089:
            r0 = 4
            int r6 = r6 + r0
            if (r7 != r6) goto L_0x0090
            int r8 = r8 + 2
            goto L_0x00c2
        L_0x0090:
            return r11
        L_0x0091:
            r10 = r7
        L_0x0092:
            r7 = r10
            r4 = 0
        L_0x0094:
            if (r7 >= r1) goto L_0x00a7
            char r12 = r0.charAt(r7)
            int r12 = p5488io.grpc.p5527g.p5528a.p5530b.C70789b.m103540a(r12)
            if (r12 != r5) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            int r4 = r4 << 4
            int r4 = r4 + r12
            int r7 = r7 + 1
            goto L_0x0094
        L_0x00a7:
            int r12 = r7 - r10
            if (r12 == 0) goto L_0x00c1
            r14 = 4
            if (r12 <= r14) goto L_0x00af
            goto L_0x00c1
        L_0x00af:
            int r11 = r8 + 1
            int r12 = r4 >>> 8
            r12 = r12 & r13
            byte r12 = (byte) r12
            r3[r8] = r12
            int r8 = r11 + 1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3[r11] = r4
            r4 = 0
            goto L_0x000f
        L_0x00c1:
            return r11
        L_0x00c2:
            if (r8 == r2) goto L_0x00d4
            if (r9 != r5) goto L_0x00c7
            return r11
        L_0x00c7:
            int r0 = r8 - r9
            int r1 = 16 - r0
            java.lang.System.arraycopy(r3, r9, r3, r1, r0)
            int r2 = r2 - r8
            int r2 = r2 + r9
            r0 = 0
            java.util.Arrays.fill(r3, r9, r2, r0)
        L_0x00d4:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00d9 }
            return r0
        L_0x00d9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            goto L_0x00e0
        L_0x00df:
            throw r0
        L_0x00e0:
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.p5528a.p5530b.C70788a.m103538b(java.lang.String, int):java.net.InetAddress");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo62486a() {
        int i = this.f188776c;
        return i != -1 ? i : C70789b.m103541b(this.f188774a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f188774a);
        sb.append("://");
        if (this.f188775b.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f188775b);
            sb.append(']');
        } else {
            sb.append(this.f188775b);
        }
        int a = mo62486a();
        if (a != C70789b.m103541b(this.f188774a)) {
            sb.append(':');
            sb.append(a);
        }
        return sb.toString();
    }
}
