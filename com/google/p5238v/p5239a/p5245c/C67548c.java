package com.google.p5238v.p5239a.p5245c;

import com.google.p5238v.p5239a.C67583e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67661ar;
import com.google.p5238v.p5239a.p5255j.C67663at;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.InvalidKeyException;

/* renamed from: com.google.v.a.c.c */
/* compiled from: PG */
public final class C67548c extends C67600g {
    public C67548c() {
        super(C67661ar.class, new C67546a(C67583e.class));
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67547b(C67663at.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67661ar) C62942bv.parseFrom((C62942bv) C67661ar.f183622c, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67661ar arVar = (C67661ar) messageLite;
        C67870bp.m98087e(arVar.f183624a);
        if (arVar.f183625b.mo59031d() != 64) {
            int d = arVar.f183625b.mo59031d();
            throw new InvalidKeyException("invalid key size: " + d + ". Valid keys must have 64 bytes.");
        }
    }
}
