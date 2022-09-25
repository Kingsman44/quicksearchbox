package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import com.google.assistant.p3897e.p3921j.p3926e.C51853bn;
import com.google.common.base.C58827ar;
import com.google.protobuf.C62971cq;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.o */
/* compiled from: PG */
public final /* synthetic */ class C129848o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C129848o f356245a = new C129848o();

    private /* synthetic */ C129848o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C62971cq cqVar = ((C51853bn) obj).f136021a;
        StringBuilder sb = new StringBuilder();
        sb.append("{\"phrases\": [");
        new C58827ar(", ").mo56099f(sb, Collection.EL.stream(cqVar).map(C129847n.f356244a).iterator());
        sb.append("]}");
        return sb.toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
