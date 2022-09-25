package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67757ef;
import com.google.p5238v.p5239a.p5255j.C67761ej;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

/* renamed from: com.google.v.a.k.x */
/* compiled from: PG */
final class C67812x extends C67600g {
    public C67812x() {
        super(C67761ej.class, new C67811w(C67537ah.class));
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67761ej) C62942bv.parseFrom((C62942bv) C67761ej.f183843e, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67761ej ejVar = (C67761ej) messageLite;
        C67870bp.m98087e(ejVar.f183845a);
        C67870bp.m98084b(new BigInteger(1, ejVar.f183847c.mo59174N()).bitLength());
        C67870bp.m98085c(new BigInteger(1, ejVar.f183848d.mo59174N()));
        C67757ef efVar = ejVar.f183846b;
        if (efVar == null) {
            efVar = C67757ef.f183828d;
        }
        C67789a.m97855b(efVar);
    }
}
