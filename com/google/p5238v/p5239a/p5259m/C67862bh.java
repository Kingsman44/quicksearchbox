package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.google.v.a.m.bh */
/* compiled from: PG */
public final class C67862bh implements C67536ag {

    /* renamed from: a */
    public final RSAPrivateCrtKey f183987a;

    /* renamed from: b */
    public final RSAPublicKey f183988b;

    /* renamed from: c */
    public final int f183989c;

    /* renamed from: d */
    public final int f183990d;

    /* renamed from: e */
    public final int f183991e;

    public C67862bh(RSAPrivateCrtKey rSAPrivateCrtKey, int i, int i2, int i3) {
        if (C67543a.m97645a(2)) {
            int i4 = C67870bp.f184014a;
            C67870bp.m98084b(rSAPrivateCrtKey.getModulus().bitLength());
            C67870bp.m98085c(rSAPrivateCrtKey.getPublicExponent());
            this.f183987a = rSAPrivateCrtKey;
            this.f183988b = (RSAPublicKey) ((KeyFactory) C67838ak.f183954g.mo59993a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.f183990d = i;
            this.f183991e = i2;
            this.f183989c = i3;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}
