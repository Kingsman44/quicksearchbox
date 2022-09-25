package com.google.p5238v.p5239a.p5240a;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67599f;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5251g.C67631j;
import com.google.p5238v.p5239a.p5255j.C67701cd;
import com.google.p5238v.p5239a.p5255j.C67703cf;
import com.google.p5238v.p5239a.p5255j.C67704cg;
import com.google.p5238v.p5239a.p5255j.C67705ch;
import com.google.p5238v.p5239a.p5255j.C67706ci;
import com.google.p5238v.p5239a.p5255j.C67707cj;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67768h;
import com.google.p5238v.p5239a.p5255j.C67769i;
import com.google.p5238v.p5239a.p5255j.C67770j;
import com.google.p5238v.p5239a.p5255j.C67778r;
import com.google.p5238v.p5239a.p5255j.C67779s;
import com.google.p5238v.p5239a.p5255j.C67780t;
import com.google.p5238v.p5239a.p5255j.C67781u;
import com.google.p5238v.p5239a.p5255j.C67782v;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.v.a.a.f */
/* compiled from: PG */
public final class C67509f extends C67600g {
    public C67509f() {
        super(C67768h.class, new C67507d(C67486a.class));
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ C67598e m97542g(int i, int i2, int i3) {
        C67779s sVar = (C67779s) C67780t.f183887c.createBuilder();
        C67781u uVar = (C67781u) C67782v.f183891b.createBuilder();
        uVar.copyOnWrite();
        ((C67782v) uVar.instance).f183893a = 16;
        C67782v vVar = (C67782v) uVar.build();
        sVar.copyOnWrite();
        vVar.getClass();
        ((C67780t) sVar.instance).f183889a = vVar;
        sVar.copyOnWrite();
        ((C67780t) sVar.instance).f183890b = i;
        C67780t tVar = (C67780t) sVar.build();
        C67704cg cgVar = (C67704cg) C67705ch.f183706c.createBuilder();
        C67706ci ciVar = (C67706ci) C67707cj.f183710c.createBuilder();
        ciVar.copyOnWrite();
        ((C67707cj) ciVar.instance).f183712a = C67701cd.m97841a(5);
        ciVar.copyOnWrite();
        ((C67707cj) ciVar.instance).f183713b = i2;
        C67707cj cjVar = (C67707cj) ciVar.build();
        cgVar.copyOnWrite();
        cjVar.getClass();
        ((C67705ch) cgVar.instance).f183708a = cjVar;
        cgVar.copyOnWrite();
        ((C67705ch) cgVar.instance).f183709b = 32;
        C67705ch chVar = (C67705ch) cgVar.build();
        C67769i iVar = (C67769i) C67770j.f183863c.createBuilder();
        iVar.copyOnWrite();
        tVar.getClass();
        ((C67770j) iVar.instance).f183865a = tVar;
        iVar.copyOnWrite();
        chVar.getClass();
        ((C67770j) iVar.instance).f183866b = chVar;
        return new C67598e((C67770j) iVar.build(), i3);
    }

    /* renamed from: a */
    public final C67599f mo59891a() {
        return new C67508e(C67770j.class);
    }

    /* renamed from: b */
    public final C67720cw mo59892b() {
        return C67720cw.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ MessageLite mo59893c(C63088z zVar) {
        return (C67768h) C62942bv.parseFrom((C62942bv) C67768h.f183858d, zVar, C62921ba.f169869a);
    }

    /* renamed from: d */
    public final String mo59894d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo59895e(MessageLite messageLite) {
        C67768h hVar = (C67768h) messageLite;
        C67870bp.m98087e(hVar.f183860a);
        new C67512i();
        C67778r rVar = hVar.f183861b;
        if (rVar == null) {
            rVar = C67778r.f183882d;
        }
        C67512i.m97554h(rVar);
        new C67631j();
        C67703cf cfVar = hVar.f183862c;
        if (cfVar == null) {
            cfVar = C67703cf.f183701d;
        }
        C67631j.m97810h(cfVar);
    }

    /* renamed from: f */
    public final int mo59902f() {
        return 2;
    }
}
