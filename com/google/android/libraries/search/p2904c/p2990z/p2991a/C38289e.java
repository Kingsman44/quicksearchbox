package com.google.android.libraries.search.p2904c.p2990z.p2991a;

import com.google.android.libraries.search.p2904c.C37612fx;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a.C37890a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.z.a.e */
/* compiled from: PG */
public final class C38289e {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f101439a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f101440b;

    /* renamed from: c */
    public final AtomicReference f101441c = new AtomicReference((Object) null);

    /* renamed from: d */
    private final Executor f101442d;

    /* renamed from: e */
    private final C47632e f101443e = new C47632e();

    /* renamed from: f */
    private final C37890a f101444f;

    public C38289e(C37890a aVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(aVar, "tokenGenerator");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f101444f = aVar;
        this.f101440b = awVar;
        this.f101442d = executor;
    }

    /* renamed from: a */
    public final C38287c mo41359a(C37612fx fxVar) {
        C69664n.m101061g(fxVar, "metadata");
        return new C38287c(this, fxVar, this.f101444f.f100473a.incrementAndGet());
    }

    /* renamed from: b */
    public final void mo41360b(C69630p pVar) {
        C69664n.m101060f(this.f101443e.mo51512b(new C38288d(this, pVar), this.f101442d), "@CanIgnoreReturnValue\n  …) }, lightweightExecutor)");
    }
}
