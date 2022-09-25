package com.google.android.apps.search.assistant.libraries.dictation.starter.p8962a;

import com.google.android.apps.gsa.staticplugins.accl.performers.p7350k.C93206e;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119270af;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119271ag;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119282d;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119285g;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119286h;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119293o;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119295q;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.starter.C119320c;
import com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.C119328g;
import com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.C119331j;
import com.google.android.apps.search.assistant.libraries.dictation.starter.crossprofile.C119334m;
import com.google.android.apps.search.assistant.surfaces.dictation.crossprofile.C125181d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126296ae;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142586k;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.starter.a.f */
/* compiled from: PG */
public final class C119311f implements C119320c {

    /* renamed from: a */
    public static final /* synthetic */ int f332698a = 0;

    /* renamed from: b */
    private static final Duration f332699b = Duration.ofSeconds(2);

    /* renamed from: c */
    private final C69464a f332700c;

    /* renamed from: d */
    private final C60888db f332701d;

    /* renamed from: e */
    private final C119334m f332702e;

    /* renamed from: f */
    private final C125181d f332703f;

    public C119311f(C119334m mVar, C125181d dVar, C69464a aVar, C60888db dbVar) {
        this.f332702e = mVar;
        this.f332703f = dVar;
        this.f332700c = aVar;
        this.f332701d = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo104281a() {
        return this.f332702e.mo104298b().mo104295b();
    }

    /* renamed from: b */
    public final C60870cx mo104282b() {
        if (!this.f332703f.mo117175b().mo117165q()) {
            return C60856cj.m92900i(C119282d.f332631e);
        }
        C119328g a = this.f332702e.mo104297a().mo104294a();
        C119282d dVar = C119282d.f332631e;
        C119331j jVar = C119331j.f332718a;
        C142568e eVar = new C142568e(C119331j.f332719b, BundlerType.m231188a("com.google.android.apps.search.assistant.libraries.dictation.proto.CanStartDictationResponse"));
        C142568e.m231170f(a.f332717a.mo104295b(), new C142586k(eVar, dVar));
        SettableFuture settableFuture = eVar.f386859a;
        Duration duration = f332699b;
        C119282d dVar2 = C119282d.f332631e;
        C60870cx e = C126309ar.m206526e(settableFuture, duration, this.f332701d);
        C126296ae aeVar = new C126296ae(dVar2);
        return C60846c.m92878g(e, TimeoutException.class, C47810es.m84963c(aeVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo104283c(C64735n nVar) {
        C60870cx c = this.f332702e.mo104298b().mo104296c(nVar);
        C119309d dVar = C119309d.f332696a;
        return C60922j.m93044g(c, C47810es.m84963c(dVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo104284d(C64735n nVar) {
        C119328g a = this.f332702e.mo104297a().mo104294a();
        C119331j jVar = C119331j.f332718a;
        C142568e eVar = new C142568e(C119331j.f332719b, BundlerType.m231188a("java.lang.Boolean"));
        C142568e.m231170f(a.f332717a.mo104296c(nVar), new C142586k(eVar, false));
        SettableFuture settableFuture = eVar.f386859a;
        C119310e eVar2 = C119310e.f332697a;
        return C60922j.m93044g(settableFuture, C47810es.m84963c(eVar2), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo104285e(C64735n nVar, C93206e eVar) {
        C119306a aVar = new C119306a(eVar);
        C119293o oVar = (C119293o) this.f332700c.mo17428b();
        aVar.f332687c = new C126322bc(C70876o.m103761b(oVar.f189039a.mo39510a(C119295q.m197986b(), oVar.f189040b), aVar, true));
        if (aVar.f332686b.get()) {
            ((C59052c) ((C59052c) C119306a.f332685a.mo56226d()).mo56372aa(34357)).mo56386p("Not starting dictation because connection is already closed. [SD]");
            return;
        }
        C126322bc bcVar = aVar.f332687c;
        if (bcVar == null) {
            ((C59052c) ((C59052c) C119306a.f332685a.mo56226d()).mo56372aa(34356)).mo56386p("Not starting dictation because requestObserver is not initialized yet. [SD]");
            return;
        }
        C119285g gVar = (C119285g) C119286h.f332638c.createBuilder();
        C119270af afVar = (C119270af) C119271ag.f332613d.createBuilder();
        afVar.copyOnWrite();
        nVar.getClass();
        ((C119271ag) afVar.instance).f332615a = nVar;
        C119297s sVar = C119297s.REQUESTER_ASSISTANT_CLIENT_OP;
        afVar.copyOnWrite();
        ((C119271ag) afVar.instance).f332616b = sVar.getNumber();
        C119271ag agVar = (C119271ag) afVar.build();
        gVar.copyOnWrite();
        C119286h hVar = (C119286h) gVar.instance;
        agVar.getClass();
        hVar.f332641b = agVar;
        hVar.f332640a = 1;
        bcVar.mo107532b((C119286h) gVar.build());
    }
}
