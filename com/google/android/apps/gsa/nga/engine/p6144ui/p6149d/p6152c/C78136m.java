package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6152c;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78114f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6150a.C78115g;
import com.google.android.apps.gsa.nga.shared.p6418y.C83377a;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128103d;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128121v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.c.m */
/* compiled from: PG */
public final class C78136m extends C128121v {

    /* renamed from: a */
    private final C78130g f215153a;

    /* renamed from: b */
    private final C78124ae f215154b;

    /* renamed from: c */
    private final C78140q f215155c;

    /* renamed from: d */
    private final C78135l f215156d;

    /* renamed from: e */
    private final C78114f f215157e;

    public C78136m(C78130g gVar, C78124ae aeVar, C78140q qVar, C78135l lVar, C78114f fVar) {
        this.f215153a = gVar;
        this.f215154b = aeVar;
        this.f215155c = qVar;
        this.f215156d = lVar;
        this.f215157e = fVar;
    }

    /* renamed from: b */
    public final C70862aj mo73100b(C70862aj ajVar) {
        C78130g gVar = this.f215153a;
        C70883v vVar = (C70883v) ajVar;
        gVar.f215147d.mo28212l("[NGA] ConnectedClientsTracker.onDisconnected", new C78126c(gVar, ajVar, vVar));
        vVar.mo62583d(new C78127d(gVar, vVar));
        return new C78129f(gVar, vVar);
    }

    /* renamed from: c */
    public final C70862aj mo73101c(C70862aj ajVar) {
        C78124ae aeVar = this.f215154b;
        C78130g gVar = this.f215153a;
        gVar.getClass();
        C22871g gVar2 = (C22871g) aeVar.f215131a.mo17428b();
        gVar2.getClass();
        C78145v vVar = (C78145v) aeVar.f215132b.mo17428b();
        vVar.getClass();
        return new C78123ad(ajVar, gVar, gVar2, vVar);
    }

    /* renamed from: d */
    public final void mo73102d(C128103d dVar, C70862aj ajVar) {
        this.f215157e.mo73081a(dVar, ajVar);
    }

    /* renamed from: e */
    public final void mo73103e(C128071at atVar, C70862aj ajVar) {
        C78140q qVar = this.f215155c;
        C22871g gVar = (C22871g) qVar.f215164a.mo17428b();
        gVar.getClass();
        C78115g gVar2 = (C78115g) qVar.f215165b.mo17428b();
        gVar2.getClass();
        C78139p pVar = new C78139p(gVar, gVar2);
        pVar.f215162b.mo28212l("[NGA] VoicePlateEventRequest received from UI layer", new C78138o(pVar, atVar, ajVar));
    }

    /* renamed from: f */
    public final void mo73104f(C70862aj ajVar) {
        Duration duration;
        C78135l lVar = this.f215156d;
        C91142g gVar = (C91142g) lVar.f215150a.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) lVar.f215151b.mo17428b();
        gVar2.getClass();
        C83377a aVar = (C83377a) lVar.f215152c.mo17428b();
        aVar.getClass();
        long d = gVar.mo85399d(C90040cs.f248661aa);
        if (d <= 0) {
            duration = Duration.ZERO;
        } else {
            duration = Duration.ofSeconds(d);
        }
        C90873ag agVar = new C90873ag(aVar.mo76664a(duration, e.a), gVar2, "[NGA] getCurrentOnboardingChip", new C78132i(ajVar));
        Objects.requireNonNull(ajVar);
        agVar.mo85223a(new C78133j(ajVar));
    }
}
