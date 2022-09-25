package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C50970bo;
import com.google.assistant.p3897e.p3902c.p3907c.C50971bp;
import com.google.assistant.p3897e.p3902c.p3907c.C50972bq;
import com.google.assistant.p3897e.p3902c.p3907c.C50983ca;
import com.google.assistant.p3897e.p3902c.p3907c.C51052ep;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.assistant.p3931f.p3939c.C52831h;
import com.google.assistant.p3931f.p3939c.C52832i;
import com.google.assistant.p3931f.p3939c.C52836m;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.b */
/* compiled from: PG */
class C36833b implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C52832i iVar = (C52832i) obj;
        C50970bo boVar = (C50970bo) C50972bq.f132697d.createBuilder();
        if (iVar.f138625a != null) {
            Function function = C36849r.f95982b;
            C52818ah ahVar = iVar.f138625a;
            if (ahVar == null) {
                ahVar = C52818ah.f138576e;
            }
            C51052ep epVar = (C51052ep) function.apply(ahVar);
            boVar.copyOnWrite();
            epVar.getClass();
            ((C50972bq) boVar.instance).f132699a = epVar;
        }
        if (iVar.f138626b != null) {
            Function function2 = C36849r.f95984d;
            C52836m mVar = iVar.f138626b;
            if (mVar == null) {
                mVar = C52836m.f138630b;
            }
            C50983ca caVar = (C50983ca) function2.apply(mVar);
            boVar.copyOnWrite();
            caVar.getClass();
            ((C50972bq) boVar.instance).f132700b = caVar;
        }
        Function function3 = C36849r.f95987g;
        C52831h a = C52831h.m86715a(iVar.f138627c);
        if (a == null) {
            a = C52831h.UNRECOGNIZED;
        }
        boVar.copyOnWrite();
        ((C50972bq) boVar.instance).f132701c = ((C50971bp) function3.apply(a)).getNumber();
        return (C50972bq) boVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
