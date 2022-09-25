package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.C67620g;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5255j.C67714cq;
import com.google.p5238v.p5239a.p5255j.C67718cu;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.d.a.o */
/* compiled from: PG */
public final class C67568o extends C67600g {
    public C67568o() {
        super(C67718cu.class, new C67567n(C67620g.class));
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PUBLIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67718cu) C62942bv.parseFrom((C62942bv) C67718cu.f183727d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67718cu cuVar = (C67718cu) messageLite;
        C67870bp.m98087e(cuVar.f183729a);
        C67714cq cqVar = cuVar.f183730b;
        if (cqVar != null) {
            C67569p.m97703a(cqVar);
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
