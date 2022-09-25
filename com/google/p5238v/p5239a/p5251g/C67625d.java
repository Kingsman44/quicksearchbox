package com.google.p5238v.p5239a.p5251g;

import com.google.p5238v.p5239a.C67909y;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67670b;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67724d;
import com.google.p5238v.p5239a.p5255j.C67766f;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.g.d */
/* compiled from: PG */
public final class C67625d extends C67600g {
    public C67625d() {
        super(C67670b.class, new C67623b(C67909y.class));
    }

    /* renamed from: g */
    public static void m97792g(C67766f fVar) {
        int i = fVar.f183857a;
        if (i < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (i > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: h */
    public static void m97793h(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67624c(C67724d.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67670b) C62942bv.parseFrom((C62942bv) C67670b.f183635d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67670b bVar = (C67670b) messageLite;
        C67870bp.m98087e(bVar.f183637a);
        m97793h(bVar.f183638b.mo59031d());
        C67766f fVar = bVar.f183639c;
        if (fVar == null) {
            fVar = C67766f.f183855b;
        }
        m97792g(fVar);
    }
}
