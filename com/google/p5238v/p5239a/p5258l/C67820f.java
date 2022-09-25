package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.C67540ak;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67647ad;
import com.google.p5238v.p5239a.p5255j.C67648ae;
import com.google.p5238v.p5239a.p5255j.C67649af;
import com.google.p5238v.p5239a.p5255j.C67650ag;
import com.google.p5238v.p5239a.p5255j.C67651ah;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.l.f */
/* compiled from: PG */
public final class C67820f extends C67600g {
    public C67820f() {
        super(C67647ad.class, new C67818d(C67540ak.class));
    }

    /* renamed from: g */
    public static void m97958g(C67651ah ahVar) {
        C67870bp.m98083a(ahVar.f183606b);
        int b = C67701cd.m97842b(ahVar.f183607c);
        if (b != 0 && b == 2) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        } else if (ahVar.f183605a < ahVar.f183606b + 25) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    /* renamed from: h */
    public static C67649af m97959h(int i, int i2, int i3) {
        C67650ag agVar = (C67650ag) C67651ah.f183603d.createBuilder();
        agVar.copyOnWrite();
        ((C67651ah) agVar.instance).f183605a = i3;
        agVar.copyOnWrite();
        ((C67651ah) agVar.instance).f183606b = i2;
        agVar.copyOnWrite();
        ((C67651ah) agVar.instance).f183607c = C67701cd.m97841a(5);
        C67651ah ahVar = (C67651ah) agVar.build();
        C67648ae aeVar = (C67648ae) C67649af.f183599c.createBuilder();
        aeVar.copyOnWrite();
        ((C67649af) aeVar.instance).f183602b = i;
        aeVar.copyOnWrite();
        ahVar.getClass();
        ((C67649af) aeVar.instance).f183601a = ahVar;
        return (C67649af) aeVar.build();
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67819e(C67649af.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67647ad) C62942bv.parseFrom((C62942bv) C67647ad.f183594d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67647ad adVar = (C67647ad) messageLite;
        C67870bp.m98087e(adVar.f183596a);
        C67651ah ahVar = adVar.f183597b;
        if (ahVar == null) {
            ahVar = C67651ah.f183603d;
        }
        m97958g(ahVar);
    }
}
