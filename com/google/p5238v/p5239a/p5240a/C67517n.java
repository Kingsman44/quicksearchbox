package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67652ai;
import com.google.p5238v.p5239a.p5255j.C67653aj;
import com.google.p5238v.p5239a.p5255j.C67655al;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.a.n */
/* compiled from: PG */
final class C67517n extends C67599f {
    public C67517n(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67652ai aiVar = (C67652ai) C67653aj.f183608c.createBuilder();
        C63088z A = C63088z.m96139A(C67859be.m98062a(((C67655al) messageLite).f183614a));
        aiVar.copyOnWrite();
        ((C67653aj) aiVar.instance).f183611b = A;
        aiVar.copyOnWrite();
        ((C67653aj) aiVar.instance).f183610a = 0;
        return (C67653aj) aiVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67655al) C62942bv.parseFrom((C62942bv) C67655al.f183612b, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", C67518o.m97576g(16, 1));
        hashMap.put("AES128_GCM_RAW", C67518o.m97576g(16, 3));
        hashMap.put("AES256_GCM", C67518o.m97576g(32, 1));
        hashMap.put("AES256_GCM_RAW", C67518o.m97576g(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67870bp.m98083a(((C67655al) messageLite).f183614a);
    }
}
