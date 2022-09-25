package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79955bc;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80006d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80014k;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54872ck;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54897di;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54912dx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54913dy;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.m */
/* compiled from: PG */
class C112647m implements Function {

    /* renamed from: a */
    private final Function f312256a;

    public C112647m(Function function) {
        this.f312256a = function;
    }

    /* renamed from: a */
    public final C54913dy apply(C80014k kVar) {
        C54912dx dxVar = (C54912dx) C54913dy.f144335d.createBuilder();
        if ((kVar.f219573a & 2) != 0) {
            Function function = this.f312256a;
            C79955bc bcVar = kVar.f219574b;
            if (bcVar == null) {
                bcVar = C79955bc.f219276i;
            }
            C54872ck a = ((C112653s) function).apply(bcVar);
            dxVar.copyOnWrite();
            C54913dy dyVar = (C54913dy) dxVar.instance;
            a.getClass();
            dyVar.f144338b = a;
            dyVar.f144337a |= 1;
        }
        for (C80006d a2 : kVar.f219575c) {
            C54897di a3 = ((C112162ao) C112229cg.f311526a).apply(a2);
            dxVar.copyOnWrite();
            C54913dy dyVar2 = (C54913dy) dxVar.instance;
            a3.getClass();
            C62971cq cqVar = dyVar2.f144339c;
            if (!cqVar.mo58948c()) {
                dyVar2.f144339c = C62942bv.mutableCopy(cqVar);
            }
            dyVar2.f144339c.add(a3);
        }
        return (C54913dy) dxVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
