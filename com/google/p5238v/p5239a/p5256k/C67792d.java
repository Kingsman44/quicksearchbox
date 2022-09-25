package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67673bc;
import com.google.p5238v.p5239a.p5255j.C67677bg;
import com.google.p5238v.p5239a.p5255j.C67678bh;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67836ai;
import com.google.p5238v.p5239a.p5259m.C67890t;
import com.google.protobuf.MessageLite;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.v.a.k.d */
/* compiled from: PG */
final class C67792d extends C67612s {
    public C67792d(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67677bg bgVar = (C67677bg) messageLite;
        C67673bc bcVar = bgVar.f183656b;
        if (bcVar == null) {
            bcVar = C67673bc.f183643d;
        }
        int b = C67698ca.m97840b(bcVar.f183646b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPublicKey k = C67836ai.m98010k(C67789a.m97856c(b), bgVar.f183657c.mo59174N(), bgVar.f183658d.mo59174N());
        C67673bc bcVar2 = bgVar.f183656b;
        if (bcVar2 == null) {
            bcVar2 = C67673bc.f183643d;
        }
        int b2 = C67701cd.m97842b(bcVar2.f183645a);
        if (b2 == 0) {
            b2 = 1;
        }
        int e = C67789a.m97858e(b2);
        C67673bc bcVar3 = bgVar.f183656b;
        if (bcVar3 == null) {
            bcVar3 = C67673bc.f183643d;
        }
        int a = C67678bh.m97838a(bcVar3.f183647c);
        if (a != 0) {
            i = a;
        }
        return new C67890t(k, e, C67789a.m97857d(i));
    }
}
