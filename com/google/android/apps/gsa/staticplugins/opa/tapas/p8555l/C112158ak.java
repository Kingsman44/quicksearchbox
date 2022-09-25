package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80002cw;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54808aa;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54935z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ak */
/* compiled from: PG */
class C112158ak implements Function {
    /* renamed from: a */
    public final C54808aa apply(C80002cw cwVar) {
        C54935z zVar = (C54935z) C54808aa.f143788c.createBuilder();
        if ((cwVar.f219487a & 1) != 0) {
            String str = cwVar.f219488b;
            zVar.copyOnWrite();
            C54808aa aaVar = (C54808aa) zVar.instance;
            str.getClass();
            aaVar.f143790a |= 1;
            aaVar.f143791b = str;
        }
        return (C54808aa) zVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
