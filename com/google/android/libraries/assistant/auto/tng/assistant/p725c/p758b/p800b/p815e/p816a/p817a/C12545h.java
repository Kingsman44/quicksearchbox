package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p817a;

import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4757ac.p4758a.C63108g;
import com.google.protos.p4757ac.p4758a.C63109h;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63112k;
import com.google.protos.p4757ac.p4758a.C63113l;
import com.google.protos.p4850an.p4855d.p4858c.C63537j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C12545h implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f39477a;

    /* renamed from: b */
    public final /* synthetic */ String f39478b;

    public /* synthetic */ C12545h(String str, String str2) {
        this.f39477a = str;
        this.f39478b = str2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f39477a;
        String str2 = this.f39478b;
        C63537j jVar = (C63537j) obj;
        C63108g gVar = (C63108g) C63109h.f170342e.createBuilder();
        C63112k kVar = (C63112k) C63113l.f170365p.createBuilder();
        kVar.copyOnWrite();
        C63113l lVar = (C63113l) kVar.instance;
        str.getClass();
        lVar.f170367a |= 1;
        lVar.f170368b = str;
        String str3 = jVar.f171856c;
        kVar.copyOnWrite();
        C63113l lVar2 = (C63113l) kVar.instance;
        str3.getClass();
        lVar2.f170367a |= 64;
        lVar2.f170373g = str3;
        String str4 = jVar.f171854a;
        kVar.copyOnWrite();
        C63113l lVar3 = (C63113l) kVar.instance;
        str4.getClass();
        lVar3.f170367a |= 512;
        lVar3.f170375i = str4;
        String str5 = jVar.f171855b;
        kVar.copyOnWrite();
        C63113l lVar4 = (C63113l) kVar.instance;
        str5.getClass();
        C62971cq cqVar = lVar4.f170381o;
        if (!cqVar.mo58948c()) {
            lVar4.f170381o = C62942bv.mutableCopy(cqVar);
        }
        lVar4.f170381o.add(str5);
        C63113l lVar5 = (C63113l) kVar.build();
        gVar.copyOnWrite();
        C63109h hVar = (C63109h) gVar.instance;
        lVar5.getClass();
        hVar.f170345b = lVar5;
        hVar.f170344a |= 1;
        C63110i iVar = (C63110i) C63111j.f170348p.createBuilder();
        String str6 = jVar.f171855b;
        iVar.copyOnWrite();
        C63111j jVar2 = (C63111j) iVar.instance;
        str6.getClass();
        jVar2.f170350a |= 32;
        jVar2.f170356g = str6;
        String str7 = jVar.f171857d;
        iVar.copyOnWrite();
        C63111j jVar3 = (C63111j) iVar.instance;
        str7.getClass();
        jVar3.f170350a |= 1;
        jVar3.f170351b = str7;
        String str8 = jVar.f171854a;
        iVar.copyOnWrite();
        C63111j jVar4 = (C63111j) iVar.instance;
        str8.getClass();
        jVar4.f170350a |= 64;
        jVar4.f170357h = str8;
        iVar.copyOnWrite();
        C63111j jVar5 = (C63111j) iVar.instance;
        str2.getClass();
        jVar5.f170350a |= 4;
        jVar5.f170353d = str2;
        String str9 = jVar.f171856c;
        iVar.copyOnWrite();
        C63111j jVar6 = (C63111j) iVar.instance;
        str9.getClass();
        jVar6.f170350a |= 8;
        jVar6.f170354e = str9;
        gVar.mo59180a((C63111j) iVar.build());
        return (C63109h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
