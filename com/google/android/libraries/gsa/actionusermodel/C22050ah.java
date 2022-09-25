package com.google.android.libraries.gsa.actionusermodel;

import com.google.assistant.p3897e.p3912f.C51220o;
import com.google.common.p4522b.C58468gd;
import com.google.p4184bj.p4193c.p4200e.C55993a;
import com.google.p4184bj.p4193c.p4200e.C55994b;
import com.google.p4184bj.p4193c.p4200e.C55995c;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import com.google.protos.p4985f.p4986a.C64654ah;
import com.google.protos.p4985f.p4986a.C64655ai;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ah */
/* compiled from: PG */
public final /* synthetic */ class C22050ah implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C22050ah f60777a = new C22050ah();

    private /* synthetic */ C22050ah() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C64655ai aiVar = (C64655ai) obj;
        C58468gd gdVar = C22063au.f60791a;
        C55994b bVar = aiVar.f175257b;
        if (bVar == null) {
            bVar = C55994b.f149106h;
        }
        C55996d dVar = bVar.f149112e;
        if (dVar == null) {
            dVar = C55996d.f149115h;
        }
        if (dVar.f149120d.size() != 0) {
            return aiVar;
        }
        C55994b bVar2 = aiVar.f175257b;
        if (bVar2 == null) {
            bVar2 = C55994b.f149106h;
        }
        C55996d dVar2 = bVar2.f149112e;
        if (dVar2 == null) {
            dVar2 = C55996d.f149115h;
        }
        if (dVar2.f149119c.size() <= 0) {
            return aiVar;
        }
        C55994b bVar3 = aiVar.f175257b;
        if (bVar3 == null) {
            bVar3 = C55994b.f149106h;
        }
        C55996d dVar3 = bVar3.f149112e;
        if (dVar3 == null) {
            dVar3 = C55996d.f149115h;
        }
        C55995c cVar = (C55995c) dVar3.toBuilder();
        C55994b bVar4 = aiVar.f175257b;
        if (bVar4 == null) {
            bVar4 = C55994b.f149106h;
        }
        C55996d dVar4 = bVar4.f149112e;
        if (dVar4 == null) {
            dVar4 = C55996d.f149115h;
        }
        cVar.mo54309b(C22063au.m41298a((C51220o) dVar4.f149119c.get(0)));
        C55994b bVar5 = aiVar.f175257b;
        if (bVar5 == null) {
            bVar5 = C55994b.f149106h;
        }
        C55993a aVar = (C55993a) bVar5.toBuilder();
        aVar.copyOnWrite();
        C55994b bVar6 = (C55994b) aVar.instance;
        C55996d dVar5 = (C55996d) cVar.build();
        dVar5.getClass();
        bVar6.f149112e = dVar5;
        bVar6.f149108a |= 16;
        C64654ah ahVar = (C64654ah) aiVar.toBuilder();
        ahVar.copyOnWrite();
        C64655ai aiVar2 = (C64655ai) ahVar.instance;
        C55994b bVar7 = (C55994b) aVar.build();
        bVar7.getClass();
        aiVar2.f175257b = bVar7;
        aiVar2.f175256a |= 1;
        return (C64655ai) ahVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
