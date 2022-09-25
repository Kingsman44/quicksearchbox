package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.apps.search.assistant.platform.ondevice.datadownload.C122179b;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17059d;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17064i;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17156s;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17157t;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17596f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.x */
/* compiled from: PG */
public final class C122297x extends C17059d {

    /* renamed from: a */
    public static final C58974d f339130a = C58974d.m91136j();

    /* renamed from: b */
    public final C60888db f339131b;

    /* renamed from: c */
    public final C122277d f339132c;

    /* renamed from: d */
    public final C122179b f339133d;

    /* renamed from: e */
    private final C122264bw f339134e;

    /* renamed from: f */
    private final C122290q f339135f;

    /* renamed from: g */
    private final C122262bu f339136g;

    /* renamed from: h */
    private final Duration f339137h;

    /* renamed from: i */
    private final boolean f339138i;

    /* renamed from: j */
    private final boolean f339139j;

    public C122297x(C60888db dbVar, C122277d dVar, C122264bw bwVar, C122179b bVar, C122290q qVar, C122262bu buVar, C62910ar arVar, boolean z, boolean z2, C122218ad adVar) {
        this.f339131b = dbVar;
        this.f339132c = dVar;
        this.f339134e = bwVar;
        this.f339133d = bVar;
        this.f339135f = qVar;
        this.f339136g = buVar;
        this.f339137h = C62950b.m95473d(arVar);
        this.f339138i = z;
        this.f339139j = z2;
        adVar.mo105574a();
    }

    /* renamed from: b */
    public final C70862aj mo23178b(C70862aj ajVar) {
        C122262bu buVar = this.f339136g;
        C122179b bVar = (C122179b) buVar.f339027a.mo17428b();
        bVar.getClass();
        C60888db dbVar = (C60888db) buVar.f339028b.mo17428b();
        dbVar.getClass();
        C122277d dVar = (C122277d) buVar.f339029c.mo17428b();
        dVar.getClass();
        C122264bw bwVar = (C122264bw) buVar.f339030d.mo17428b();
        bwVar.getClass();
        return new C122261bt(bVar, dbVar, dVar, bwVar, (C70883v) ajVar);
    }

    /* renamed from: c */
    public final void mo23179c(C17064i iVar, C70862aj ajVar) {
        C70148al m = C70148al.m102135m();
        if (this.f339138i) {
            C122290q qVar = this.f339135f;
            C17156s sVar = new C17156s();
            qVar.mo105591a(sVar, new C122284k(qVar, iVar));
            ajVar = new C17596f(Arrays.asList(new C70862aj[]{ajVar, sVar}));
        }
        C17036ac acVar = iVar.f49676b;
        if (acVar == null) {
            acVar = C17036ac.f49640d;
        }
        C60870cx a = this.f339134e.mo105581a(acVar);
        C122292s sVar2 = new C122292s(this, acVar, iVar);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(sVar2), this.f339131b);
        if (!this.f339137h.isZero()) {
            Duration duration = this.f339137h;
            h = C60856cj.m92908q(h, duration.toMillis(), TimeUnit.MILLISECONDS, this.f339131b);
        }
        C17157t.m34306b(m, h, ajVar, this.f339131b, this.f339139j);
    }
}
