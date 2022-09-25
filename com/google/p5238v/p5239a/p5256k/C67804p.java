package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67746dv;
import com.google.p5238v.p5239a.p5255j.C67748dx;
import com.google.p5238v.p5239a.p5255j.C67749dy;
import com.google.p5238v.p5239a.p5255j.C67750dz;
import com.google.p5238v.p5239a.p5255j.C67752ea;
import com.google.p5238v.p5239a.p5255j.C67753eb;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67838ak;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.k.p */
/* compiled from: PG */
final class C67804p extends C67599f {
    public C67804p(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67746dv dvVar = (C67746dv) messageLite;
        C67748dx dxVar = dvVar.f183801a;
        if (dxVar == null) {
            dxVar = C67748dx.f183804b;
        }
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C67838ak.f183953f.mo59993a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(dvVar.f183802b, new BigInteger(1, dvVar.f183803c.mo59174N())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        C67752ea eaVar = (C67752ea) C67753eb.f183817e.createBuilder();
        eaVar.copyOnWrite();
        ((C67753eb) eaVar.instance).f183819a = 0;
        eaVar.copyOnWrite();
        dxVar.getClass();
        ((C67753eb) eaVar.instance).f183820b = dxVar;
        C63088z A = C63088z.m96139A(rSAPublicKey.getPublicExponent().toByteArray());
        eaVar.copyOnWrite();
        ((C67753eb) eaVar.instance).f183822d = A;
        C63088z A2 = C63088z.m96139A(rSAPublicKey.getModulus().toByteArray());
        eaVar.copyOnWrite();
        ((C67753eb) eaVar.instance).f183821c = A2;
        C67753eb ebVar = (C67753eb) eaVar.build();
        C67749dy dyVar = (C67749dy) C67750dz.f183807i.createBuilder();
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183809a = 0;
        dyVar.copyOnWrite();
        ebVar.getClass();
        ((C67750dz) dyVar.instance).f183810b = ebVar;
        C63088z A3 = C63088z.m96139A(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183811c = A3;
        C63088z A4 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeP().toByteArray());
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183812d = A4;
        C63088z A5 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183813e = A5;
        C63088z A6 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183814f = A6;
        C63088z A7 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183815g = A7;
        C63088z A8 = C63088z.m96139A(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        dyVar.copyOnWrite();
        ((C67750dz) dyVar.instance).f183816h = A8;
        return (C67750dz) dyVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67746dv) C62942bv.parseFrom((C62942bv) C67746dv.f183799d, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4", new C67598e(C67805q.m97904g(5, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", new C67598e(C67805q.m97904g(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", new C67598e(C67805q.m97904g(5, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4", new C67598e(C67805q.m97904g(6, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", new C67598e(C67805q.m97904g(6, 4096, RSAKeyGenParameterSpec.F4), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67746dv dvVar = (C67746dv) messageLite;
        C67748dx dxVar = dvVar.f183801a;
        if (dxVar == null) {
            dxVar = C67748dx.f183804b;
        }
        int b = C67701cd.m97842b(dxVar.f183806a);
        if (b == 0) {
            b = 1;
        }
        C67789a.m97858e(b);
        C67870bp.m98084b(dvVar.f183802b);
        C67870bp.m98085c(new BigInteger(1, dvVar.f183803c.mo59174N()));
    }
}
