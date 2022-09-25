package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67757ef;
import com.google.p5238v.p5239a.p5255j.C67759eh;
import com.google.p5238v.p5239a.p5255j.C67761ej;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67838ak;
import com.google.p5238v.p5239a.p5259m.C67862bh;
import com.google.p5238v.p5239a.p5259m.C67864bj;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.google.v.a.k.t */
/* compiled from: PG */
final class C67808t extends C67612s {
    public C67808t(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67759eh ehVar = (C67759eh) messageLite;
        KeyFactory keyFactory = (KeyFactory) C67838ak.f183954g.mo59993a("RSA");
        C67761ej ejVar = ehVar.f183836b;
        if (ejVar == null) {
            ejVar = C67761ej.f183843e;
        }
        int i = 1;
        BigInteger bigInteger = new BigInteger(1, ejVar.f183847c.mo59174N());
        C67761ej ejVar2 = ehVar.f183836b;
        if (ejVar2 == null) {
            ejVar2 = C67761ej.f183843e;
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, new BigInteger(1, ejVar2.f183848d.mo59174N()), new BigInteger(1, ehVar.f183837c.mo59174N()), new BigInteger(1, ehVar.f183838d.mo59174N()), new BigInteger(1, ehVar.f183839e.mo59174N()), new BigInteger(1, ehVar.f183840f.mo59174N()), new BigInteger(1, ehVar.f183841g.mo59174N()), new BigInteger(1, ehVar.f183842h.mo59174N())));
        C67761ej ejVar3 = ehVar.f183836b;
        if (ejVar3 == null) {
            ejVar3 = C67761ej.f183843e;
        }
        C67757ef efVar = ejVar3.f183846b;
        if (efVar == null) {
            efVar = C67757ef.f183828d;
        }
        C67761ej ejVar4 = ehVar.f183836b;
        if (ejVar4 == null) {
            ejVar4 = C67761ej.f183843e;
        }
        BigInteger bigInteger2 = new BigInteger(1, ejVar4.f183847c.mo59174N());
        C67761ej ejVar5 = ehVar.f183836b;
        if (ejVar5 == null) {
            ejVar5 = C67761ej.f183843e;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger2, new BigInteger(1, ejVar5.f183848d.mo59174N())));
        int b = C67701cd.m97842b(efVar.f183830a);
        if (b == 0) {
            b = 1;
        }
        int e = C67789a.m97858e(b);
        int b2 = C67701cd.m97842b(efVar.f183831b);
        if (b2 == 0) {
            b2 = 1;
        }
        C67864bj.m98067c(rSAPrivateCrtKey, rSAPublicKey, e, C67789a.m97858e(b2), efVar.f183832c);
        int b3 = C67701cd.m97842b(efVar.f183830a);
        if (b3 == 0) {
            b3 = 1;
        }
        int e2 = C67789a.m97858e(b3);
        int b4 = C67701cd.m97842b(efVar.f183831b);
        if (b4 != 0) {
            i = b4;
        }
        return new C67862bh(rSAPrivateCrtKey, e2, C67789a.m97858e(i), efVar.f183832c);
    }
}
