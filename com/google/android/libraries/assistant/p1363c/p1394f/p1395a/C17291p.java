package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9029a.C119725a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119727a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119728b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119734h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119735i;
import com.google.android.libraries.assistant.p1363c.p1394f.C17275a;
import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17325u;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2511d.C32542e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63126b;
import com.google.speech.p5208h.C66611ci;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;
import p5488io.grpc.C70888j;

/* renamed from: com.google.android.libraries.assistant.c.f.a.p */
/* compiled from: PG */
public final class C17291p implements C17275a {

    /* renamed from: a */
    public static final C59071e f50100a = C59071e.m91331h();

    /* renamed from: b */
    public final C17325u f50101b;

    /* renamed from: c */
    public final C71422aw f50102c;

    /* renamed from: d */
    public final Executor f50103d;

    /* renamed from: e */
    public final C32534ai f50104e;

    /* renamed from: f */
    public final C32534ai f50105f;

    /* renamed from: g */
    public final AtomicBoolean f50106g = new AtomicBoolean();

    /* renamed from: h */
    public final C71816z f50107h = new C71816z();

    /* renamed from: i */
    public final C71816z f50108i = new C71816z();

    /* renamed from: j */
    public final C71816z f50109j = new C71816z();

    /* renamed from: k */
    private final C119725a f50110k;

    /* renamed from: l */
    private final AtomicBoolean f50111l = new AtomicBoolean();

    public C17291p(long j, C17325u uVar, C119725a aVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(uVar, "opaHandoverServiceStub");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f50101b = uVar;
        this.f50110k = aVar;
        this.f50102c = awVar;
        this.f50103d = executor;
        C32534ai aiVar = new C32534ai(executor);
        aiVar.mo38137d(C17280e.m34475a(j));
        this.f50104e = aiVar;
        this.f50105f = new C32534ai(executor);
    }

    /* renamed from: a */
    public final C60870cx mo23260a(C32542e eVar) {
        C69664n.m101061g(eVar, "statusConsumer");
        return this.f50105f.mo38133a(eVar);
    }

    /* renamed from: b */
    public final void mo23261b(C52081en enVar) {
        Object obj;
        C69664n.m101061g(enVar, "delta");
        this.f50104e.mo38137d(C17280e.m34476b(enVar));
        C62971cq cqVar = enVar.f136684d;
        C69664n.m101060f(cqVar, "delta.interactionDeltaList");
        Iterator a = C69734n.m101143k(C69540x.m100847ac(cqVar), C17292q.f50112a).mo5191a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (C69664n.m101066l(((C51809dy) obj).f135936b, "tts.OUTPUT")) {
                break;
            }
        }
        C51809dy dyVar = (C51809dy) obj;
        if (dyVar != null && this.f50111l.compareAndSet(false, true)) {
            C70888j a2 = this.f50110k.mo104490a(dyVar);
            C17602l lVar = new C17602l(this.f50103d, new C17282g(this));
            C119734h a3 = C119735i.m198650a(a2);
            C119727a aVar = (C119727a) C119728b.f333553a.createBuilder();
            C69664n.m101060f(aVar, "newBuilder()");
            C69664n.m101061g(aVar, "builder");
            C62942bv build = aVar.build();
            C69664n.m101060f(build, "_builder.build()");
            a3.mo104492b((C119728b) build, lVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo23262c() {
        this.f50104e.mo38137d(C17280e.f50079c);
        this.f50107h.mo62909P(C69788q.f186170a);
        if (this.f50111l.compareAndSet(false, true)) {
            this.f50108i.mo62909P(C69788q.f186170a);
        }
    }

    /* renamed from: d */
    public final void mo23263d(Throwable th) {
        if (th == null) {
            this.f50108i.mo62909P(C69788q.f186170a);
            this.f50107h.mo62909P(C69788q.f186170a);
            return;
        }
        C59052c cVar = (C59052c) ((C59052c) f50100a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(42659));
        cVar.mo56386p("#onEndOfS3Responses");
        Throwable a = C17293r.m34513a(th, C63126b.DELTA_STREAMING_FAILED);
        this.f50107h.mo63050j(a);
        this.f50108i.mo63050j(a);
    }

    /* renamed from: e */
    public final void mo23264e(C66611ci ciVar) {
        C69664n.m101061g(ciVar, "s3response");
        this.f50104e.mo38137d(C17280e.m34477c(ciVar));
    }
}
