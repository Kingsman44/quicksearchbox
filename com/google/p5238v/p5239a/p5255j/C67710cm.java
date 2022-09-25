package com.google.p5238v.p5239a.p5255j;

/* renamed from: com.google.v.a.j.cm */
/* compiled from: PG */
public final class C67710cm {
    /* renamed from: a */
    public static /* synthetic */ String m97845a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "UNRECOGNIZED" : "DHKEM_P521_HKDF_SHA512" : "DHKEM_P384_HKDF_SHA384" : "DHKEM_P256_HKDF_SHA256" : "DHKEM_X25519_HKDF_SHA256" : "KEM_UNKNOWN";
    }

    /* renamed from: b */
    public static int m97846b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }
}
