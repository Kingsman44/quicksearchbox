package com.google.android.libraries.gsa.actionusermodel;

import com.google.common.p4522b.C58468gd;
import com.google.protos.p4985f.p4986a.C64683bj;
import com.google.protos.p4985f.p4986a.p4987a.C64645a;
import com.google.protos.p4985f.p4986a.p4987a.C64646b;
import com.google.protos.p4985f.p5001d.C64820b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ar */
/* compiled from: PG */
public final /* synthetic */ class C22060ar implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C22060ar f60787a = new C22060ar();

    private /* synthetic */ C22060ar() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C22021a aVar = (C22021a) obj;
        C58468gd gdVar = C22063au.f60791a;
        C64645a aVar2 = (C64645a) C64646b.f175230g.createBuilder();
        String e = aVar.mo27333e();
        aVar2.copyOnWrite();
        C64646b bVar = (C64646b) aVar2.instance;
        e.getClass();
        bVar.f175232a |= 1;
        bVar.f175233b = e;
        boolean f = aVar.mo27334f();
        aVar2.copyOnWrite();
        C64646b bVar2 = (C64646b) aVar2.instance;
        bVar2.f175232a |= 2;
        bVar2.f175234c = f;
        C64820b d = aVar.mo27332d();
        aVar2.copyOnWrite();
        C64646b bVar3 = (C64646b) aVar2.instance;
        bVar3.f175236e = d.getNumber();
        bVar3.f175232a |= 8;
        C64683bj c = aVar.mo27331c();
        aVar2.copyOnWrite();
        C64646b bVar4 = (C64646b) aVar2.instance;
        c.getClass();
        bVar4.f175235d = c;
        bVar4.f175232a |= 4;
        aVar2.mo59288a(aVar.mo27330b());
        return (C64646b) aVar2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
