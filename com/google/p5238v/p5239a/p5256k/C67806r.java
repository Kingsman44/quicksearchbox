package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67748dx;
import com.google.p5238v.p5239a.p5255j.C67753eb;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67838ak;
import com.google.p5238v.p5239a.p5259m.C67861bg;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.google.v.a.k.r */
/* compiled from: PG */
final class C67806r extends C67612s {
    public C67806r(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67753eb ebVar = (C67753eb) messageLite;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) C67838ak.f183954g.mo59993a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, ebVar.f183821c.mo59174N()), new BigInteger(1, ebVar.f183822d.mo59174N())));
        C67748dx dxVar = ebVar.f183820b;
        if (dxVar == null) {
            dxVar = C67748dx.f183804b;
        }
        int b = C67701cd.m97842b(dxVar.f183806a);
        if (b != 0) {
            i = b;
        }
        return new C67861bg(rSAPublicKey, C67789a.m97858e(i));
    }
}
