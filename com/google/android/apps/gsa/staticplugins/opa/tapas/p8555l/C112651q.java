package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79950ay;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79953ba;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54868cg;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54869ch;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54870ci;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.q */
/* compiled from: PG */
class C112651q implements Function {
    /* renamed from: a */
    public final C54870ci apply(C79953ba baVar) {
        C54869ch chVar = (C54869ch) C54870ci.f144143f.createBuilder();
        if ((baVar.f219271a & 1) != 0) {
            Function function = C112233ck.f311528a;
            C79950ay ayVar = baVar.f219272b;
            if (ayVar == null) {
                ayVar = C79950ay.f219259c;
            }
            C54868cg a = ((C112650p) function).apply(ayVar);
            chVar.copyOnWrite();
            C54870ci ciVar = (C54870ci) chVar.instance;
            a.getClass();
            ciVar.f144146b = a;
            ciVar.f144145a |= 1;
        }
        if ((baVar.f219271a & 2) != 0) {
            Function function2 = C112233ck.f311528a;
            C79950ay ayVar2 = baVar.f219273c;
            if (ayVar2 == null) {
                ayVar2 = C79950ay.f219259c;
            }
            C54868cg a2 = ((C112650p) function2).apply(ayVar2);
            chVar.copyOnWrite();
            C54870ci ciVar2 = (C54870ci) chVar.instance;
            a2.getClass();
            ciVar2.f144147c = a2;
            ciVar2.f144145a |= 2;
        }
        if ((baVar.f219271a & 4) != 0) {
            Function function3 = C112233ck.f311528a;
            C79950ay ayVar3 = baVar.f219274d;
            if (ayVar3 == null) {
                ayVar3 = C79950ay.f219259c;
            }
            C54868cg a3 = ((C112650p) function3).apply(ayVar3);
            chVar.copyOnWrite();
            C54870ci ciVar3 = (C54870ci) chVar.instance;
            a3.getClass();
            ciVar3.f144148d = a3;
            ciVar3.f144145a |= 4;
        }
        if ((baVar.f219271a & 8) != 0) {
            Function function4 = C112233ck.f311528a;
            C79950ay ayVar4 = baVar.f219275e;
            if (ayVar4 == null) {
                ayVar4 = C79950ay.f219259c;
            }
            C54868cg a4 = ((C112650p) function4).apply(ayVar4);
            chVar.copyOnWrite();
            C54870ci ciVar4 = (C54870ci) chVar.instance;
            a4.getClass();
            ciVar4.f144149e = a4;
            ciVar4.f144145a |= 8;
        }
        return (C54870ci) chVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
