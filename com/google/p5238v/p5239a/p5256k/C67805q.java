package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67745du;
import com.google.p5238v.p5239a.p5255j.C67746dv;
import com.google.p5238v.p5239a.p5255j.C67747dw;
import com.google.p5238v.p5239a.p5255j.C67748dx;
import com.google.p5238v.p5239a.p5255j.C67750dz;
import com.google.p5238v.p5239a.p5255j.C67753eb;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.math.BigInteger;

/* renamed from: com.google.v.a.k.q */
/* compiled from: PG */
public final class C67805q extends C67613t {
    public C67805q() {
        super(C67750dz.class, new C67803o(C67536ag.class));
    }

    /* renamed from: g */
    public static C67746dv m97904g(int i, int i2, BigInteger bigInteger) {
        C67747dw dwVar = (C67747dw) C67748dx.f183804b.createBuilder();
        dwVar.copyOnWrite();
        ((C67748dx) dwVar.instance).f183806a = C67701cd.m97841a(i);
        C67748dx dxVar = (C67748dx) dwVar.build();
        C67745du duVar = (C67745du) C67746dv.f183799d.createBuilder();
        duVar.copyOnWrite();
        dxVar.getClass();
        ((C67746dv) duVar.instance).f183801a = dxVar;
        duVar.copyOnWrite();
        ((C67746dv) duVar.instance).f183802b = i2;
        C63088z A = C63088z.m96139A(bigInteger.toByteArray());
        duVar.copyOnWrite();
        ((C67746dv) duVar.instance).f183803c = A;
        return (C67746dv) duVar.build();
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67804p(C67746dv.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67750dz) C62942bv.parseFrom((C62942bv) C67750dz.f183807i, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67750dz dzVar = (C67750dz) messageLite;
        C67870bp.m98087e(dzVar.f183809a);
        C67753eb ebVar = dzVar.f183810b;
        if (ebVar == null) {
            ebVar = C67753eb.f183817e;
        }
        int i = 1;
        C67870bp.m98084b(new BigInteger(1, ebVar.f183821c.mo59174N()).bitLength());
        C67753eb ebVar2 = dzVar.f183810b;
        if (ebVar2 == null) {
            ebVar2 = C67753eb.f183817e;
        }
        C67870bp.m98085c(new BigInteger(1, ebVar2.f183822d.mo59174N()));
        C67753eb ebVar3 = dzVar.f183810b;
        if (ebVar3 == null) {
            ebVar3 = C67753eb.f183817e;
        }
        C67748dx dxVar = ebVar3.f183820b;
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
