package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67755ed;
import com.google.p5238v.p5239a.p5255j.C67757ef;
import com.google.p5238v.p5239a.p5255j.C67758eg;
import com.google.p5238v.p5239a.p5255j.C67759eh;
import com.google.p5238v.p5239a.p5255j.C67760ei;
import com.google.p5238v.p5239a.p5255j.C67761ej;
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

/* renamed from: com.google.v.a.k.u */
/* compiled from: PG */
final class C67809u extends C67599f {
    public C67809u(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67755ed edVar = (C67755ed) messageLite;
        C67757ef efVar = edVar.f183825a;
        if (efVar == null) {
            efVar = C67757ef.f183828d;
        }
        C67870bp.m98084b(edVar.f183826b);
        int b = C67701cd.m97842b(efVar.f183830a);
        if (b == 0) {
            b = 1;
        }
        C67789a.m97858e(b);
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C67838ak.f183953f.mo59993a("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(edVar.f183826b, new BigInteger(1, edVar.f183827c.mo59174N())));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
        C67760ei eiVar = (C67760ei) C67761ej.f183843e.createBuilder();
        eiVar.copyOnWrite();
        ((C67761ej) eiVar.instance).f183845a = 0;
        eiVar.copyOnWrite();
        efVar.getClass();
        ((C67761ej) eiVar.instance).f183846b = efVar;
        C63088z A = C63088z.m96139A(rSAPublicKey.getPublicExponent().toByteArray());
        eiVar.copyOnWrite();
        ((C67761ej) eiVar.instance).f183848d = A;
        C63088z A2 = C63088z.m96139A(rSAPublicKey.getModulus().toByteArray());
        eiVar.copyOnWrite();
        ((C67761ej) eiVar.instance).f183847c = A2;
        C67761ej ejVar = (C67761ej) eiVar.build();
        C67758eg egVar = (C67758eg) C67759eh.f183833i.createBuilder();
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183835a = 0;
        egVar.copyOnWrite();
        ejVar.getClass();
        ((C67759eh) egVar.instance).f183836b = ejVar;
        C63088z A3 = C63088z.m96139A(rSAPrivateCrtKey.getPrivateExponent().toByteArray());
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183837c = A3;
        C63088z A4 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeP().toByteArray());
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183838d = A4;
        C63088z A5 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeQ().toByteArray());
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183839e = A5;
        C63088z A6 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeExponentP().toByteArray());
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183840f = A6;
        C63088z A7 = C63088z.m96139A(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray());
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183841g = A7;
        C63088z A8 = C63088z.m96139A(rSAPrivateCrtKey.getCrtCoefficient().toByteArray());
        egVar.copyOnWrite();
        ((C67759eh) egVar.instance).f183842h = A8;
        return (C67759eh) egVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67755ed) C62942bv.parseFrom((C62942bv) C67755ed.f183823d, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4", new C67598e(C67810v.m97922g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", new C67598e(C67810v.m97922g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", new C67598e(C67810v.m97922g(5, 5, 32, 3072, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4", new C67598e(C67810v.m97922g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", new C67598e(C67810v.m97922g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 3));
        hashMap.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", new C67598e(C67810v.m97922g(6, 6, 64, 4096, RSAKeyGenParameterSpec.F4), 1));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67755ed edVar = (C67755ed) messageLite;
        C67757ef efVar = edVar.f183825a;
        if (efVar == null) {
            efVar = C67757ef.f183828d;
        }
        C67789a.m97855b(efVar);
        C67870bp.m98084b(edVar.f183826b);
        C67870bp.m98085c(new BigInteger(1, edVar.f183827c.mo59174N()));
    }
}
