package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67763el;
import com.google.p5238v.p5239a.p5255j.C67765en;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.a.ae */
/* compiled from: PG */
public final class C67502ae extends C67600g {
    public C67502ae() {
        super(C67763el.class, new C67500ac(C67486a.class));
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67501ad(C67765en.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67763el) C62942bv.parseFrom((C62942bv) C67763el.f183849c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67763el elVar = (C67763el) messageLite;
        C67870bp.m98087e(elVar.f183851a);
        if (elVar.f183852b.mo59031d() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
