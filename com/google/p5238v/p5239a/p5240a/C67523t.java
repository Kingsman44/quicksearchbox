package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67664au;
import com.google.p5238v.p5239a.p5255j.C67665av;
import com.google.p5238v.p5239a.p5255j.C67667ax;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.a.t */
/* compiled from: PG */
final class C67523t extends C67599f {
    public C67523t(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67667ax axVar = (C67667ax) messageLite;
        C67664au auVar = (C67664au) C67665av.f183629c.createBuilder();
        auVar.copyOnWrite();
        ((C67665av) auVar.instance).f183631a = 0;
        C63088z A = C63088z.m96139A(C67859be.m98062a(32));
        auVar.copyOnWrite();
        ((C67665av) auVar.instance).f183632b = A;
        return (C67665av) auVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67667ax) C62942bv.parseFrom((C62942bv) C67667ax.f183633a, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new C67598e(C67667ax.f183633a, 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new C67598e(C67667ax.f183633a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67667ax axVar = (C67667ax) messageLite;
    }
}
