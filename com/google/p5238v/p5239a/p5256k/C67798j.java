package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67696bz;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.k.j */
/* compiled from: PG */
final class C67798j extends C67600g {
    public C67798j() {
        super(C67696bz.class, new C67797i(C67537ah.class));
    }

    /* renamed from: g */
    public static final void m97887g(C67696bz bzVar) {
        C67870bp.m98087e(bzVar.f183695a);
        if (bzVar.f183696b.mo59031d() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67696bz) C62942bv.parseFrom((C62942bv) C67696bz.f183693c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        m97887g((C67696bz) messageLite);
    }
}
