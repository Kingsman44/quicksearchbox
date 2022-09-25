package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67646ac;
import com.google.p5238v.p5239a.p5255j.C67647ad;
import com.google.p5238v.p5239a.p5255j.C67649af;
import com.google.p5238v.p5239a.p5255j.C67651ah;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.l.e */
/* compiled from: PG */
final class C67819e extends C67599f {
    public C67819e(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67649af afVar = (C67649af) messageLite;
        C67646ac acVar = (C67646ac) C67647ad.f183594d.createBuilder();
        C63088z A = C63088z.m96139A(C67859be.m98062a(afVar.f183602b));
        acVar.copyOnWrite();
        ((C67647ad) acVar.instance).f183598c = A;
        C67651ah ahVar = afVar.f183601a;
        if (ahVar == null) {
            ahVar = C67651ah.f183603d;
        }
        acVar.copyOnWrite();
        ahVar.getClass();
        ((C67647ad) acVar.instance).f183597b = ahVar;
        acVar.copyOnWrite();
        ((C67647ad) acVar.instance).f183596a = 0;
        return (C67647ad) acVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67649af) C62942bv.parseFrom((C62942bv) C67649af.f183599c, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_HKDF_4KB", new C67598e(C67820f.m97959h(16, 16, 4096), 3));
        hashMap.put("AES128_GCM_HKDF_1MB", new C67598e(C67820f.m97959h(16, 16, 1048576), 3));
        hashMap.put("AES256_GCM_HKDF_4KB", new C67598e(C67820f.m97959h(32, 32, 4096), 3));
        hashMap.put("AES256_GCM_HKDF_1MB", new C67598e(C67820f.m97959h(32, 32, 1048576), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67649af afVar = (C67649af) messageLite;
        if (afVar.f183602b >= 16) {
            C67651ah ahVar = afVar.f183601a;
            if (ahVar == null) {
                ahVar = C67651ah.f183603d;
            }
            C67820f.m97958g(ahVar);
            return;
        }
        throw new GeneralSecurityException("key_size must be at least 16 bytes");
    }
}
