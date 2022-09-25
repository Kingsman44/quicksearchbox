package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42264aq;
import com.google.android.libraries.social.populous.core.C42284bj;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42589x;
import com.google.android.libraries.social.populous.logging.C42590y;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3295d.C42375i;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import java.util.HashSet;
import java.util.List;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;

/* renamed from: com.google.android.libraries.social.populous.ax */
/* compiled from: PG */
final class C42191ax implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58528ij f110498a;

    /* renamed from: b */
    final /* synthetic */ List f110499b;

    /* renamed from: c */
    final /* synthetic */ C42201bf f110500c;

    /* renamed from: d */
    final /* synthetic */ C58528ij f110501d;

    /* renamed from: e */
    final /* synthetic */ C42188au f110502e;

    /* renamed from: f */
    final /* synthetic */ C58872ci f110503f;

    /* renamed from: g */
    final /* synthetic */ C42193az f110504g;

    public C42191ax(C42193az azVar, C58528ij ijVar, List list, C42201bf bfVar, C58528ij ijVar2, C42188au auVar, C58872ci ciVar) {
        this.f110504g = azVar;
        this.f110498a = ijVar;
        this.f110499b = list;
        this.f110500c = bfVar;
        this.f110501d = ijVar2;
        this.f110502e = auVar;
        this.f110503f = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C42264aq c = C42264aq.m74421c(10, C42284bj.m74440a(th));
        C42188au auVar = this.f110502e;
        C58495hd hdVar = C58729pv.f156485a;
        C42198bc f = C42199bd.m74152f();
        f.mo44887c(true);
        f.mo44888d(C58528ij.m90006F(this.f110499b));
        f.mo44886b(C58485gu.m89846n(c));
        C42593n nVar = (C42593n) f;
        nVar.f111760b = 2;
        nVar.f111759a = Integer.valueOf(this.f110499b.size());
        auVar.mo44880b(hdVar, f.mo44885a());
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58528ij ijVar;
        C58528ij ijVar2;
        C42375i iVar = (C42375i) obj;
        if (!this.f110498a.isEmpty()) {
            C58528ij F = C58528ij.m90006F(C58758qx.m90645c(C58528ij.m90006F(this.f110499b), iVar.f111121a.keySet()));
            boolean z = !C69296d.m100510c() || F.isEmpty() || this.f110500c.mo44898b().isEmpty();
            C58495hd b = this.f110504g.mo44882b(iVar, this.f110501d);
            C42188au auVar = this.f110502e;
            C42198bc f = C42199bd.m74152f();
            f.mo44887c(z);
            if (z) {
                C58528ij ijVar3 = this.f110501d;
                HashSet hashSet = new HashSet(C69296d.m100510c() ? iVar.f111123c : iVar.f111122b);
                if (!ijVar3.isEmpty()) {
                    hashSet.removeAll(ijVar3);
                }
                ijVar = C58528ij.m90006F(hashSet);
            } else {
                ijVar = C58733pz.f156496a;
            }
            f.mo44888d(ijVar);
            C42593n nVar = (C42593n) f;
            nVar.f111760b = 2;
            nVar.f111759a = Integer.valueOf(this.f110499b.size());
            f.mo44886b(C58485gu.m89845m());
            auVar.mo44880b(b, f.mo44885a());
            if (!z) {
                C42193az azVar = this.f110504g;
                C58801sm G = this.f110500c.mo44898b().listIterator(0);
                C58485gu u = F.mo55229u();
                C42201bf bfVar = this.f110500c;
                C42188au auVar2 = this.f110502e;
                C58872ci ciVar = this.f110503f;
                C69296d.f185416a.mo6453a().mo60962g();
                if (G.hasNext()) {
                    C42184aq aqVar = (C42184aq) azVar.f110511c.get(G.next());
                    boolean z2 = !G.hasNext();
                    if (aqVar == null) {
                        C42591z zVar = azVar.f110513e;
                        C42589x g = C42590y.m75179g();
                        g.mo45652c(20);
                        g.mo45651b(0);
                        zVar.mo45637g(10, 4, g.mo45650a(), (Integer) null, C42576k.f111734a);
                        C58495hd hdVar = C58729pv.f156485a;
                        C42198bc f2 = C42199bd.m74152f();
                        f2.mo44887c(z2);
                        if (z2) {
                            ijVar2 = C58528ij.m90006F(u);
                        } else {
                            ijVar2 = C58733pz.f156496a;
                        }
                        f2.mo44888d(ijVar2);
                        f2.mo44886b(C58485gu.m89846n(C42264aq.m74421c(14, 21)));
                        C60856cj.m92900i(C42188au.m74128a(hdVar, f2.mo44885a()));
                        throw null;
                    }
                    C58485gu.m89845m();
                    new C42183ap(u, z2);
                    throw null;
                }
                azVar.mo44883c(u, auVar2, ciVar, bfVar);
            }
        }
    }
}
