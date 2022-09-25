package com.android.p247a.p249b.p250a;

import com.android.p247a.p249b.p252b.C5004e;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* renamed from: com.android.a.b.a.h */
/* compiled from: PG */
public enum C4997h {
    RSA_PSS_WITH_SHA256(257, C4995f.CHUNKED_SHA256, new C5004e("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1)), 23),
    RSA_PSS_WITH_SHA512(258, C4995f.CHUNKED_SHA512, new C5004e("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1)), 23),
    RSA_PKCS1_V1_5_WITH_SHA256(259, C4995f.CHUNKED_SHA256, new C5004e("SHA256withRSA", (Object) null), 1),
    RSA_PKCS1_V1_5_WITH_SHA512(260, C4995f.CHUNKED_SHA512, new C5004e("SHA512withRSA", (Object) null), 1),
    ECDSA_WITH_SHA256(513, C4995f.CHUNKED_SHA256, new C5004e("SHA256withECDSA", (Object) null), 11),
    ECDSA_WITH_SHA512(514, C4995f.CHUNKED_SHA512, new C5004e("SHA512withECDSA", (Object) null), 11),
    DSA_WITH_SHA256(769, C4995f.CHUNKED_SHA256, new C5004e("SHA256withDSA", (Object) null), 1),
    DETDSA_WITH_SHA256(769, C4995f.CHUNKED_SHA256, new C5004e("SHA256withDetDSA", (Object) null), 1),
    VERITY_RSA_PKCS1_V1_5_WITH_SHA256(1057, C4995f.VERITY_CHUNKED_SHA256, new C5004e("SHA256withRSA", (Object) null), 1),
    VERITY_ECDSA_WITH_SHA256(1059, C4995f.VERITY_CHUNKED_SHA256, new C5004e("SHA256withECDSA", (Object) null), 11),
    VERITY_DSA_WITH_SHA256(1061, C4995f.VERITY_CHUNKED_SHA256, new C5004e("SHA256withDSA", (Object) null), 1);
    

    /* renamed from: l */
    public final int f15840l;

    /* renamed from: m */
    public final C4995f f15841m;

    /* renamed from: n */
    public final C5004e f15842n;

    /* renamed from: o */
    public final int f15843o;

    private C4997h(int i, C4995f fVar, C5004e eVar, int i2) {
        this.f15840l = i;
        this.f15841m = fVar;
        this.f15842n = eVar;
        this.f15843o = i2;
    }

    /* renamed from: a */
    public static C4997h m13783a(int i) {
        for (C4997h hVar : values()) {
            if (hVar.f15840l == i) {
                return hVar;
            }
        }
        return null;
    }
}
