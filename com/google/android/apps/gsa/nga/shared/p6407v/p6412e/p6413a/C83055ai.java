package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.common.p4522b.C58370cn;
import com.google.nlp.p4735b.p4736a.C62838e;
import com.google.nlp.p4735b.p4736a.C62839f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C83055ai implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C83055ai f226667a = new C83055ai();

    private /* synthetic */ C83055ai() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C62839f fVar = (C62839f) obj;
        C62838e eVar = (C62838e) C62839f.f169692f.createBuilder();
        String str = fVar.f169695b;
        eVar.copyOnWrite();
        C62839f fVar2 = (C62839f) eVar.instance;
        str.getClass();
        fVar2.f169694a |= 1;
        fVar2.f169695b = str;
        Iterable iterable = (Iterable) Collection.EL.stream(fVar.f169696c).map(C83104w.f226715a).collect(C58370cn.f155946a);
        eVar.copyOnWrite();
        C62839f fVar3 = (C62839f) eVar.instance;
        C62971cq cqVar = fVar3.f169696c;
        if (!cqVar.mo58948c()) {
            fVar3.f169696c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar3.f169696c);
        return (C62839f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
