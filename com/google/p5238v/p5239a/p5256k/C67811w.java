package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67757ef;
import com.google.p5238v.p5239a.p5255j.C67761ej;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67838ak;
import com.google.p5238v.p5239a.p5259m.C67863bi;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: com.google.v.a.k.w */
/* compiled from: PG */
final class C67811w extends C67612s {
    public C67811w(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67761ej ejVar = (C67761ej) messageLite;
        int i = 1;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) C67838ak.f183954g.mo59993a("RSA")).generatePublic(new RSAPublicKeySpec(new BigInteger(1, ejVar.f183847c.mo59174N()), new BigInteger(1, ejVar.f183848d.mo59174N())));
        C67757ef efVar = ejVar.f183846b;
        if (efVar == null) {
            efVar = C67757ef.f183828d;
        }
        int b = C67701cd.m97842b(efVar.f183830a);
        if (b == 0) {
            b = 1;
        }
        int e = C67789a.m97858e(b);
        int b2 = C67701cd.m97842b(efVar.f183831b);
        if (b2 != 0) {
            i = b2;
        }
        return new C67863bi(rSAPublicKey, e, C67789a.m97858e(i), efVar.f183832c);
    }
}
