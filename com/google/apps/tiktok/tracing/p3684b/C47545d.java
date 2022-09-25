package com.google.apps.tiktok.tracing.p3684b;

import android.util.SparseArray;
import com.google.android.libraries.performance.p2389a.p2390a.p2391a.C31121a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2416j.C31547o;
import com.google.apps.tiktok.tracing.C47556bg;
import com.google.apps.tiktok.tracing.C47559bj;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import com.google.apps.tiktok.tracing.C47779do;
import com.google.apps.tiktok.tracing.C47814ew;
import com.google.apps.tiktok.tracing.C47817ez;
import com.google.apps.tiktok.tracing.C47857q;
import com.google.apps.tiktok.tracing.C47859s;
import com.google.apps.tiktok.tracing.C47860t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Iterator;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71246cb;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71247cc;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71249ce;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71252ch;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71254cj;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71255ck;

/* renamed from: com.google.apps.tiktok.tracing.b.d */
/* compiled from: PG */
public final class C47545d implements C47779do {

    /* renamed from: a */
    public static final C59071e f123392a = C59071e.m91332i("com.google.apps.tiktok.tracing.b.d");

    /* renamed from: b */
    private final C68214a f123393b;

    public C47545d(C68214a aVar) {
        this.f123393b = aVar;
    }

    /* renamed from: a */
    public final void mo51407a(C47547f fVar, C71207aq aqVar) {
        C31167ax.m58112a().f84035a.mo36909n(fVar.f123399e, aqVar);
        if (((C58833ax) this.f123393b.mo27525b()).mo56113h() && ((C31547o) ((C58833ax) this.f123393b.mo27525b()).mo56107c()).mo37224d()) {
            long j = fVar.f123397c;
            long j2 = fVar.f123398d;
            C31167ax.m58112a().f84035a.mo36908m(fVar.f123395a, j, j2, fVar.f123396b);
        }
    }

    /* renamed from: b */
    public final void mo51372b(C47814ew ewVar, SparseArray sparseArray) {
        C58833ax axVar;
        C60870cx cxVar;
        C47814ew ewVar2 = ewVar;
        SparseArray sparseArray2 = sparseArray;
        C58833ax axVar2 = (C58833ax) this.f123393b.mo27525b();
        if (!axVar2.mo56113h() || !((C31547o) axVar2.mo56107c()).mo36980b()) {
            axVar = C58836b.f156633a;
        } else {
            float f = ((C31547o) axVar2.mo56107c()).mo37227f().f84957a;
            if (C47817ez.m84993a(ewVar2.f123834c, f)) {
                axVar = C58833ax.m90834k(Float.valueOf(f));
            } else {
                axVar = C58836b.f156633a;
            }
        }
        if (axVar.mo56113h()) {
            new SparseArray();
            float floatValue = ((Float) axVar.mo56107c()).floatValue();
            ewVar.getClass();
            C71249ce ceVar = (C71249ce) C71251cg.f190215k.createBuilder();
            ceVar.copyOnWrite();
            C71251cg cgVar = (C71251cg) ceVar.instance;
            cgVar.f190217a |= 4;
            cgVar.f190221e = floatValue;
            long j = ewVar2.f123837f;
            ceVar.copyOnWrite();
            C71251cg cgVar2 = (C71251cg) ceVar.instance;
            cgVar2.f190217a |= 128;
            cgVar2.f190226j = j;
            long j2 = ewVar2.f123836e;
            ceVar.copyOnWrite();
            C71251cg cgVar3 = (C71251cg) ceVar.instance;
            cgVar3.f190217a |= 64;
            cgVar3.f190225i = j2;
            long j3 = ewVar2.f123837f;
            long j4 = (ewVar2.f123833b ^ ewVar2.f123834c) & Long.MAX_VALUE;
            if (j4 == 0) {
                j4 = 1;
            }
            ceVar.copyOnWrite();
            C71251cg cgVar4 = (C71251cg) ceVar.instance;
            cgVar4.f190217a |= 1;
            cgVar4.f190218b = j4;
            ceVar.copyOnWrite();
            C71251cg cgVar5 = (C71251cg) ceVar.instance;
            cgVar5.f190219c = 1;
            cgVar5.f190217a |= 2;
            Iterator it = ewVar2.f123835d.iterator();
            C71255ck ckVar = null;
            C71255ck ckVar2 = null;
            long j5 = 0;
            while (it.hasNext()) {
                C47556bg bgVar = (C47556bg) it.next();
                C71252ch chVar = (C71252ch) C71255ck.f190229m.createBuilder();
                String str = bgVar.f123407b;
                chVar.copyOnWrite();
                C71255ck ckVar3 = (C71255ck) chVar.instance;
                str.getClass();
                Iterator it2 = it;
                ckVar3.f190231a |= 1;
                ckVar3.f190232b = str;
                int i = bgVar.f123408c;
                chVar.copyOnWrite();
                C71255ck ckVar4 = (C71255ck) chVar.instance;
                ckVar4.f190231a |= 8;
                ckVar4.f190235e = ((long) i) + 1;
                int i2 = bgVar.f123409d;
                chVar.copyOnWrite();
                C71255ck ckVar5 = (C71255ck) chVar.instance;
                ckVar5.f190231a |= 16;
                ckVar5.f190236f = ((long) i2) + 1;
                long j6 = bgVar.f123410e;
                chVar.copyOnWrite();
                C71255ck ckVar6 = (C71255ck) chVar.instance;
                ckVar6.f190231a |= 32;
                ckVar6.f190237g = j6 + j3;
                if ((bgVar.f123406a & 16) != 0) {
                    long j7 = bgVar.f123411f;
                    chVar.copyOnWrite();
                    C71255ck ckVar7 = (C71255ck) chVar.instance;
                    ckVar7.f190231a |= 64;
                    ckVar7.f190238h = j7;
                }
                if ((bgVar.f123406a & 32) != 0) {
                    int i3 = bgVar.f123412g;
                    chVar.copyOnWrite();
                    C71255ck ckVar8 = (C71255ck) chVar.instance;
                    ckVar8.f190231a |= 128;
                    ckVar8.f190239i = i3;
                }
                C47559bj i4 = C47563bn.m84655i(C47546e.f123394a, (C47563bn) sparseArray2.get(bgVar.f123408c, C47562bm.f123426a));
                if (i4.mo51420b()) {
                    C47542a aVar = (C47542a) i4.mo51419a();
                    if (aVar.mo51406b()) {
                        chVar.copyOnWrite();
                        C71255ck ckVar9 = (C71255ck) chVar.instance;
                        ckVar9.f190241k = 5;
                        ckVar9.f190231a |= 512;
                    }
                    C58833ax a = aVar.mo51405a();
                    if (a.mo56113h()) {
                        C71207aq aqVar = (C71207aq) a.mo56107c();
                        chVar.copyOnWrite();
                        C71255ck ckVar10 = (C71255ck) chVar.instance;
                        aqVar.getClass();
                        ckVar10.f190242l = aqVar;
                        ckVar10.f190231a |= 1024;
                    }
                }
                C71255ck ckVar11 = (C71255ck) chVar.build();
                if (ckVar11.f190236f == 0) {
                    ckVar2 = ckVar11;
                } else {
                    int a2 = C71254cj.m103947a(ckVar11.f190241k);
                    if (a2 != 0 && a2 == 6 && ckVar == null) {
                        ckVar = ckVar11;
                    }
                }
                ceVar.copyOnWrite();
                C71251cg cgVar6 = (C71251cg) ceVar.instance;
                ckVar11.getClass();
                cgVar6.mo62661a();
                cgVar6.f190220d.add(ckVar11);
                long j8 = ckVar11.f190237g + ckVar11.f190238h;
                if (j8 > j5) {
                    j5 = j8;
                }
                C47559bj i5 = C47563bn.m84655i(C31121a.f83818a, (C47563bn) sparseArray2.get(bgVar.f123408c, C47562bm.f123426a));
                if (i5.mo51420b() && (((C71251cg) ceVar.instance).f190217a & 32) == 0) {
                    long longValue = ((Long) i5.mo51419a()).longValue();
                    ceVar.copyOnWrite();
                    C71251cg cgVar7 = (C71251cg) ceVar.instance;
                    cgVar7.f190217a |= 32;
                    cgVar7.f190224h = longValue;
                }
                ewVar2 = ewVar;
                it = it2;
            }
            C47814ew ewVar3 = ewVar2;
            if ((ewVar3.f123832a & 16) != 0) {
                C47860t tVar = ewVar3.f123838g;
                if (tVar == null) {
                    tVar = C47860t.f123928d;
                }
                C71246cb cbVar = (C71246cb) C71247cc.f190208d.createBuilder();
                if ((tVar.f123930a & 1) != 0) {
                    C47859s sVar = tVar.f123931b;
                    if (sVar == null) {
                        sVar = C47859s.f123924c;
                    }
                    int i6 = sVar.f123927b;
                    cbVar.copyOnWrite();
                    C71247cc ccVar = (C71247cc) cbVar.instance;
                    ccVar.f190210a |= 1;
                    ccVar.f190211b = i6;
                }
                if ((tVar.f123930a & 2) != 0) {
                    C47857q qVar = tVar.f123932c;
                    if (qVar == null) {
                        qVar = C47857q.f123919d;
                    }
                    long j9 = qVar.f123922b;
                    cbVar.copyOnWrite();
                    C71247cc ccVar2 = (C71247cc) cbVar.instance;
                    ccVar2.f190210a |= 2;
                    ccVar2.f190212c = j9;
                }
                C71247cc ccVar3 = (C71247cc) cbVar.build();
                ceVar.copyOnWrite();
                C71251cg cgVar8 = (C71251cg) ceVar.instance;
                ccVar3.getClass();
                cgVar8.f190222f = ccVar3;
                cgVar8.f190217a |= 8;
            }
            if (ckVar == null) {
                ckVar = ckVar2;
            }
            C31164au auVar = new C31164au(ckVar.f190232b);
            C71207aq aqVar2 = ckVar.f190242l;
            if (aqVar2 == null) {
                aqVar2 = C71207aq.f190077a;
            }
            C47547f fVar = new C47547f(auVar, aqVar2, j3, j5, (C71251cg) ceVar.build());
            if (fVar.f123399e.f190220d.size() != 1 || fVar.f123397c != fVar.f123398d || (fVar.f123399e.f190217a & 8) != 0) {
                C58833ax axVar3 = (C58833ax) this.f123393b.mo27525b();
                if (!axVar3.mo56113h()) {
                    cxVar = C60856cj.m92900i(fVar.f123396b);
                } else {
                    C58833ax c = ((C31547o) axVar3.mo56107c()).mo37223c();
                    if (c.mo56113h()) {
                        cxVar = C60922j.m93044g(((C47548g) c.mo56107c()).mo51408a(), new C47543b(fVar), C60826bg.f164896a);
                    } else {
                        cxVar = C60856cj.m92900i(fVar.f123396b);
                    }
                }
                C60856cj.m92911t(cxVar, new C47544c(this, fVar), C60826bg.f164896a);
                return;
            }
            return;
        }
    }
}
