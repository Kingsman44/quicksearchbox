package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67692bv;
import com.google.p5238v.p5239a.p5255j.C67694bx;
import com.google.p5238v.p5239a.p5255j.C67696bz;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.k.h */
/* compiled from: PG */
public final class C67796h extends C67613t {
    public C67796h() {
        super(C67694bx.class, new C67794f(C67536ag.class));
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67795g(C67692bv.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67694bx) C62942bv.parseFrom((C62942bv) C67694bx.f183688d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67694bx bxVar = (C67694bx) messageLite;
        C67870bp.m98087e(bxVar.f183690a);
        new C67798j();
        C67696bz bzVar = bxVar.f183692c;
        if (bzVar == null) {
            bzVar = C67696bz.f183693c;
        }
        C67798j.m97887g(bzVar);
        if (bxVar.f183691b.mo59031d() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
