package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48619bh;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48622bk;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.s */
/* compiled from: PG */
public final /* synthetic */ class C111101s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111101s f309339a = new C111101s();

    private /* synthetic */ C111101s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        C48619bh bhVar = (C48619bh) C48622bk.f125645b.createBuilder();
        bhVar.copyOnWrite();
        C48622bk bkVar = (C48622bk) bhVar.instance;
        C62971cq cqVar = bkVar.f125647a;
        if (!cqVar.mo58948c()) {
            bkVar.f125647a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bkVar.f125647a);
        return (C48622bk) bhVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
