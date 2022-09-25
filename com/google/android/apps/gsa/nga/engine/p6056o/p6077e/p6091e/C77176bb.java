package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bb */
/* compiled from: PG */
public final /* synthetic */ class C77176bb implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77176bb f212978a = new C77176bb();

    private /* synthetic */ C77176bb() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51446i iVar = (C51446i) ((C51473j) obj).toBuilder();
        C51419h hVar = C51419h.DISABLED;
        iVar.copyOnWrite();
        C51473j jVar = (C51473j) iVar.instance;
        jVar.f134097f = hVar.f133932g;
        jVar.f134092a |= 16;
        return (C51473j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
