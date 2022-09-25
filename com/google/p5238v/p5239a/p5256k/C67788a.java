package com.google.p5238v.p5239a.p5256k;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67673bc;
import com.google.p5238v.p5239a.p5255j.C67675be;
import com.google.p5238v.p5239a.p5255j.C67677bg;
import com.google.p5238v.p5239a.p5255j.C67678bh;
import com.google.p5238v.p5239a.p5255j.C67698ca;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5256k.p5257a.C67789a;
import com.google.p5238v.p5239a.p5259m.C67836ai;
import com.google.p5238v.p5239a.p5259m.C67864bj;
import com.google.p5238v.p5239a.p5259m.C67889s;
import com.google.protobuf.MessageLite;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.v.a.k.a */
/* compiled from: PG */
final class C67788a extends C67612s {
    public C67788a(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67675be beVar = (C67675be) messageLite;
        C67677bg bgVar = beVar.f183651b;
        if (bgVar == null) {
            bgVar = C67677bg.f183653e;
        }
        C67673bc bcVar = bgVar.f183656b;
        if (bcVar == null) {
            bcVar = C67673bc.f183643d;
        }
        int b = C67698ca.m97840b(bcVar.f183646b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        ECPrivateKey j = C67836ai.m98009j(C67789a.m97856c(b), beVar.f183652c.mo59174N());
        C67677bg bgVar2 = beVar.f183651b;
        if (bgVar2 == null) {
            bgVar2 = C67677bg.f183653e;
        }
        C67673bc bcVar2 = bgVar2.f183656b;
        if (bcVar2 == null) {
            bcVar2 = C67673bc.f183643d;
        }
        int b2 = C67698ca.m97840b(bcVar2.f183646b);
        if (b2 == 0) {
            b2 = 1;
        }
        int c = C67789a.m97856c(b2);
        C67677bg bgVar3 = beVar.f183651b;
        if (bgVar3 == null) {
            bgVar3 = C67677bg.f183653e;
        }
        byte[] N = bgVar3.f183657c.mo59174N();
        C67677bg bgVar4 = beVar.f183651b;
        if (bgVar4 == null) {
            bgVar4 = C67677bg.f183653e;
        }
        ECPublicKey k = C67836ai.m98010k(c, N, bgVar4.f183658d.mo59174N());
        C67677bg bgVar5 = beVar.f183651b;
        if (bgVar5 == null) {
            bgVar5 = C67677bg.f183653e;
        }
        C67673bc bcVar3 = bgVar5.f183656b;
        if (bcVar3 == null) {
            bcVar3 = C67673bc.f183643d;
        }
        int b3 = C67701cd.m97842b(bcVar3.f183645a);
        if (b3 == 0) {
            b3 = 1;
        }
        int e = C67789a.m97858e(b3);
        C67677bg bgVar6 = beVar.f183651b;
        if (bgVar6 == null) {
            bgVar6 = C67677bg.f183653e;
        }
        C67673bc bcVar4 = bgVar6.f183656b;
        if (bcVar4 == null) {
            bcVar4 = C67673bc.f183643d;
        }
        int a = C67678bh.m97838a(bcVar4.f183647c);
        if (a == 0) {
            a = 1;
        }
        C67864bj.m98065a(j, k, e, C67789a.m97857d(a));
        C67677bg bgVar7 = beVar.f183651b;
        if (bgVar7 == null) {
            bgVar7 = C67677bg.f183653e;
        }
        C67673bc bcVar5 = bgVar7.f183656b;
        if (bcVar5 == null) {
            bcVar5 = C67673bc.f183643d;
        }
        int b4 = C67701cd.m97842b(bcVar5.f183645a);
        if (b4 == 0) {
            b4 = 1;
        }
        int e2 = C67789a.m97858e(b4);
        C67677bg bgVar8 = beVar.f183651b;
        if (bgVar8 == null) {
            bgVar8 = C67677bg.f183653e;
        }
        C67673bc bcVar6 = bgVar8.f183656b;
        if (bcVar6 == null) {
            bcVar6 = C67673bc.f183643d;
        }
        int a2 = C67678bh.m97838a(bcVar6.f183647c);
        if (a2 != 0) {
            i = a2;
        }
        return new C67889s(j, e2, C67789a.m97857d(i));
    }
}
