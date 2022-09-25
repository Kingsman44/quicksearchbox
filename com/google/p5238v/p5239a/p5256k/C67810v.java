package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67754ec;
import com.google.p5238v.p5239a.p5255j.C67755ed;
import com.google.p5238v.p5239a.p5255j.C67756ee;
import com.google.p5238v.p5239a.p5255j.C67757ef;
import com.google.p5238v.p5239a.p5255j.C67759eh;
import com.google.p5238v.p5239a.p5255j.C67761ej;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

/* renamed from: com.google.v.a.k.v */
/* compiled from: PG */
public final class C67810v extends C67613t {
    public C67810v() {
        super(C67759eh.class, new C67808t(C67536ag.class));
    }

    /* renamed from: g */
    public static C67755ed m97922g(int i, int i2, int i3, int i4, BigInteger bigInteger) {
        C67756ee eeVar = (C67756ee) C67757ef.f183828d.createBuilder();
        eeVar.copyOnWrite();
        ((C67757ef) eeVar.instance).f183830a = C67701cd.m97841a(i);
        eeVar.copyOnWrite();
        ((C67757ef) eeVar.instance).f183831b = C67701cd.m97841a(i2);
        eeVar.copyOnWrite();
        ((C67757ef) eeVar.instance).f183832c = i3;
        C67757ef efVar = (C67757ef) eeVar.build();
        C67754ec ecVar = (C67754ec) C67755ed.f183823d.createBuilder();
        ecVar.copyOnWrite();
        efVar.getClass();
        ((C67755ed) ecVar.instance).f183825a = efVar;
        ecVar.copyOnWrite();
        ((C67755ed) ecVar.instance).f183826b = i4;
        C63088z A = C63088z.m96139A(bigInteger.toByteArray());
        ecVar.copyOnWrite();
        ((C67755ed) ecVar.instance).f183827c = A;
        return (C67755ed) ecVar.build();
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67809u(C67755ed.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67759eh) C62942bv.parseFrom((C62942bv) C67759eh.f183833i, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67759eh ehVar = (C67759eh) messageLite;
        C67870bp.m98087e(ehVar.f183835a);
        C67761ej ejVar = ehVar.f183836b;
        if (ejVar == null) {
            ejVar = C67761ej.f183843e;
        }
        C67870bp.m98084b(new BigInteger(1, ejVar.f183847c.mo59174N()).bitLength());
        C67761ej ejVar2 = ehVar.f183836b;
        if (ejVar2 == null) {
            ejVar2 = C67761ej.f183843e;
        }
        C67870bp.m98085c(new BigInteger(1, ejVar2.f183848d.mo59174N()));
        C67761ej ejVar3 = ehVar.f183836b;
        if (ejVar3 == null) {
            ejVar3 = C67761ej.f183843e;
        }
        C67757ef efVar = ejVar3.f183846b;
        if (efVar == null) {
            efVar = C67757ef.f183828d;
        }
        C67789a.m97855b(efVar);
    }
}
