package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.tasks.l */
/* compiled from: PG */
final class C118553l implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C118558q f329145a;

    /* renamed from: b */
    private final C118522by f329146b;

    /* renamed from: c */
    private final C118466aa f329147c;

    /* renamed from: d */
    private final long f329148d;

    /* renamed from: e */
    private final C31520m f329149e;

    public C118553l(C118558q qVar, C118522by byVar, C118466aa aaVar, long j, C31520m mVar) {
        this.f329145a = qVar;
        this.f329146b = byVar;
        this.f329147c = aaVar;
        this.f329148d = j;
        this.f329149e = mVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f329145a.f329169i.mo103734b(this.f329149e, C31164au.m58093c("bgdTasks-", this.f329146b), 3);
        if (th instanceof C118550i) {
            this.f329145a.f329167g.mo103739c(this.f329147c.f328811g, this.f329146b, this.f329148d);
            this.f329145a.f329167g.mo103737a();
            throw new C118552k(String.format("%s background task %s crashed.", new Object[]{this.f329147c, this.f329146b.name()}), th);
        } else if (th instanceof C118560s) {
            this.f329145a.f329167g.mo103739c(this.f329147c.f328812h, this.f329146b, this.f329148d);
            this.f329145a.f329167g.mo103737a();
            C59104x d = C118558q.f329161a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BgTaskExecutorImpl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(33973)).mo56354G("%s background task %s was not found.", this.f329147c, this.f329146b.name());
        } else if (th instanceof CancellationException) {
            this.f329145a.f329167g.mo103739c(this.f329147c.f328810f, this.f329146b, this.f329148d);
            this.f329145a.f329167g.mo103737a();
            C59104x c = C118558q.f329161a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BgTaskExecutorImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(33972)).mo56354G("%s background task %s was cancelled.", this.f329147c, this.f329146b.name());
        } else {
            this.f329145a.f329167g.mo103739c(this.f329147c.f328810f, this.f329146b, this.f329148d);
            this.f329145a.f329167g.mo103737a();
            String format = String.format("%s background task %s failed. Crashing.", new Object[]{this.f329147c, this.f329146b.name()});
            C59104x c2 = C118558q.f329161a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BgTaskExecutorImpl");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(th)).mo56372aa(33971)).mo56389s("%s", format);
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        this.f329145a.f329167g.mo103739c(this.f329147c.f328809e, this.f329146b, this.f329148d);
        this.f329145a.f329169i.mo103734b(this.f329149e, C31164au.m58093c("bgdTasks-", this.f329146b), 2);
        this.f329145a.f329167g.mo103737a();
        C58976aa aaVar = C58975e.f156826a;
        this.f329146b.name();
    }
}
