package com.google.p4591e.p4592a.p4597c.p4598a.p4599a.p4600a.p4601a.p4602a;

import org.chromium.net.PrivateKeyType;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.e.a.c.a.a.a.a.a.a */
/* compiled from: PG */
public final class C61035a extends C61037c {

    /* renamed from: c */
    private static final byte[] f165263c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: d */
    private final byte[] f165264d;

    public C61035a() {
        throw null;
    }

    /* renamed from: a */
    public static byte[] m93373a(String str) {
        int length;
        C61035a aVar = new C61035a(f165272b);
        byte[] a = C61038d.m93380a(str, StandardCharsets.UTF_8);
        if (a == null || (length = a.length) == 0) {
            return a;
        }
        C61036b bVar = new C61036b();
        aVar.mo57583b(a, length, bVar);
        aVar.mo57583b(a, -1, bVar);
        int i = bVar.f165267c;
        byte[] bArr = new byte[i];
        if (bVar.f165266b != null) {
            int min = Math.min(i - bVar.f165268d, i);
            System.arraycopy(bVar.f165266b, bVar.f165268d, bArr, 0, min);
            int i2 = bVar.f165268d + min;
            bVar.f165268d = i2;
            if (i2 >= bVar.f165267c) {
                bVar.f165266b = null;
                return bArr;
            }
        }
        return bArr;
    }

    /* renamed from: e */
    private final void m93374e(int i, C61036b bVar) {
        if (mo57585c() && (i & bVar.f165265a) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    /* renamed from: b */
    public final void mo57583b(byte[] bArr, int i, C61036b bVar) {
        byte b;
        if (!bVar.f165269e) {
            int i2 = 0;
            if (i < 0) {
                bVar.f165269e = true;
            }
            int i3 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                byte[] d = m93377d(bVar);
                int i4 = i3 + 1;
                byte b2 = bArr[i3];
                if (b2 == 61) {
                    bVar.f165269e = true;
                    break;
                }
                if (b2 >= 0) {
                    byte[] bArr2 = f165263c;
                    int length = bArr2.length;
                    if (b2 < 123 && (b = bArr2[b2]) >= 0) {
                        int i5 = 3 & (bVar.f165270f + 1);
                        bVar.f165270f = i5;
                        int i6 = (bVar.f165265a << 6) + b;
                        bVar.f165265a = i6;
                        if (i5 == 0) {
                            int i7 = bVar.f165267c;
                            int i8 = i7 + 1;
                            bVar.f165267c = i8;
                            d[i7] = (byte) ((i6 >> 16) & PrivateKeyType.INVALID);
                            int i9 = i8 + 1;
                            bVar.f165267c = i9;
                            d[i8] = (byte) ((i6 >> 8) & PrivateKeyType.INVALID);
                            bVar.f165267c = i9 + 1;
                            d[i9] = (byte) (i6 & PrivateKeyType.INVALID);
                        }
                    }
                }
                i2++;
                i3 = i4;
            }
            if (bVar.f165269e && bVar.f165270f != 0) {
                byte[] d2 = m93377d(bVar);
                int i10 = bVar.f165270f;
                if (i10 != 1) {
                    if (i10 == 2) {
                        m93374e(15, bVar);
                        int i11 = bVar.f165265a >> 4;
                        bVar.f165265a = i11;
                        int i12 = bVar.f165267c;
                        bVar.f165267c = i12 + 1;
                        d2[i12] = (byte) (i11 & PrivateKeyType.INVALID);
                    } else if (i10 == 3) {
                        m93374e(3, bVar);
                        int i13 = bVar.f165265a >> 2;
                        bVar.f165265a = i13;
                        int i14 = bVar.f165267c;
                        int i15 = i14 + 1;
                        bVar.f165267c = i15;
                        d2[i14] = (byte) ((i13 >> 8) & PrivateKeyType.INVALID);
                        bVar.f165267c = i15 + 1;
                        d2[i15] = (byte) (i13 & PrivateKeyType.INVALID);
                    } else {
                        throw new IllegalStateException("Impossible modulus " + i10);
                    }
                } else if (mo57585c()) {
                    throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
                }
            }
        }
    }

    public C61035a(byte[] bArr) {
        super(f165271a);
        this.f165264d = f165263c;
        if (bArr != null) {
            int i = 0;
            while (i < 2) {
                byte b = bArr[i];
                if (b != 61) {
                    if (b >= 0) {
                        byte[] bArr2 = this.f165264d;
                        int length = bArr2.length;
                        if (b < 123 && bArr2[b] != -1) {
                        }
                    }
                    i++;
                }
                String str = new String(bArr, StandardCharsets.UTF_8);
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + str + "]");
            }
        }
    }
}
