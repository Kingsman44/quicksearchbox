package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c;

import com.google.android.apps.auto.p450a.p452b.C8943i;
import com.google.android.apps.auto.p450a.p452b.C8944j;
import com.google.common.p4552o.p4553a.C59458ai;
import com.google.common.p4552o.p4553a.C59459aj;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.e */
/* compiled from: PG */
public final /* synthetic */ class C11629e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11629e f37583a = new C11629e();

    private /* synthetic */ C11629e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C8944j jVar = (C8944j) obj;
        C59458ai aiVar = (C59458ai) C59459aj.f157725g.createBuilder();
        String str = jVar.f30996a;
        aiVar.copyOnWrite();
        C59459aj ajVar = (C59459aj) aiVar.instance;
        str.getClass();
        int i = 1;
        ajVar.f157727a |= 1;
        ajVar.f157728b = str;
        int a = C8943i.m23520a(jVar.f30997b);
        if (a != 0) {
            i = a;
        }
        aiVar.copyOnWrite();
        C59459aj ajVar2 = (C59459aj) aiVar.instance;
        ajVar2.f157727a |= 2;
        ajVar2.f157729c = i - 1;
        int i2 = jVar.f30998c;
        aiVar.copyOnWrite();
        C59459aj ajVar3 = (C59459aj) aiVar.instance;
        ajVar3.f157727a |= 4;
        ajVar3.f157730d = i2;
        int i3 = jVar.f30999d;
        aiVar.copyOnWrite();
        C59459aj ajVar4 = (C59459aj) aiVar.instance;
        ajVar4.f157727a |= 8;
        ajVar4.f157731e = i3;
        C63042fg fgVar = jVar.f31000e;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long a2 = C11634j.m27335a(C62953e.m95478c(fgVar));
        aiVar.copyOnWrite();
        C59459aj ajVar5 = (C59459aj) aiVar.instance;
        ajVar5.f157727a |= 16;
        ajVar5.f157732f = a2;
        return (C59459aj) aiVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
