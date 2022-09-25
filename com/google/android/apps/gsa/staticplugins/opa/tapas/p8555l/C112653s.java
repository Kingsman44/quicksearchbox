package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79946au;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79955bc;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79965bm;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79975bw;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79982cc;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54849bo;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54864cc;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54871cj;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54872ck;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54884cw;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54895dg;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54903do;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.s */
/* compiled from: PG */
class C112653s implements Function {

    /* renamed from: a */
    private final Function f312257a;

    /* renamed from: b */
    private final Function f312258b;

    public C112653s(Function function, Function function2) {
        this.f312257a = function;
        this.f312258b = function2;
    }

    /* renamed from: a */
    public final C54872ck apply(C79955bc bcVar) {
        C54871cj cjVar = (C54871cj) C54872ck.f144150i.createBuilder();
        if ((bcVar.f219278a & 32) != 0) {
            Function function = C112235cm.f311530b;
            C79965bm bmVar = bcVar.f219279b;
            if (bmVar == null) {
                bmVar = C79965bm.f219309r;
            }
            C54884cw a = ((C112153af) function).apply(bmVar);
            cjVar.copyOnWrite();
            C54872ck ckVar = (C54872ck) cjVar.instance;
            a.getClass();
            ckVar.f144153b = a;
            ckVar.f144152a |= 1;
        }
        if ((bcVar.f219278a & 64) != 0) {
            Function function2 = C112235cm.f311530b;
            C79965bm bmVar2 = bcVar.f219280c;
            if (bmVar2 == null) {
                bmVar2 = C79965bm.f219309r;
            }
            C54884cw a2 = ((C112153af) function2).apply(bmVar2);
            cjVar.copyOnWrite();
            C54872ck ckVar2 = (C54872ck) cjVar.instance;
            a2.getClass();
            ckVar2.f144154c = a2;
            ckVar2.f144152a |= 2;
        }
        if ((bcVar.f219278a & 128) != 0) {
            Function function3 = C112235cm.f311531c;
            C79946au auVar = bcVar.f219281d;
            if (auVar == null) {
                auVar = C79946au.f219229p;
            }
            C54864cc a3 = ((C112648n) function3).apply(auVar);
            cjVar.copyOnWrite();
            C54872ck ckVar3 = (C54872ck) cjVar.instance;
            a3.getClass();
            ckVar3.f144155d = a3;
            ckVar3.f144152a |= 4;
        }
        for (C79982cc a4 : bcVar.f219282e) {
            C54903do a5 = ((C112167at) this.f312257a).apply(a4);
            cjVar.copyOnWrite();
            C54872ck ckVar4 = (C54872ck) cjVar.instance;
            a5.getClass();
            C62971cq cqVar = ckVar4.f144156e;
            if (!cqVar.mo58948c()) {
                ckVar4.f144156e = C62942bv.mutableCopy(cqVar);
            }
            ckVar4.f144156e.add(a5);
        }
        if ((bcVar.f219278a & 256) != 0) {
            Function function4 = C112235cm.f311529a;
            C79975bw bwVar = bcVar.f219283f;
            if (bwVar == null) {
                bwVar = C79975bw.f219358e;
            }
            C54895dg a6 = ((C112161an) function4).apply(bwVar);
            cjVar.copyOnWrite();
            C54872ck ckVar5 = (C54872ck) cjVar.instance;
            a6.getClass();
            ckVar5.f144157f = a6;
            ckVar5.f144152a |= 8;
        }
        if ((bcVar.f219278a & 1024) != 0) {
            Function function5 = this.f312258b;
            C80007da daVar = bcVar.f219284g;
            if (daVar == null) {
                daVar = C80007da.f219520C;
            }
            C54849bo a7 = ((C112196bb) function5).apply(daVar);
            cjVar.copyOnWrite();
            C54872ck ckVar6 = (C54872ck) cjVar.instance;
            a7.getClass();
            ckVar6.f144158g = a7;
            ckVar6.f144152a |= 16;
        }
        if ((bcVar.f219278a & 2048) != 0) {
            int i = bcVar.f219285h;
            cjVar.copyOnWrite();
            C54872ck ckVar7 = (C54872ck) cjVar.instance;
            ckVar7.f144152a |= 32;
            ckVar7.f144159h = i;
        }
        return (C54872ck) cjVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
