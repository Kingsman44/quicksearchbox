package com.google.android.libraries.assistant.pcp.p1567h.p1568a;

import com.google.assistant.p3803ag.p3804a.p3806b.C48831l;
import com.google.assistant.p3803ag.p3804a.p3806b.C48832m;
import com.google.assistant.p3994s.p3995a.C53236gk;
import com.google.assistant.p3994s.p3995a.C53243gr;
import com.google.assistant.p3994s.p3995a.C53244gs;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C18774a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18774a f52890a = new C18774a();

    private /* synthetic */ C18774a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48832m mVar = (C48832m) obj;
        C53243gr grVar = (C53243gr) C53244gs.f139553j.createBuilder();
        String str = mVar.f126343b;
        grVar.copyOnWrite();
        C53244gs gsVar = (C53244gs) grVar.instance;
        str.getClass();
        gsVar.f139555a |= 1;
        gsVar.f139556b = str;
        String str2 = mVar.f126344c;
        grVar.copyOnWrite();
        C53244gs gsVar2 = (C53244gs) grVar.instance;
        str2.getClass();
        gsVar2.f139555a |= 2;
        gsVar2.f139557c = str2;
        String str3 = mVar.f126345d;
        grVar.copyOnWrite();
        C53244gs gsVar3 = (C53244gs) grVar.instance;
        str3.getClass();
        gsVar3.f139555a |= 4;
        gsVar3.f139558d = str3;
        String str4 = mVar.f126346e;
        grVar.copyOnWrite();
        C53244gs gsVar4 = (C53244gs) grVar.instance;
        str4.getClass();
        gsVar4.f139555a |= 8;
        gsVar4.f139559e = str4;
        int a = C48831l.m85283a(mVar.f126349h);
        if (a == 0) {
            a = 1;
        }
        C53236gk a2 = C18776c.m36177a(a);
        grVar.copyOnWrite();
        C53244gs gsVar5 = (C53244gs) grVar.instance;
        gsVar5.f139560f = a2.f139534d;
        gsVar5.f139555a |= 16;
        String str5 = mVar.f126347f;
        grVar.copyOnWrite();
        C53244gs gsVar6 = (C53244gs) grVar.instance;
        str5.getClass();
        gsVar6.f139555a |= 32;
        gsVar6.f139561g = str5;
        String str6 = mVar.f126348g;
        grVar.copyOnWrite();
        C53244gs gsVar7 = (C53244gs) grVar.instance;
        str6.getClass();
        gsVar7.f139555a |= 64;
        gsVar7.f139562h = str6;
        grVar.copyOnWrite();
        C53244gs gsVar8 = (C53244gs) grVar.instance;
        gsVar8.f139563i = 1;
        gsVar8.f139555a |= 128;
        return (C53244gs) grVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
