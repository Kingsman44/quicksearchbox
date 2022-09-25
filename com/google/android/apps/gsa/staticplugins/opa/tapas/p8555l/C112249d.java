package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80028y;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54829av;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54830aw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d */
/* compiled from: PG */
class C112249d implements Function {
    /* renamed from: a */
    public final C54830aw apply(C80028y yVar) {
        C54829av avVar = (C54829av) C54830aw.f143876g.createBuilder();
        if ((yVar.f219615a & 1) != 0) {
            float f = yVar.f219616b;
            avVar.copyOnWrite();
            C54830aw awVar = (C54830aw) avVar.instance;
            awVar.f143878a |= 1;
            awVar.f143879b = f;
        }
        if ((yVar.f219615a & 2) != 0) {
            int i = yVar.f219617c;
            avVar.copyOnWrite();
            C54830aw awVar2 = (C54830aw) avVar.instance;
            awVar2.f143878a |= 2;
            awVar2.f143880c = i;
        }
        if ((yVar.f219615a & 4) != 0) {
            int i2 = yVar.f219618d;
            avVar.copyOnWrite();
            C54830aw awVar3 = (C54830aw) avVar.instance;
            awVar3.f143878a |= 4;
            awVar3.f143881d = i2;
        }
        if ((yVar.f219615a & 8) != 0) {
            float f2 = yVar.f219619e;
            avVar.copyOnWrite();
            C54830aw awVar4 = (C54830aw) avVar.instance;
            awVar4.f143878a |= 8;
            awVar4.f143882e = f2;
        }
        if ((yVar.f219615a & 16) != 0) {
            float f3 = yVar.f219620f;
            avVar.copyOnWrite();
            C54830aw awVar5 = (C54830aw) avVar.instance;
            awVar5.f143878a |= 16;
            awVar5.f143883f = f3;
        }
        return (C54830aw) avVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
