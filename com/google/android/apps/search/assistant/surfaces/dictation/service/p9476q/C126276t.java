package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.binaries.satin.app.apr;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125193ak;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125255k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.t */
/* compiled from: PG */
public final class C126276t implements C126277u {

    /* renamed from: a */
    public static final C59071e f347929a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.q.t");

    /* renamed from: b */
    public final C126278v f347930b;

    /* renamed from: c */
    public final C126208av f347931c;

    /* renamed from: d */
    public final C70862aj f347932d;

    /* renamed from: e */
    public final C126174c f347933e;

    /* renamed from: f */
    public final C126268l f347934f;

    /* renamed from: g */
    public final C21370a f347935g;

    /* renamed from: h */
    public final AtomicBoolean f347936h = new AtomicBoolean(false);

    /* renamed from: i */
    public final AtomicReference f347937i = new AtomicReference();

    /* renamed from: j */
    public final Executor f347938j;

    /* renamed from: k */
    public final C61301b f347939k;

    /* renamed from: l */
    public final C126200an f347940l;

    /* renamed from: m */
    private final long f347941m;

    public C126276t(C126278v vVar, C126208av avVar, af afVar, C126200an anVar, C70862aj ajVar, apr apr, C126273q qVar, C126174c cVar, Executor executor, C21370a aVar) {
        apr apr2 = apr;
        this.f347930b = vVar;
        this.f347931c = avVar;
        this.f347940l = anVar;
        this.f347932d = ajVar;
        this.f347933e = cVar;
        this.f347934f = new C126264h(afVar, new C126272p(this), (C125193ak) apr2.f199139a.b.f198027a.f199304cW.mo17428b(), apr2.f199139a.b.f198027a.mo66661T(), (C125255k) apr2.f199139a.b.f198027a.f199306cY.mo17428b(), (C126174c) apr2.f199139a.b.f198027a.f199305cX.mo17428b(), (C60888db) apr2.f199139a.a.n.mo17428b(), (Executor) apr2.f199139a.a.p.mo17428b());
        long andIncrement = qVar.f347928a.getAndIncrement();
        this.f347941m = andIncrement;
        this.f347935g = aVar;
        this.f347938j = new C60904dr(executor);
        this.f347939k = C126290c.m206496a("AsrSession#" + andIncrement);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo107502a() {
        C126271o oVar = new C126271o(this);
        return C60856cj.m92905n(C47810es.m84965e(oVar), this.f347938j);
    }

    /* renamed from: b */
    public final void mo107503b(C37680i iVar) {
        C126264h hVar = (C126264h) this.f347934f;
        if (!hVar.f347916e.get()) {
            C126262f fVar = new C126262f(hVar, iVar);
            hVar.mo107493a(C60856cj.m92903l(C47810es.m84977q(fVar), hVar.f347915d), C89885b.ASSISTANT_DICTATION_ASR_AIAI_OTHER_ERROR, "Failed to send audio for %s [SD]", C126290c.m206496a(hVar.f347920i.toString()));
        }
    }

    public final String toString() {
        long j = this.f347941m;
        return "AsrSession#" + j;
    }
}
