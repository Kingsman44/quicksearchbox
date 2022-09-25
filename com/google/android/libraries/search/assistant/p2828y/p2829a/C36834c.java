package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C50981bz;
import com.google.assistant.p3897e.p3902c.p3907c.C50983ca;
import com.google.assistant.p3897e.p3902c.p3907c.C51001cs;
import com.google.assistant.p3931f.p3939c.C52836m;
import com.google.assistant.p3931f.p3939c.C52838o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.c */
/* compiled from: PG */
class C36834c implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C50981bz bzVar = (C50981bz) C50983ca.f132732b.createBuilder();
        for (C52838o apply : ((C52836m) obj).f138632a) {
            C51001cs csVar = (C51001cs) C36849r.f95985e.apply(apply);
            bzVar.copyOnWrite();
            C50983ca caVar = (C50983ca) bzVar.instance;
            csVar.getClass();
            C62971cq cqVar = caVar.f132734a;
            if (!cqVar.mo58948c()) {
                caVar.f132734a = C62942bv.mutableCopy(cqVar);
            }
            caVar.f132734a.add(csVar);
        }
        return (C50983ca) bzVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
