package com.android.p247a;

import com.android.p247a.p248a.C4981a;
import com.android.p247a.p248a.C4983c;
import com.android.p247a.p249b.p250a.C4993d;
import com.android.p247a.p249b.p250a.C4995f;
import com.android.p247a.p249b.p250a.C4997h;
import com.android.p247a.p249b.p252b.C5002c;
import com.android.p247a.p249b.p252b.C5003d;
import com.android.p247a.p249b.p253c.C5005a;
import com.android.p247a.p249b.p253c.C5007c;
import com.android.p247a.p255d.C5012a;
import com.android.p247a.p255d.C5013b;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.a.e */
/* compiled from: PG */
public final class C5014e {
    /* renamed from: a */
    public static void m13803a(ByteBuffer byteBuffer, int i, Map map, C5011d dVar) {
        int i2 = 1;
        int i3 = 2;
        boolean z = i == 2;
        try {
            ByteBuffer b = C4993d.m13776b(byteBuffer);
            if (!b.hasRemaining()) {
                if (i != 2) {
                    i3 = 10;
                }
                dVar.mo9968b(i3, new Object[0]);
                return;
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                while (b.hasRemaining()) {
                    C4984b bVar = new C4984b();
                    if (z) {
                        dVar.f15874b.add(bVar);
                    } else {
                        dVar.f15875c.add(bVar);
                    }
                    try {
                        m13805c(C4993d.m13776b(b), i, instance, map, bVar);
                    } catch (C4981a | BufferUnderflowException unused) {
                        bVar.mo9916a(true != z ? 11 : 3, new Object[0]);
                        return;
                    }
                }
            } catch (CertificateException e) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e);
            }
        } catch (C4981a unused2) {
            if (i != 2) {
                i2 = 9;
            }
            dVar.mo9968b(i2, new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02fd, code lost:
        r1 = r0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0300, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0305, code lost:
        r1 = r0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0307, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0309, code lost:
        r5.mo9967a(30, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0143, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0144, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r4 = (java.nio.ByteBuffer) r9.limit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d9, code lost:
        throw new com.android.p247a.p248a.C4981a("Malformed ZIP Central Directory record #" + (r12 + 1) + " at file offset " + (r2 + ((long) r13)), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0202, code lost:
        r1 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x020e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0210, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0212, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0213, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024f, code lost:
        r12 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02fc A[ExcHandler: NoSuchAlgorithmException (r0v4 'e' java.security.NoSuchAlgorithmException A[CUSTOM_DECLARE]), Splitter:B:6:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0300 A[ExcHandler: a | a | IOException (r0v3 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:6:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[ExcHandler: j (unused com.android.a.b.a.j), SYNTHETIC, Splitter:B:1:0x000e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.android.p247a.C5011d m13804b(com.android.p247a.p249b.p252b.C5002c r32, int r33, int r34) {
        /*
            r1 = r32
            java.lang.String r2 = "ZIP Central Directory too large: "
            java.lang.String r3 = "ZIP Central Directory overlaps with End of Central Directory. CD end: "
            java.lang.String r4 = "ZIP Central Directory start offset out of range: "
            com.android.a.d r5 = new com.android.a.d
            r5.<init>()
            r7 = 0
            long r8 = r1.f15849c     // Catch:{ a -> 0x0324, IOException -> 0x0322, a -> 0x0320, NoSuchAlgorithmException -> 0x0312, j -> 0x0309 }
            r10 = 22
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0018
            r8 = 0
            goto L_0x0025
        L_0x0018:
            com.android.a.b.b.e r8 = com.android.p247a.p249b.p253c.C5008d.m13797d(r1, r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r8 != 0) goto L_0x0025
            r8 = 65535(0xffff, float:9.1834E-41)
            com.android.a.b.b.e r8 = com.android.p247a.p249b.p253c.C5008d.m13797d(r1, r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x0025:
            if (r8 == 0) goto L_0x02f4
            java.lang.Object r9 = r8.f15852a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.Object r8 = r8.f15853b     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r10 = r8.longValue()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r9.order(r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.p247a.p249b.p253c.C5008d.m13796c(r9)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r8 = r9.position()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r8 = r8 + 16
            long r14 = com.android.p247a.p249b.p253c.C5008d.m13795b(r9, r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x02da
            com.android.p247a.p249b.p253c.C5008d.m13796c(r9)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r4 = r9.position()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r4 = r4 + 12
            long r16 = com.android.p247a.p249b.p253c.C5008d.m13795b(r9, r4)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r12 = r14 + r16
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x02c0
            com.android.p247a.p249b.p253c.C5008d.m13796c(r9)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r3 = r9.position()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r3 = r3 + 10
            short r3 = r9.getShort(r3)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            char r3 = (char) r3     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.a.d.b r4 = new com.android.a.d.b     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r13 = r4
            r18 = r3
            r19 = r10
            r13.<init>(r14, r16, r18, r19)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r9 = r4.f15881b     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x02ae
            long r2 = r4.f15880a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r10 = (int) r9     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r9 = r1.mo9959a(r2, r10)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r9.order(r10)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r10 = r4.f15882c     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r11.<init>(r10)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r12 = 0
        L_0x0091:
            if (r12 >= r10) goto L_0x01da
            int r13 = r9.position()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.p247a.p249b.p253c.C5008d.m13796c(r9)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r14 = r9.remaining()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r15 = " bytes"
            r8 = 46
            if (r14 < r8) goto L_0x0192
            int r8 = r9.position()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r14 = r9.getInt()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r7 = 33639248(0x2014b50, float:9.499037E-38)
            if (r14 != r7) goto L_0x0177
            int r7 = r8 + 8
            java.nio.Buffer r7 = r9.position(r7)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            short r19 = r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            short r20 = r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r21 = com.android.p247a.p249b.p253c.C5008d.m13794a(r9)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r23 = com.android.p247a.p249b.p253c.C5008d.m13794a(r9)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r25 = com.android.p247a.p249b.p253c.C5008d.m13794a(r9)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            short r7 = r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            char r7 = (char) r7     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            short r14 = r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            char r14 = (char) r14     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            short r6 = r9.getShort()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            char r6 = (char) r6     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r31 = r10
            int r10 = r8 + 42
            java.nio.Buffer r10 = r9.position(r10)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r27 = com.android.p247a.p249b.p253c.C5008d.m13794a(r9)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.Buffer r10 = r9.position(r8)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r10 = r7 + 46
            int r10 = r10 + r14
            int r10 = r10 + r6
            int r6 = r9.remaining()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r10 > r6) goto L_0x014c
            int r6 = r8 + 46
            java.lang.String r29 = com.android.p247a.p249b.p253c.C5005a.m13789a(r9, r6, r7)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.Buffer r6 = r9.position(r8)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r6 = r9.limit()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r8 = r8 + r10
            java.nio.Buffer r10 = r9.limit(r8)     // Catch:{ all -> 0x0143 }
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10     // Catch:{ all -> 0x0143 }
            r9.slice()     // Catch:{ all -> 0x0143 }
            java.nio.Buffer r6 = r9.limit(r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.Buffer r6 = r9.position(r8)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.a.b.c.a r6 = new com.android.a.b.c.a     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r18 = r6
            r30 = r7
            r18.<init>(r19, r20, r21, r23, r25, r27, r29, r30)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r7 = r6.f15860g     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r8 = "/"
            boolean r7 = r7.endsWith(r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r7 != 0) goto L_0x013c
            r11.add(r6)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x013c:
            int r12 = r12 + 1
            r10 = r31
            r7 = 0
            goto L_0x0091
        L_0x0143:
            r0 = move-exception
            r1 = r0
            java.nio.Buffer r4 = r9.limit(r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x014c:
            com.android.a.d.a r1 = new com.android.a.d.a     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r4 = r9.remaining()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.<init>()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r7 = "Input too short. Need: "
            r6.append(r7)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r10)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r7 = " bytes, available: "
            r6.append(r7)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r4)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r15)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r4 = r6.toString()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.BufferUnderflowException r6 = new java.nio.BufferUnderflowException     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.<init>()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r4, r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x0177:
            com.android.a.d.a r1 = new com.android.a.d.a     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r4 = "Not a Central Directory record. Signature: 0x"
            long r6 = (long) r14     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            java.lang.String r6 = java.lang.Long.toHexString(r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r4 = r4.concat(r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r4)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x0192:
            com.android.a.d.a r1 = new com.android.a.d.a     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            int r4 = r9.remaining()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.<init>()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r7 = "Input too short. Need at least: 46 bytes, available: "
            r6.append(r7)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r4)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r15)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r4 = r6.toString()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.BufferUnderflowException r6 = new java.nio.BufferUnderflowException     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.<init>()     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r4, r6)     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x01b5, a -> 0x0304, IOException -> 0x0302, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x01b5:
            r0 = move-exception
            r1 = r0
            com.android.a.a.a r4 = new com.android.a.a.a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6 = 1
            int r12 = r12 + r6
            long r6 = (long) r13     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            long r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.<init>()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r7 = "Malformed ZIP Central Directory record #"
            r6.append(r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r12)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r7 = " at file offset "
            r6.append(r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.append(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r2 = r6.toString()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r4.<init>(r2, r1)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r4     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x01da:
            java.util.Iterator r2 = r11.iterator()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x01de:
            boolean r3 = r2.hasNext()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r3 == 0) goto L_0x01f5
            java.lang.Object r3 = r2.next()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.a.b.c.a r3 = (com.android.p247a.p249b.p253c.C5005a) r3     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r6 = "stamp-cert-sha256"
            java.lang.String r7 = r3.f15860g     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            boolean r6 = r6.equals(r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r6 == 0) goto L_0x01de
            goto L_0x01f6
        L_0x01f5:
            r3 = 0
        L_0x01f6:
            r2 = 1845461005(0x6dff800d, float:9.884185E27)
            if (r3 != 0) goto L_0x0216
            com.android.p247a.p249b.p250a.C4993d.m13780f(r1, r4, r2)     // Catch:{ j -> 0x0202, a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc }
            r1 = 24
        L_0x0200:
            r2 = 0
            goto L_0x0205
        L_0x0202:
            r1 = 25
            goto L_0x0200
        L_0x0205:
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ a -> 0x0212, IOException -> 0x0210, a -> 0x020e, NoSuchAlgorithmException -> 0x020b, j -> 0x0309 }
            r5.mo9967a(r1, r3)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            return r5
        L_0x020b:
            r0 = move-exception
            goto L_0x0314
        L_0x020e:
            r0 = move-exception
            goto L_0x0213
        L_0x0210:
            r0 = move-exception
            goto L_0x0213
        L_0x0212:
            r0 = move-exception
        L_0x0213:
            r1 = r0
            goto L_0x0307
        L_0x0216:
            long r6 = r4.f15880a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            byte[] r19 = com.android.p247a.p249b.p253c.C5007c.m13793a(r1, r3, r6)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3.<init>()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6 = -262969152(0xfffffffff05368c0, float:-2.6171189E29)
            com.android.a.b.a.i r6 = com.android.p247a.p249b.p250a.C4993d.m13780f(r1, r4, r6)     // Catch:{ j -> 0x0229, a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc }
            goto L_0x022b
        L_0x0229:
            r6 = 0
        L_0x022b:
            if (r6 == 0) goto L_0x0241
            java.util.EnumMap r7 = new java.util.EnumMap     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.Class<com.android.a.b.a.f> r8 = com.android.p247a.p249b.p250a.C4995f.class
            r7.<init>(r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r6 = r6.f15844a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r8 = 3
            m13803a(r6, r8, r7, r5)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3.put(r6, r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x0241:
            boolean r6 = r3.isEmpty()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r6 == 0) goto L_0x0267
            r6 = 1896449818(0x7109871a, float:6.810044E29)
            com.android.a.b.a.i r12 = com.android.p247a.p249b.p250a.C4993d.m13780f(r1, r4, r6)     // Catch:{ j -> 0x024f, a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc }
            goto L_0x0251
        L_0x024f:
            r12 = 0
        L_0x0251:
            if (r12 == 0) goto L_0x0267
            java.util.EnumMap r6 = new java.util.EnumMap     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.Class<com.android.a.b.a.f> r7 = com.android.p247a.p249b.p250a.C4995f.class
            r6.<init>(r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r7 = r12.f15844a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r8 = 2
            m13803a(r7, r8, r6, r5)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3.put(r7, r6)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x0267:
            boolean r6 = r3.isEmpty()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r6 == 0) goto L_0x0279
            java.util.Map r6 = m13806d(r11, r1, r4, r5)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3.put(r8, r6)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x0279:
            com.android.a.b.a.a r6 = new com.android.a.b.a.a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r6.<init>()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.a.b.a.i r1 = com.android.p247a.p249b.p250a.C4993d.m13780f(r1, r4, r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.nio.ByteBuffer r1 = r1.f15844a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r18 = r1
            r20 = r3
            r21 = r33
            r22 = r34
            r23 = r6
            com.android.p247a.p249b.p250a.p251a.C4990e.m13770a(r18, r19, r20, r21, r22, r23)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            boolean r1 = r6.f15802a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r5.f15877e = r1     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.util.List r1 = r6.f15803b     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            boolean r1 = r1.isEmpty()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            if (r1 != 0) goto L_0x02ad
            com.android.a.c r1 = new com.android.a.c     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.util.List r2 = r6.f15803b     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            com.android.a.b.a.b r2 = (com.android.p247a.p249b.p250a.C4991b) r2     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r5.f15876d = r1     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x02ad:
            return r5
        L_0x02ae:
            com.android.a.a.a r1 = new com.android.a.a.a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3.<init>(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r3.append(r9)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r2 = r3.toString()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x02c0:
            com.android.a.d.a r1 = new com.android.a.d.a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r2.<init>(r3)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r2.append(r12)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r3 = ", EoCD start: "
            r2.append(r3)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r2.append(r10)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x02da:
            com.android.a.d.a r1 = new com.android.a.d.a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r2.<init>(r4)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r2.append(r14)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r3 = ". ZIP End of Central Directory offset: "
            r2.append(r3)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r2.append(r10)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            r1.<init>(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x02f4:
            com.android.a.d.a r1 = new com.android.a.d.a     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            java.lang.String r2 = "ZIP End of Central Directory record not found"
            r1.<init>(r2)     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
            throw r1     // Catch:{ a -> 0x0304, IOException -> 0x0302, a -> 0x0300, NoSuchAlgorithmException -> 0x02fc, j -> 0x0309 }
        L_0x02fc:
            r0 = move-exception
            r1 = r0
            r2 = 0
            goto L_0x0315
        L_0x0300:
            r0 = move-exception
            goto L_0x0305
        L_0x0302:
            r0 = move-exception
            goto L_0x0305
        L_0x0304:
            r0 = move-exception
        L_0x0305:
            r1 = r0
            r2 = 0
        L_0x0307:
            r3 = 1
            goto L_0x0328
        L_0x0309:
            r1 = 30
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5.mo9967a(r1, r2)
            goto L_0x0331
        L_0x0312:
            r0 = move-exception
            r2 = 0
        L_0x0314:
            r1 = r0
        L_0x0315:
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            r1 = 29
            r5.mo9967a(r1, r3)
            goto L_0x0331
        L_0x0320:
            r0 = move-exception
            goto L_0x0325
        L_0x0322:
            r0 = move-exception
            goto L_0x0325
        L_0x0324:
            r0 = move-exception
        L_0x0325:
            r2 = 0
            r3 = 1
            r1 = r0
        L_0x0328:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            r1 = 28
            r5.mo9967a(r1, r3)
        L_0x0331:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p247a.C5014e.m13804b(com.android.a.b.b.c, int, int):com.android.a.d");
    }

    /* renamed from: c */
    private static void m13805c(ByteBuffer byteBuffer, int i, CertificateFactory certificateFactory, Map map, C4984b bVar) {
        ByteBuffer b = C4993d.m13776b(byteBuffer);
        ByteBuffer b2 = C4993d.m13776b(b);
        ByteBuffer b3 = C4993d.m13776b(b);
        while (b2.hasRemaining()) {
            try {
                ByteBuffer b4 = C4993d.m13776b(b2);
                int i2 = b4.getInt();
                byte[] e = C4993d.m13779e(b4);
                C4997h a = C4997h.m13783a(i2);
                if (a != null) {
                    map.put(a.f15841m, e);
                }
            } catch (C4981a | BufferUnderflowException unused) {
                bVar.mo9916a(i == 2 ? 8 : 16, new Object[0]);
                return;
            }
        }
        if (b3.hasRemaining()) {
            byte[] e2 = C4993d.m13779e(b3);
            try {
                bVar.f15800a = new C5003d((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(e2)), e2);
            } catch (CertificateException unused2) {
                bVar.mo9916a(i == 2 ? 6 : 14, new Object[0]);
                return;
            }
        }
        if (bVar.f15800a == null) {
            bVar.mo9916a(i == 2 ? 7 : 15, new Object[0]);
        }
    }

    /* renamed from: d */
    private static Map m13806d(List list, C5002c cVar, C5013b bVar, C5011d dVar) {
        ArrayList arrayList = new ArrayList(1);
        EnumMap enumMap = new EnumMap(C4995f.class);
        Iterator it = list.iterator();
        C5005a aVar = null;
        while (it.hasNext()) {
            C5005a aVar2 = (C5005a) it.next();
            String str = aVar2.f15860g;
            if (aVar == null && "META-INF/MANIFEST.MF".equals(str)) {
                aVar = aVar2;
            } else if (str.startsWith("META-INF/") && (str.endsWith(".RSA") || str.endsWith(".DSA") || str.endsWith(".EC"))) {
                arrayList.add(aVar2);
            }
        }
        if (aVar == null) {
            return enumMap;
        }
        if (arrayList.isEmpty()) {
            dVar.mo9968b(36, new Object[0]);
        } else {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C5005a aVar3 = (C5005a) arrayList.get(i);
                try {
                    Iterator<? extends Certificate> it2 = CertificateFactory.getInstance("X.509").generateCertificates(new ByteArrayInputStream(C5007c.m13793a(cVar, aVar3, bVar.f15880a))).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Certificate certificate = (Certificate) it2.next();
                        if (certificate instanceof X509Certificate) {
                            C4984b bVar2 = new C4984b();
                            bVar2.f15800a = (X509Certificate) certificate;
                            dVar.f15873a.add(bVar2);
                            break;
                        }
                    }
                    i++;
                } catch (CertificateException e) {
                    dVar.mo9968b(37, aVar3.f15860g, e);
                } catch (C5012a e2) {
                    throw new C4981a("Failed to read APK", e2);
                }
            }
        }
        try {
            enumMap.put(C4995f.SHA256, C4983c.m13764a(C5007c.m13793a(cVar, aVar, bVar.f15880a)));
            return enumMap;
        } catch (C5012a e3) {
            throw new C4981a("Failed to read APK", e3);
        }
    }
}
