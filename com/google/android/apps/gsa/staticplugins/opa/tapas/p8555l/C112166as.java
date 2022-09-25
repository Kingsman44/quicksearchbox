package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79980ca;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79984ce;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54900dl;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54901dm;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54905dq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.as */
/* compiled from: PG */
class C112166as implements Function {
    /* renamed from: a */
    public final C54901dm apply(C79980ca caVar) {
        C54900dl dlVar = (C54900dl) C54901dm.f144262f.createBuilder();
        if ((caVar.f219374a & 1) != 0) {
            Function function = C112282dn.f311609a;
            C79984ce ceVar = caVar.f219375b;
            if (ceVar == null) {
                ceVar = C79984ce.f219406e;
            }
            C54905dq a = ((C112168au) function).apply(ceVar);
            dlVar.copyOnWrite();
            C54901dm dmVar = (C54901dm) dlVar.instance;
            a.getClass();
            dmVar.f144265b = a;
            dmVar.f144264a |= 1;
        }
        if ((caVar.f219374a & 2) != 0) {
            Function function2 = C112282dn.f311609a;
            C79984ce ceVar2 = caVar.f219376c;
            if (ceVar2 == null) {
                ceVar2 = C79984ce.f219406e;
            }
            C54905dq a2 = ((C112168au) function2).apply(ceVar2);
            dlVar.copyOnWrite();
            C54901dm dmVar2 = (C54901dm) dlVar.instance;
            a2.getClass();
            dmVar2.f144266c = a2;
            dmVar2.f144264a |= 2;
        }
        if ((caVar.f219374a & 4) != 0) {
            Function function3 = C112282dn.f311609a;
            C79984ce ceVar3 = caVar.f219377d;
            if (ceVar3 == null) {
                ceVar3 = C79984ce.f219406e;
            }
            C54905dq a3 = ((C112168au) function3).apply(ceVar3);
            dlVar.copyOnWrite();
            C54901dm dmVar3 = (C54901dm) dlVar.instance;
            a3.getClass();
            dmVar3.f144267d = a3;
            dmVar3.f144264a |= 4;
        }
        if ((caVar.f219374a & 8) != 0) {
            Function function4 = C112282dn.f311609a;
            C79984ce ceVar4 = caVar.f219378e;
            if (ceVar4 == null) {
                ceVar4 = C79984ce.f219406e;
            }
            C54905dq a4 = ((C112168au) function4).apply(ceVar4);
            dlVar.copyOnWrite();
            C54901dm dmVar4 = (C54901dm) dlVar.instance;
            a4.getClass();
            dmVar4.f144268e = a4;
            dmVar4.f144264a |= 8;
        }
        return (C54901dm) dlVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
