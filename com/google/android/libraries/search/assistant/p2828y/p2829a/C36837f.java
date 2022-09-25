package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C51051eo;
import com.google.assistant.p3897e.p3902c.p3907c.C51052ep;
import com.google.assistant.p3931f.p3939c.C52817ag;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.protobuf.C63037fb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.f */
/* compiled from: PG */
class C36837f implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C52818ah ahVar = (C52818ah) obj;
        C51051eo eoVar = (C51051eo) C51052ep.f132933e.createBuilder();
        if ((ahVar.f138578a & 1) != 0) {
            String str = ahVar.f138581d;
            eoVar.copyOnWrite();
            C51052ep epVar = (C51052ep) eoVar.instance;
            str.getClass();
            epVar.f132935a |= 1;
            epVar.f132938d = str;
        }
        if (ahVar.f138579b == 2 && C52817ag.m86714a(2) == 1) {
            String str2 = (String) ahVar.f138580c;
            eoVar.copyOnWrite();
            C51052ep epVar2 = (C51052ep) eoVar.instance;
            str2.getClass();
            epVar2.f132936b = 2;
            epVar2.f132937c = str2;
        }
        if (ahVar.f138579b == 3 && C52817ag.m86714a(3) == 2) {
            boolean booleanValue = ((Boolean) ahVar.f138580c).booleanValue();
            eoVar.copyOnWrite();
            C51052ep epVar3 = (C51052ep) eoVar.instance;
            epVar3.f132936b = 3;
            epVar3.f132937c = Boolean.valueOf(booleanValue);
        }
        if (ahVar.f138579b == 4 && C52817ag.m86714a(4) == 3) {
            double doubleValue = ((Double) ahVar.f138580c).doubleValue();
            eoVar.copyOnWrite();
            C51052ep epVar4 = (C51052ep) eoVar.instance;
            epVar4.f132936b = 4;
            epVar4.f132937c = Double.valueOf(doubleValue);
        }
        if (ahVar.f138579b == 6 && C52817ag.m86714a(6) == 5) {
            C63037fb fbVar = (C63037fb) ahVar.f138580c;
            eoVar.copyOnWrite();
            C51052ep epVar5 = (C51052ep) eoVar.instance;
            fbVar.getClass();
            epVar5.f132937c = fbVar;
            epVar5.f132936b = 6;
        }
        return (C51052ep) eoVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
