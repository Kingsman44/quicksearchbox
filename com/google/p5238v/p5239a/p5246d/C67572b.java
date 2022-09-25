package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.C67903s;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67682bl;
import com.google.p5238v.p5239a.p5255j.C67684bn;
import com.google.p5238v.p5239a.p5255j.C67685bo;
import com.google.p5238v.p5239a.p5255j.C67686bp;
import com.google.p5238v.p5239a.p5255j.C67687bq;
import com.google.p5238v.p5239a.p5255j.C67688br;
import com.google.p5238v.p5239a.p5255j.C67690bt;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5259m.C67836ai;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.d.b */
/* compiled from: PG */
final class C67572b extends C67599f {
    public C67572b(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67682bl blVar = (C67682bl) messageLite;
        C67684bn bnVar = blVar.f183664a;
        if (bnVar == null) {
            bnVar = C67684bn.f183665d;
        }
        C67690bt btVar = bnVar.f183667a;
        if (btVar == null) {
            btVar = C67690bt.f183681d;
        }
        int b = C67698ca.m97840b(btVar.f183683a);
        if (b == 0) {
            b = 1;
        }
        KeyPair c = C67836ai.m98002c(C67836ai.m98011l(C67581k.m97739c(b)));
        ECPrivateKey eCPrivateKey = (ECPrivateKey) c.getPrivate();
        ECPoint w = ((ECPublicKey) c.getPublic()).getW();
        C67687bq bqVar = (C67687bq) C67688br.f183675e.createBuilder();
        bqVar.copyOnWrite();
        ((C67688br) bqVar.instance).f183677a = 0;
        C67684bn bnVar2 = blVar.f183664a;
        if (bnVar2 == null) {
            bnVar2 = C67684bn.f183665d;
        }
        bqVar.copyOnWrite();
        bnVar2.getClass();
        ((C67688br) bqVar.instance).f183678b = bnVar2;
        C63088z A = C63088z.m96139A(w.getAffineX().toByteArray());
        bqVar.copyOnWrite();
        ((C67688br) bqVar.instance).f183679c = A;
        C63088z A2 = C63088z.m96139A(w.getAffineY().toByteArray());
        bqVar.copyOnWrite();
        ((C67688br) bqVar.instance).f183680d = A2;
        C67688br brVar = (C67688br) bqVar.build();
        C67685bo boVar = (C67685bo) C67686bp.f183670d.createBuilder();
        boVar.copyOnWrite();
        ((C67686bp) boVar.instance).f183672a = 0;
        boVar.copyOnWrite();
        brVar.getClass();
        ((C67686bp) boVar.instance).f183673b = brVar;
        C63088z A3 = C63088z.m96139A(eCPrivateKey.getS().toByteArray());
        boVar.copyOnWrite();
        ((C67686bp) boVar.instance).f183674c = A3;
        return (C67686bp) boVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67682bl) C62942bv.parseFrom((C62942bv) C67682bl.f183662b, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C67573c.m97718g(3, C67903s.m98166a("AES128_GCM"), C67573c.f183500a, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C67573c.m97718g(3, C67903s.m98166a("AES128_GCM"), C67573c.f183500a, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C67573c.m97718g(4, C67903s.m98166a("AES128_GCM"), C67573c.f183500a, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C67573c.m97718g(4, C67903s.m98166a("AES128_GCM"), C67573c.f183500a, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C67573c.m97718g(4, C67903s.m98166a("AES128_GCM"), C67573c.f183500a, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C67573c.m97718g(3, C67903s.m98166a("AES128_CTR_HMAC_SHA256"), C67573c.f183500a, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C67573c.m97718g(3, C67903s.m98166a("AES128_CTR_HMAC_SHA256"), C67573c.f183500a, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C67573c.m97718g(4, C67903s.m98166a("AES128_CTR_HMAC_SHA256"), C67573c.f183500a, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C67573c.m97718g(4, C67903s.m98166a("AES128_CTR_HMAC_SHA256"), C67573c.f183500a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67684bn bnVar = ((C67682bl) messageLite).f183664a;
        if (bnVar == null) {
            bnVar = C67684bn.f183665d;
        }
        C67581k.m97737a(bnVar);
    }
}
