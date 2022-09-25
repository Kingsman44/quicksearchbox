package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122442cg;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122443ch;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cc */
/* compiled from: PG */
public final /* synthetic */ class C122769cc implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122769cc f340087a = new C122769cc();

    private /* synthetic */ C122769cc() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65196fc fcVar = (C65196fc) obj;
        C122442cg cgVar = (C122442cg) C122443ch.f339445c.createBuilder();
        cgVar.copyOnWrite();
        C122443ch chVar = (C122443ch) cgVar.instance;
        fcVar.getClass();
        chVar.f339448b = fcVar;
        chVar.f339447a = 1;
        return (C122443ch) cgVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
