package com.google.android.apps.gsa.nga.engine.p6056o.p6059c;

import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52394qc;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52404qm;
import com.google.assistant.p3897e.p3921j.C52405qn;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63378v;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.c.g */
/* compiled from: PG */
public final /* synthetic */ class C76595g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76595g f211842a = new C76595g();

    private /* synthetic */ C76595g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63358b bVar = (C63358b) obj;
        C52394qc qcVar = (C52394qc) C52395qd.f137485e.createBuilder();
        C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
        int i = bVar.f171219b;
        qaVar.copyOnWrite();
        C52393qb qbVar = (C52393qb) qaVar.instance;
        qbVar.f137481a |= 1;
        qbVar.f137482b = i;
        int a = C63378v.m96231a(bVar.f171220c);
        if (a == 0) {
            a = 1;
        }
        qaVar.copyOnWrite();
        C52393qb qbVar2 = (C52393qb) qaVar.instance;
        qbVar2.f137481a |= 2;
        qbVar2.f137483c = a - 1;
        int i2 = bVar.f171221d;
        qaVar.copyOnWrite();
        C52393qb qbVar3 = (C52393qb) qaVar.instance;
        qbVar3.f137481a |= 4;
        qbVar3.f137484d = i2;
        qcVar.copyOnWrite();
        C52395qd qdVar = (C52395qd) qcVar.instance;
        C52393qb qbVar4 = (C52393qb) qaVar.build();
        qbVar4.getClass();
        qdVar.f137488b = qbVar4;
        qdVar.f137487a |= 1;
        int i3 = bVar.f171218a;
        if (!((i3 & 16) == 0 && (i3 & 32) == 0 && (i3 & 64) == 0)) {
            C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
            if ((bVar.f171218a & 16) != 0) {
                int i4 = bVar.f171222e;
                qkVar.copyOnWrite();
                C52403ql qlVar = (C52403ql) qkVar.instance;
                qlVar.f137514a |= 1;
                qlVar.f137515b = i4;
            }
            if ((bVar.f171218a & 32) != 0) {
                int i5 = bVar.f171223f;
                qkVar.copyOnWrite();
                C52403ql qlVar2 = (C52403ql) qkVar.instance;
                qlVar2.f137514a |= 2;
                qlVar2.f137516c = i5;
            }
            if ((bVar.f171218a & 64) != 0) {
                int i6 = bVar.f171224g;
                qkVar.copyOnWrite();
                C52403ql qlVar3 = (C52403ql) qkVar.instance;
                qlVar3.f137514a |= 4;
                qlVar3.f137517d = i6;
            }
            C52403ql qlVar4 = (C52403ql) qkVar.build();
            qcVar.copyOnWrite();
            C52395qd qdVar2 = (C52395qd) qcVar.instance;
            qlVar4.getClass();
            qdVar2.f137489c = qlVar4;
            qdVar2.f137487a |= 2;
        }
        if ((bVar.f171218a & 512) != 0) {
            C52404qm qmVar = (C52404qm) C52405qn.f137519c.createBuilder();
            String str = bVar.f171225h;
            qmVar.copyOnWrite();
            C52405qn qnVar = (C52405qn) qmVar.instance;
            str.getClass();
            qnVar.f137521a |= 1;
            qnVar.f137522b = str;
            qcVar.copyOnWrite();
            C52395qd qdVar3 = (C52395qd) qcVar.instance;
            C52405qn qnVar2 = (C52405qn) qmVar.build();
            qnVar2.getClass();
            qdVar3.f137490d = qnVar2;
            qdVar3.f137487a |= 4;
        }
        return (C52395qd) qcVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
