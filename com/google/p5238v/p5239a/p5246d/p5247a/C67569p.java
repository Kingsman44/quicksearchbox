package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5255j.C67708ck;
import com.google.p5238v.p5239a.p5255j.C67709cl;
import com.google.p5238v.p5239a.p5255j.C67710cm;
import com.google.p5238v.p5239a.p5255j.C67714cq;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.security.GeneralSecurityException;
import org.chromium.net.PrivateKeyType;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.v.a.d.a.p */
/* compiled from: PG */
public final class C67569p {

    /* renamed from: a */
    public static final byte[] f183482a = m97705c(1, 0);

    /* renamed from: b */
    public static final byte[] f183483b = m97705c(2, 32);

    /* renamed from: c */
    public static final byte[] f183484c = m97705c(2, 16);

    /* renamed from: d */
    public static final byte[] f183485d = m97705c(2, 17);

    /* renamed from: e */
    public static final byte[] f183486e = m97705c(2, 18);

    /* renamed from: f */
    public static final byte[] f183487f = m97705c(2, 1);

    /* renamed from: g */
    public static final byte[] f183488g = m97705c(2, 2);

    /* renamed from: h */
    public static final byte[] f183489h = m97705c(2, 3);

    /* renamed from: i */
    public static final byte[] f183490i = m97705c(2, 1);

    /* renamed from: j */
    public static final byte[] f183491j = m97705c(2, 2);

    /* renamed from: k */
    public static final byte[] f183492k = m97705c(2, 3);

    /* renamed from: l */
    public static final byte[] f183493l = new byte[0];

    /* renamed from: m */
    private static final byte[] f183494m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    private static final byte[] f183495n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    private static final byte[] f183496o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    static void m97703a(C67714cq cqVar) {
        int b;
        int a;
        int a2;
        int i = cqVar.f183719a;
        int b2 = C67710cm.m97846b(i);
        int i2 = 1;
        if ((b2 != 0 && b2 == 2) || (b = C67710cm.m97846b(i)) == 0 || b == 1) {
            int b3 = C67710cm.m97846b(cqVar.f183719a);
            if (b3 != 0) {
                i2 = b3;
            }
            throw new GeneralSecurityException("Invalid KEM param: ".concat(C67710cm.m97845a(i2)));
        }
        int i3 = cqVar.f183720b;
        int a3 = C67709cl.m97844a(i3);
        String str = "UNRECOGNIZED";
        if ((a3 != 0 && a3 == 2) || (a = C67709cl.m97844a(i3)) == 0 || a == 1) {
            int a4 = C67709cl.m97844a(cqVar.f183720b);
            if (a4 != 0) {
                if (a4 == 2) {
                    str = "KDF_UNKNOWN";
                } else if (a4 == 3) {
                    str = "HKDF_SHA256";
                } else if (a4 == 4) {
                    str = "HKDF_SHA384";
                } else if (a4 == 5) {
                    str = "HKDF_SHA512";
                }
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        int i4 = cqVar.f183721c;
        int a5 = C67708ck.m97843a(i4);
        if ((a5 != 0 && a5 == 2) || (a2 = C67708ck.m97843a(i4)) == 0 || a2 == 1) {
            int a6 = C67708ck.m97843a(cqVar.f183721c);
            if (a6 != 0) {
                if (a6 == 2) {
                    str = "AEAD_UNKNOWN";
                } else if (a6 == 3) {
                    str = "AES_128_GCM";
                } else if (a6 == 4) {
                    str = "AES_256_GCM";
                } else if (a6 == 5) {
                    str = "CHACHA20_POLY1305";
                }
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    static byte[] m97704b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return C67886p.m98135c(f183495n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m97705c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & PrivateKeyType.INVALID);
        }
        return bArr;
    }

    /* renamed from: d */
    static byte[] m97706d(byte[] bArr) {
        return C67886p.m98135c(f183494m, bArr);
    }

    /* renamed from: e */
    static byte[] m97707e(String str, byte[] bArr, byte[] bArr2) {
        return C67886p.m98135c(f183496o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    static byte[] m97708f(String str, byte[] bArr, byte[] bArr2, int i) {
        return C67886p.m98135c(m97705c(2, i), f183496o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
