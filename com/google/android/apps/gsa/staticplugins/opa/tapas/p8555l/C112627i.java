package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79944as;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54859by;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54860bz;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54862ca;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54874cm;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56333d;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56335f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.i */
/* compiled from: PG */
class C112627i implements Function {
    /* renamed from: a */
    public final C54862ca apply(C79944as asVar) {
        C54860bz bzVar = (C54860bz) C54862ca.f144103e.createBuilder();
        if ((asVar.f219225a & 1) != 0) {
            float f = asVar.f219226b;
            bzVar.copyOnWrite();
            C54862ca caVar = (C54862ca) bzVar.instance;
            caVar.f144105a |= 1;
            caVar.f144106b = f;
        }
        if ((asVar.f219225a & 2) != 0) {
            Function function = C112225cc.f311520a;
            C56333d dVar = asVar.f219227c;
            if (dVar == null) {
                dVar = C56333d.f150154d;
            }
            C54859by a = ((C112598h) function).apply(dVar);
            bzVar.copyOnWrite();
            C54862ca caVar2 = (C54862ca) bzVar.instance;
            a.getClass();
            caVar2.f144107c = a;
            caVar2.f144105a |= 2;
        }
        if ((asVar.f219225a & 4) != 0) {
            Function function2 = C112225cc.f311521b;
            C56335f fVar = asVar.f219228d;
            if (fVar == null) {
                fVar = C56335f.f150159c;
            }
            C54874cm a2 = ((C112656v) function2).apply(fVar);
            bzVar.copyOnWrite();
            C54862ca caVar3 = (C54862ca) bzVar.instance;
            a2.getClass();
            caVar3.f144108d = a2;
            caVar3.f144105a |= 4;
        }
        return (C54862ca) bzVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
