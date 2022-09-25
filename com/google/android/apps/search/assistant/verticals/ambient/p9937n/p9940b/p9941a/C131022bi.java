package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50668d;
import com.google.assistant.p3886c.p3887a.C50669e;
import com.google.assistant.p3886c.p3887a.C50670f;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C131022bi implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131022bi f358422a = new C131022bi();

    private /* synthetic */ C131022bi() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        Duration duration = C131043cc.f358455a;
        C50669e eVar = (C50669e) ((C50670f) guVar.get(0)).toBuilder();
        C50668d dVar = (C50668d) Collection.EL.stream(guVar).map(C131019bf.f358419a).reduce(C131009aw.f358408a).orElse(C50668d.f131800j);
        eVar.copyOnWrite();
        C50670f fVar = (C50670f) eVar.instance;
        dVar.getClass();
        fVar.f131815c = dVar;
        fVar.f131813a |= 2;
        return (C50670f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
