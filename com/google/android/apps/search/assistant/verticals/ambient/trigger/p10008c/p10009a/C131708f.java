package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.p10009a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8220g.C106558b;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.assistant.p4016z.C53713bk;
import com.google.assistant.p4016z.C53715bm;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C131708f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131708f f359820a = new C131708f();

    private /* synthetic */ C131708f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53713bk bkVar = (C53713bk) C53715bm.f141021c.createBuilder();
        C106558b bVar = (C106558b) ((C131701c) obj).mo110260b();
        bkVar.copyOnWrite();
        C53715bm bmVar = (C53715bm) bkVar.instance;
        bVar.getClass();
        bmVar.f141024b = bVar;
        bmVar.f141023a = 10;
        return (C53715bm) bkVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
