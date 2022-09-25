package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79950ay;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79953ba;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79977by;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54868cg;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54870ci;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54898dj;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54899dk;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ar */
/* compiled from: PG */
class C112165ar implements Function {
    /* renamed from: a */
    public final C54899dk apply(C79977by byVar) {
        C54898dj djVar = (C54898dj) C54899dk.f144254g.createBuilder();
        if ((byVar.f219366a & 1) != 0) {
            Function function = C112281dm.f311608b;
            C79950ay ayVar = byVar.f219367b;
            if (ayVar == null) {
                ayVar = C79950ay.f219259c;
            }
            C54868cg a = ((C112650p) function).apply(ayVar);
            djVar.copyOnWrite();
            C54899dk dkVar = (C54899dk) djVar.instance;
            a.getClass();
            dkVar.f144257b = a;
            dkVar.f144256a |= 1;
        }
        if ((byVar.f219366a & 2) != 0) {
            Function function2 = C112281dm.f311607a;
            C79953ba baVar = byVar.f219368c;
            if (baVar == null) {
                baVar = C79953ba.f219269f;
            }
            C54870ci a2 = ((C112651q) function2).apply(baVar);
            djVar.copyOnWrite();
            C54899dk dkVar2 = (C54899dk) djVar.instance;
            a2.getClass();
            dkVar2.f144258c = a2;
            dkVar2.f144256a |= 2;
        }
        if ((byVar.f219366a & 4) != 0) {
            Function function3 = C112281dm.f311607a;
            C79953ba baVar2 = byVar.f219369d;
            if (baVar2 == null) {
                baVar2 = C79953ba.f219269f;
            }
            C54870ci a3 = ((C112651q) function3).apply(baVar2);
            djVar.copyOnWrite();
            C54899dk dkVar3 = (C54899dk) djVar.instance;
            a3.getClass();
            dkVar3.f144259d = a3;
            dkVar3.f144256a |= 4;
        }
        if ((byVar.f219366a & 8) != 0) {
            Function function4 = C112281dm.f311607a;
            C79953ba baVar3 = byVar.f219370e;
            if (baVar3 == null) {
                baVar3 = C79953ba.f219269f;
            }
            C54870ci a4 = ((C112651q) function4).apply(baVar3);
            djVar.copyOnWrite();
            C54899dk dkVar4 = (C54899dk) djVar.instance;
            a4.getClass();
            dkVar4.f144260e = a4;
            dkVar4.f144256a |= 8;
        }
        if ((byVar.f219366a & 16) != 0) {
            Function function5 = C112281dm.f311607a;
            C79953ba baVar4 = byVar.f219371f;
            if (baVar4 == null) {
                baVar4 = C79953ba.f219269f;
            }
            C54870ci a5 = ((C112651q) function5).apply(baVar4);
            djVar.copyOnWrite();
            C54899dk dkVar5 = (C54899dk) djVar.instance;
            a5.getClass();
            dkVar5.f144261f = a5;
            dkVar5.f144256a |= 16;
        }
        return (C54899dk) djVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
