package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67748dx;
import com.google.p5238v.p5239a.p5255j.C67750dz;
import com.google.p5238v.p5239a.p5255j.C67753eb;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67838ak;
import com.google.p5238v.p5239a.p5259m.C67860bf;
import com.google.p5238v.p5239a.p5259m.C67864bj;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.google.v.a.k.o */
/* compiled from: PG */
final class C67803o extends C67612s {
    public C67803o(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67750dz dzVar = (C67750dz) messageLite;
        KeyFactory keyFactory = (KeyFactory) C67838ak.f183954g.mo59993a("RSA");
        C67753eb ebVar = dzVar.f183810b;
        if (ebVar == null) {
            ebVar = C67753eb.f183817e;
        }
        int i = 1;
        BigInteger bigInteger = new BigInteger(1, ebVar.f183821c.mo59174N());
        C67753eb ebVar2 = dzVar.f183810b;
        if (ebVar2 == null) {
            ebVar2 = C67753eb.f183817e;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, ebVar2.f183822d.mo59174N()), new BigInteger(1, dzVar.f183811c.mo59174N()), new BigInteger(1, dzVar.f183812d.mo59174N()), new BigInteger(1, dzVar.f183813e.mo59174N()), new BigInteger(1, dzVar.f183814f.mo59174N()), new BigInteger(1, dzVar.f183815g.mo59174N()), new BigInteger(1, dzVar.f183816h.mo59174N())));
        C67753eb ebVar3 = dzVar.f183810b;
        if (ebVar3 == null) {
            ebVar3 = C67753eb.f183817e;
        }
        C67748dx dxVar = ebVar3.f183820b;
        if (dxVar == null) {
            dxVar = C67748dx.f183804b;
        }
        C67753eb ebVar4 = dzVar.f183810b;
        if (ebVar4 == null) {
            ebVar4 = C67753eb.f183817e;
        }
        BigInteger bigInteger2 = new BigInteger(1, ebVar4.f183821c.mo59174N());
        C67753eb ebVar5 = dzVar.f183810b;
        if (ebVar5 == null) {
            ebVar5 = C67753eb.f183817e;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, ebVar5.f183822d.mo59174N())));
        int b = C67701cd.m97842b(dxVar.f183806a);
        if (b == 0) {
            b = 1;
        }
        C67864bj.m98066b(rSAPrivateCrtKey, rSAPublicKey, C67789a.m97858e(b));
        int b2 = C67701cd.m97842b(dxVar.f183806a);
        if (b2 != 0) {
            i = b2;
        }
        return new C67860bf(rSAPrivateCrtKey, C67789a.m97858e(i));
    }
}
