package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67748dx;
import com.google.p5238v.p5239a.p5255j.C67753eb;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

/* renamed from: com.google.v.a.k.s */
/* compiled from: PG */
final class C67807s extends C67600g {
    public C67807s() {
        super(C67753eb.class, new C67806r(C67537ah.class));
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67753eb) C62942bv.parseFrom((C62942bv) C67753eb.f183817e, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67753eb ebVar = (C67753eb) messageLite;
        C67870bp.m98087e(ebVar.f183819a);
        int i = 1;
        C67870bp.m98084b(new BigInteger(1, ebVar.f183821c.mo59174N()).bitLength());
        C67870bp.m98085c(new BigInteger(1, ebVar.f183822d.mo59174N()));
        C67748dx dxVar = ebVar.f183820b;
        if (dxVar == null) {
            dxVar = C67748dx.f183804b;
        }
        int b = C67701cd.m97842b(dxVar.f183806a);
        if (b != 0) {
            i = b;
        }
        C67789a.m97858e(i);
    }

    /* renamed from: f */
    public final int mo59902f() {
        return 2;
    }
}
