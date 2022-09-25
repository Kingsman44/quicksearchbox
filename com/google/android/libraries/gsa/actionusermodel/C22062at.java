package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.p11002ag.C147576f;
import com.google.assistant.p3897e.p3912f.C51218m;
import com.google.assistant.p3897e.p3912f.C51220o;
import com.google.common.p4522b.C58468gd;
import com.google.p4184bj.p4193c.p4200e.C55993a;
import com.google.p4184bj.p4193c.p4200e.C55994b;
import com.google.p4184bj.p4193c.p4200e.C55995c;
import com.google.p4184bj.p4193c.p4200e.C55996d;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4986a.C64654ah;
import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p4986a.C64661ao;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.at */
/* compiled from: PG */
public final /* synthetic */ class C22062at implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f60789a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f60790b;

    public /* synthetic */ C22062at(List list, AtomicBoolean atomicBoolean) {
        this.f60789a = list;
        this.f60790b = atomicBoolean;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int r;
        List<C64661ao> list = this.f60789a;
        AtomicBoolean atomicBoolean = this.f60790b;
        C64655ai aiVar = (C64655ai) obj;
        C58468gd gdVar = C22063au.f60791a;
        C55994b bVar = aiVar.f175257b;
        if (bVar == null) {
            bVar = C55994b.f149106h;
        }
        if ((bVar.f149108a & 16) == 0) {
            return aiVar;
        }
        C55994b bVar2 = aiVar.f175257b;
        if (bVar2 == null) {
            bVar2 = C55994b.f149106h;
        }
        C55996d dVar = bVar2.f149112e;
        if (dVar == null) {
            dVar = C55996d.f149115h;
        }
        C62971cq cqVar = dVar.f149119c;
        C55996d dVar2 = bVar2.f149112e;
        if (dVar2 == null) {
            dVar2 = C55996d.f149115h;
        }
        C55995c cVar = (C55995c) dVar2.toBuilder();
        for (C64661ao aoVar : list) {
            String str = aoVar.f175267b;
            for (int i = 0; i < cqVar.size(); i++) {
                C51220o oVar = (C51220o) cqVar.get(i);
                if ((oVar.f133352a & 8) != 0 && !str.equals(oVar.f133356e) && ((r = C147576f.m240621c().mo124327r(str, oVar.f133356e)) == 5 || r == 4 || r == 3)) {
                    atomicBoolean.set(true);
                    C51218m mVar = (C51218m) oVar.toBuilder();
                    mVar.copyOnWrite();
                    C51220o oVar2 = (C51220o) mVar.instance;
                    str.getClass();
                    oVar2.f133352a |= 8;
                    oVar2.f133356e = str;
                    C51220o oVar3 = (C51220o) mVar.build();
                    cVar.copyOnWrite();
                    C55996d dVar3 = (C55996d) cVar.instance;
                    oVar3.getClass();
                    dVar3.mo54311a();
                    dVar3.f149119c.set(i, oVar3);
                }
            }
        }
        if (!atomicBoolean.get()) {
            return aiVar;
        }
        C55993a aVar = (C55993a) bVar2.toBuilder();
        aVar.copyOnWrite();
        C55994b bVar3 = (C55994b) aVar.instance;
        C55996d dVar4 = (C55996d) cVar.build();
        dVar4.getClass();
        bVar3.f149112e = dVar4;
        bVar3.f149108a |= 16;
        C55994b bVar4 = (C55994b) aVar.build();
        C64654ah ahVar = (C64654ah) aiVar.toBuilder();
        ahVar.copyOnWrite();
        C64655ai aiVar2 = (C64655ai) ahVar.instance;
        bVar4.getClass();
        aiVar2.f175257b = bVar4;
        aiVar2.f175256a |= 1;
        return (C64655ai) ahVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
