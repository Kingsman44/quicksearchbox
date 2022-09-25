package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5255j.C67777q;
import com.google.p5238v.p5239a.p5255j.C67778r;
import com.google.p5238v.p5239a.p5255j.C67780t;
import com.google.p5238v.p5239a.p5255j.C67782v;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.a.h */
/* compiled from: PG */
final class C67511h extends C67599f {
    public C67511h(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ MessageLite mo59888a(MessageLite messageLite) {
        C67780t tVar = (C67780t) messageLite;
        C67777q qVar = (C67777q) C67778r.f183882d.createBuilder();
        C67782v vVar = tVar.f183889a;
        if (vVar == null) {
            vVar = C67782v.f183891b;
        }
        qVar.copyOnWrite();
        vVar.getClass();
        ((C67778r) qVar.instance).f183885b = vVar;
        C63088z A = C63088z.m96139A(C67859be.m98062a(tVar.f183890b));
        qVar.copyOnWrite();
        ((C67778r) qVar.instance).f183886c = A;
        qVar.copyOnWrite();
        ((C67778r) qVar.instance).f183884a = 0;
        return (C67778r) qVar.build();
    }

    /* renamed from: b */
    public final /* synthetic */ MessageLite mo59889b(C63088z zVar) {
        return (C67780t) C62942bv.parseFrom((C62942bv) C67780t.f183887c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo59890d(MessageLite messageLite) {
        C67780t tVar = (C67780t) messageLite;
        C67870bp.m98083a(tVar.f183890b);
        C67782v vVar = tVar.f183889a;
        if (vVar == null) {
            vVar = C67782v.f183891b;
        }
        C67512i.m97553g(vVar);
    }
}
