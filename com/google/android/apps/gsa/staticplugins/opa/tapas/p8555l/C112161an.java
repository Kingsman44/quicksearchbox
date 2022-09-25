package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79946au;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79974bv;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79975bw;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54864cc;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54892dd;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54894df;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54895dg;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.an */
/* compiled from: PG */
class C112161an implements Function {
    /* renamed from: a */
    public final C54895dg apply(C79975bw bwVar) {
        C54892dd ddVar = (C54892dd) C54895dg.f144242e.createBuilder();
        if ((bwVar.f219360a & 1) != 0) {
            Function function = C112277di.f311597a;
            C79946au auVar = bwVar.f219361b;
            if (auVar == null) {
                auVar = C79946au.f219229p;
            }
            C54864cc a = ((C112648n) function).apply(auVar);
            ddVar.copyOnWrite();
            C54895dg dgVar = (C54895dg) ddVar.instance;
            a.getClass();
            dgVar.f144245b = a;
            dgVar.f144244a |= 1;
        }
        if ((bwVar.f219360a & 2) != 0) {
            Function function2 = C112277di.f311598b;
            C79974bv bvVar = bwVar.f219362c;
            if (bvVar == null) {
                bvVar = C79974bv.f219349h;
            }
            C54894df a2 = ((C112655u) function2).apply(bvVar);
            ddVar.copyOnWrite();
            C54895dg dgVar2 = (C54895dg) ddVar.instance;
            a2.getClass();
            dgVar2.f144246c = a2;
            dgVar2.f144244a |= 2;
        }
        if ((bwVar.f219360a & 4) != 0) {
            Function function3 = C112277di.f311597a;
            C79946au auVar2 = bwVar.f219363d;
            if (auVar2 == null) {
                auVar2 = C79946au.f219229p;
            }
            C54864cc a3 = ((C112648n) function3).apply(auVar2);
            ddVar.copyOnWrite();
            C54895dg dgVar3 = (C54895dg) ddVar.instance;
            a3.getClass();
            dgVar3.f144247d = a3;
            dgVar3.f144244a |= 4;
        }
        return (C54895dg) ddVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
