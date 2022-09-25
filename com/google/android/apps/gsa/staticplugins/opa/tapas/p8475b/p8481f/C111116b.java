package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48611b;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48638c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.b */
/* compiled from: PG */
public final /* synthetic */ class C111116b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111116b f309365a = new C111116b();

    private /* synthetic */ C111116b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        C48611b bVar = (C48611b) C48638c.f125710b.createBuilder();
        bVar.copyOnWrite();
        C48638c cVar = (C48638c) bVar.instance;
        C62971cq cqVar = cVar.f125712a;
        if (!cqVar.mo58948c()) {
            cVar.f125712a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) cVar.f125712a);
        return (C48638c) bVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
