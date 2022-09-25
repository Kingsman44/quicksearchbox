package com.google.android.libraries.search.assistant.p2828y.p2829a;

import com.google.assistant.p3897e.p3902c.p3907c.C50972bq;
import com.google.assistant.p3897e.p3902c.p3907c.C51001cs;
import com.google.assistant.p3897e.p3902c.p3907c.C51144i;
import com.google.assistant.p3897e.p3902c.p3907c.C51153j;
import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.assistant.p3931f.p3939c.C52832i;
import com.google.assistant.p3931f.p3939c.C52838o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.y.a.e */
/* compiled from: PG */
class C36836e implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C52828e eVar = (C52828e) obj;
        C51144i iVar = (C51144i) C51153j.f133156h.createBuilder();
        String str = eVar.f138604a;
        iVar.copyOnWrite();
        str.getClass();
        ((C51153j) iVar.instance).f133158a = str;
        for (C52832i apply : eVar.f138605b) {
            C50972bq bqVar = (C50972bq) C36849r.f95983c.apply(apply);
            iVar.copyOnWrite();
            C51153j jVar = (C51153j) iVar.instance;
            bqVar.getClass();
            C62971cq cqVar = jVar.f133159b;
            if (!cqVar.mo58948c()) {
                jVar.f133159b = C62942bv.mutableCopy(cqVar);
            }
            jVar.f133159b.add(bqVar);
        }
        for (C52838o apply2 : eVar.f138606c) {
            C51001cs csVar = (C51001cs) C36849r.f95985e.apply(apply2);
            iVar.copyOnWrite();
            C51153j jVar2 = (C51153j) iVar.instance;
            csVar.getClass();
            C62971cq cqVar2 = jVar2.f133160c;
            if (!cqVar2.mo58948c()) {
                jVar2.f133160c = C62942bv.mutableCopy(cqVar2);
            }
            jVar2.f133160c.add(csVar);
        }
        boolean z = eVar.f138607d;
        iVar.copyOnWrite();
        ((C51153j) iVar.instance).f133161d = z;
        boolean z2 = eVar.f138608e;
        iVar.copyOnWrite();
        ((C51153j) iVar.instance).f133162e = z2;
        boolean z3 = eVar.f138609f;
        iVar.copyOnWrite();
        ((C51153j) iVar.instance).f133163f = z3;
        boolean z4 = eVar.f138610g;
        iVar.copyOnWrite();
        ((C51153j) iVar.instance).f133164g = z4;
        return (C51153j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
