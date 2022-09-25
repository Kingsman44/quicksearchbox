package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52394qc;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52404qm;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72288l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.az */
/* compiled from: PG */
public final class C114802az {

    /* renamed from: a */
    private static final C59071e f318553a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.j.az");

    /* renamed from: a */
    public static C52395qd m190314a(long j, boolean z) {
        C72210d dVar = new C72210d(TimeUnit.SECONDS.toMillis(j));
        C52394qc qcVar = (C52394qc) C52395qd.f137485e.createBuilder();
        C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
        int n = dVar.mo63375n();
        qaVar.copyOnWrite();
        C52393qb qbVar = (C52393qb) qaVar.instance;
        qbVar.f137481a |= 1;
        qbVar.f137482b = n;
        int m = dVar.mo63374m();
        qaVar.copyOnWrite();
        C52393qb qbVar2 = (C52393qb) qaVar.instance;
        qbVar2.f137481a |= 2;
        qbVar2.f137483c = m;
        int j2 = dVar.mo63371j();
        qaVar.copyOnWrite();
        C52393qb qbVar3 = (C52393qb) qaVar.instance;
        qbVar3.f137481a |= 4;
        qbVar3.f137484d = j2;
        qcVar.copyOnWrite();
        C52395qd qdVar = (C52395qd) qcVar.instance;
        C52393qb qbVar4 = (C52393qb) qaVar.build();
        qbVar4.getClass();
        qdVar.f137488b = qbVar4;
        qdVar.f137487a |= 1;
        if (!z) {
            C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
            int k = dVar.mo63372k();
            qkVar.copyOnWrite();
            C52403ql qlVar = (C52403ql) qkVar.instance;
            qlVar.f137514a |= 1;
            qlVar.f137515b = k;
            int l = dVar.mo63373l();
            qkVar.copyOnWrite();
            C52403ql qlVar2 = (C52403ql) qkVar.instance;
            qlVar2.f137514a |= 2;
            qlVar2.f137516c = l;
            qcVar.copyOnWrite();
            C52395qd qdVar2 = (C52395qd) qcVar.instance;
            C52403ql qlVar3 = (C52403ql) qkVar.build();
            qlVar3.getClass();
            qdVar2.f137489c = qlVar3;
            qdVar2.f137487a |= 2;
        }
        C52404qm qmVar = (C52404qm) C52405qn.f137519c.createBuilder();
        String str = dVar.f191963b.mo63325C().f192423d;
        qmVar.copyOnWrite();
        C52405qn qnVar = (C52405qn) qmVar.instance;
        qnVar.f137521a |= 1;
        qnVar.f137522b = str;
        qcVar.copyOnWrite();
        C52395qd qdVar3 = (C52395qd) qcVar.instance;
        C52405qn qnVar2 = (C52405qn) qmVar.build();
        qnVar2.getClass();
        qdVar3.f137490d = qnVar2;
        qdVar3.f137487a |= 4;
        return (C52395qd) qcVar.build();
    }

    /* renamed from: b */
    public static C58833ax m190315b(C52395qd qdVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C72288l lVar;
        if (qdVar == null) {
            ((C59052c) ((C59052c) f318553a.mo56226d()).mo56372aa(29568)).mo56386p("DateTimeProto was null, returning null");
            return C58836b.f156633a;
        }
        if ((qdVar.f137487a & 1) != 0) {
            C52393qb qbVar = qdVar.f137488b;
            if (qbVar == null) {
                qbVar = C52393qb.f137479e;
            }
            i = qbVar.f137482b;
        } else {
            i = new C72210d().mo63375n();
        }
        int i6 = i;
        if ((qdVar.f137487a & 1) != 0) {
            C52393qb qbVar2 = qdVar.f137488b;
            if (qbVar2 == null) {
                qbVar2 = C52393qb.f137479e;
            }
            i2 = qbVar2.f137483c;
        } else {
            i2 = new C72210d().mo63374m();
        }
        int i7 = i2;
        if ((qdVar.f137487a & 1) != 0) {
            C52393qb qbVar3 = qdVar.f137488b;
            if (qbVar3 == null) {
                qbVar3 = C52393qb.f137479e;
            }
            i3 = qbVar3.f137484d;
        } else {
            i3 = new C72210d().mo63371j();
        }
        int i8 = i3;
        if ((qdVar.f137487a & 2) != 0) {
            C52403ql qlVar = qdVar.f137489c;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            i4 = qlVar.f137515b;
        } else {
            i4 = 0;
        }
        if ((qdVar.f137487a & 2) != 0) {
            C52403ql qlVar2 = qdVar.f137489c;
            if (qlVar2 == null) {
                qlVar2 = C52403ql.f137512f;
            }
            i5 = qlVar2.f137516c;
        } else {
            i5 = 0;
        }
        if ((qdVar.f137487a & 4) != 0) {
            C52405qn qnVar = qdVar.f137490d;
            if (qnVar == null) {
                qnVar = C52405qn.f137519c;
            }
            lVar = C72288l.m106786m(qnVar.f137522b);
        } else {
            lVar = C72288l.m106789p();
        }
        return C58833ax.m90834k(new C72210d(i6, i7, i8, i4, i5, lVar));
    }
}
