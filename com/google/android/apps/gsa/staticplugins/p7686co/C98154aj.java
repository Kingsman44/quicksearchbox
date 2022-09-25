package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98436dc;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98437dd;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98444k;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98447n;
import com.google.common.base.C58817ah;
import com.google.common.base.C58839bc;
import com.google.common.base.C58844bh;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.p375ai.p378b.C7624dx;
import com.google.p375ai.p378b.C7625dy;
import com.google.p375ai.p378b.C7641en;
import com.google.p375ai.p378b.C7653ez;
import com.google.p375ai.p378b.C7659fe;
import com.google.p375ai.p378b.C7749in;
import com.google.p375ai.p378b.C7750io;
import com.google.p375ai.p378b.C7956qe;
import com.google.p375ai.p378b.C7957qf;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.aj */
/* compiled from: PG */
public final class C98154aj {

    /* renamed from: a */
    static final C58528ij f274083a = C58476gl.m89803b(EnumSet.of(C7749in.FOREGROUND_START_NOW, new C7749in[]{C7749in.FOREGROUND_START_SEARCH_SUGGEST, C7749in.RENDERING_STOPPED, C7749in.NEXT_PAGE}));

    /* renamed from: b */
    static final C58528ij f274084b = C58476gl.m89803b(EnumSet.of(C7749in.FOREGROUND_START_NOW, new C7749in[0]));

    /* renamed from: c */
    static final C58528ij f274085c = C58476gl.m89803b(EnumSet.of(C7749in.FOREGROUND_START_SEARCH_SUGGEST, new C7749in[0]));

    /* renamed from: d */
    public static final /* synthetic */ int f274086d = 0;

    /* renamed from: e */
    private static final C58817ah f274087e = new C98153ai();

    /* renamed from: a */
    static C58839bc m162583a(C7749in inVar) {
        return new C98151ag(inVar);
    }

    /* renamed from: b */
    static C58839bc m162584b(C55893j jVar) {
        return new C98152ah(jVar);
    }

    /* renamed from: c */
    static C7957qf m162585c(C7957qf qfVar) {
        C7653ez ezVar;
        if (qfVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(qfVar.f27955a.size());
        for (C7653ez ezVar2 : qfVar.f27955a) {
            if (m162587e(ezVar2)) {
                arrayList.add(ezVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList(qfVar.f27956b.size());
        for (C7659fe feVar : qfVar.f27956b) {
            if ((feVar.f26578a & 2) != 0) {
                ezVar = feVar.f26580c;
                if (ezVar == null) {
                    ezVar = C7653ez.f26564g;
                }
            } else {
                ezVar = null;
            }
            if (m162587e(ezVar)) {
                arrayList2.add(feVar);
            }
        }
        if (arrayList.size() == qfVar.f27955a.size() && arrayList2.size() == qfVar.f27956b.size()) {
            return qfVar;
        }
        C7956qe qeVar = (C7956qe) qfVar.toBuilder();
        qeVar.copyOnWrite();
        ((C7957qf) qeVar.instance).f27955a = C7957qf.emptyProtobufList();
        qeVar.copyOnWrite();
        C7957qf qfVar2 = (C7957qf) qeVar.instance;
        C62971cq cqVar = qfVar2.f27955a;
        if (!cqVar.mo58948c()) {
            qfVar2.f27955a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) qfVar2.f27955a);
        qeVar.copyOnWrite();
        ((C7957qf) qeVar.instance).f27956b = C7957qf.emptyProtobufList();
        qeVar.copyOnWrite();
        C7957qf qfVar3 = (C7957qf) qeVar.instance;
        C62971cq cqVar2 = qfVar3.f27956b;
        if (!cqVar2.mo58948c()) {
            qfVar3.f27956b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) arrayList2, (List) qfVar3.f27956b);
        return (C7957qf) qeVar.build();
    }

    /* renamed from: d */
    static Iterable m162586d(C7957qf qfVar) {
        if (qfVar == null) {
            return C58485gu.m89845m();
        }
        ArrayList arrayList = new ArrayList(qfVar.f27955a);
        for (C7659fe feVar : qfVar.f27956b) {
            if ((feVar.f26578a & 2) != 0) {
                C7653ez ezVar = feVar.f26580c;
                if (ezVar == null) {
                    ezVar = C7653ez.f26564g;
                }
                arrayList.add(ezVar);
            }
        }
        return C58557jl.m90124e(C58557jl.m90127h(C58557jl.m90124e(arrayList, C58844bh.NOT_NULL), f274087e), C58844bh.NOT_NULL);
    }

    /* renamed from: f */
    static String m162588f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "card selector" : "entry type" : "full" : "invalid";
    }

    /* renamed from: g */
    static C98437dd m162589g(boolean z, C7641en enVar, C98444k kVar) {
        C98436dc g = C98437dd.m163018g();
        g.mo91105d(Integer.MAX_VALUE);
        C98447n nVar = (C98447n) g;
        nVar.f274859c = kVar;
        g.mo91104c(z);
        if (enVar != null) {
            nVar.f274857a = enVar;
        }
        return g.mo91102a();
    }

    /* renamed from: h */
    private static boolean m162590h(C7625dy dyVar) {
        int a = C7624dx.m22789a(dyVar.f26344a);
        return a != 0 && a == 2;
    }

    /* renamed from: e */
    static /* synthetic */ boolean m162587e(C7653ez ezVar) {
        C7750io ioVar;
        C7750io ioVar2;
        if (ezVar == null) {
            return false;
        }
        int i = ezVar.f26567b;
        if (i == 1) {
            C58528ij ijVar = f274083a;
            C7749in a = C7749in.m22836a(((C7750io) ezVar.f26568c).f27122b);
            if (a == null) {
                a = C7749in.INVALID;
            }
            if (!ijVar.contains(a)) {
                return false;
            }
            int i2 = ezVar.f26567b;
            if (i2 == 1) {
                ioVar = (C7750io) ezVar.f26568c;
            } else {
                ioVar = C7750io.f27119d;
            }
            if ((2 & ioVar.f27121a) != 0) {
                if (i2 == 1) {
                    ioVar2 = (C7750io) ezVar.f26568c;
                } else {
                    ioVar2 = C7750io.f27119d;
                }
                C7625dy dyVar = ioVar2.f27123c;
                if (dyVar == null) {
                    dyVar = C7625dy.f26342c;
                }
                return m162590h(dyVar);
            }
        } else if (i == 2) {
            return m162590h((C7625dy) ezVar.f26568c);
        } else {
            return false;
        }
    }
}
