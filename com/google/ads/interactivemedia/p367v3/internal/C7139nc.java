package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nc */
/* compiled from: PG */
public final class C7139nc {

    /* renamed from: a */
    public final boolean f23044a;

    /* renamed from: b */
    public final String f23045b;

    /* renamed from: c */
    public final C7072kq f23046c;

    /* renamed from: d */
    public final int f23047d;

    /* renamed from: e */
    public final byte[] f23048e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r5.equals("cens") != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r5.equals("cenc") != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r5.equals("cbcs") != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r5.equals("cbc1") != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r6 = new java.lang.StringBuilder(r5.length() + 68);
        r6.append("Unsupported protection scheme type '");
        r6.append(r5);
        r6.append("'. Assuming AES-CTR crypto mode.");
        android.util.Log.w("TrackEncryptionBox", r6.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7139nc(boolean r4, java.lang.String r5, int r6, byte[] r7, int r8, int r9, byte[] r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r10 != 0) goto L_0x000d
            r0 = 1
        L_0x000d:
            r0 = r0 ^ r2
            com.google.ads.interactivemedia.p367v3.internal.ary.m19462o(r0)
            r3.f23044a = r4
            r3.f23045b = r5
            r3.f23047d = r6
            r3.f23048e = r10
            com.google.ads.interactivemedia.v3.internal.kq r4 = new com.google.ads.interactivemedia.v3.internal.kq
            if (r5 != 0) goto L_0x001e
            goto L_0x006d
        L_0x001e:
            int r6 = r5.hashCode()
            r10 = 2
            switch(r6) {
                case 3046605: goto L_0x0042;
                case 3046671: goto L_0x0039;
                case 3049879: goto L_0x0030;
                case 3049895: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x004c
        L_0x0027:
            java.lang.String r6 = "cens"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004c
            goto L_0x006d
        L_0x0030:
            java.lang.String r6 = "cenc"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004c
            goto L_0x006d
        L_0x0039:
            java.lang.String r6 = "cbcs"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004c
            goto L_0x004a
        L_0x0042:
            java.lang.String r6 = "cbc1"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x004c
        L_0x004a:
            r1 = 2
            goto L_0x006d
        L_0x004c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r10 = r5.length()
            int r10 = r10 + 68
            r6.<init>(r10)
            java.lang.String r10 = "Unsupported protection scheme type '"
            r6.append(r10)
            r6.append(r5)
            java.lang.String r5 = "'. Assuming AES-CTR crypto mode."
            r6.append(r5)
            java.lang.String r5 = "TrackEncryptionBox"
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
        L_0x006d:
            r4.<init>(r1, r7, r8, r9)
            r3.f23046c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7139nc.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
