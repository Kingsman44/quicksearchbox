package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67762ek;
import com.google.p5238v.p5239a.p5255j.C67763el;
import com.google.p5238v.p5239a.p5255j.C67765en;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.v.a.a.ad */
/* compiled from: PG */
final class C67501ad extends C67599f {
    public C67501ad(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67765en enVar = (C67765en) messageLite;
        C67762ek ekVar = (C67762ek) C67763el.f183849c.createBuilder();
        ekVar.copyOnWrite();
        ((C67763el) ekVar.instance).f183851a = 0;
        C63088z A = C63088z.m96139A(C67859be.m98062a(32));
        ekVar.copyOnWrite();
        ((C67763el) ekVar.instance).f183852b = A;
        return (C67763el) ekVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67765en) C62942bv.parseFrom((C62942bv) C67765en.f183853a, zVar, C62921ba.f169869a);
    }

    /* renamed from: c */
    public final Map mo59897c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new C67598e(C67765en.f183853a, 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new C67598e(C67765en.f183853a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67765en enVar = (C67765en) messageLite;
    }
}
