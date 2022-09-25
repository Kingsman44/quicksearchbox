package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79944as;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79946au;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79953ba;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79961bi;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79963bk;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79965bm;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79967bo;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79969bq;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79971bs;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54862ca;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54864cc;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54870ci;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54880cs;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54882cu;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54883cv;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54884cw;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54886cy;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54889da;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54891dc;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.af */
/* compiled from: PG */
class C112153af implements Function {
    /* renamed from: a */
    public final C54884cw apply(C79965bm bmVar) {
        C54883cv cvVar = (C54883cv) C54884cw.f144187r.createBuilder();
        if ((bmVar.f219311a & 2) != 0) {
            float f = bmVar.f219312b;
            cvVar.copyOnWrite();
            C54884cw cwVar = (C54884cw) cvVar.instance;
            cwVar.f144189a |= 1;
            cwVar.f144190b = f;
        }
        if ((bmVar.f219311a & 4) != 0) {
            mo99433b(bmVar, cvVar);
        }
        if ((bmVar.f219311a & 8) != 0) {
            float f2 = bmVar.f219314d;
            cvVar.copyOnWrite();
            C54884cw cwVar2 = (C54884cw) cvVar.instance;
            cwVar2.f144189a |= 4;
            cwVar2.f144192d = f2;
        }
        if ((bmVar.f219311a & 16) != 0) {
            float f3 = bmVar.f219315e;
            cvVar.copyOnWrite();
            C54884cw cwVar3 = (C54884cw) cvVar.instance;
            cwVar3.f144189a |= 8;
            cwVar3.f144193e = f3;
        }
        for (C79944as a : bmVar.f219316f) {
            C54862ca a2 = ((C112627i) C112248cz.f311543g).apply(a);
            cvVar.copyOnWrite();
            C54884cw cwVar4 = (C54884cw) cvVar.instance;
            a2.getClass();
            C62971cq cqVar = cwVar4.f144194f;
            if (!cqVar.mo58948c()) {
                cwVar4.f144194f = C62942bv.mutableCopy(cqVar);
            }
            cwVar4.f144194f.add(a2);
        }
        if ((bmVar.f219311a & 64) != 0) {
            Function function = C112248cz.f311541e;
            C79961bi biVar = bmVar.f219317g;
            if (biVar == null) {
                biVar = C79961bi.f219295f;
            }
            C54880cs a3 = ((C112151ad) function).apply(biVar);
            cvVar.copyOnWrite();
            C54884cw cwVar5 = (C54884cw) cvVar.instance;
            a3.getClass();
            cwVar5.f144195g = a3;
            cwVar5.f144189a |= 16;
        }
        if ((bmVar.f219311a & 128) != 0) {
            Function function2 = C112248cz.f311539c;
            C79969bq bqVar = bmVar.f219318h;
            if (bqVar == null) {
                bqVar = C79969bq.f219335g;
            }
            C54889da a4 = ((C112155ah) function2).apply(bqVar);
            cvVar.copyOnWrite();
            C54884cw cwVar6 = (C54884cw) cvVar.instance;
            a4.getClass();
            cwVar6.f144196h = a4;
            cwVar6.f144189a |= 32;
        }
        if ((bmVar.f219311a & 256) != 0) {
            Function function3 = C112248cz.f311542f;
            C79971bs bsVar = bmVar.f219319i;
            if (bsVar == null) {
                bsVar = C79971bs.f219343e;
            }
            C54891dc a5 = ((C112156ai) function3).apply(bsVar);
            cvVar.copyOnWrite();
            C54884cw cwVar7 = (C54884cw) cvVar.instance;
            a5.getClass();
            cwVar7.f144197i = a5;
            cwVar7.f144189a |= 64;
        }
        if ((bmVar.f219311a & 512) != 0) {
            Function function4 = C112248cz.f311544h;
            C79946au auVar = bmVar.f219320j;
            if (auVar == null) {
                auVar = C79946au.f219229p;
            }
            C54864cc a6 = ((C112648n) function4).apply(auVar);
            cvVar.copyOnWrite();
            C54884cw cwVar8 = (C54884cw) cvVar.instance;
            a6.getClass();
            cwVar8.f144198j = a6;
            cwVar8.f144189a |= 128;
        }
        if ((bmVar.f219311a & 1024) != 0) {
            Function function5 = C112248cz.f311540d;
            C79953ba baVar = bmVar.f219321k;
            if (baVar == null) {
                baVar = C79953ba.f219269f;
            }
            C54870ci a7 = ((C112651q) function5).apply(baVar);
            cvVar.copyOnWrite();
            C54884cw cwVar9 = (C54884cw) cvVar.instance;
            a7.getClass();
            cwVar9.f144199k = a7;
            cwVar9.f144189a |= 256;
        }
        if ((bmVar.f219311a & 2048) != 0) {
            Function function6 = C112248cz.f311540d;
            C79953ba baVar2 = bmVar.f219322l;
            if (baVar2 == null) {
                baVar2 = C79953ba.f219269f;
            }
            C54870ci a8 = ((C112651q) function6).apply(baVar2);
            cvVar.copyOnWrite();
            C54884cw cwVar10 = (C54884cw) cvVar.instance;
            a8.getClass();
            cwVar10.f144200l = a8;
            cwVar10.f144189a |= 512;
        }
        if ((bmVar.f219311a & 4096) != 0) {
            Function function7 = C112248cz.f311537a;
            C79967bo boVar = bmVar.f219323m;
            if (boVar == null) {
                boVar = C79967bo.f219328f;
            }
            C54886cy a9 = ((C112154ag) function7).apply(boVar);
            cvVar.copyOnWrite();
            C54884cw cwVar11 = (C54884cw) cvVar.instance;
            a9.getClass();
            cwVar11.f144201m = a9;
            cwVar11.f144189a |= 1024;
        }
        if ((bmVar.f219311a & 8192) != 0) {
            Function function8 = C112248cz.f311538b;
            C79963bk bkVar = bmVar.f219324n;
            if (bkVar == null) {
                bkVar = C79963bk.f219302f;
            }
            C54882cu a10 = ((C112152ae) function8).apply(bkVar);
            cvVar.copyOnWrite();
            C54884cw cwVar12 = (C54884cw) cvVar.instance;
            a10.getClass();
            cwVar12.f144202n = a10;
            cwVar12.f144189a |= 2048;
        }
        if ((bmVar.f219311a & 16384) != 0) {
            Function function9 = C112248cz.f311538b;
            C79963bk bkVar2 = bmVar.f219325o;
            if (bkVar2 == null) {
                bkVar2 = C79963bk.f219302f;
            }
            C54882cu a11 = ((C112152ae) function9).apply(bkVar2);
            cvVar.copyOnWrite();
            C54884cw cwVar13 = (C54884cw) cvVar.instance;
            a11.getClass();
            cwVar13.f144203o = a11;
            cwVar13.f144189a |= 4096;
        }
        if ((bmVar.f219311a & 32768) != 0) {
            Function function10 = C112248cz.f311538b;
            C79963bk bkVar3 = bmVar.f219326p;
            if (bkVar3 == null) {
                bkVar3 = C79963bk.f219302f;
            }
            C54882cu a12 = ((C112152ae) function10).apply(bkVar3);
            cvVar.copyOnWrite();
            C54884cw cwVar14 = (C54884cw) cvVar.instance;
            a12.getClass();
            cwVar14.f144204p = a12;
            cwVar14.f144189a |= 8192;
        }
        if ((bmVar.f219311a & 65536) != 0) {
            Function function11 = C112248cz.f311538b;
            C79963bk bkVar4 = bmVar.f219327q;
            if (bkVar4 == null) {
                bkVar4 = C79963bk.f219302f;
            }
            C54882cu a13 = ((C112152ae) function11).apply(bkVar4);
            cvVar.copyOnWrite();
            C54884cw cwVar15 = (C54884cw) cvVar.instance;
            a13.getClass();
            cwVar15.f144205q = a13;
            cwVar15.f144189a |= 16384;
        }
        return (C54884cw) cvVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public void mo99433b(C79965bm bmVar, C54883cv cvVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
