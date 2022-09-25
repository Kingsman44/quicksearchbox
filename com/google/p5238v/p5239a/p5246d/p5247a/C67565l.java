package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67712co;
import com.google.p5238v.p5239a.p5255j.C67714cq;
import com.google.p5238v.p5239a.p5255j.C67715cr;
import com.google.p5238v.p5239a.p5255j.C67716cs;
import com.google.p5238v.p5239a.p5255j.C67717ct;
import com.google.p5238v.p5239a.p5255j.C67718cu;
import com.google.p5238v.p5239a.p5259m.C67871bq;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.d.a.l */
/* compiled from: PG */
final class C67565l extends C67599f {
    public C67565l(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        byte[] b = C67871bq.m98089b();
        byte[] c = C67871bq.m98090c(b);
        C67717ct ctVar = (C67717ct) C67718cu.f183727d.createBuilder();
        ctVar.copyOnWrite();
        ((C67718cu) ctVar.instance).f183729a = 0;
        C67714cq cqVar = ((C67712co) messageLite).f183716a;
        if (cqVar == null) {
            cqVar = C67714cq.f183717d;
        }
        ctVar.copyOnWrite();
        cqVar.getClass();
        ((C67718cu) ctVar.instance).f183730b = cqVar;
        C63088z A = C63088z.m96139A(c);
        ctVar.copyOnWrite();
        ((C67718cu) ctVar.instance).f183731c = A;
        C67718cu cuVar = (C67718cu) ctVar.build();
        C67715cr crVar = (C67715cr) C67716cs.f183722d.createBuilder();
        crVar.copyOnWrite();
        ((C67716cs) crVar.instance).f183724a = 0;
        crVar.copyOnWrite();
        cuVar.getClass();
        ((C67716cs) crVar.instance).f183725b = cuVar;
        C63088z A2 = C63088z.m96139A(b);
        crVar.copyOnWrite();
        ((C67716cs) crVar.instance).f183726c = A2;
        return (C67716cs) crVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67712co) C62942bv.parseFrom((C62942bv) C67712co.f183714b, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C67566m.m97692g(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C67566m.m97692g(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C67566m.m97692g(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C67566m.m97692g(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", C67566m.m97692g(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", C67566m.m97692g(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", C67566m.m97692g(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", C67566m.m97692g(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", C67566m.m97692g(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", C67566m.m97692g(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", C67566m.m97692g(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", C67566m.m97692g(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", C67566m.m97692g(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", C67566m.m97692g(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", C67566m.m97692g(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", C67566m.m97692g(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", C67566m.m97692g(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", C67566m.m97692g(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67714cq cqVar = ((C67712co) messageLite).f183716a;
        if (cqVar == null) {
            cqVar = C67714cq.f183717d;
        }
        C67569p.m97703a(cqVar);
    }
}
