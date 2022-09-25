package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67671ba;
import com.google.p5238v.p5239a.p5255j.C67673bc;
import com.google.p5238v.p5239a.p5255j.C67674bd;
import com.google.p5238v.p5239a.p5255j.C67675be;
import com.google.p5238v.p5239a.p5255j.C67676bf;
import com.google.p5238v.p5239a.p5255j.C67677bg;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
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

/* renamed from: com.google.v.a.k.b */
/* compiled from: PG */
final class C67790b extends C67599f {
    public C67790b(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67673bc bcVar = ((C67671ba) messageLite).f183642a;
        if (bcVar == null) {
            bcVar = C67673bc.f183643d;
        }
        int b = C67698ca.m97840b(bcVar.f183646b);
        if (b == 0) {
            b = 1;
        }
        KeyPair c = C67836ai.m98002c(C67836ai.m98011l(C67789a.m97856c(b)));
        ECPoint w = ((ECPublicKey) c.getPublic()).getW();
        C67676bf bfVar = (C67676bf) C67677bg.f183653e.createBuilder();
        bfVar.copyOnWrite();
        ((C67677bg) bfVar.instance).f183655a = 0;
        bfVar.copyOnWrite();
        bcVar.getClass();
        ((C67677bg) bfVar.instance).f183656b = bcVar;
        C63088z A = C63088z.m96139A(w.getAffineX().toByteArray());
        bfVar.copyOnWrite();
        ((C67677bg) bfVar.instance).f183657c = A;
        C63088z A2 = C63088z.m96139A(w.getAffineY().toByteArray());
        bfVar.copyOnWrite();
        ((C67677bg) bfVar.instance).f183658d = A2;
        C67677bg bgVar = (C67677bg) bfVar.build();
        C67674bd bdVar = (C67674bd) C67675be.f183648d.createBuilder();
        bdVar.copyOnWrite();
        ((C67675be) bdVar.instance).f183650a = 0;
        bdVar.copyOnWrite();
        bgVar.getClass();
        ((C67675be) bdVar.instance).f183651b = bgVar;
        C63088z A3 = C63088z.m96139A(((ECPrivateKey) c.getPrivate()).getS().toByteArray());
        bdVar.copyOnWrite();
        ((C67675be) bdVar.instance).f183652c = A3;
        return (C67675be) bdVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67671ba) C62942bv.parseFrom((C62942bv) C67671ba.f183640b, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ECDSA_P256", C67791c.m97863g(5, 4, 4, 1));
        hashMap.put("ECDSA_P256_IEEE_P1363", C67791c.m97863g(5, 4, 3, 1));
        hashMap.put("ECDSA_P256_RAW", C67791c.m97863g(5, 4, 3, 3));
        hashMap.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", C67791c.m97863g(5, 4, 3, 3));
        hashMap.put("ECDSA_P384", C67791c.m97863g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_IEEE_P1363", C67791c.m97863g(6, 5, 3, 1));
        hashMap.put("ECDSA_P384_SHA512", C67791c.m97863g(6, 5, 4, 1));
        hashMap.put("ECDSA_P384_SHA384", C67791c.m97863g(4, 5, 4, 1));
        hashMap.put("ECDSA_P521", C67791c.m97863g(6, 6, 4, 1));
        hashMap.put("ECDSA_P521_IEEE_P1363", C67791c.m97863g(6, 6, 3, 1));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67673bc bcVar = ((C67671ba) messageLite).f183642a;
        if (bcVar == null) {
            bcVar = C67673bc.f183643d;
        }
        C67789a.m97854a(bcVar);
    }
}
