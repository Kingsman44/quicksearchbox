package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67673bc;
import com.google.p5238v.p5239a.p5255j.C67677bg;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.k.e */
/* compiled from: PG */
final class C67793e extends C67600g {
    public C67793e() {
        super(C67677bg.class, new C67792d(C67537ah.class));
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67677bg) C62942bv.parseFrom((C62942bv) C67677bg.f183653e, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67677bg bgVar = (C67677bg) messageLite;
        C67870bp.m98087e(bgVar.f183655a);
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
