package com.google.android.libraries.performance.primes.metrics.p2404b;

import android.content.Context;
import com.google.android.libraries.performance.primes.C31207bz;
import com.google.android.libraries.performance.primes.p2402g.C31251n;
import com.google.android.libraries.performance.primes.p2402g.C31252o;
import com.google.android.libraries.performance.primes.p2402g.C31257t;
import com.google.android.libraries.performance.primes.p2402g.C31258u;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.m */
/* compiled from: PG */
public final class C31310m {

    /* renamed from: a */
    public final C31306i f84303a;

    /* renamed from: b */
    public final C69464a f84304b;

    /* renamed from: c */
    public final C31251n f84305c;

    /* renamed from: d */
    public final C69464a f84306d;

    /* renamed from: e */
    public final C58833ax f84307e;

    /* renamed from: f */
    public final C58833ax f84308f;

    /* renamed from: g */
    private final C31207bz f84309g;

    /* renamed from: h */
    private final Executor f84310h;

    public C31310m(C31306i iVar, C69464a aVar, C31207bz bzVar, C31252o oVar, C69464a aVar2, C58833ax axVar, C58833ax axVar2, Executor executor, C68214a aVar3, C69464a aVar4) {
        C31252o oVar2 = oVar;
        this.f84303a = iVar;
        this.f84309g = bzVar;
        this.f84304b = aVar;
        this.f84310h = executor;
        C69464a aVar5 = aVar2;
        this.f84306d = new C31309l(aVar2);
        Context context = (Context) oVar2.f84187a.mo17428b();
        context.getClass();
        Executor executor2 = (Executor) oVar2.f84188b.mo17428b();
        executor2.getClass();
        C31257t tVar = (C31257t) oVar2.f84189c.mo17428b();
        tVar.getClass();
        Boolean bool = (Boolean) oVar2.f84190d.mo17428b();
        bool.getClass();
        this.f84305c = new C31251n(context, executor2, tVar, aVar3, bool.booleanValue(), aVar4);
        this.f84307e = axVar;
        this.f84308f = axVar2;
    }

    /* renamed from: c */
    static /* synthetic */ C71207aq m58378c(C69464a aVar) {
        if (!((C58833ax) aVar.mo17428b()).mo56113h() || ((C31300c) ((C58833ax) aVar.mo17428b()).mo56107c()).mo37019b() == null) {
            return null;
        }
        C69464a b = ((C31300c) ((C58833ax) aVar.mo17428b()).mo56107c()).mo37019b();
        b.getClass();
        return (C71207aq) b.mo17428b();
    }

    /* renamed from: a */
    public final long mo37022a(String str) {
        if (this.f84309g.f84112b) {
            return -1;
        }
        C31251n nVar = this.f84305c;
        if (nVar.f84186d.mo36968c()) {
            return -1;
        }
        boolean z = nVar.f84185c;
        C31258u uVar = nVar.f84184b;
        if (z) {
            return uVar.mo36973a(str);
        }
        return -1;
    }

    /* renamed from: b */
    public final C60870cx mo37023b(C31302e eVar) {
        if (this.f84309g.f84112b) {
            return C60856cj.m92898g();
        }
        return C60856cj.m92905n(new C31308k(this, eVar), this.f84310h);
    }

    /* renamed from: d */
    public final boolean mo37024d(String str) {
        return mo37022a(str) != -1;
    }

    /* renamed from: e */
    public final boolean mo37025e() {
        C31251n nVar = this.f84305c;
        return nVar.f84185c && nVar.f84184b.mo36975c();
    }
}
