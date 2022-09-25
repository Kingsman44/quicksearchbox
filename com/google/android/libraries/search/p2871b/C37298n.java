package com.google.android.libraries.search.p2871b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2888c.C37219b;
import com.google.android.libraries.search.p2871b.p2888c.C37225h;
import com.google.android.libraries.search.p2871b.p2889d.C37227a;
import com.google.android.libraries.search.p2871b.p2891f.C37236a;
import com.google.android.libraries.search.p2871b.p2891f.C37237b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import dagger.C68214a;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.n */
/* compiled from: PG */
public final class C37298n implements C37215b, C37217c {

    /* renamed from: a */
    public final Object f99106a = new Object();

    /* renamed from: b */
    public final C68214a f99107b;

    /* renamed from: c */
    public final C58528ij f99108c;

    /* renamed from: d */
    public final C37319t f99109d;

    /* renamed from: e */
    public final C37226d f99110e;

    /* renamed from: f */
    public final C37219b f99111f;

    /* renamed from: g */
    public final C37225h f99112g;

    /* renamed from: h */
    public final long f99113h;

    /* renamed from: i */
    private final Executor f99114i;

    /* renamed from: j */
    private final C21370a f99115j;

    public C37298n(C21370a aVar, C58833ax axVar, C58833ax axVar2, Set set, C37226d dVar, C58833ax axVar3, C68214a aVar2, C37319t tVar) {
        this.f99115j = aVar;
        C37219b bVar = (C37219b) axVar.mo56109e(C37219b.m66045b().mo40699a());
        this.f99111f = bVar;
        this.f99112g = (C37225h) axVar2.mo56109e(C37225h.m66062d().mo40706a());
        this.f99108c = C58528ij.m90006F(set);
        this.f99110e = dVar;
        this.f99107b = aVar2;
        this.f99109d = tVar;
        this.f99114i = new C60904dr(bVar.mo40702d());
        if (tVar.mo40771f() && axVar3.mo56113h()) {
            ((C37227a) axVar3.mo56107c()).mo40720b(tVar.mo40767c(), dVar);
        }
        dVar.mo40719e(this);
        if (tVar.mo40765a().mo56113h()) {
            dVar.mo40718d(((Integer) tVar.mo40765a().mo56107c()).intValue());
        }
        this.f99113h = new Random().nextLong();
    }

    /* renamed from: a */
    public final C60870cx mo19974a(C37254c cVar) {
        return mo40849c(cVar);
    }

    /* renamed from: b */
    public final C60870cx mo40698b(C37309b bVar) {
        if (bVar.mo40863e()) {
            return C60866ct.f164955a;
        }
        C71189f d = bVar.mo40862d();
        synchronized (this.f99106a) {
            C58800sl lA = this.f99109d.mo40766b().iterator();
            while (lA.hasNext()) {
                ((C37237b) lA.next()).mo40741a(d);
            }
            C58800sl lA2 = this.f99108c.iterator();
            while (lA2.hasNext()) {
                ((C37236a) lA2.next()).mo40739b();
            }
        }
        C37275l lVar = new C37275l(this, bVar);
        return C60856cj.m92905n(C47810es.m84965e(lVar), this.f99114i);
    }

    /* renamed from: c */
    public final synchronized C60870cx mo40849c(C37254c cVar) {
        C37273k kVar;
        kVar = new C37273k(this, cVar, this.f99115j.mo26872d());
        return C60856cj.m92905n(C47810es.m84965e(kVar), this.f99114i);
    }

    public final String toString() {
        return "Generic AppFlows Logger: ".concat(String.valueOf(this.f99109d.mo40767c()));
    }
}
