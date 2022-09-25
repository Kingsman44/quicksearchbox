package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9966a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.assistant.p3886c.C50836h;
import com.google.assistant.p3886c.C50837i;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.a.b */
/* compiled from: PG */
public final /* synthetic */ class C131260b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131260b f358909a = new C131260b();

    private /* synthetic */ C131260b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130701b bVar = (C130701b) obj;
        C50836h hVar = (C50836h) C50837i.f132363f.createBuilder();
        String h = bVar.mo109797h();
        hVar.copyOnWrite();
        C50837i iVar = (C50837i) hVar.instance;
        h.getClass();
        iVar.f132365a |= 1;
        iVar.f132366b = h;
        double a = bVar.mo109791a();
        hVar.copyOnWrite();
        C50837i iVar2 = (C50837i) hVar.instance;
        iVar2.f132365a |= 4;
        iVar2.f132368d = a;
        return (C50837i) hVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
