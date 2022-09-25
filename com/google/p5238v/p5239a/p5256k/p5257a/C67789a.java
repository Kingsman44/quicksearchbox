package com.google.p5238v.p5239a.p5256k.p5257a;

import com.google.p5238v.p5239a.p5255j.C67673bc;
import com.google.p5238v.p5239a.p5255j.C67678bh;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67757ef;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.k.a.a */
/* compiled from: PG */
public final class C67789a {
    /* renamed from: b */
    public static void m97855b(C67757ef efVar) {
        int b = C67701cd.m97842b(efVar.f183830a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        m97858e(b);
        int b2 = C67701cd.m97842b(efVar.f183830a);
        if (b2 == 0) {
            b2 = 1;
        }
        int b3 = C67701cd.m97842b(efVar.f183831b);
        if (b3 != 0) {
            i = b3;
        }
        if (b2 != i) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        } else if (efVar.f183832c < 0) {
            throw new GeneralSecurityException("salt length is negative");
        }
    }

    /* renamed from: c */
    public static int m97856c(int i) {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(i != 1 ? i != 2 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? "null" : "CURVE25519" : "NIST_P521" : "NIST_P384" : "NIST_P256" : "UNKNOWN_CURVE" : "UNRECOGNIZED"));
    }

    /* renamed from: d */
    public static int m97857d(int i) {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                throw new GeneralSecurityException("unknown ECDSA encoding: ".concat(i != 2 ? i != 3 ? i != 4 ? "UNRECOGNIZED" : "DER" : "IEEE_P1363" : "UNKNOWN_ENCODING"));
            }
        }
        return i3;
    }

    /* renamed from: e */
    public static int m97858e(int i) {
        String str;
        int i2 = i - 2;
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 4) {
            return 5;
        }
        switch (i) {
            case 2:
                str = "UNKNOWN_HASH";
                break;
            case 3:
                str = "SHA1";
                break;
            case 4:
                str = "SHA384";
                break;
            case 5:
                str = "SHA256";
                break;
            case 6:
                str = "SHA512";
                break;
            case 7:
                str = "SHA224";
                break;
            default:
                str = "UNRECOGNIZED";
                break;
        }
        throw new GeneralSecurityException("unsupported hash type: ".concat(str));
    }

    /* renamed from: a */
    public static void m97854a(C67673bc bcVar) {
        int a = C67678bh.m97838a(bcVar.f183647c);
        if (a == 0) {
            a = 1;
        }
        int b = C67701cd.m97842b(bcVar.f183645a);
        if (b == 0) {
            b = 1;
        }
        int b2 = C67698ca.m97840b(bcVar.f183646b);
        if (b2 == 0) {
            b2 = 1;
        }
        int i = a - 2;
        if (i == 1 || i == 2) {
            int i2 = b2 - 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    } else if (b != 6) {
                        throw new GeneralSecurityException("Invalid ECDSA parameters");
                    }
                } else if (b != 4 && b != 6) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            } else if (b != 5) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
    }
}
