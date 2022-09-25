package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79932ag;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79934ai;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79940ao;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80016m;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80018o;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80020q;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80022s;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80024u;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80026w;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113397eh;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54814ag;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54816ai;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54818ak;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54820am;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54824aq;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54826as;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54839be;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54841bg;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54844bj;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54845bk;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54847bm;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54853bs;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54920k;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.aq */
/* compiled from: PG */
class C112164aq implements Function {

    /* renamed from: a */
    private final Function f311423a;

    /* renamed from: b */
    private final Function f311424b;

    /* renamed from: c */
    private final Function f311425c;

    /* renamed from: d */
    private final Function f311426d;

    /* renamed from: e */
    private final Function f311427e;

    public C112164aq(Function function, Function function2, Function function3, Function function4, Function function5) {
        this.f311423a = function;
        this.f311424b = function2;
        this.f311425c = function3;
        this.f311426d = function4;
        this.f311427e = function5;
    }

    /* renamed from: a */
    public final C54845bk apply(C79938am amVar) {
        C54844bj bjVar = (C54844bj) C54845bk.f143986C.createBuilder();
        if ((amVar.f219182a & 1) != 0) {
            mo99448c(amVar, bjVar);
        }
        if ((amVar.f219182a & 2) != 0) {
            int i = amVar.f219184c;
            bjVar.copyOnWrite();
            C54845bk bkVar = (C54845bk) bjVar.instance;
            bkVar.f143990a |= 2;
            bkVar.f143992c = i;
        }
        if ((amVar.f219182a & 4) != 0) {
            int i2 = amVar.f219185d;
            bjVar.copyOnWrite();
            C54845bk bkVar2 = (C54845bk) bjVar.instance;
            bkVar2.f143990a |= 4;
            bkVar2.f143993d = i2;
        }
        if ((amVar.f219182a & 8) != 0) {
            C48580an b = C48580an.m85241b(amVar.f219186e);
            if (b == null) {
                b = C48580an.UNKNOWN;
            }
            bjVar.copyOnWrite();
            C54845bk bkVar3 = (C54845bk) bjVar.instance;
            bkVar3.f143994e = b.getNumber();
            bkVar3.f143990a |= 8;
        }
        if ((amVar.f219182a & 16) != 0) {
            int i3 = amVar.f219187f;
            bjVar.copyOnWrite();
            C54845bk bkVar4 = (C54845bk) bjVar.instance;
            bkVar4.f143990a |= 16;
            bkVar4.f143995f = i3;
        }
        if ((amVar.f219182a & 32) != 0) {
            float f = amVar.f219188g;
            bjVar.copyOnWrite();
            C54845bk bkVar5 = (C54845bk) bjVar.instance;
            bkVar5.f143990a |= 32;
            bkVar5.f143996g = f;
        }
        if ((amVar.f219182a & 64) != 0) {
            String str = amVar.f219189h;
            bjVar.copyOnWrite();
            C54845bk bkVar6 = (C54845bk) bjVar.instance;
            str.getClass();
            bkVar6.f143990a |= 64;
            bkVar6.f143997h = str;
        }
        if ((amVar.f219182a & 128) != 0) {
            String str2 = amVar.f219190i;
            bjVar.copyOnWrite();
            C54845bk bkVar7 = (C54845bk) bjVar.instance;
            str2.getClass();
            bkVar7.f143990a |= 128;
            bkVar7.f143998i = str2;
        }
        if ((amVar.f219182a & 256) != 0) {
            String str3 = amVar.f219191j;
            bjVar.copyOnWrite();
            C54845bk bkVar8 = (C54845bk) bjVar.instance;
            str3.getClass();
            bkVar8.f143990a |= 256;
            bkVar8.f143999j = str3;
        }
        if ((amVar.f219182a & 512) != 0) {
            mo99447b(amVar, bjVar);
        }
        if ((amVar.f219182a & 1024) != 0) {
            Function function = C112280dl.f311603e;
            C80016m mVar = amVar.f219193l;
            if (mVar == null) {
                mVar = C80016m.f219576f;
            }
            C54920k a = ((C112295e) function).apply(mVar);
            bjVar.copyOnWrite();
            C54845bk bkVar9 = (C54845bk) bjVar.instance;
            a.getClass();
            bkVar9.f144001l = a;
            bkVar9.f143990a |= 1024;
        }
        if ((amVar.f219182a & 2048) != 0) {
            Function function2 = C112280dl.f311599a;
            if (amVar.f219194m == null) {
                C80024u uVar = C80024u.f219602d;
            }
            C54824aq a2 = ((C112148aa) function2).mo99425a();
            bjVar.copyOnWrite();
            C54845bk bkVar10 = (C54845bk) bjVar.instance;
            a2.getClass();
            bkVar10.f144002m = a2;
            bkVar10.f143990a |= 2048;
        }
        if ((amVar.f219182a & 4096) != 0) {
            Function function3 = this.f311426d;
            C80018o oVar = amVar.f219195n;
            if (oVar == null) {
                oVar = C80018o.f219583i;
            }
            C54816ai a3 = ((C112174b) function3).apply(oVar);
            bjVar.copyOnWrite();
            C54845bk bkVar11 = (C54845bk) bjVar.instance;
            a3.getClass();
            bkVar11.f144003n = a3;
            bkVar11.f143990a |= 4096;
        }
        if ((amVar.f219182a & 8192) != 0) {
            Function function4 = this.f311425c;
            C80026w wVar = amVar.f219196o;
            if (wVar == null) {
                wVar = C80026w.f219607e;
            }
            C54826as a4 = ((C112149ab) function4).apply(wVar);
            bjVar.copyOnWrite();
            C54845bk bkVar12 = (C54845bk) bjVar.instance;
            a4.getClass();
            bkVar12.f144004o = a4;
            bkVar12.f143990a |= 8192;
        }
        if ((amVar.f219182a & 16384) != 0) {
            Function function5 = this.f311424b;
            C79940ao aoVar = amVar.f219197p;
            if (aoVar == null) {
                aoVar = C79940ao.f219208d;
            }
            C54853bs a5 = ((C112197bc) function5).apply(aoVar);
            bjVar.copyOnWrite();
            C54845bk bkVar13 = (C54845bk) bjVar.instance;
            a5.getClass();
            bkVar13.f144005p = a5;
            bkVar13.f143990a |= 16384;
        }
        if ((amVar.f219182a & 32768) != 0) {
            Function function6 = C112280dl.f311600b;
            C80022s sVar = amVar.f219198q;
            if (sVar == null) {
                sVar = C80022s.f219597d;
            }
            C54820am a6 = ((C112172ay) function6).apply(sVar);
            bjVar.copyOnWrite();
            C54845bk bkVar14 = (C54845bk) bjVar.instance;
            a6.getClass();
            bkVar14.f144006q = a6;
            bkVar14.f143990a |= 32768;
        }
        if ((amVar.f219182a & 65536) != 0) {
            Function function7 = C112280dl.f311602d;
            C80020q qVar = amVar.f219199r;
            if (qVar == null) {
                qVar = C80020q.f219593c;
            }
            C54818ak a7 = ((C112644j) function7).apply(qVar);
            bjVar.copyOnWrite();
            C54845bk bkVar15 = (C54845bk) bjVar.instance;
            a7.getClass();
            bkVar15.f144007r = a7;
            bkVar15.f143990a |= 65536;
        }
        if ((amVar.f219182a & C89885b.S3REQUEST_VALUE) != 0) {
            String str4 = amVar.f219200s;
            bjVar.copyOnWrite();
            C54845bk bkVar16 = (C54845bk) bjVar.instance;
            str4.getClass();
            bkVar16.f143990a = 131072 | bkVar16.f143990a;
            bkVar16.f144008s = str4;
        }
        if ((amVar.f219182a & C89885b.HTTP_VALUE) != 0) {
            Function function8 = C112280dl.f311601c;
            C79932ag agVar = amVar.f219201t;
            if (agVar == null) {
                agVar = C79932ag.f219101ae;
            }
            C54839be a8 = ((C112159al) function8).apply(agVar);
            bjVar.copyOnWrite();
            C54845bk bkVar17 = (C54845bk) bjVar.instance;
            a8.getClass();
            bkVar17.f144009t = a8;
            bkVar17.f143990a |= C89885b.HTTP_VALUE;
        }
        if ((amVar.f219182a & 1048576) != 0) {
            Function function9 = this.f311423a;
            C113397eh ehVar = amVar.f219203v;
            if (ehVar == null) {
                ehVar = C113397eh.f314000f;
            }
            C54847bm a9 = ((C112173az) function9).apply(ehVar);
            bjVar.copyOnWrite();
            C54845bk bkVar18 = (C54845bk) bjVar.instance;
            a9.getClass();
            bkVar18.f144010u = a9;
            bkVar18.f143990a |= 524288;
        }
        if ((amVar.f219182a & 4194304) != 0) {
            boolean z = amVar.f219205x;
            bjVar.copyOnWrite();
            C54845bk bkVar19 = (C54845bk) bjVar.instance;
            bkVar19.f143990a = 1048576 | bkVar19.f143990a;
            bkVar19.f144011v = z;
        }
        if ((amVar.f219182a & 8388608) != 0) {
            boolean z2 = amVar.f219206y;
            bjVar.copyOnWrite();
            C54845bk bkVar20 = (C54845bk) bjVar.instance;
            bkVar20.f143990a |= C89885b.NOW_VALUE;
            bkVar20.f144012w = z2;
        }
        if ((amVar.f219182a & 16777216) != 0) {
            Function function10 = this.f311427e;
            C79934ai aiVar = amVar.f219207z;
            if (aiVar == null) {
                aiVar = C79934ai.f219159k;
            }
            C54841bg a10 = ((C112160am) function10).apply(aiVar);
            bjVar.copyOnWrite();
            C54845bk bkVar21 = (C54845bk) bjVar.instance;
            a10.getClass();
            bkVar21.f144013x = a10;
            bkVar21.f143990a |= 4194304;
        }
        if ((amVar.f219182a & 268435456) != 0) {
            boolean z3 = amVar.f219179C;
            bjVar.copyOnWrite();
            C54845bk bkVar22 = (C54845bk) bjVar.instance;
            bkVar22.f143990a = 8388608 | bkVar22.f143990a;
            bkVar22.f144014y = z3;
        }
        if ((amVar.f219182a & 134217728) != 0) {
            float f2 = amVar.f219178B;
            bjVar.copyOnWrite();
            C54845bk bkVar23 = (C54845bk) bjVar.instance;
            bkVar23.f143990a |= 16777216;
            bkVar23.f144015z = f2;
        }
        if ((amVar.f219182a & 536870912) != 0) {
            int i4 = amVar.f219180D;
            bjVar.copyOnWrite();
            C54845bk bkVar24 = (C54845bk) bjVar.instance;
            bkVar24.f143990a |= 33554432;
            bkVar24.f143988A = i4;
        }
        if ((amVar.f219182a & 1073741824) != 0) {
            C54814ag agVar2 = amVar.f219181E;
            if (agVar2 == null) {
                agVar2 = C54814ag.f143814c;
            }
            bjVar.copyOnWrite();
            C54845bk bkVar25 = (C54845bk) bjVar.instance;
            agVar2.getClass();
            bkVar25.f143989B = agVar2;
            bkVar25.f143990a |= 67108864;
        }
        return (C54845bk) bjVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public void mo99447b(C79938am amVar, C54844bj bjVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo99448c(C79938am amVar, C54844bj bjVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
