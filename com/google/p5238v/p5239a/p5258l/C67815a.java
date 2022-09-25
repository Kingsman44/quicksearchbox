package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67707cj;
import com.google.p5238v.p5239a.p5255j.C67772l;
import com.google.p5238v.p5239a.p5255j.C67776p;
import com.google.p5238v.p5239a.p5259m.C67873c;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.l.a */
/* compiled from: PG */
final class C67815a extends C67612s {
    public C67815a(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67772l lVar = (C67772l) messageLite;
        byte[] N = lVar.f183871c.mo59174N();
        C67776p pVar = lVar.f183870b;
        if (pVar == null) {
            pVar = C67776p.f183876e;
        }
        int b = C67701cd.m97842b(pVar.f183880c);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        String a = C67824j.m97968a(b);
        C67776p pVar2 = lVar.f183870b;
        int i2 = (pVar2 == null ? C67776p.f183876e : pVar2).f183879b;
        if (pVar2 == null) {
            pVar2 = C67776p.f183876e;
        }
        C67707cj cjVar = pVar2.f183881d;
        if (cjVar == null) {
            cjVar = C67707cj.f183710c;
        }
        int b2 = C67701cd.m97842b(cjVar.f183712a);
        if (b2 != 0) {
            i = b2;
        }
        String a2 = C67824j.m97968a(i);
        C67776p pVar3 = lVar.f183870b;
        C67707cj cjVar2 = (pVar3 == null ? C67776p.f183876e : pVar3).f183881d;
        if (cjVar2 == null) {
            cjVar2 = C67707cj.f183710c;
        }
        int i3 = cjVar2.f183713b;
        if (pVar3 == null) {
            pVar3 = C67776p.f183876e;
        }
        return new C67873c(N, a, i2, a2, i3, pVar3.f183878a);
    }
}
