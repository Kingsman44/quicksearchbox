package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cs */
/* compiled from: PG */
public final /* synthetic */ class C77220cs implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77220cs f213052a = new C77220cs();

    private /* synthetic */ C77220cs() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51592nk nkVar = (C51592nk) obj;
        C51588ng ngVar = (C51588ng) nkVar.toBuilder();
        C51591nj njVar = C51591nj.PAUSED;
        ngVar.copyOnWrite();
        C51592nk nkVar2 = (C51592nk) ngVar.instance;
        nkVar2.f134468e = njVar.f134461e;
        nkVar2.f134464a |= 2;
        long j = nkVar.f134469f;
        ngVar.copyOnWrite();
        C51592nk nkVar3 = (C51592nk) ngVar.instance;
        nkVar3.f134465b = 4;
        nkVar3.f134466c = Long.valueOf(j);
        return (C51592nk) ngVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
