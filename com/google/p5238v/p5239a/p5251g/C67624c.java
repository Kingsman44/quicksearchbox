package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67643a;
import com.google.p5238v.p5239a.p5255j.C67670b;
import com.google.p5238v.p5239a.p5255j.C67697c;
import com.google.p5238v.p5239a.p5255j.C67724d;
import com.google.p5238v.p5239a.p5255j.C67751e;
import com.google.p5238v.p5239a.p5255j.C67766f;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.g.c */
/* compiled from: PG */
final class C67624c extends C67599f {
    public C67624c(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67724d dVar = (C67724d) messageLite;
        C67643a aVar = (C67643a) C67670b.f183635d.createBuilder();
        aVar.copyOnWrite();
        ((C67670b) aVar.instance).f183637a = 0;
        C63088z A = C63088z.m96139A(C67859be.m98062a(dVar.f183747a));
        aVar.copyOnWrite();
        ((C67670b) aVar.instance).f183638b = A;
        C67766f fVar = dVar.f183748b;
        if (fVar == null) {
            fVar = C67766f.f183855b;
        }
        aVar.copyOnWrite();
        fVar.getClass();
        ((C67670b) aVar.instance).f183639c = fVar;
        return (C67670b) aVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67724d) C62942bv.parseFrom((C62942bv) C67724d.f183745c, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        C67697c cVar = (C67697c) C67724d.f183745c.createBuilder();
        cVar.copyOnWrite();
        ((C67724d) cVar.instance).f183747a = 32;
        C67751e eVar = (C67751e) C67766f.f183855b.createBuilder();
        eVar.copyOnWrite();
        ((C67766f) eVar.instance).f183857a = 16;
        C67766f fVar = (C67766f) eVar.build();
        cVar.copyOnWrite();
        fVar.getClass();
        ((C67724d) cVar.instance).f183748b = fVar;
        hashMap.put("AES_CMAC", new C67598e((C67724d) cVar.build(), 1));
        C67697c cVar2 = (C67697c) C67724d.f183745c.createBuilder();
        cVar2.copyOnWrite();
        ((C67724d) cVar2.instance).f183747a = 32;
        C67751e eVar2 = (C67751e) C67766f.f183855b.createBuilder();
        eVar2.copyOnWrite();
        ((C67766f) eVar2.instance).f183857a = 16;
        C67766f fVar2 = (C67766f) eVar2.build();
        cVar2.copyOnWrite();
        fVar2.getClass();
        ((C67724d) cVar2.instance).f183748b = fVar2;
        hashMap.put("AES256_CMAC", new C67598e((C67724d) cVar2.build(), 1));
        C67697c cVar3 = (C67697c) C67724d.f183745c.createBuilder();
        cVar3.copyOnWrite();
        ((C67724d) cVar3.instance).f183747a = 32;
        C67751e eVar3 = (C67751e) C67766f.f183855b.createBuilder();
        eVar3.copyOnWrite();
        ((C67766f) eVar3.instance).f183857a = 16;
        C67766f fVar3 = (C67766f) eVar3.build();
        cVar3.copyOnWrite();
        fVar3.getClass();
        ((C67724d) cVar3.instance).f183748b = fVar3;
        hashMap.put("AES256_CMAC_RAW", new C67598e((C67724d) cVar3.build(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67724d dVar = (C67724d) messageLite;
        C67766f fVar = dVar.f183748b;
        if (fVar == null) {
            fVar = C67766f.f183855b;
        }
        C67625d.m97792g(fVar);
        C67625d.m97793h(dVar.f183747a);
    }
}
