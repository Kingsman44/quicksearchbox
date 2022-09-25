package com.google.android.apps.search.assistant.verticals.ambient.p10017u;

import com.google.assistant.p4016z.C53689an;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53702b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.c */
/* compiled from: PG */
public final /* synthetic */ class C131831c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131831c f360041a = new C131831c();

    private /* synthetic */ C131831c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53692aq aqVar = (C53692aq) obj;
        C53689an anVar = (C53689an) aqVar.toBuilder();
        C53702b bVar = aqVar.f140946h;
        if (bVar == null) {
            bVar = C53702b.f140971f;
        }
        C53702b a = C131834f.m214312a(bVar);
        anVar.copyOnWrite();
        C53692aq aqVar2 = (C53692aq) anVar.instance;
        a.getClass();
        aqVar2.f140946h = a;
        aqVar2.f140939a |= 512;
        return (C53692aq) anVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
