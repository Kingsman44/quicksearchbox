package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122435c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122449d;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ca */
/* compiled from: PG */
public final /* synthetic */ class C122767ca implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122767ca f340085a = new C122767ca();

    private /* synthetic */ C122767ca() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C122435c cVar = (C122435c) C122449d.f339464b.createBuilder();
        cVar.copyOnWrite();
        C122449d dVar = (C122449d) cVar.instance;
        C62971cq cqVar = dVar.f339466a;
        if (!cqVar.mo58948c()) {
            dVar.f339466a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) dVar.f339466a);
        return (C122449d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
