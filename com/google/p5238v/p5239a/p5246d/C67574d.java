package com.google.p5238v.p5239a.p5246d;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67668ay;
import com.google.p5238v.p5239a.p5255j.C67680bj;
import com.google.p5238v.p5239a.p5255j.C67684bn;
import com.google.p5238v.p5239a.p5255j.C67688br;
import com.google.p5238v.p5239a.p5255j.C67690bt;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.p5238v.p5239a.p5259m.C67836ai;
import com.google.p5238v.p5239a.p5259m.C67893w;
import com.google.protobuf.MessageLite;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.v.a.d.d */
/* compiled from: PG */
final class C67574d extends C67612s {
    public C67574d(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67688br brVar = (C67688br) messageLite;
        C67684bn bnVar = brVar.f183678b;
        if (bnVar == null) {
            bnVar = C67684bn.f183665d;
        }
        C67690bt btVar = bnVar.f183667a;
        if (btVar == null) {
            btVar = C67690bt.f183681d;
        }
        int b = C67698ca.m97840b(btVar.f183683a);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPublicKey k = C67836ai.m98010k(C67581k.m97739c(b), brVar.f183679c.mo59174N(), brVar.f183680d.mo59174N());
        C67680bj bjVar = bnVar.f183668b;
        if (bjVar == null) {
            bjVar = C67680bj.f183659b;
        }
        C67725da daVar = bjVar.f183661a;
        if (daVar == null) {
            daVar = C67725da.f183749d;
        }
        C67582l lVar = new C67582l(daVar);
        byte[] N = btVar.f183685c.mo59174N();
        int b2 = C67701cd.m97842b(btVar.f183684b);
        if (b2 == 0) {
            b2 = 1;
        }
        String b3 = C67581k.m97738b(b2);
        int b4 = C67668ay.m97837b(bnVar.f183669c);
        if (b4 != 0) {
            i = b4;
        }
        return new C67893w(k, N, b3, C67581k.m97740d(i), lVar);
    }
}
