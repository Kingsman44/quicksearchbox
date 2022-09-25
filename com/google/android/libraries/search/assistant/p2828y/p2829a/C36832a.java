package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C51090g;
import com.google.assistant.p3897e.p3902c.p3907c.C51117h;
import com.google.assistant.p3897e.p3902c.p3907c.C51135hr;
import com.google.assistant.p3897e.p3902c.p3907c.C51153j;
import com.google.assistant.p3931f.p3939c.C52820aj;
import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.a */
/* compiled from: PG */
class C36832a implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C52825b bVar = (C52825b) obj;
        C51090g gVar = (C51090g) C51117h.f133040h.createBuilder();
        String str = bVar.f138596b;
        gVar.copyOnWrite();
        str.getClass();
        ((C51117h) gVar.instance).f133043b = str;
        String str2 = bVar.f138597c;
        gVar.copyOnWrite();
        str2.getClass();
        ((C51117h) gVar.instance).f133044c = str2;
        for (C52828e apply : bVar.f138598d) {
            C51153j jVar = (C51153j) C36849r.f95981a.apply(apply);
            gVar.copyOnWrite();
            C51117h hVar = (C51117h) gVar.instance;
            jVar.getClass();
            C62971cq cqVar = hVar.f133045d;
            if (!cqVar.mo58948c()) {
                hVar.f133045d = C62942bv.mutableCopy(cqVar);
            }
            hVar.f133045d.add(jVar);
        }
        if ((bVar.f138595a & 1) != 0) {
            int i = bVar.f138599e;
            gVar.copyOnWrite();
            C51117h hVar2 = (C51117h) gVar.instance;
            hVar2.f133042a |= 1;
            hVar2.f133046e = i;
        }
        if ((bVar.f138595a & 2) != 0) {
            Function function = C36849r.f95986f;
            C52820aj ajVar = bVar.f138600f;
            if (ajVar == null) {
                ajVar = C52820aj.f138582b;
            }
            C51135hr hrVar = (C51135hr) function.apply(ajVar);
            gVar.copyOnWrite();
            C51117h hVar3 = (C51117h) gVar.instance;
            hrVar.getClass();
            hVar3.f133047f = hrVar;
            hVar3.f133042a |= 2;
        }
        boolean z = bVar.f138601g;
        gVar.copyOnWrite();
        ((C51117h) gVar.instance).f133048g = z;
        return (C51117h) gVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
