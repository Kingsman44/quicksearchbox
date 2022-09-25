package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.C67590f;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67711cn;
import com.google.p5238v.p5239a.p5255j.C67712co;
import com.google.p5238v.p5239a.p5255j.C67713cp;
import com.google.p5238v.p5239a.p5255j.C67714cq;
import com.google.p5238v.p5239a.p5255j.C67716cs;
import com.google.p5238v.p5239a.p5255j.C67718cu;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.d.a.m */
/* compiled from: PG */
public final class C67566m extends C67613t {
    public C67566m() {
        super(C67716cs.class, new C67564k(C67590f.class));
    }

    /* renamed from: g */
    public static C67598e m97692g(int i, int i2, int i3, int i4) {
        C67713cp cpVar = (C67713cp) C67714cq.f183717d.createBuilder();
        cpVar.copyOnWrite();
        ((C67714cq) cpVar.instance).f183719a = i - 2;
        cpVar.copyOnWrite();
        ((C67714cq) cpVar.instance).f183720b = i2 - 2;
        cpVar.copyOnWrite();
        ((C67714cq) cpVar.instance).f183721c = i3 - 2;
        C67714cq cqVar = (C67714cq) cpVar.build();
        C67711cn cnVar = (C67711cn) C67712co.f183714b.createBuilder();
        cnVar.copyOnWrite();
        cqVar.getClass();
        ((C67712co) cnVar.instance).f183716a = cqVar;
        return new C67598e((C67712co) cnVar.build(), i4);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67565l(C67712co.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67716cs) C62942bv.parseFrom((C62942bv) C67716cs.f183722d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67716cs csVar = (C67716cs) messageLite;
        if (csVar.f183726c.mo59173M()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (csVar.f183725b != null) {
            C67870bp.m98087e(csVar.f183724a);
            C67718cu cuVar = csVar.f183725b;
            if (cuVar == null) {
                cuVar = C67718cu.f183727d;
            }
            C67714cq cqVar = cuVar.f183730b;
            if (cqVar == null) {
                cqVar = C67714cq.f183717d;
            }
            C67569p.m97703a(cqVar);
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }
}
