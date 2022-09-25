package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h;

import com.google.android.apps.gsa.nga.engine.p5956ar.C75035cv;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6069e.C76693a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76741a;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122505be;
import com.google.android.libraries.assistant.p1481f.p1483b.C17949d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5127o.p5128a.C65635p;
import com.google.protos.p5127o.p5128a.C65636q;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.h.v */
/* compiled from: PG */
public final class C76739v implements C76719b {

    /* renamed from: a */
    public static final C58974d f212066a = C58974d.m91136j();

    /* renamed from: b */
    public static final Duration f212067b = Duration.ofMinutes(30);

    /* renamed from: q */
    private static final C76737t f212068q = new C76718a(C122463r.f339493g, Optional.empty());

    /* renamed from: c */
    public C122472a f212069c = null;

    /* renamed from: d */
    public C60870cx f212070d = null;

    /* renamed from: e */
    public final C91142g f212071e;

    /* renamed from: f */
    public final C22871g f212072f;

    /* renamed from: g */
    public final C76092h f212073g;

    /* renamed from: h */
    public final C60950i f212074h;

    /* renamed from: i */
    public final C75035cv f212075i;

    /* renamed from: j */
    public final C47770dh f212076j;

    /* renamed from: k */
    public final C17949d f212077k;

    /* renamed from: l */
    public long f212078l = -1;

    /* renamed from: m */
    public C60870cx f212079m;

    /* renamed from: n */
    public C76737t f212080n = f212068q;

    /* renamed from: o */
    public Instant f212081o;

    /* renamed from: p */
    public final C122505be f212082p;

    /* renamed from: r */
    private final C70888j f212083r;

    /* renamed from: s */
    private final C70888j f212084s;

    /* renamed from: t */
    private final C76741a f212085t;

    /* renamed from: u */
    private final C78007b f212086u;

    /* renamed from: v */
    private C60870cx f212087v;

    public C76739v(C122505be beVar, C70888j jVar, C70888j jVar2, C91142g gVar, C90821bm bmVar, C76092h hVar, C60950i iVar, C76741a aVar, C75035cv cvVar, C78007b bVar, C47770dh dhVar, C17949d dVar) {
        this.f212082p = beVar;
        this.f212083r = jVar;
        this.f212084s = jVar2;
        this.f212071e = gVar;
        this.f212072f = bmVar.mo85163a(C76738u.class);
        this.f212073g = hVar;
        this.f212074h = iVar;
        this.f212085t = aVar;
        this.f212075i = cvVar;
        this.f212086u = bVar;
        this.f212076j = dhVar;
        this.f212077k = dVar;
    }

    /* renamed from: g */
    private final synchronized C60870cx m123349g() {
        C60870cx cxVar = this.f212087v;
        if (cxVar != null) {
            return C60856cj.m92901j(cxVar);
        }
        C60870cx g = C60922j.m93044g(C60856cj.m92901j(this.f212086u.mo72959a()), C76730m.f212059a, C60826bg.f164896a);
        this.f212087v = g;
        C60856cj.m92911t(g, new C76735r(this), C60826bg.f164896a);
        return C60856cj.m92901j(g);
    }

    /* renamed from: a */
    public final C76693a mo72310a() {
        try {
            return new C76721d((C65636q) C70864c.m103731e(new C65635p(), mo72314e(this.f212071e.mo85399d(C90126fx.f251506kB)), C70851i.f189015a));
        } catch (Exception e) {
            return new C76734q(e);
        }
    }

    /* renamed from: b */
    public final C60870cx mo72311b(boolean z) {
        return C60922j.m93044g(mo72313d(z), C76729l.f212058a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo72312c() {
        C60870cx d = mo72313d(false);
        this.f212085t.mo72316a(d, "service", Optional.empty());
        return d;
    }

    /* renamed from: d */
    public final C60870cx mo72313d(boolean z) {
        if (!this.f212073g.mo72021b().mo72042g()) {
            return C60856cj.m92899h(Status.f186916n.withDescription("Service is unavailable when on-device is off.").asException());
        }
        return this.f212072f.mo28210j(m123349g(), "[NGA] ServiceProviderImpl.getService", new C76726i(this, z));
    }

    /* renamed from: e */
    public final C70888j mo72314e(long j) {
        if (j == 0) {
            return this.f212083r;
        }
        if (j == 1) {
            return this.f212084s;
        }
        throw new Exception("Invalid flag value for AgsaNga__grpc_fulfillment_service_process");
    }

    /* renamed from: f */
    public final synchronized void mo72315f() {
        this.f212087v = null;
    }
}
