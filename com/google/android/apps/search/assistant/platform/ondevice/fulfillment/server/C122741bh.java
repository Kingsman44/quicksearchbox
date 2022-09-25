package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122426br;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122427bs;
import com.google.protos.p4985f.p5030q.C65184er;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.bh */
/* compiled from: PG */
public final /* synthetic */ class C122741bh implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122741bh f340056a = new C122741bh();

    private /* synthetic */ C122741bh() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65184er erVar = (C65184er) obj;
        C122426br brVar = (C122426br) C122427bs.f339414c.createBuilder();
        brVar.copyOnWrite();
        C122427bs bsVar = (C122427bs) brVar.instance;
        erVar.getClass();
        bsVar.f339417b = erVar;
        bsVar.f339416a = 1;
        return (C122427bs) brVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
