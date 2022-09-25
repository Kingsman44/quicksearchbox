package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.apps.gsa.nga.api.a.ce;
import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.api.b.b;
import com.google.android.apps.gsa.nga.api.p5884b.C74700a;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5218j.C67087ko;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.n */
/* compiled from: PG */
public final class C81041n implements b, C74700a {

    /* renamed from: b */
    public static final /* synthetic */ int f222106b = 0;

    /* renamed from: c */
    private static final Duration f222107c = Duration.ofMinutes(1);

    /* renamed from: a */
    public final Map f222108a = new ConcurrentHashMap();

    /* renamed from: d */
    private final AtomicInteger f222109d = new AtomicInteger(0);

    /* renamed from: e */
    private final Executor f222110e;

    /* renamed from: f */
    private final C60888db f222111f;

    public C81041n(Executor executor, C60888db dbVar) {
        this.f222110e = new C60904dr(executor);
        this.f222111f = dbVar;
    }

    /* renamed from: g */
    private final void m128992g(cf cfVar) {
        this.f222110e.execute(new C81033f(this, cfVar));
    }

    /* renamed from: a */
    public final void mo71057a(C19347o oVar, cf cfVar) {
        Map.EL.compute(this.f222108a, cfVar, new C81038k(oVar));
        m128992g(cfVar);
    }

    /* renamed from: b */
    public final void mo71058b(cf cfVar) {
        Map.EL.computeIfPresent(this.f222108a, cfVar, C81035h.f222102a);
    }

    /* renamed from: c */
    public final cf mo74827c() {
        ce createBuilder = cf.c.createBuilder();
        int andIncrement = this.f222109d.getAndIncrement();
        createBuilder.copyOnWrite();
        cf cfVar = createBuilder.instance;
        cfVar.a |= 1;
        cfVar.b = andIncrement;
        return createBuilder.build();
    }

    /* renamed from: d */
    public final void mo74828d(cf cfVar, C67087ko koVar) {
        C81040m mVar = (C81040m) this.f222108a.get(cfVar);
        if (mVar == null || !mVar.mo74819c()) {
            throw new IllegalArgumentException("RohanSodaEventStore.handleSodaEvent called with inactive token");
        }
        ((BlockingQueue) mVar.mo74818b().mo56107c()).add(koVar);
        m128992g(cfVar);
    }

    /* renamed from: e */
    public final void mo74829e(cf cfVar) {
        Map.EL.compute(this.f222108a, cfVar, C81037j.f222104a);
    }

    /* renamed from: f */
    public final void mo74830f(cf cfVar) {
        Map.EL.computeIfPresent(this.f222108a, cfVar, C81036i.f222103a);
        C80905at.m128764h("RohanSodaEventStoreAndPusher", this.f222111f.mo29165e(new C81032e(this, cfVar), f222107c.toMinutes(), TimeUnit.MINUTES), "Failed to execute cleanup taks for %s", cfVar);
    }
}
