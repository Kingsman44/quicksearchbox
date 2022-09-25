package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79936ak;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80020q;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54817aj;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54818ak;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54843bi;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.j */
/* compiled from: PG */
class C112644j implements Function {
    /* renamed from: a */
    public final C54818ak apply(C80020q qVar) {
        C54817aj ajVar = (C54817aj) C54818ak.f143828c.createBuilder();
        if ((qVar.f219595a & 1) != 0) {
            Function function = C112226cd.f311522a;
            C79936ak akVar = qVar.f219596b;
            if (akVar == null) {
                akVar = C79936ak.f219171c;
            }
            C54843bi a = ((C112163ap) function).apply(akVar);
            ajVar.copyOnWrite();
            C54818ak akVar2 = (C54818ak) ajVar.instance;
            a.getClass();
            akVar2.f143831b = a;
            akVar2.f143830a |= 1;
        }
        return (C54818ak) ajVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
