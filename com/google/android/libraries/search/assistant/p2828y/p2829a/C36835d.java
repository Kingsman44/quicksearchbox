package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C51000cr;
import com.google.assistant.p3897e.p3902c.p3907c.C51001cs;
import com.google.assistant.p3931f.p3939c.C52838o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63037fb;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.d */
/* compiled from: PG */
class C36835d implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C52838o oVar = (C52838o) obj;
        C51000cr crVar = (C51000cr) C51001cs.f132776f.createBuilder();
        if ((oVar.f138635a & 1) != 0) {
            String str = oVar.f138636b;
            crVar.copyOnWrite();
            C51001cs csVar = (C51001cs) crVar.instance;
            str.getClass();
            csVar.f132778a |= 1;
            csVar.f132779b = str;
        }
        String str2 = oVar.f138637c;
        crVar.copyOnWrite();
        str2.getClass();
        ((C51001cs) crVar.instance).f132780c = str2;
        C62971cq cqVar = oVar.f138638d;
        crVar.copyOnWrite();
        C51001cs csVar2 = (C51001cs) crVar.instance;
        C62971cq cqVar2 = csVar2.f132781d;
        if (!cqVar2.mo58948c()) {
            csVar2.f132781d = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) csVar2.f132781d);
        C63037fb fbVar = oVar.f138639e;
        if (fbVar != null) {
            crVar.copyOnWrite();
            ((C51001cs) crVar.instance).f132782e = fbVar;
        }
        return (C51001cs) crVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
