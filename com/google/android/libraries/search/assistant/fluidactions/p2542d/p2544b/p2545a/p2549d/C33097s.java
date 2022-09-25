package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.google.assistant.p3897e.p3902c.p3907c.C51024do;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.s */
/* compiled from: PG */
public final /* synthetic */ class C33097s implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C33097s f88613a = new C33097s();

    private /* synthetic */ C33097s() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51024do doVar = (C51024do) ((C51027dr) obj).toBuilder();
        doVar.copyOnWrite();
        C51027dr drVar = (C51027dr) doVar.instance;
        drVar.f132854a |= 1;
        drVar.f132859f = false;
        return (C51027dr) doVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
