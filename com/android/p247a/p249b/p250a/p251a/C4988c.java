package com.android.p247a.p249b.p250a.p251a;

import com.android.p247a.p248a.C4981a;
import com.android.p247a.p249b.p250a.C4991b;
import com.android.p247a.p249b.p250a.C4993d;
import com.android.p247a.p249b.p250a.C4994e;
import com.android.p247a.p249b.p250a.C4996g;
import com.android.p247a.p249b.p250a.C4997h;
import com.android.p247a.p249b.p252b.C5001b;
import com.android.p247a.p249b.p252b.C5003d;
import com.android.p247a.p249b.p252b.C5004e;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.android.a.b.a.a.c */
/* compiled from: PG */
final class C4988c {
    /* renamed from: a */
    public static X509Certificate m13767a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, byte[] bArr, C4991b bVar) {
        byte[] e = C4993d.m13779e(byteBuffer);
        try {
            C5003d dVar = new C5003d((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(e)), e);
            bVar.f15812b.add(dVar);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(e);
            byte[] digest = instance.digest();
            if (Arrays.equals(bArr, digest)) {
                return dVar;
            }
            bVar.mo9921b(27, C4993d.m13775a(digest), C4993d.m13775a(bArr));
            return null;
        } catch (CertificateException e2) {
            bVar.mo9921b(18, e2);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0063 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13768b(java.nio.ByteBuffer r8, java.security.cert.X509Certificate r9, com.android.p247a.p249b.p250a.C4991b r10) {
        /*
            java.nio.ByteBuffer r8 = com.android.p247a.p249b.p250a.C4993d.m13776b(r8)
            r0 = 0
            r1 = 0
        L_0x0006:
            boolean r2 = r8.hasRemaining()
            if (r2 == 0) goto L_0x00c1
            r2 = 1
            int r1 = r1 + r2
            java.nio.ByteBuffer r3 = com.android.p247a.p249b.p250a.C4993d.m13776b(r8)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            int r4 = r3.getInt()     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            int r5 = r3.remaining()     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            byte[] r5 = new byte[r5]     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r3.get(r5)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r3 = -1654455305(0xffffffff9d6303f7, float:-3.004525E-21)
            if (r4 != r3) goto L_0x0079
            r3 = 34
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            java.nio.ByteBuffer r4 = r4.order(r5)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            java.util.List r4 = com.android.p247a.p249b.p250a.p251a.C4987b.m13766a(r4)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            r5 = 0
        L_0x0035:
            int r6 = r4.size()     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            if (r5 >= r6) goto L_0x004b
            java.util.List r6 = r10.f15813c     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            java.lang.Object r7 = r4.get(r5)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            com.android.a.b.a.a.a r7 = (com.android.p247a.p249b.p250a.p251a.C4986a) r7     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            java.security.cert.X509Certificate r7 = r7.f15806a     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            r6.add(r7)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            int r5 = r5 + 1
            goto L_0x0035
        L_0x004b:
            java.util.List r4 = r10.f15813c     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            int r5 = r4.size()     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            int r5 = r5 + -1
            java.lang.Object r4 = r4.get(r5)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            boolean r4 = r9.equals(r4)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            if (r4 != 0) goto L_0x0006
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            r10.mo9921b(r3, r4)     // Catch:{ SecurityException -> 0x0071, IllegalArgumentException -> 0x006b, Exception -> 0x0063 }
            goto L_0x0006
        L_0x0063:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r4 = 33
            r10.mo9921b(r4, r3)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            goto L_0x0006
        L_0x006b:
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r10.mo9921b(r3, r4)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            goto L_0x0006
        L_0x0071:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r4 = 35
            r10.mo9921b(r4, r3)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            goto L_0x0006
        L_0x0079:
            r3 = -465807034(0xffffffffe43c5946, float:-1.3897683E22)
            if (r4 != r3) goto L_0x00a5
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            java.nio.ByteBuffer r3 = r3.order(r4)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            long r3 = r3.getLong()     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0096
            r10.f15811a = r3     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            goto L_0x0006
        L_0x0096:
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r5[r0] = r3     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r3 = 38
            r10.mo9921b(r3, r5)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            goto L_0x0006
        L_0x00a5:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r3[r0] = r4     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            r4 = 32
            r10.mo9920a(r4, r3)     // Catch:{ a | BufferUnderflowException -> 0x00b4 }
            goto L_0x0006
        L_0x00b4:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r8[r0] = r9
            r9 = 31
            r10.mo9921b(r9, r8)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p247a.p249b.p250a.p251a.C4988c.m13768b(java.nio.ByteBuffer, java.security.cert.X509Certificate, com.android.a.b.a.b):void");
    }

    /* renamed from: c */
    public static void m13769c(byte[] bArr, int i, X509Certificate x509Certificate, ByteBuffer byteBuffer, C4991b bVar) {
        ArrayList arrayList = new ArrayList(1);
        int i2 = 0;
        while (byteBuffer.hasRemaining()) {
            i2++;
            try {
                ByteBuffer b = C4993d.m13776b(byteBuffer);
                int i3 = b.getInt();
                byte[] e = C4993d.m13779e(b);
                C4997h a = C4997h.m13783a(i3);
                if (a == null) {
                    bVar.mo9920a(19, Integer.valueOf(i3));
                } else {
                    arrayList.add(new C4994e(a, e));
                }
            } catch (C4981a | BufferUnderflowException unused) {
                bVar.mo9921b(20, Integer.valueOf(i2));
                return;
            }
        }
        if (arrayList.isEmpty()) {
            bVar.mo9921b(17, new Object[0]);
            return;
        }
        try {
            for (C4994e eVar : C4993d.m13781g(arrayList, i)) {
                C4997h hVar = eVar.f15820a;
                C5004e eVar2 = hVar.f15842n;
                String str = (String) eVar2.f15852a;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) eVar2.f15853b;
                PublicKey publicKey = ((C5001b) x509Certificate).f15846a.getPublicKey();
                try {
                    Signature instance = Signature.getInstance(str);
                    instance.initVerify(publicKey);
                    if (algorithmParameterSpec != null) {
                        instance.setParameter(algorithmParameterSpec);
                    }
                    instance.update(bArr);
                    if (!instance.verify(eVar.f15821b)) {
                        bVar.mo9921b(21, hVar);
                        return;
                    }
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e2) {
                    bVar.mo9921b(22, hVar, e2);
                    return;
                }
            }
        } catch (C4996g e3) {
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C4994e eVar3 = (C4994e) arrayList.get(i4);
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(eVar3.f15820a);
            }
            bVar.mo9921b(26, sb.toString(), e3);
        }
    }
}
