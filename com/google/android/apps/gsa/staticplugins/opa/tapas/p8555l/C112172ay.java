package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80022s;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54819al;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54820am;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ay */
/* compiled from: PG */
class C112172ay implements Function {
    /* renamed from: a */
    public final C54820am apply(C80022s sVar) {
        C54819al alVar = (C54819al) C54820am.f143832c.createBuilder();
        if ((sVar.f219599a & 2) != 0) {
            double d = sVar.f219601c;
            alVar.copyOnWrite();
            C54820am amVar = (C54820am) alVar.instance;
            amVar.f143834a |= 1;
            amVar.f143835b = d;
        }
        return (C54820am) alVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
