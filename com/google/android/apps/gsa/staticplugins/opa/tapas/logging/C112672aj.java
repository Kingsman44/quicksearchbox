package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.libraries.assistant.portable.p1586b.C19076h;
import com.google.android.libraries.assistant.portable.p1586b.C19077i;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aj */
/* compiled from: PG */
public final /* synthetic */ class C112672aj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112672aj f312293a = new C112672aj();

    private /* synthetic */ C112672aj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59071e eVar = C112678ap.f312305a;
        C19076h hVar = (C19076h) C19077i.f53509c.createBuilder();
        int intValue = ((Integer) obj).intValue();
        hVar.copyOnWrite();
        C19077i iVar = (C19077i) hVar.instance;
        iVar.f53511a |= 1;
        iVar.f53512b = intValue;
        return (C19077i) hVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
