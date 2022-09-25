package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.binaries.satin.app.arq;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120082b;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121597bx;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.C33512a;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2591a.C33502b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2618a.C33724b;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2629d.C33880a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import dagger.p5294a.C68225k;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ah */
/* compiled from: PG */
public final class C33768ah implements C33502b {

    /* renamed from: a */
    public static final C59071e f90184a = C59071e.m91331h();

    /* renamed from: k */
    private static final Duration f90185k = Duration.ofSeconds(30);

    /* renamed from: b */
    public final C33787b f90186b;

    /* renamed from: c */
    public final C71422aw f90187c;

    /* renamed from: d */
    public final C33724b f90188d;

    /* renamed from: e */
    public final C33776ap f90189e;

    /* renamed from: f */
    public final Optional f90190f;

    /* renamed from: g */
    public final C33777aq f90191g;

    /* renamed from: h */
    public final C121597bx f90192h;

    /* renamed from: i */
    public final C33880a f90193i;

    /* renamed from: j */
    public final C33512a f90194j;

    /* renamed from: l */
    private final C46459k f90195l;

    /* renamed from: m */
    private final Executor f90196m;

    /* renamed from: n */
    private final Bundle f90197n;

    /* renamed from: o */
    private final C47632e f90198o = new C47632e();

    /* renamed from: p */
    private final AtomicLong f90199p;

    public C33768ah(C33787b bVar, C121597bx bxVar, C33880a aVar, C33512a aVar2, C46459k kVar, C71422aw awVar, Executor executor, arq arq, C33724b bVar2, C33776ap apVar, Bundle bundle, Optional optional) {
        C69664n.m101061g(bxVar, "directActionsVisEventsDispatcher");
        C69664n.m101061g(aVar, "sessionLifecycleListener");
        C69664n.m101061g(aVar2, "activityIdMapper");
        C69664n.m101061g(kVar, "androidFutures");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(arq, "throttlerFactory");
        C69664n.m101061g(bVar2, "currentProcessName");
        this.f90186b = bVar;
        this.f90192h = bxVar;
        this.f90193i = aVar;
        this.f90194j = aVar2;
        this.f90195l = kVar;
        this.f90187c = awVar;
        this.f90196m = executor;
        this.f90188d = bVar2;
        this.f90189e = apVar;
        this.f90197n = bundle;
        this.f90190f = optional;
        C120082b bVar3 = new C120082b();
        C62910ar arVar = (C62910ar) ((C46897i) arq.f199906a.a.b.mo67406dK().f184806a.mo17428b()).mo50901a("com.google.android.libraries.search.assistant.invocation.device 45370430").mo50905d();
        C68225k.m98532d(arVar);
        this.f90191g = new C33777aq((C21370a) arq.f199906a.a.i.mo17428b(), bVar3, arVar);
        this.f90199p = new AtomicLong(0);
    }

    /* renamed from: l */
    private final C60870cx m62400l(String str, C69626l lVar) {
        C60870cx b = this.f90198o.mo51512b(new C33862p(this, str, lVar), this.f90196m);
        C69664n.m101060f(b, "private fun logGrpcFailu…lightweightExecutor\n    )");
        return b;
    }

    /* renamed from: m */
    private final void m62401m(String str, C69626l lVar) {
        this.f90195l.mo50458f(m62400l(str, lVar), f90185k.getSeconds(), TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public final C60870cx mo38913a(C33504b bVar, IBinder iBinder) {
        C69664n.m101061g(iBinder, "token");
        return m62400l("onCreate", new C33871y(this, bVar, iBinder, (C69577g) null));
    }

    /* renamed from: b */
    public final void mo38914b() {
        m62401m("onBackPressed", new C33864r(this, (C69577g) null));
    }

    /* renamed from: c */
    public final void mo38915c() {
        m62401m("onCloseSystemDialogs", new C33867u(this, (C69577g) null));
    }

    /* renamed from: d */
    public final void mo38916d() {
        m62401m("onConfigurationChanged", new C33869w(this, (C69577g) null));
    }

    /* renamed from: e */
    public final void mo38917e() {
        m62401m("onDestroy", new C33761aa(this, (C69577g) null));
    }

    /* renamed from: f */
    public final void mo38918f(VoiceInteractionSession.ActivityId activityId) {
        C69664n.m101061g(activityId, "activityId");
        m62401m("onDirectActionsInvalidated", new C33762ab(this, activityId, (C69577g) null));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38919g(AssistStateCompat assistStateCompat) {
        mo38920h(assistStateCompat, (VoiceInteractionSession.ActivityId) null);
    }

    /* renamed from: h */
    public final void mo38920h(AssistStateCompat assistStateCompat, VoiceInteractionSession.ActivityId activityId) {
        m62401m("onHandleAssist", new C33763ac(activityId, assistStateCompat, this, (C69577g) null));
    }

    /* renamed from: i */
    public final void mo38921i(Bitmap bitmap) {
        m62401m("onHandleScreenshot", new C33764ad(this, bitmap, (C69577g) null));
    }

    /* renamed from: j */
    public final void mo38922j() {
        m62401m("onHide", new C33766af(this, (C69577g) null));
    }

    /* renamed from: k */
    public final void mo38923k(Bundle bundle, int i) {
        Bundle bundle2;
        if (this.f90199p.getAndIncrement() == 0 && (bundle2 = this.f90197n) != null) {
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            Bundle bundle3 = new Bundle(bundle);
            bundle3.putAll(bundle2);
            bundle = bundle3;
        }
        m62401m("onShow", new C33767ag(this, bundle, i, (C69577g) null));
    }
}
