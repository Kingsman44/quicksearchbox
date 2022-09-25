package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79952b;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54810ac;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54827at;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54828au;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54845bk;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54849bo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.l */
/* compiled from: PG */
class C112646l implements Function {

    /* renamed from: a */
    private final Function f312254a;

    /* renamed from: b */
    private final Function f312255b;

    public C112646l(Function function, Function function2) {
        this.f312254a = function;
        this.f312255b = function2;
    }

    /* renamed from: a */
    public final C54828au apply(C80012i iVar) {
        C54827at atVar = (C54827at) C54828au.f143868g.createBuilder();
        if ((iVar.f219561a & 2) != 0) {
            mo99474b(iVar, atVar);
        }
        for (C79938am a : iVar.f219563c) {
            C54845bk a2 = ((C112164aq) this.f312254a).apply(a);
            atVar.copyOnWrite();
            C54828au auVar = (C54828au) atVar.instance;
            a2.getClass();
            auVar.mo54161a();
            auVar.f143872c.add(a2);
        }
        if ((iVar.f219561a & 16) != 0) {
            long j = iVar.f219565e;
            atVar.copyOnWrite();
            C54828au auVar2 = (C54828au) atVar.instance;
            auVar2.f143870a |= 2;
            auVar2.f143873d = j;
        }
        if ((iVar.f219561a & 4) != 0) {
            Function function = this.f312255b;
            C80007da daVar = iVar.f219564d;
            if (daVar == null) {
                daVar = C80007da.f219520C;
            }
            C54849bo a3 = ((C112196bb) function).apply(daVar);
            atVar.copyOnWrite();
            C54828au auVar3 = (C54828au) atVar.instance;
            a3.getClass();
            auVar3.f143874e = a3;
            auVar3.f143870a |= 4;
        }
        if ((iVar.f219561a & 32) != 0) {
            Function function2 = C112228cf.f311523a;
            C79952b a4 = C79952b.m128040a(iVar.f219566f);
            if (a4 == null) {
                a4 = C79952b.UNKNOWN_ORIGIN;
            }
            C54810ac a5 = ((C112199be) function2).apply(a4);
            atVar.copyOnWrite();
            C54828au auVar4 = (C54828au) atVar.instance;
            auVar4.f143875f = a5.f143798e;
            auVar4.f143870a |= 8;
        }
        return (C54828au) atVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public void mo99474b(C80012i iVar, C54827at atVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
