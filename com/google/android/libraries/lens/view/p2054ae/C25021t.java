package com.google.android.libraries.lens.view.p2054ae;

import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.android.p4638e.C61410e;
import com.google.p4017at.p4056g.p4057a.p4058a.C53982aq;
import com.google.p4017at.p4056g.p4057a.p4058a.C53983ar;
import com.google.p4017at.p4056g.p4057a.p4058a.C54040cu;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.lens.view.ae.t */
/* compiled from: PG */
public final class C25021t {

    /* renamed from: a */
    public static final Duration f68223a = Duration.ofSeconds(10);

    /* renamed from: b */
    public static final C58974d f68224b = C58974d.m91135i("AppServiceStreamHelper");

    /* renamed from: c */
    public final Executor f68225c;

    /* renamed from: d */
    public final C60888db f68226d;

    /* renamed from: e */
    public final HashMap f68227e = new HashMap();

    /* renamed from: f */
    public C70868g f68228f = null;

    /* renamed from: g */
    private final Duration f68229g;

    /* renamed from: h */
    private final C25008g f68230h;

    /* renamed from: i */
    private final C25020s f68231i = new C25020s(this);

    /* renamed from: j */
    private C60870cx f68232j = null;

    public C25021t(C60888db dbVar, C25008g gVar) {
        this.f68226d = dbVar;
        this.f68225c = C25806i.m47612a(dbVar);
        this.f68230h = gVar;
        this.f68229g = Duration.ofSeconds(30);
    }

    /* renamed from: a */
    public final void mo30230a() {
        Executor executor = this.f68225c;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C25016o(this)))));
    }

    /* renamed from: b */
    public final void mo30231b() {
        if (this.f68228f == null) {
            C25008g gVar = this.f68230h;
            C53982aq aqVar = (C53982aq) ((C53982aq) gVar.f68197a.mo17428b()).mo62577p(C61409d.f166071a, (C61410e) gVar.f68198b.mo56108d(new C25007f(gVar)));
            C25020s sVar = this.f68231i;
            sVar.getClass();
            C70888j jVar = aqVar.f189039a;
            C70338di diVar = C53983ar.f141639d;
            if (diVar == null) {
                synchronized (C53983ar.class) {
                    diVar = C53983ar.f141639d;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.BIDI_STREAMING;
                        d.f187488d = C70338di.m102602c("google.internal.lens.api.v1.LensApplicationService", "StreamTranslateText");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C54040cu.f141789d);
                        d.f187486b = C70850d.m103697c(C54042cw.f141794e);
                        diVar = d.mo62040a();
                        C53983ar.f141639d = diVar;
                    }
                }
            }
            this.f68228f = (C70868g) C70876o.m103761b(jVar.mo39510a(diVar, aqVar.f189040b), sVar, true);
            mo30232c();
        }
    }

    /* renamed from: c */
    public final void mo30232c() {
        this.f68232j = this.f68226d.mo29164d(C47810es.m84977q(new C25013l(this)), this.f68229g.toNanos(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: d */
    public final void mo30233d() {
        C70868g gVar = this.f68228f;
        if (gVar != null) {
            gVar.mo20121a();
            this.f68228f = null;
            this.f68231i.f68222a.mo30230a();
            C60870cx cxVar = this.f68232j;
            if (cxVar != null) {
                cxVar.cancel(false);
                this.f68232j = null;
            }
        }
    }
}
