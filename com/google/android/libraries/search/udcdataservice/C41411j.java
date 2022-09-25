package com.google.android.libraries.search.udcdataservice;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.udcdataservice.j */
/* compiled from: PG */
public final /* synthetic */ class C41411j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C41411j f108182a = new C41411j();

    private /* synthetic */ C41411j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C41418q.f108190d;
        C41388d dVar = (C41388d) C41389e.f108143e.createBuilder();
        dVar.copyOnWrite();
        C41389e eVar = (C41389e) dVar.instance;
        eVar.f108146b = ((C41387c) obj).f108142h;
        eVar.f108145a |= 1;
        dVar.copyOnWrite();
        C41389e eVar2 = (C41389e) dVar.instance;
        eVar2.f108147c = 0;
        eVar2.f108145a |= 2;
        dVar.copyOnWrite();
        C41389e eVar3 = (C41389e) dVar.instance;
        eVar3.f108148d = 0;
        eVar3.f108145a |= 4;
        return (C41389e) dVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
