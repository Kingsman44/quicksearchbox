package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10094c.C132730e;
import com.google.android.apps.search.fedora.p10094c.C132738m;
import com.google.android.apps.search.fedora.p10094c.C132739n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.j.b.z */
/* compiled from: PG */
final class C133001z {

    /* renamed from: a */
    public static final C59071e f362708a = C59071e.m91332i("com.google.android.apps.search.fedora.j.b.z");

    /* renamed from: k */
    private static final Duration f362709k = Duration.ofSeconds(30);

    /* renamed from: b */
    public final C69464a f362710b;

    /* renamed from: c */
    public final C69464a f362711c;

    /* renamed from: d */
    public final C60950i f362712d;

    /* renamed from: e */
    public final C132738m f362713e;

    /* renamed from: f */
    public final C132739n f362714f;

    /* renamed from: g */
    public final C58881cr f362715g;

    /* renamed from: h */
    public final C60888db f362716h;

    /* renamed from: i */
    public final C132730e f362717i;

    /* renamed from: j */
    public final C133072j f362718j;

    /* renamed from: l */
    private final AtomicReference f362719l = new AtomicReference(C60866ct.f164955a);

    public C133001z(C69464a aVar, C69464a aVar2, C60950i iVar, C132738m mVar, C132739n nVar, C132730e eVar, C133072j jVar, C60888db dbVar) {
        this.f362710b = aVar;
        this.f362711c = aVar2;
        this.f362712d = iVar;
        this.f362713e = mVar;
        this.f362714f = nVar;
        this.f362716h = dbVar;
        this.f362717i = eVar;
        this.f362718j = jVar;
        this.f362715g = C58886cw.m90973a(new C132986k(mVar));
    }

    /* renamed from: a */
    public final C60870cx mo110950a(Consumer consumer) {
        C60870cx cxVar = (C60870cx) this.f362719l.get();
        if (!cxVar.isDone()) {
            cxVar.cancel(false);
        }
        C132987l lVar = new C132987l(this, consumer);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(lVar), this.f362716h);
        AtomicReference atomicReference = this.f362719l;
        C60872cz e = this.f362716h.mo29165e(new C132993r(this), f362709k.getSeconds(), TimeUnit.SECONDS);
        C133000y yVar = new C133000y();
        C60856cj.m92911t(e, C47810es.m84974n(yVar), this.f362716h);
        atomicReference.set(e);
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter.nativeIsInitialized(r0.f54364a.get()) == false) goto L_0x001a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo110951b(com.google.speech.p5228m.C67270aa r5, p3186j$.util.function.Consumer r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.apps.search.fedora.c.n r0 = r4.f362714f     // Catch:{ all -> 0x0067 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.f362177d     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0067 }
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter r0 = (com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter) r0     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            java.util.concurrent.atomic.AtomicLong r0 = r0.f54364a     // Catch:{ all -> 0x0067 }
            long r0 = r0.get()     // Catch:{ all -> 0x0067 }
            boolean r0 = com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter.nativeIsInitialized(r0)     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0060
        L_0x001a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0067 }
            com.google.android.apps.search.fedora.c.n r0 = r4.f362714f     // Catch:{ all -> 0x0067 }
            com.google.common.f.e r1 = com.google.android.apps.search.fedora.p10094c.C132739n.f362174a     // Catch:{ all -> 0x0067 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0067 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "FedoraEkhoWriter"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = "initializing EkhoWriter."
            r3 = 39809(0x9b81, float:5.5784E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0067 }
            com.google.android.apps.search.fedora.c.c r1 = r0.f362178e     // Catch:{ all -> 0x0067 }
            android.content.Context r1 = r1.f362154a     // Catch:{ all -> 0x0067 }
            com.google.android.apps.search.fedora.p10094c.C132727b.m215742a(r1)     // Catch:{ all -> 0x0067 }
            r0.mo110898a()     // Catch:{ all -> 0x0067 }
            g.a.a r1 = r0.f362176c     // Catch:{ all -> 0x0067 }
            java.lang.Object r1 = r1.mo17428b()     // Catch:{ all -> 0x0067 }
            com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger r1 = (com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger) r1     // Catch:{ all -> 0x0067 }
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoRealtimeLogging.nativeSetRealtimeLogger(r1)     // Catch:{ all -> 0x0067 }
            com.google.android.apps.search.fedora.c.g r1 = r0.f362179f     // Catch:{ all -> 0x0067 }
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter r1 = new com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            r1.mo24644b(r5)     // Catch:{ all -> 0x0067 }
            java.util.concurrent.atomic.AtomicLong r5 = r1.f54364a     // Catch:{ all -> 0x0067 }
            long r2 = r5.get()     // Catch:{ all -> 0x0067 }
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter.nativeEnableWriting(r2)     // Catch:{ all -> 0x0067 }
            java.util.concurrent.atomic.AtomicReference r5 = r0.f362177d     // Catch:{ all -> 0x0067 }
            r5.set(r1)     // Catch:{ all -> 0x0067 }
        L_0x0060:
            com.google.android.apps.search.fedora.c.n r5 = r4.f362714f     // Catch:{ all -> 0x0067 }
            r6.accept(r5)     // Catch:{ all -> 0x0067 }
            monitor-exit(r4)
            return
        L_0x0067:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.fedora.p10107j.p10109b.C133001z.mo110951b(com.google.speech.m.aa, j$.util.function.Consumer):void");
    }
}
