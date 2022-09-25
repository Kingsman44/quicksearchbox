package com.google.android.libraries.assistant.pcp.p1575l.p1576a;

import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31521n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71213aw;

/* renamed from: com.google.android.libraries.assistant.pcp.l.a.d */
/* compiled from: PG */
public final class C18951d implements C18949b {

    /* renamed from: b */
    private static final C59071e f53264b = C59071e.m91332i("com.google.android.libraries.assistant.pcp.l.a.d");

    /* renamed from: a */
    final AtomicBoolean f53265a = new AtomicBoolean(false);

    /* renamed from: c */
    private final C31521n f53266c;

    /* renamed from: d */
    private final C18948a f53267d;

    /* renamed from: e */
    private final C31520m f53268e;

    /* renamed from: f */
    private final Executor f53269f;

    public C18951d(C18948a aVar, C31521n nVar, Executor executor) {
        this.f53266c = nVar;
        this.f53267d = aVar;
        this.f53269f = executor;
        this.f53268e = nVar.mo37209a();
    }

    /* renamed from: a */
    public final void mo24228a(C71213aw awVar, C60870cx cxVar) {
        C18950c cVar = new C18950c(this, awVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(cVar), this.f53269f);
    }

    /* renamed from: b */
    public final void mo24229b(int i, C71213aw awVar) {
        if (this.f53265a.getAndSet(true)) {
            ((C59052c) ((C59052c) f53264b.mo56226d()).mo56372aa(47517)).mo56389s("The primes timer %s is already stopped", this.f53267d.f53261h);
            return;
        }
        C31521n nVar = this.f53266c;
        C31520m mVar = this.f53268e;
        C31164au auVar = this.f53267d.f53261h;
        C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
        apVar.mo58885m(C71213aw.f190094g, awVar);
        nVar.mo37211c(mVar, auVar, (C71207aq) apVar.build(), i);
    }

    public final void close() {
        mo24229b(1, C71213aw.f190093f);
    }
}
