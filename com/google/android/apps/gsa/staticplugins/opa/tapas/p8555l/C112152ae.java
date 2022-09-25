package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79963bk;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79967bo;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54881ct;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54882cu;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54886cy;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ae */
/* compiled from: PG */
class C112152ae implements Function {
    /* renamed from: a */
    public final C54882cu apply(C79963bk bkVar) {
        C54881ct ctVar = (C54881ct) C54882cu.f144180f.createBuilder();
        if ((bkVar.f219304a & 1) != 0) {
            Function function = C112247cy.f311536a;
            C79967bo boVar = bkVar.f219305b;
            if (boVar == null) {
                boVar = C79967bo.f219328f;
            }
            C54886cy a = ((C112154ag) function).apply(boVar);
            ctVar.copyOnWrite();
            C54882cu cuVar = (C54882cu) ctVar.instance;
            a.getClass();
            cuVar.f144183b = a;
            cuVar.f144182a |= 1;
        }
        if ((bkVar.f219304a & 2) != 0) {
            Function function2 = C112247cy.f311536a;
            C79967bo boVar2 = bkVar.f219306c;
            if (boVar2 == null) {
                boVar2 = C79967bo.f219328f;
            }
            C54886cy a2 = ((C112154ag) function2).apply(boVar2);
            ctVar.copyOnWrite();
            C54882cu cuVar2 = (C54882cu) ctVar.instance;
            a2.getClass();
            cuVar2.f144184c = a2;
            cuVar2.f144182a |= 2;
        }
        if ((bkVar.f219304a & 4) != 0) {
            Function function3 = C112247cy.f311536a;
            C79967bo boVar3 = bkVar.f219307d;
            if (boVar3 == null) {
                boVar3 = C79967bo.f219328f;
            }
            C54886cy a3 = ((C112154ag) function3).apply(boVar3);
            ctVar.copyOnWrite();
            C54882cu cuVar3 = (C54882cu) ctVar.instance;
            a3.getClass();
            cuVar3.f144185d = a3;
            cuVar3.f144182a |= 4;
        }
        if ((bkVar.f219304a & 8) != 0) {
            Function function4 = C112247cy.f311536a;
            C79967bo boVar4 = bkVar.f219308e;
            if (boVar4 == null) {
                boVar4 = C79967bo.f219328f;
            }
            C54886cy a4 = ((C112154ag) function4).apply(boVar4);
            ctVar.copyOnWrite();
            C54882cu cuVar4 = (C54882cu) ctVar.instance;
            a4.getClass();
            cuVar4.f144186e = a4;
            cuVar4.f144182a |= 8;
        }
        return (C54882cu) ctVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
