package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asi */
/* compiled from: PG */
final class asi extends ars {

    /* renamed from: a */
    static final ars f21488a = new asi((Object) null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final transient Object[] f21489b;

    /* renamed from: c */
    private final transient Object f21490c;

    /* renamed from: d */
    private final transient int f21491d;

    private asi(Object obj, Object[] objArr, int i) {
        this.f21490c = obj;
        this.f21489b = objArr;
        this.f21491d = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v3 ?, r2v5 ?, r2v4 ?, r2v6 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: k */
    static com.google.ads.interactivemedia.p367v3.internal.asi m19496k(int r10, java.lang.Object[] r11) {
        /*
            if (r10 != 0) goto L_0x0007
            com.google.ads.interactivemedia.v3.internal.ars r10 = f21488a
            com.google.ads.interactivemedia.v3.internal.asi r10 = (com.google.ads.interactivemedia.p367v3.internal.asi) r10
            return r10
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 != r2) goto L_0x0019
            r10 = r11[r1]
            r1 = r11[r2]
            com.google.ads.interactivemedia.p367v3.internal.ary.m19459l(r10, r1)
            com.google.ads.interactivemedia.v3.internal.asi r10 = new com.google.ads.interactivemedia.v3.internal.asi
            r10.<init>(r0, r11, r2)
            return r10
        L_0x0019:
            int r3 = r11.length
            int r3 = r3 >> r2
            com.google.ads.interactivemedia.p367v3.internal.aqd.m19284l(r10, r3)
            int r3 = com.google.ads.interactivemedia.p367v3.internal.arx.m19440i(r10)
            if (r10 != r2) goto L_0x002e
            r10 = r11[r1]
            r1 = r11[r2]
            com.google.ads.interactivemedia.p367v3.internal.ary.m19459l(r10, r1)
            r10 = 1
            goto L_0x00e2
        L_0x002e:
            int r0 = r3 + -1
            r2 = 128(0x80, float:1.794E-43)
            r4 = -1
            if (r3 > r2) goto L_0x0070
            byte[] r2 = new byte[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x003a:
            if (r1 >= r10) goto L_0x006d
            int r3 = r1 + r1
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.ads.interactivemedia.p367v3.internal.ary.m19459l(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.ads.interactivemedia.p367v3.internal.ary.m19449b(r6)
        L_0x004f:
            r6 = r6 & r0
            byte r7 = r2[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x005d
            byte r3 = (byte) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x003a
        L_0x005d:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0068
            int r6 = r6 + 1
            goto L_0x004f
        L_0x0068:
            java.lang.IllegalArgumentException r10 = m19497l(r4, r5, r11, r7)
            throw r10
        L_0x006d:
            r0 = r2
            goto L_0x00e2
        L_0x0070:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r3 > r2) goto L_0x00ae
            short[] r2 = new short[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x007a:
            if (r1 >= r10) goto L_0x006d
            int r3 = r1 + r1
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.ads.interactivemedia.p367v3.internal.ary.m19459l(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.ads.interactivemedia.p367v3.internal.ary.m19449b(r6)
        L_0x008f:
            r6 = r6 & r0
            short r7 = r2[r6]
            char r7 = (char) r7
            r8 = 65535(0xffff, float:9.1834E-41)
            if (r7 != r8) goto L_0x009e
            short r3 = (short) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009e:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00a9
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00a9:
            java.lang.IllegalArgumentException r10 = m19497l(r4, r5, r11, r7)
            throw r10
        L_0x00ae:
            int[] r2 = new int[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x00b3:
            if (r1 >= r10) goto L_0x006d
            int r3 = r1 + r1
            r5 = r11[r3]
            r6 = r3 ^ 1
            r6 = r11[r6]
            com.google.ads.interactivemedia.p367v3.internal.ary.m19459l(r5, r6)
            int r7 = r5.hashCode()
            int r7 = com.google.ads.interactivemedia.p367v3.internal.ary.m19449b(r7)
        L_0x00c8:
            r7 = r7 & r0
            r8 = r2[r7]
            if (r8 != r4) goto L_0x00d2
            r2[r7] = r3
            int r1 = r1 + 1
            goto L_0x00b3
        L_0x00d2:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00dd
            int r7 = r7 + 1
            goto L_0x00c8
        L_0x00dd:
            java.lang.IllegalArgumentException r10 = m19497l(r5, r6, r11, r8)
            throw r10
        L_0x00e2:
            com.google.ads.interactivemedia.v3.internal.asi r1 = new com.google.ads.interactivemedia.v3.internal.asi
            r1.<init>(r0, r11, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.asi.m19496k(int, java.lang.Object[]):com.google.ads.interactivemedia.v3.internal.asi");
    }

    /* renamed from: l */
    private static IllegalArgumentException m19497l(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public final arx mo15318f() {
        return new asf(this, this.f21489b, this.f21491d);
    }

    /* renamed from: g */
    public final arx mo15319g() {
        return new asg(this, new ash(this.f21489b, 0, this.f21491d));
    }

    public final Object get(Object obj) {
        Object obj2 = this.f21490c;
        Object[] objArr = this.f21489b;
        int i = this.f21491d;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[0].equals(obj)) {
                return null;
            }
            return objArr[1];
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int b = ary.m19449b(obj.hashCode());
                while (true) {
                    int i2 = b & length;
                    byte b2 = bArr[i2] & 255;
                    if (b2 == 255) {
                        return null;
                    }
                    if (objArr[b2].equals(obj)) {
                        return objArr[b2 ^ 1];
                    }
                    b = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int b3 = ary.m19449b(obj.hashCode());
                while (true) {
                    int i3 = b3 & length2;
                    char c = (char) sArr[i3];
                    if (c == 65535) {
                        return null;
                    }
                    if (objArr[c].equals(obj)) {
                        return objArr[c ^ 1];
                    }
                    b3 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int b4 = ary.m19449b(obj.hashCode());
                while (true) {
                    int i4 = b4 & length3;
                    int i5 = iArr[i4];
                    if (i5 == -1) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return objArr[i5 ^ 1];
                    }
                    b4 = i4 + 1;
                }
            }
        }
    }

    /* renamed from: i */
    public final arj mo15323i() {
        return new ash(this.f21489b, 1, this.f21491d);
    }

    /* renamed from: j */
    public final boolean mo15325j() {
        return false;
    }

    public final int size() {
        return this.f21491d;
    }
}
