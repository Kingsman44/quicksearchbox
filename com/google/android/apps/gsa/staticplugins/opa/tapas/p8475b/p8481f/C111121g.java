package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48628bq;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48629br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.g */
/* compiled from: PG */
public final /* synthetic */ class C111121g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111121g f309372a = new C111121g();

    private /* synthetic */ C111121g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        C48628bq bqVar = (C48628bq) C48629br.f125669b.createBuilder();
        bqVar.copyOnWrite();
        C48629br brVar = (C48629br) bqVar.instance;
        C62971cq cqVar = brVar.f125671a;
        if (!cqVar.mo58948c()) {
            brVar.f125671a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) brVar.f125671a);
        return (C48629br) bqVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
