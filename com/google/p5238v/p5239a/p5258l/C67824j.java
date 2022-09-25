package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.p5255j.C67701cd;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.v.a.l.j */
/* compiled from: PG */
final class C67824j {
    /* renamed from: a */
    public static String m97968a(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(C67701cd.m97841a(i))));
    }
}
