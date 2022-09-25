package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67653aj;
import com.google.p5238v.p5239a.p5255j.C67654ak;
import com.google.p5238v.p5239a.p5255j.C67655al;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.a.o */
/* compiled from: PG */
public final class C67518o extends C67600g {
    public C67518o() {
        super(C67653aj.class, new C67516m(C67486a.class));
    }

    /* renamed from: g */
    public static C67598e m97576g(int i, int i2) {
        C67654ak akVar = (C67654ak) C67655al.f183612b.createBuilder();
        akVar.copyOnWrite();
        ((C67655al) akVar.instance).f183614a = i;
        return new C67598e((C67655al) akVar.build(), i2);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67517n(C67655al.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67653aj) C62942bv.parseFrom((C62942bv) C67653aj.f183608c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67653aj ajVar = (C67653aj) messageLite;
        C67870bp.m98087e(ajVar.f183610a);
        C67870bp.m98083a(ajVar.f183611b.mo59031d());
    }

    /* renamed from: f */
    public final int mo59902f() {
        return 2;
    }
}
