package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.unifiedime.C118576a;
import com.google.android.apps.gsa.unifiedime.C118585c;
import com.google.android.apps.gsa.unifiedime.C118586d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.j */
/* compiled from: PG */
public final /* synthetic */ class C126266j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C126266j f347922a = new C126266j();

    private /* synthetic */ C126266j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C118576a aVar = (C118576a) C118586d.f330853e.createBuilder();
        aVar.copyOnWrite();
        C118586d dVar = (C118586d) aVar.instance;
        str.getClass();
        dVar.f330855a |= 1;
        dVar.f330856b = str;
        C118585c cVar = C118585c.POST_RECOGNITION;
        aVar.copyOnWrite();
        C118586d dVar2 = (C118586d) aVar.instance;
        dVar2.f330858d = cVar.f330852d;
        dVar2.f330855a |= 4;
        aVar.copyOnWrite();
        C118586d dVar3 = (C118586d) aVar.instance;
        dVar3.f330855a |= 2;
        dVar3.f330857c = 0.9f;
        return (C118586d) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
