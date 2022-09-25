package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.assistant.p3886c.C50836h;
import com.google.assistant.p3886c.C50837i;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C106854g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106854g f297730a = new C106854g();

    private /* synthetic */ C106854g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130701b bVar = (C130701b) obj;
        C58495hd hdVar = C106855h.f297731a;
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
        bVar.mo109795f().ifPresent(new C106849b(hVar));
        Optional g = bVar.mo109796g();
        Objects.requireNonNull(hVar);
        g.ifPresent(new C106850c(hVar));
        return (C50837i) hVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
