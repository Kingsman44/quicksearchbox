package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42291bq;
import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.core.C42321ct;
import com.google.android.libraries.social.populous.logging.C42570e;
import com.google.android.libraries.social.populous.logging.C42573h;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42589x;
import com.google.android.libraries.social.populous.logging.C42590y;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3295d.C42375i;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4181bi.C55831bd;
import com.google.p4181bi.C55832be;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55858t;
import java.util.Set;
import java.util.concurrent.CancellationException;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69314v;

/* renamed from: com.google.android.libraries.social.populous.ay */
/* compiled from: PG */
final class C42192ay implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f110505a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f110506b;

    /* renamed from: c */
    final /* synthetic */ C42193az f110507c;

    /* renamed from: d */
    final /* synthetic */ int f110508d;

    public C42192ay(C42193az azVar, C58872ci ciVar, int i, C60870cx cxVar) {
        this.f110507c = azVar;
        this.f110505a = ciVar;
        this.f110508d = i;
        this.f110506b = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (C69314v.m100612c()) {
            C42591z zVar = this.f110507c.f110513e;
            int b = C42570e.m75128b(th);
            C42589x g = C42590y.m75179g();
            g.mo45652c(C42291bq.m74450a(this.f110508d));
            g.mo45651b(0);
            ((C42573h) g).f111717a = null;
            zVar.mo45637g(10, b, g.mo45650a(), (Integer) null, C42576k.f111734a);
        } else if (!(th instanceof CancellationException) && !this.f110506b.isCancelled()) {
            C42591z zVar2 = this.f110507c.f110513e;
            C42589x g2 = C42590y.m75179g();
            g2.mo45652c(C42291bq.m74450a(this.f110508d));
            g2.mo45651b(0);
            ((C42573h) g2).f111717a = null;
            zVar2.mo45637g(10, 4, g2.mo45650a(), (Integer) null, C42576k.f111734a);
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        int i;
        Set<C42321ct> set;
        C42375i iVar = (C42375i) obj;
        if (C69314v.m100612c()) {
            i = C42570e.m75127a(iVar.f111126f, iVar.f111121a.size());
        } else {
            i = true != iVar.f111121a.isEmpty() ? 2 : 3;
        }
        C42591z zVar = this.f110507c.f110513e;
        C42589x g = C42590y.m75179g();
        g.mo45652c(C42291bq.m74450a(iVar.f111125e));
        g.mo45651b(iVar.f111121a.size());
        ((C42573h) g).f111717a = this.f110505a;
        zVar.mo45637g(10, i, g.mo45650a(), (Integer) null, C42576k.f111734a);
        C42193az azVar = this.f110507c;
        C58800sl lA = iVar.f111121a.values().iterator();
        while (lA.hasNext()) {
            C42405ab abVar = (C42405ab) lA.next();
            if (abVar.mo45410l()) {
                C58833ax b = abVar.mo45400b();
                if (b.mo56113h()) {
                    C55858t tVar = ((C55856r) b.mo56107c()).f147385d;
                    if (tVar == null) {
                        tVar = C55858t.f147392f;
                    }
                    if ((tVar.f147394a & 1) != 0) {
                        C55832be beVar = tVar.f147395b;
                        if (beVar == null) {
                            beVar = C55832be.f147328e;
                        }
                        int a = C55831bd.m87791a(beVar.f147332c);
                        if (a != 0 && a == 4) {
                            azVar.f110513e.mo45635e(37, C42576k.f111734a);
                        }
                    }
                }
            }
        }
        C42320cs csVar = C42320cs.EMAIL;
        if (this.f110508d - 1 != 8) {
            C42193az azVar2 = this.f110507c;
            C58800sl lA2 = iVar.f111121a.keySet().iterator();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            boolean z3 = false;
            while (lA2.hasNext()) {
                int ordinal = ((C42321ct) lA2.next()).mo45203a().ordinal();
                if (ordinal == 0) {
                    i3++;
                    z3 = true;
                } else if (ordinal == 1) {
                    i4++;
                    z = true;
                } else if (ordinal == 2) {
                    i5++;
                    z2 = true;
                }
            }
            if (C69296d.m100510c()) {
                set = C58758qx.m90647e(iVar.f111122b, iVar.f111123c);
            } else {
                set = iVar.f111122b;
            }
            boolean z4 = z3;
            int i6 = 0;
            boolean z5 = z2;
            boolean z6 = z;
            int i7 = 0;
            for (C42321ct a2 : set) {
                int ordinal2 = a2.mo45203a().ordinal();
                if (ordinal2 == 0) {
                    i2++;
                    z4 = true;
                } else if (ordinal2 == 1) {
                    i6++;
                    z6 = true;
                } else if (ordinal2 == 2) {
                    i7++;
                    z5 = true;
                }
            }
            if (z4) {
                azVar2.f110513e.mo45636f(7, i3, C42576k.f111734a);
                azVar2.f110513e.mo45636f(8, i2, C42576k.f111734a);
            }
            if (z6) {
                azVar2.f110513e.mo45636f(11, i4, C42576k.f111734a);
                azVar2.f110513e.mo45636f(12, i6, C42576k.f111734a);
            }
            if (z5) {
                azVar2.f110513e.mo45636f(9, i5, C42576k.f111734a);
                azVar2.f110513e.mo45636f(10, i7, C42576k.f111734a);
                return;
            }
            return;
        }
        C42193az azVar3 = this.f110507c;
        azVar3.f110513e.mo45636f(6, iVar.f111121a.size(), C42576k.f111734a);
        azVar3.f110513e.mo45636f(5, iVar.f111122b.size(), C42576k.f111734a);
    }
}
