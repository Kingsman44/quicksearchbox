package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79963bk;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79967bo;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79969bq;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54882cu;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54886cy;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54887cz;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54889da;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ah */
/* compiled from: PG */
class C112155ah implements Function {
    /* renamed from: a */
    public final C54889da apply(C79969bq bqVar) {
        C54887cz czVar = (C54887cz) C54889da.f144219g.createBuilder();
        if ((bqVar.f219337a & 1) != 0) {
            Function function = C112270db.f311590a;
            C79967bo boVar = bqVar.f219338b;
            if (boVar == null) {
                boVar = C79967bo.f219328f;
            }
            C54886cy a = ((C112154ag) function).apply(boVar);
            czVar.copyOnWrite();
            C54889da daVar = (C54889da) czVar.instance;
            a.getClass();
            daVar.f144222b = a;
            daVar.f144221a |= 1;
        }
        if ((bqVar.f219337a & 2) != 0) {
            Function function2 = C112270db.f311591b;
            C79963bk bkVar = bqVar.f219339c;
            if (bkVar == null) {
                bkVar = C79963bk.f219302f;
            }
            C54882cu a2 = ((C112152ae) function2).apply(bkVar);
            czVar.copyOnWrite();
            C54889da daVar2 = (C54889da) czVar.instance;
            a2.getClass();
            daVar2.f144223c = a2;
            daVar2.f144221a |= 2;
        }
        if ((bqVar.f219337a & 4) != 0) {
            Function function3 = C112270db.f311591b;
            C79963bk bkVar2 = bqVar.f219340d;
            if (bkVar2 == null) {
                bkVar2 = C79963bk.f219302f;
            }
            C54882cu a3 = ((C112152ae) function3).apply(bkVar2);
            czVar.copyOnWrite();
            C54889da daVar3 = (C54889da) czVar.instance;
            a3.getClass();
            daVar3.f144224d = a3;
            daVar3.f144221a |= 4;
        }
        if ((bqVar.f219337a & 8) != 0) {
            Function function4 = C112270db.f311591b;
            C79963bk bkVar3 = bqVar.f219341e;
            if (bkVar3 == null) {
                bkVar3 = C79963bk.f219302f;
            }
            C54882cu a4 = ((C112152ae) function4).apply(bkVar3);
            czVar.copyOnWrite();
            C54889da daVar4 = (C54889da) czVar.instance;
            a4.getClass();
            daVar4.f144225e = a4;
            daVar4.f144221a |= 8;
        }
        if ((bqVar.f219337a & 16) != 0) {
            Function function5 = C112270db.f311591b;
            C79963bk bkVar4 = bqVar.f219342f;
            if (bkVar4 == null) {
                bkVar4 = C79963bk.f219302f;
            }
            C54882cu a5 = ((C112152ae) function5).apply(bkVar4);
            czVar.copyOnWrite();
            C54889da daVar5 = (C54889da) czVar.instance;
            a5.getClass();
            daVar5.f144226f = a5;
            daVar5.f144221a |= 16;
        }
        return (C54889da) czVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
