package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.p10009a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8225l.C106586c;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C131707e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131707e f359819a = new C131707e();

    private /* synthetic */ C131707e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
        C106586c cVar = (C106586c) ((C131701c) obj).mo110260b();
        bkVar.copyOnWrite();
        C53715bm bmVar = (C53715bm) bkVar.instance;
        cVar.getClass();
        bmVar.f141024b = cVar;
        bmVar.f141023a = 2;
        return (C53715bm) bkVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
