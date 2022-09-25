package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83916c;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.bt */
/* compiled from: PG */
public final /* synthetic */ class C94214bt implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C94214bt f263248a = new C94214bt();

    private /* synthetic */ C94214bt() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C83916c cVar = (C83916c) C83917d.f228552j.createBuilder();
        String str = (String) entry.getKey();
        cVar.copyOnWrite();
        C83917d dVar = (C83917d) cVar.instance;
        str.getClass();
        dVar.f228554a |= 1;
        dVar.f228555b = str;
        int intValue = ((Integer) entry.getValue()).intValue();
        cVar.copyOnWrite();
        C83917d dVar2 = (C83917d) cVar.instance;
        dVar2.f228554a |= 256;
        dVar2.f228562i = intValue;
        return (C83917d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
