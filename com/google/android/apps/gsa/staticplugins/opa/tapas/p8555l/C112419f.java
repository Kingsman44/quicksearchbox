package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79942aq;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54854bt;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54855bu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.f */
/* compiled from: PG */
class C112419f implements Function {
    /* renamed from: a */
    public final C54855bu apply(C79942aq aqVar) {
        C54854bt btVar = (C54854bt) C54855bu.f144082i.createBuilder();
        if ((aqVar.f219215a & 1) != 0) {
            float f = aqVar.f219216b;
            btVar.copyOnWrite();
            C54855bu buVar = (C54855bu) btVar.instance;
            buVar.f144084a |= 1;
            buVar.f144085b = f;
        }
        if ((aqVar.f219215a & 2) != 0) {
            float f2 = aqVar.f219217c;
            btVar.copyOnWrite();
            C54855bu buVar2 = (C54855bu) btVar.instance;
            buVar2.f144084a |= 2;
            buVar2.f144086c = f2;
        }
        if ((aqVar.f219215a & 4) != 0) {
            float f3 = aqVar.f219218d;
            btVar.copyOnWrite();
            C54855bu buVar3 = (C54855bu) btVar.instance;
            buVar3.f144084a |= 4;
            buVar3.f144087d = f3;
        }
        if ((aqVar.f219215a & 8) != 0) {
            float f4 = aqVar.f219219e;
            btVar.copyOnWrite();
            C54855bu buVar4 = (C54855bu) btVar.instance;
            buVar4.f144084a |= 8;
            buVar4.f144088e = f4;
        }
        if ((aqVar.f219215a & 16) != 0) {
            float f5 = aqVar.f219220f;
            btVar.copyOnWrite();
            C54855bu buVar5 = (C54855bu) btVar.instance;
            buVar5.f144084a |= 16;
            buVar5.f144089f = f5;
        }
        if ((aqVar.f219215a & 32) != 0) {
            float f6 = aqVar.f219221g;
            btVar.copyOnWrite();
            C54855bu buVar6 = (C54855bu) btVar.instance;
            buVar6.f144084a |= 32;
            buVar6.f144090g = f6;
        }
        if ((aqVar.f219215a & 64) != 0) {
            float f7 = aqVar.f219222h;
            btVar.copyOnWrite();
            C54855bu buVar7 = (C54855bu) btVar.instance;
            buVar7.f144084a |= 64;
            buVar7.f144091h = f7;
        }
        return (C54855bu) btVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
