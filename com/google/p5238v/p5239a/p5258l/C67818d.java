package com.google.p5238v.p5239a.p5258l;

import com.google.p5238v.p5239a.p5250f.C67612s;
import com.google.p5238v.p5239a.p5255j.C67647ad;
import com.google.p5238v.p5239a.p5255j.C67651ah;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5259m.C67881k;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.l.d */
/* compiled from: PG */
final class C67818d extends C67612s {
    public C67818d(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo59896a(MessageLite messageLite) {
        C67647ad adVar = (C67647ad) messageLite;
        byte[] N = adVar.f183598c.mo59174N();
        C67651ah ahVar = adVar.f183597b;
        if (ahVar == null) {
            ahVar = C67651ah.f183603d;
        }
        int b = C67701cd.m97842b(ahVar.f183607c);
        if (b == 0) {
            b = 1;
        }
        String a = C67824j.m97968a(b);
        C67651ah ahVar2 = adVar.f183597b;
        int i = (ahVar2 == null ? C67651ah.f183603d : ahVar2).f183606b;
        if (ahVar2 == null) {
            ahVar2 = C67651ah.f183603d;
        }
        return new C67881k(N, a, i, ahVar2.f183605a);
    }
}
