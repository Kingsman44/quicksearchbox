package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67656am;
import com.google.p5238v.p5239a.p5255j.C67657an;
import com.google.p5238v.p5239a.p5255j.C67659ap;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.a.q */
/* compiled from: PG */
final class C67520q extends C67599f {
    public C67520q(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67656am amVar = (C67656am) C67657an.f183615c.createBuilder();
        C63088z A = C63088z.m96139A(C67859be.m98062a(((C67659ap) messageLite).f183621a));
        amVar.copyOnWrite();
        ((C67657an) amVar.instance).f183618b = A;
        amVar.copyOnWrite();
        ((C67657an) amVar.instance).f183617a = 0;
        return (C67657an) amVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67659ap) C62942bv.parseFrom((C62942bv) C67659ap.f183619b, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", C67521r.m97589h(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", C67521r.m97589h(16, 3));
        hashMap.put("AES256_GCM_SIV", C67521r.m97589h(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", C67521r.m97589h(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67870bp.m98083a(((C67659ap) messageLite).f183621a);
    }
}
