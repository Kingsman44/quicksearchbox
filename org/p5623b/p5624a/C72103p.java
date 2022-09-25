package org.p5623b.p5624a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;
import org.p5623b.p5629b.C72123b;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.b.a.p */
/* compiled from: PG */
public final class C72103p extends C72108u {

    /* renamed from: b */
    private static final ConcurrentMap f191931b = new ConcurrentHashMap();

    /* renamed from: a */
    public final String f191932a;

    /* renamed from: c */
    private byte[] f191933c;

    public C72103p(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2' || !m105597k(str, 2)) {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        this.f191932a = str;
    }

    /* renamed from: e */
    static C72103p m105595e(byte[] bArr) {
        C72103p pVar = (C72103p) f191931b.get(new C72102o(bArr));
        return pVar == null ? new C72103p(bArr) : pVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, org.b.a.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.p5623b.p5624a.C72103p m105596i(java.lang.Object r2) {
        /*
            if (r2 == 0) goto L_0x004c
            boolean r0 = r2 instanceof org.p5623b.p5624a.C72103p
            if (r0 == 0) goto L_0x0007
            goto L_0x004c
        L_0x0007:
            org.b.a.u r0 = r2.mo63233g()
            boolean r1 = r0 instanceof org.p5623b.p5624a.C72103p
            if (r1 != 0) goto L_0x0049
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L_0x0031
            byte[] r2 = (byte[]) r2
            org.b.a.u r2 = m105626q(r2)     // Catch:{ IOException -> 0x001c }
            org.b.a.p r2 = (org.p5623b.p5624a.C72103p) r2     // Catch:{ IOException -> 0x001c }
            return r2
        L_0x001c:
            r2 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "failed to construct object identifier from byte[]: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x0031:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "illegal object in getInstance: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x0049:
            org.b.a.p r0 = (org.p5623b.p5624a.C72103p) r0
            return r0
        L_0x004c:
            org.b.a.p r2 = (org.p5623b.p5624a.C72103p) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72103p.m105596i(java.lang.Object):org.b.a.p");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r0 + 1) == '0') goto L_0x0022;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m105597k(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = 0
        L_0x0005:
            r2 = 0
        L_0x0006:
            int r0 = r0 + -1
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L_0x002d
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L_0x0023
            if (r2 == 0) goto L_0x0022
            if (r2 <= r4) goto L_0x0005
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 == r3) goto L_0x0022
            goto L_0x0005
        L_0x0022:
            return r1
        L_0x0023:
            if (r5 < r3) goto L_0x002c
            r3 = 57
            if (r5 > r3) goto L_0x002c
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002c:
            return r1
        L_0x002d:
            if (r2 == 0) goto L_0x003a
            if (r2 <= r4) goto L_0x0039
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r4
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72103p.m105597k(java.lang.String, int):boolean");
    }

    /* renamed from: l */
    private final synchronized byte[] m105598l() {
        if (this.f191933c == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C72089cg cgVar = new C72089cg(this.f191932a);
            int parseInt = Integer.parseInt(cgVar.mo63277a()) * 40;
            String a = cgVar.mo63277a();
            if (a.length() <= 18) {
                m105599s(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(a));
            } else {
                m105600t(byteArrayOutputStream, new BigInteger(a).add(BigInteger.valueOf((long) parseInt)));
            }
            while (cgVar.f191909a != -1) {
                String a2 = cgVar.mo63277a();
                if (a2.length() <= 18) {
                    m105599s(byteArrayOutputStream, Long.parseLong(a2));
                } else {
                    m105600t(byteArrayOutputStream, new BigInteger(a2));
                }
            }
            this.f191933c = byteArrayOutputStream.toByteArray();
        }
        return this.f191933c;
    }

    /* renamed from: s */
    private static final void m105599s(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: t */
    private static final void m105600t(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* renamed from: a */
    public final int mo63217a() {
        int length = m105598l().length;
        return C72090ch.m105544a(length) + 1 + length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 6, m105598l());
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if (uVar == this) {
            return true;
        }
        if (!(uVar instanceof C72103p)) {
            return false;
        }
        return this.f191932a.equals(((C72103p) uVar).f191932a);
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    public final int hashCode() {
        return this.f191932a.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: org.b.a.p} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r2 = r1.putIfAbsent(r0, r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.p5623b.p5624a.C72103p mo63297j() {
        /*
            r3 = this;
            org.b.a.o r0 = new org.b.a.o
            byte[] r1 = r3.m105598l()
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap r1 = f191931b
            java.lang.Object r2 = r1.get(r0)
            org.b.a.p r2 = (org.p5623b.p5624a.C72103p) r2
            if (r2 != 0) goto L_0x001e
            java.lang.Object r0 = r1.putIfAbsent(r0, r3)
            r2 = r0
            org.b.a.p r2 = (org.p5623b.p5624a.C72103p) r2
            if (r2 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            return r3
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72103p.mo63297j():org.b.a.p");
    }

    public final String toString() {
        return this.f191932a;
    }

    public C72103p(C72103p pVar, String str) {
        if (m105597k(str, 0)) {
            String str2 = pVar.f191932a;
            this.f191932a = str2 + "." + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }

    public C72103p(byte[] bArr) {
        long j;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        BigInteger bigInteger = null;
        long j2 = 0;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j2 <= 72057594037927808L) {
                long j3 = j2 + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j3 < 40) {
                            stringBuffer.append('0');
                        } else {
                            if (j3 < 80) {
                                stringBuffer.append('1');
                                j = -40;
                            } else {
                                stringBuffer.append('2');
                                j = -80;
                            }
                            j3 += j;
                        }
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j3);
                } else {
                    j2 = j3 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j2) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
            z = false;
            j2 = 0;
        }
        this.f191932a = stringBuffer.toString();
        this.f191933c = C72123b.m105660b(bArr);
    }
}
