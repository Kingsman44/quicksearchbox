package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.google.v.a.m.bf */
/* compiled from: PG */
public final class C67860bf implements C67536ag {

    /* renamed from: a */
    public final RSAPrivateCrtKey f183982a;

    /* renamed from: b */
    public final RSAPublicKey f183983b;

    /* renamed from: c */
    public final String f183984c;

    public C67860bf(RSAPrivateCrtKey rSAPrivateCrtKey, int i) {
        if (C67543a.m97645a(2)) {
            int i2 = C67870bp.f184014a;
            C67870bp.m98084b(rSAPrivateCrtKey.getModulus().bitLength());
            C67870bp.m98085c(rSAPrivateCrtKey.getPublicExponent());
            this.f183982a = rSAPrivateCrtKey;
            this.f183984c = C67847at.m98027a(i).concat("withRSA");
            this.f183983b = (RSAPublicKey) ((KeyFactory) C67838ak.f183954g.mo59993a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }
}
