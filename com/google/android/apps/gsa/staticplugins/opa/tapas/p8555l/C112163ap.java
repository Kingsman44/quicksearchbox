package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79936ak;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54842bh;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54843bi;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ap */
/* compiled from: PG */
class C112163ap implements Function {
    /* renamed from: a */
    public final C54843bi apply(C79936ak akVar) {
        C54842bh bhVar = (C54842bh) C54843bi.f143982c.createBuilder();
        if ((akVar.f219173a & 1) != 0) {
            String str = akVar.f219174b;
            bhVar.copyOnWrite();
            C54843bi biVar = (C54843bi) bhVar.instance;
            str.getClass();
            biVar.f143984a |= 1;
            biVar.f143985b = str;
        }
        return (C54843bi) bhVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
