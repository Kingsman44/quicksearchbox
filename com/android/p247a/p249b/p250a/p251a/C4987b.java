package com.android.p247a.p249b.p250a.p251a;

/* renamed from: com.android.a.b.a.a.b */
/* compiled from: PG */
public final class C4987b {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0122, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012d, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0131, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        throw new java.lang.SecurityException("Failed to decode certificate #" + r5 + r17, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0173, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0197, code lost:
        throw new java.io.IOException("Failed to parse SourceStampCertificateLineage object", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0118 A[ExcHandler: CertificateException (e java.security.cert.CertificateException), PHI: r5 r17 
      PHI: (r5v5 int) = (r5v0 int), (r5v7 int) binds: [B:57:0x0142, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v4 java.lang.String) = (r17v3 java.lang.String), (r17v9 java.lang.String) binds: [B:57:0x0142, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE], Splitter:B:24:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0122 A[ExcHandler: CertificateException (e java.security.cert.CertificateException), PHI: r1 r5 
      PHI: (r1v6 java.lang.String) = (r1v0 java.lang.String), (r1v9 java.lang.String), (r1v9 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x001c, B:13:0x0029, B:17:0x0031, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v3 int) = (r5v0 int), (r5v6 int), (r5v7 int), (r5v7 int) binds: [B:8:0x001c, B:13:0x0029, B:17:0x0031, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018c A[ExcHandler: a | BufferUnderflowException (r0v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x001c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m13766a(java.nio.ByteBuffer r18) {
        /*
            java.lang.String r1 = " when parsing SourceStampCertificateLineage object"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            if (r18 == 0) goto L_0x01a2
            boolean r4 = r18.hasRemaining()
            if (r4 != 0) goto L_0x0012
            goto L_0x01a2
        L_0x0012:
            com.android.p247a.p249b.p250a.C4993d.m13777c(r18)
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch:{ CertificateException -> 0x0198 }
            r5 = 0
            int r6 = r18.getInt()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0172, InvalidKeyException -> 0x0170, InvalidAlgorithmParameterException -> 0x016e, SignatureException -> 0x016c, CertificateException -> 0x0122 }
            r7 = 1
            if (r6 != r7) goto L_0x0140
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0172, InvalidKeyException -> 0x0170, InvalidAlgorithmParameterException -> 0x016e, SignatureException -> 0x016c, CertificateException -> 0x0122 }
            r6.<init>()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0172, InvalidKeyException -> 0x0170, InvalidAlgorithmParameterException -> 0x016e, SignatureException -> 0x016c, CertificateException -> 0x0122 }
            r7 = 0
        L_0x0029:
            boolean r8 = r18.hasRemaining()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0139, InvalidKeyException -> 0x0137, InvalidAlgorithmParameterException -> 0x0135, SignatureException -> 0x0133, CertificateException -> 0x0122 }
            if (r8 == 0) goto L_0x0130
            int r5 = r5 + 1
            java.nio.ByteBuffer r8 = com.android.p247a.p249b.p250a.C4993d.m13776b(r18)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.nio.ByteBuffer r9 = com.android.p247a.p249b.p250a.C4993d.m13776b(r8)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            int r15 = r8.getInt()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            int r16 = r8.getInt()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            com.android.a.b.a.h r10 = com.android.p247a.p249b.p250a.C4997h.m13783a(r7)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            byte[] r14 = com.android.p247a.p249b.p250a.C4993d.m13779e(r8)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.lang.String r11 = " when verifying SourceStampCertificateLineage object"
            if (r3 == 0) goto L_0x0097
            com.android.a.b.b.e r10 = r10.f15842n     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.lang.Object r12 = r10.f15852a     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.lang.Object r10 = r10.f15853b     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.security.spec.AlgorithmParameterSpec r10 = (java.security.spec.AlgorithmParameterSpec) r10     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.security.cert.X509Certificate r13 = r3.f15846a     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            java.security.PublicKey r13 = r13.getPublicKey()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x012c, InvalidKeyException -> 0x012a, InvalidAlgorithmParameterException -> 0x0128, SignatureException -> 0x0126, CertificateException -> 0x0122 }
            r17 = r1
            java.security.Signature r1 = java.security.Signature.getInstance(r12)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r1.initVerify(r13)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            if (r10 == 0) goto L_0x006b
            r1.setParameter(r10)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
        L_0x006b:
            r1.update(r9)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            boolean r1 = r1.verify(r14)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            if (r1 == 0) goto L_0x0075
            goto L_0x0099
        L_0x0075:
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.<init>()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r3 = "Unable to verify signature of certificate #"
            r2.append(r3)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.append(r5)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r3 = " using "
            r2.append(r3)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.append(r12)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.append(r11)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r1.<init>(r2)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            throw r1     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
        L_0x0097:
            r17 = r1
        L_0x0099:
            java.nio.Buffer r1 = r9.rewind()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            byte[] r1 = com.android.p247a.p249b.p250a.C4993d.m13779e(r9)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            int r9 = r9.getInt()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            if (r3 == 0) goto L_0x00ca
            if (r7 != r9) goto L_0x00ac
            goto L_0x00ca
        L_0x00ac:
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r3.<init>()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r4 = "Signing algorithm ID mismatch for certificate #"
            r3.append(r4)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r3.append(r2)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r3.append(r11)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r2 = r3.toString()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r1.<init>(r2)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            throw r1     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
        L_0x00ca:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r3.<init>(r1)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.security.cert.Certificate r3 = r4.generateCertificate(r3)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            com.android.a.b.b.d r7 = new com.android.a.b.b.d     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r7.<init>(r3, r1)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            boolean r1 = r6.contains(r7)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            if (r1 != 0) goto L_0x00fc
            r6.add(r7)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            com.android.a.b.a.a.a r1 = new com.android.a.b.a.a.a     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            com.android.a.b.a.h r12 = com.android.p247a.p249b.p250a.C4997h.m13783a(r9)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            com.android.a.b.a.h r13 = com.android.p247a.p249b.p250a.C4997h.m13783a(r16)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r10 = r1
            r11 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.add(r1)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r3 = r7
            r7 = r16
            r1 = r17
            goto L_0x0029
        L_0x00fc:
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.<init>()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r3 = "Encountered duplicate entries in SigningCertificateLineage at certificate #"
            r2.append(r3)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r2.append(r5)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r3 = ".  All signing certificates should be unique"
            r2.append(r3)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            r1.<init>(r2)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
            throw r1     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0120, InvalidKeyException -> 0x011e, InvalidAlgorithmParameterException -> 0x011c, SignatureException -> 0x011a, CertificateException -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            goto L_0x0131
        L_0x011a:
            r0 = move-exception
            goto L_0x0151
        L_0x011c:
            r0 = move-exception
            goto L_0x0151
        L_0x011e:
            r0 = move-exception
            goto L_0x0151
        L_0x0120:
            r0 = move-exception
            goto L_0x0151
        L_0x0122:
            r0 = move-exception
            r17 = r1
            goto L_0x0131
        L_0x0126:
            r0 = move-exception
            goto L_0x012d
        L_0x0128:
            r0 = move-exception
            goto L_0x012d
        L_0x012a:
            r0 = move-exception
            goto L_0x012d
        L_0x012c:
            r0 = move-exception
        L_0x012d:
            r17 = r1
            goto L_0x0151
        L_0x0130:
            return r2
        L_0x0131:
            r1 = r0
            goto L_0x0153
        L_0x0133:
            r0 = move-exception
            goto L_0x013a
        L_0x0135:
            r0 = move-exception
            goto L_0x013a
        L_0x0137:
            r0 = move-exception
            goto L_0x013a
        L_0x0139:
            r0 = move-exception
        L_0x013a:
            r17 = r1
            goto L_0x0151
        L_0x013d:
            r4 = r17
            goto L_0x0175
        L_0x0140:
            r17 = r1
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0150, InvalidKeyException -> 0x014e, InvalidAlgorithmParameterException -> 0x014c, SignatureException -> 0x014a, CertificateException -> 0x0118 }
            java.lang.String r2 = "Encoded SigningCertificateLineage has a version different than any of which we are aware"
            r1.<init>(r2)     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0150, InvalidKeyException -> 0x014e, InvalidAlgorithmParameterException -> 0x014c, SignatureException -> 0x014a, CertificateException -> 0x0118 }
            throw r1     // Catch:{ a -> 0x018e, BufferUnderflowException -> 0x018c, NoSuchAlgorithmException -> 0x0150, InvalidKeyException -> 0x014e, InvalidAlgorithmParameterException -> 0x014c, SignatureException -> 0x014a, CertificateException -> 0x0118 }
        L_0x014a:
            r0 = move-exception
            goto L_0x0151
        L_0x014c:
            r0 = move-exception
            goto L_0x0151
        L_0x014e:
            r0 = move-exception
            goto L_0x0151
        L_0x0150:
            r0 = move-exception
        L_0x0151:
            r1 = r0
            goto L_0x013d
        L_0x0153:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to decode certificate #"
            r3.<init>(r4)
            r3.append(r5)
            r4 = r17
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
        L_0x016c:
            r0 = move-exception
            goto L_0x0173
        L_0x016e:
            r0 = move-exception
            goto L_0x0173
        L_0x0170:
            r0 = move-exception
            goto L_0x0173
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            r4 = r1
            r1 = r0
        L_0x0175:
            java.lang.SecurityException r2 = new java.lang.SecurityException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to verify signature over signed data for certificate #"
            r3.<init>(r6)
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
        L_0x018c:
            r0 = move-exception
            goto L_0x018f
        L_0x018e:
            r0 = move-exception
        L_0x018f:
            r1 = r0
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Failed to parse SourceStampCertificateLineage object"
            r2.<init>(r3, r1)
            throw r2
        L_0x0198:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Failed to obtain X.509 CertificateFactory"
            r2.<init>(r3, r1)
            throw r2
        L_0x01a2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p247a.p249b.p250a.p251a.C4987b.m13766a(java.nio.ByteBuffer):java.util.List");
    }
}
