package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.shared.p6968aa.C89000a;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60322of;
import com.google.common.p4552o.C60324oh;
import com.google.common.p4552o.C60325oi;
import com.google.common.p4552o.C60327ok;
import com.google.common.p4552o.C60328ol;
import com.google.common.p4552o.C60329om;
import com.google.common.p4552o.C60333oq;
import com.google.common.p4552o.C60337ou;
import com.google.common.p4552o.C60339ow;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.gsa.c.a.a.h */
/* compiled from: PG */
final class C22183h implements C89059o {

    /* renamed from: c */
    private static final C59071e f61239c = C59071e.m91332i("com.google.android.libraries.gsa.c.a.a.h");

    /* renamed from: a */
    public final long f61240a;

    /* renamed from: b */
    public final long f61241b;

    /* renamed from: d */
    private final int f61242d;

    /* renamed from: e */
    private final C22160ac f61243e;

    /* renamed from: f */
    private final List f61244f = new LinkedList();

    /* renamed from: g */
    private C60870cx f61245g;

    /* renamed from: h */
    private C60870cx f61246h;

    public C22183h(int i, C22160ac acVar, long j, long j2) {
        this.f61242d = i;
        this.f61243e = acVar;
        this.f61240a = j;
        this.f61241b = j2;
    }

    /* renamed from: a */
    public final synchronized C60325oi mo27426a() {
        C60322of ofVar;
        ofVar = (C60322of) C60325oi.f163247i.createBuilder();
        C22196u uVar = C22196u.f61276a;
        C89060p pVar = C89060p.f241363a;
        try {
            C60870cx cxVar = this.f61245g;
            if (cxVar != null && cxVar.isDone()) {
                uVar = (C22196u) C90877ak.m148472f(this.f61245g);
            }
            C60870cx cxVar2 = this.f61246h;
            if (cxVar2 != null && cxVar2.isDone()) {
                pVar = (C89060p) C90877ak.m148472f(this.f61246h);
            }
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = f61239c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConnCheckAndReport");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48524)).mo56386p("Connectivity check has failed");
        }
        C89062r c2 = uVar.mo27407c();
        int i = c2.f241373e;
        ofVar.copyOnWrite();
        C60325oi oiVar = (C60325oi) ofVar.instance;
        oiVar.f163249a |= 1;
        oiVar.f163250b = i;
        int i2 = c2.f241374f;
        ofVar.copyOnWrite();
        C60325oi oiVar2 = (C60325oi) ofVar.instance;
        oiVar2.f163249a |= 8;
        oiVar2.f163251c = i2;
        boolean j = uVar.mo27415j();
        ofVar.copyOnWrite();
        C60325oi oiVar3 = (C60325oi) ofVar.instance;
        oiVar3.f163249a |= 16;
        oiVar3.f163252d = j;
        C60324oh ohVar = pVar.f241367e;
        ofVar.copyOnWrite();
        C60325oi oiVar4 = (C60325oi) ofVar.instance;
        oiVar4.f163254f = ohVar.f163246i;
        oiVar4.f163249a |= 128;
        long j2 = this.f61240a;
        ofVar.copyOnWrite();
        C60325oi oiVar5 = (C60325oi) ofVar.instance;
        oiVar5.f163249a |= 256;
        oiVar5.f163255g = (int) j2;
        long j3 = this.f61241b;
        ofVar.copyOnWrite();
        C60325oi oiVar6 = (C60325oi) ofVar.instance;
        oiVar6.f163249a |= 512;
        oiVar6.f163256h = (int) j3;
        int i3 = this.f61242d;
        ofVar.copyOnWrite();
        C60325oi oiVar7 = (C60325oi) ofVar.instance;
        oiVar7.f163249a |= 64;
        oiVar7.f163253e = i3;
        return (C60325oi) ofVar.build();
    }

    /* renamed from: b */
    public final synchronized C60329om mo27427b() {
        C60328ol olVar;
        olVar = (C60328ol) C60329om.f163263e.createBuilder();
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.f61244f.size(); i++) {
            C89000a aVar = (C89000a) this.f61244f.get(i);
            C60333oq f = aVar.mo82963f();
            olVar.copyOnWrite();
            C60329om omVar = (C60329om) olVar.instance;
            f.getClass();
            C62971cq cqVar = omVar.f163265a;
            if (!cqVar.mo58948c()) {
                omVar.f163265a = C62942bv.mutableCopy(cqVar);
            }
            omVar.f163265a.add(f);
            j = Math.min(j, C21383f.m40448a(aVar.f241178c, aVar.f241176a));
        }
        C22160ac acVar = this.f61243e;
        long j2 = j - 5000;
        C60337ou[] ouVarArr = (C60337ou[]) acVar.f61152b.mo27448g(j2);
        if (ouVarArr != null) {
            List asList = Arrays.asList(ouVarArr);
            olVar.copyOnWrite();
            C60329om omVar2 = (C60329om) olVar.instance;
            C62971cq cqVar2 = omVar2.f163266b;
            if (!cqVar2.mo58948c()) {
                omVar2.f163266b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) asList, (List) omVar2.f163266b);
        }
        C60339ow[] owVarArr = (C60339ow[]) acVar.f61153c.mo27448g(j2);
        if (owVarArr != null) {
            List asList2 = Arrays.asList(owVarArr);
            olVar.copyOnWrite();
            C60329om omVar3 = (C60329om) olVar.instance;
            C62971cq cqVar3 = omVar3.f163268d;
            if (!cqVar3.mo58948c()) {
                omVar3.f163268d = C62942bv.mutableCopy(cqVar3);
            }
            C62947c.addAll((Iterable) asList2, (List) omVar3.f163268d);
        }
        C60327ok[] okVarArr = (C60327ok[]) acVar.f61151a.mo27448g(j2);
        if (okVarArr != null) {
            List asList3 = Arrays.asList(okVarArr);
            olVar.copyOnWrite();
            C60329om omVar4 = (C60329om) olVar.instance;
            C62971cq cqVar4 = omVar4.f163267c;
            if (!cqVar4.mo58948c()) {
                omVar4.f163267c = C62942bv.mutableCopy(cqVar4);
            }
            C62947c.addAll((Iterable) asList3, (List) omVar4.f163267c);
        }
        return (C60329om) olVar.build();
    }

    /* renamed from: c */
    public final synchronized void mo27428c(C89000a aVar) {
        this.f61244f.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized C60870cx mo27429d(C58881cr crVar) {
        if (this.f61246h == null) {
            this.f61246h = ((C22184i) crVar).f61247a.mo27444n();
        }
        return this.f61246h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized C60870cx mo27430e(C58881cr crVar) {
        if (this.f61245g == null) {
            this.f61245g = ((C22192q) crVar).f61262a.mo27393b();
        }
        return this.f61245g;
    }
}
