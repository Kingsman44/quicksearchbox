package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126276t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126277u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126278v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37345aj;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a.C37748h;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.o */
/* compiled from: PG */
public final class C125411o implements C126278v {

    /* renamed from: a */
    public static final C59071e f345861a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.e.o");

    /* renamed from: b */
    static final int f345862b = ((int) Math.ceil(150.0d));

    /* renamed from: c */
    public static final C37407bl f345863c;

    /* renamed from: d */
    public static final C37360ay f345864d;

    /* renamed from: e */
    public static final C37410bo f345865e;

    /* renamed from: f */
    public static final C37346ak f345866f;

    /* renamed from: g */
    public final C37419bx f345867g;

    /* renamed from: h */
    public final C126174c f345868h;

    /* renamed from: i */
    public final boolean f345869i;

    /* renamed from: j */
    public final Executor f345870j;

    /* renamed from: k */
    public final Executor f345871k;

    /* renamed from: l */
    public final Executor f345872l;

    /* renamed from: m */
    public final Queue f345873m = new C58425eo(f345862b);

    /* renamed from: n */
    public final AtomicBoolean f345874n = new AtomicBoolean(false);

    /* renamed from: o */
    public final AtomicBoolean f345875o = new AtomicBoolean(false);

    /* renamed from: p */
    public final AtomicReference f345876p = new AtomicReference();

    /* renamed from: q */
    public final C61301b f345877q;

    /* renamed from: r */
    public C37402bg f345878r = null;

    /* renamed from: s */
    public C37325aa f345879s = null;

    /* renamed from: t */
    public final C37482d f345880t;

    /* renamed from: u */
    private final long f345881u;

    static {
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37748h hVar = C37748h.f100180a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        hVar.getClass();
        cVar.f100246b = hVar;
        cVar.f100245a = 22;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        blVar.f99328b = cVar2;
        blVar.f99327a |= 1;
        f345863c = (C37407bl) bkVar.build();
        C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        ayVar.f99226a |= 512;
        ayVar.f99236k = true;
        C37360ay ayVar2 = (C37360ay) avVar.build();
        f345864d = ayVar2;
        C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
        bnVar.copyOnWrite();
        C37410bo boVar = (C37410bo) bnVar.instance;
        boVar.f99332a |= 64;
        boVar.f99339h = true;
        bnVar.copyOnWrite();
        C37410bo boVar2 = (C37410bo) bnVar.instance;
        ayVar2.getClass();
        boVar2.f99337f = ayVar2;
        boVar2.f99332a |= 1;
        C39226b bVar = C39226b.TAG_ASSISTANT_DICTATION;
        bnVar.copyOnWrite();
        C37410bo boVar3 = (C37410bo) bnVar.instance;
        boVar3.f99336e = Integer.valueOf(bVar.getNumber());
        boVar3.f99335d = 14;
        f345865e = (C37410bo) bnVar.build();
        C37345aj ajVar = (C37345aj) C37346ak.f99197g.createBuilder();
        C37705a aVar2 = (C37705a) C37773c.f100243c.createBuilder();
        C37748h hVar2 = C37748h.f100180a;
        aVar2.copyOnWrite();
        C37773c cVar3 = (C37773c) aVar2.instance;
        hVar2.getClass();
        cVar3.f100246b = hVar2;
        cVar3.f100245a = 22;
        ajVar.copyOnWrite();
        C37346ak akVar = (C37346ak) ajVar.instance;
        C37773c cVar4 = (C37773c) aVar2.build();
        cVar4.getClass();
        akVar.f99203e = cVar4;
        akVar.f99199a |= 8;
        f345866f = (C37346ak) ajVar.build();
    }

    public C125411o(C37419bx bxVar, C37482d dVar, C126174c cVar, boolean z, Executor executor, C125410n nVar) {
        this.f345867g = bxVar;
        this.f345880t = dVar;
        this.f345868h = cVar;
        this.f345869i = z;
        this.f345870j = executor;
        long andIncrement = nVar.f345860a.getAndIncrement();
        this.f345881u = andIncrement;
        this.f345871k = new C60904dr(executor);
        this.f345872l = new C60904dr(executor);
        this.f345877q = C126290c.m206496a("AudioSession#" + andIncrement);
    }

    /* renamed from: a */
    public final void mo106962a(C126277u uVar) {
        while (!this.f345873m.isEmpty()) {
            C37680i iVar = (C37680i) this.f345873m.poll();
            iVar.getClass();
            uVar.mo107503b(iVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP:0: B:1:0x0002->B:4:0x000e, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106963b(com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126277u r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f345876p
        L_0x0002:
            r1 = 0
            boolean r1 = r0.compareAndSet(r3, r1)
            if (r1 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            java.lang.Object r1 = r0.get()
            if (r1 == r3) goto L_0x0002
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125411o.mo106963b(com.google.android.apps.search.assistant.surfaces.dictation.service.q.u):void");
    }

    /* renamed from: c */
    public final void mo106964c(C126277u uVar) {
        ((C59052c) ((C59052c) f345861a.mo56224b()).mo56372aa(36505)).mo56354G("Setting %s on %s [SD]", ((C126276t) uVar).f347939k, this.f345877q);
        this.f345876p.set(uVar);
        if (this.f345869i) {
            C125408l lVar = new C125408l(this, uVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(lVar), this.f345872l), "Failed to consume audio in %s. [SD]", this.f345877q);
        }
    }

    public final String toString() {
        long j = this.f345881u;
        return "AudioSession#" + j;
    }
}
