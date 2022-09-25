package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.C67620g;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67684bn;
import com.google.p5238v.p5239a.p5255j.C67688br;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.d.e */
/* compiled from: PG */
final class C67575e extends C67600g {
    public C67575e() {
        super(C67688br.class, new C67574d(C67620g.class));
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67688br) C62942bv.parseFrom((C62942bv) C67688br.f183675e, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67688br brVar = (C67688br) messageLite;
        C67870bp.m98087e(brVar.f183677a);
        C67684bn bnVar = brVar.f183678b;
        if (bnVar == null) {
            bnVar = C67684bn.f183665d;
        }
        C67581k.m97737a(bnVar);
    }
}
