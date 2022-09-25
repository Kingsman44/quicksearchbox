package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67665av;
import com.google.p5238v.p5239a.p5255j.C67667ax;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.a.u */
/* compiled from: PG */
public final class C67524u extends C67600g {
    public C67524u() {
        super(C67665av.class, new C67522s(C67486a.class));
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67523t(C67667ax.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67665av) C62942bv.parseFrom((C62942bv) C67665av.f183629c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67665av avVar = (C67665av) messageLite;
        C67870bp.m98087e(avVar.f183631a);
        if (avVar.f183632b.mo59031d() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
