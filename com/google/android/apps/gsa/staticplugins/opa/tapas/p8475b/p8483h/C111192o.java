package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8483h;

import com.google.assistant.p3897e.p3921j.C52406qo;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.h.o */
/* compiled from: PG */
public final /* synthetic */ class C111192o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111192o f309488a = new C111192o();

    private /* synthetic */ C111192o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Instant instant = (Instant) obj;
        C59071e eVar = C111175am.f309456a;
        C52406qo qoVar = (C52406qo) C52407qp.f137523d.createBuilder();
        long epochSecond = instant.getEpochSecond();
        qoVar.copyOnWrite();
        C52407qp qpVar = (C52407qp) qoVar.instance;
        qpVar.f137525a |= 1;
        qpVar.f137526b = epochSecond;
        int nano = instant.getNano();
        qoVar.copyOnWrite();
        C52407qp qpVar2 = (C52407qp) qoVar.instance;
        qpVar2.f137525a |= 2;
        qpVar2.f137527c = nano;
        return (C52407qp) qoVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
