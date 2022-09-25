package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.p9033a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9030b.C119726a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.C119736a;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.android.libraries.search.assistant.p2703l.C34794h;
import com.google.android.libraries.search.assistant.p2703l.C34798l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67186ad;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.d.d.a.k */
/* compiled from: PG */
public final class C119747k implements C119736a {

    /* renamed from: a */
    public final C71422aw f333577a;

    /* renamed from: b */
    public final C32534ai f333578b;

    /* renamed from: c */
    public boolean f333579c;

    /* renamed from: d */
    private final Executor f333580d;

    /* renamed from: e */
    private final C34798l f333581e;

    /* renamed from: f */
    private C34793g f333582f;

    /* renamed from: g */
    private final Executor f333583g;

    /* renamed from: h */
    private final C33447g f333584h;

    public C119747k(Executor executor, C71422aw awVar, C33447g gVar, C34798l lVar) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(gVar, "shutdownHookRegistry");
        C69664n.m101061g(lVar, "serviceRegistry");
        this.f333580d = executor;
        this.f333577a = awVar;
        this.f333584h = gVar;
        this.f333581e = lVar;
        this.f333578b = new C32534ai(executor);
        this.f333583g = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C51809dy mo104493a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        if (!C69664n.m101066l("tts.OUTPUT", dyVar.f135936b)) {
            return dyVar;
        }
        if (this.f333582f == null) {
            C34794h a = this.f333581e.mo39515a(new C119744h(this));
            this.f333582f = a.f92324a;
            this.f333584h.mo38849b(new C119737a(a));
        }
        C51808dx dxVar = (C51808dx) dyVar.toBuilder();
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        dvVar.mo53733c(C119726a.f333552a.mo38881b(this.f333582f));
        dxVar.mo53736a((C51807dw) dvVar.build());
        C62942bv build = dxVar.build();
        C69664n.m101060f(build, "clientOp\n      .toBuilde…()\n      )\n      .build()");
        return (C51809dy) build;
    }

    /* renamed from: b */
    public final void mo104494b(Throwable th) {
        this.f333583g.execute(C47810es.m84977q(new C119745i(this, th)));
    }

    /* renamed from: c */
    public final void mo104495c(C67186ad adVar) {
        C69664n.m101061g(adVar, "ttsServiceEvent");
        this.f333583g.execute(C47810es.m84977q(new C119746j(this, adVar)));
    }
}
