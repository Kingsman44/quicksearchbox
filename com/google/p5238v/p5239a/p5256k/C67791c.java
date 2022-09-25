package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67669az;
import com.google.p5238v.p5239a.p5255j.C67671ba;
import com.google.p5238v.p5239a.p5255j.C67672bb;
import com.google.p5238v.p5239a.p5255j.C67673bc;
import com.google.p5238v.p5239a.p5255j.C67675be;
import com.google.p5238v.p5239a.p5255j.C67677bg;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.k.c */
/* compiled from: PG */
public final class C67791c extends C67613t {
    public C67791c() {
        super(C67675be.class, new C67788a(C67536ag.class));
    }

    /* renamed from: g */
    public static C67598e m97863g(int i, int i2, int i3, int i4) {
        C67672bb bbVar = (C67672bb) C67673bc.f183643d.createBuilder();
        bbVar.copyOnWrite();
        ((C67673bc) bbVar.instance).f183645a = C67701cd.m97841a(i);
        bbVar.copyOnWrite();
        ((C67673bc) bbVar.instance).f183646b = C67698ca.m97839a(i2);
        bbVar.copyOnWrite();
        ((C67673bc) bbVar.instance).f183647c = i3 - 2;
        C67673bc bcVar = (C67673bc) bbVar.build();
        C67669az azVar = (C67669az) C67671ba.f183640b.createBuilder();
        azVar.copyOnWrite();
        bcVar.getClass();
        ((C67671ba) azVar.instance).f183642a = bcVar;
        return new C67598e((C67671ba) azVar.build(), i4);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67790b(C67671ba.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67675be) C62942bv.parseFrom((C62942bv) C67675be.f183648d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67675be beVar = (C67675be) messageLite;
        C67870bp.m98087e(beVar.f183650a);
        C67677bg bgVar = beVar.f183651b;
        if (bgVar == null) {
            bgVar = C67677bg.f183653e;
        }
        C67673bc bcVar = bgVar.f183656b;
        if (bcVar == null) {
            bcVar = C67673bc.f183643d;
        }
        C67789a.m97854a(bcVar);
    }

    /* renamed from: f */
    public final int mo59902f() {
        return 2;
    }
}
