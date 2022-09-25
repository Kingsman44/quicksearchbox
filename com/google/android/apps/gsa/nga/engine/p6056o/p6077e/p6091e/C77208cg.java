package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cg */
/* compiled from: PG */
public final /* synthetic */ class C77208cg implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77208cg f213033a = new C77208cg();

    private /* synthetic */ C77208cg() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51588ng ngVar = (C51588ng) ((C51592nk) obj).toBuilder();
        C51591nj njVar = C51591nj.PAUSED;
        ngVar.copyOnWrite();
        C51592nk nkVar = (C51592nk) ngVar.instance;
        nkVar.f134468e = njVar.f134461e;
        nkVar.f134464a |= 2;
        ngVar.copyOnWrite();
        C51592nk nkVar2 = (C51592nk) ngVar.instance;
        nkVar2.f134465b = 0;
        nkVar2.f134466c = null;
        return (C51592nk) ngVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
