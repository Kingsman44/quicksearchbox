package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.apps.gsa.binaries.satin.app.anx;
import com.google.android.libraries.assistant.p1363c.p1394f.C17275a;
import com.google.android.libraries.assistant.p1363c.p1394f.C17298b;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17323s;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17325u;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17326v;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.c.f.a.v */
/* compiled from: PG */
public final class C17297v implements C17298b {

    /* renamed from: c */
    private static final Duration f50118c = Duration.ofMinutes(5);

    /* renamed from: a */
    public final C17323s f50119a;

    /* renamed from: b */
    public final C17278c f50120b;

    /* renamed from: d */
    private final C71422aw f50121d;

    /* renamed from: e */
    private final anx f50122e;

    static {
        Duration.ofSeconds(1);
    }

    public C17297v(C17323s sVar, anx anx, C71422aw awVar, Executor executor, C60950i iVar) {
        C69664n.m101061g(sVar, "opaHandoverServiceFutureStub");
        C69664n.m101061g(anx, "handoverSessionFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(iVar, "timeSource");
        this.f50119a = sVar;
        this.f50122e = anx;
        this.f50121d = awVar;
        C17294s sVar2 = new C17294s(this);
        Duration duration = f50118c;
        C69664n.m101060f(duration, "CONTEXT_CACHE_TIMEOUT");
        this.f50120b = new C17278c(sVar2, duration, iVar, executor);
    }

    /* renamed from: a */
    public final C17275a mo23266a(long j) {
        anx anx = this.f50122e;
        C17291p pVar = new C17291p(j, (C17325u) anx.f199101a.b.f198027a.f199248bT.mo17428b(), anx.f199101a.b.f198027a.mo66643B(), (C71422aw) anx.f199101a.a.H.mo17428b(), (Executor) anx.f199101a.a.n.mo17428b());
        if (pVar.f50106g.compareAndSet(false, true)) {
            C17602l lVar = new C17602l(pVar.f50103d, new C17281f(pVar));
            C17325u uVar = pVar.f50101b;
            C71803m.m105042c(pVar.f50102c, (C69585o) null, (C71424ay) null, new C17290o(pVar, (C70868g) C70876o.m103761b(uVar.f189039a.mo39510a(C17326v.m34549d(), uVar.f189040b), lVar, true), (C69577g) null), 3).mo62873s(new C17283h(pVar));
        }
        return pVar;
    }

    /* renamed from: b */
    public final C60870cx mo23267b() {
        return C71663i.m104692e(this.f50121d, (C71424ay) null, new C17295t(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo23268c() {
        return C71663i.m104692e(this.f50121d, (C71424ay) null, new C17296u(this, (C69577g) null), 3);
    }
}
