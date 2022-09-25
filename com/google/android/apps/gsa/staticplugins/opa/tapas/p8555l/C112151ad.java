package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79953ba;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79961bi;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54870ci;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54879cr;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54880cs;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ad */
/* compiled from: PG */
class C112151ad implements Function {
    /* renamed from: a */
    public final C54880cs apply(C79961bi biVar) {
        C54879cr crVar = (C54879cr) C54880cs.f144173f.createBuilder();
        if ((biVar.f219297a & 1) != 0) {
            Function function = C112246cx.f311535a;
            C79953ba baVar = biVar.f219298b;
            if (baVar == null) {
                baVar = C79953ba.f219269f;
            }
            C54870ci a = ((C112651q) function).apply(baVar);
            crVar.copyOnWrite();
            C54880cs csVar = (C54880cs) crVar.instance;
            a.getClass();
            csVar.f144176b = a;
            csVar.f144175a |= 1;
        }
        if ((biVar.f219297a & 2) != 0) {
            Function function2 = C112246cx.f311535a;
            C79953ba baVar2 = biVar.f219299c;
            if (baVar2 == null) {
                baVar2 = C79953ba.f219269f;
            }
            C54870ci a2 = ((C112651q) function2).apply(baVar2);
            crVar.copyOnWrite();
            C54880cs csVar2 = (C54880cs) crVar.instance;
            a2.getClass();
            csVar2.f144177c = a2;
            csVar2.f144175a |= 2;
        }
        if ((biVar.f219297a & 4) != 0) {
            Function function3 = C112246cx.f311535a;
            C79953ba baVar3 = biVar.f219300d;
            if (baVar3 == null) {
                baVar3 = C79953ba.f219269f;
            }
            C54870ci a3 = ((C112651q) function3).apply(baVar3);
            crVar.copyOnWrite();
            C54880cs csVar3 = (C54880cs) crVar.instance;
            a3.getClass();
            csVar3.f144178d = a3;
            csVar3.f144175a |= 4;
        }
        if ((biVar.f219297a & 8) != 0) {
            Function function4 = C112246cx.f311535a;
            C79953ba baVar4 = biVar.f219301e;
            if (baVar4 == null) {
                baVar4 = C79953ba.f219269f;
            }
            C54870ci a4 = ((C112651q) function4).apply(baVar4);
            crVar.copyOnWrite();
            C54880cs csVar4 = (C54880cs) crVar.instance;
            a4.getClass();
            csVar4.f144179e = a4;
            csVar4.f144175a |= 8;
        }
        return (C54880cs) crVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
