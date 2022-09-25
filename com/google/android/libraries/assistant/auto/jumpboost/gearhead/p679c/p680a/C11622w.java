package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11627c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5481k.C69713k;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.w */
/* compiled from: PG */
public final class C11622w implements C11627c, C47102r {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f37567a;

    /* renamed from: b */
    public static final C59071e f37568b = C59071e.m91331h();

    /* renamed from: i */
    private static final Uri f37569i = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();

    /* renamed from: j */
    private static final String[] f37570j = {"CarConnectionState"};

    /* renamed from: c */
    public final Context f37571c;

    /* renamed from: d */
    public final C11624y f37572d = new C11624y();

    /* renamed from: e */
    public final Executor f37573e;

    /* renamed from: f */
    public final IntentFilter f37574f;

    /* renamed from: g */
    public final C69684c f37575g;

    /* renamed from: h */
    public final Set f37576h;

    /* renamed from: k */
    private final Executor f37577k;

    /* renamed from: l */
    private final ScheduledExecutorService f37578l;

    /* renamed from: m */
    private final C46877q f37579m;

    /* renamed from: n */
    private final Executor f37580n;

    static {
        C69669s sVar = new C69669s(C11622w.class, "currentState", "getCurrentState()I");
        int i = C69649af.f186028a;
        f37567a = new C69713k[]{sVar};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0069, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11622w(com.google.apps.tiktok.tracing.C47770dh r2, android.content.Context r3, java.util.concurrent.Executor r4, java.util.concurrent.ScheduledExecutorService r5, com.google.apps.tiktok.dataservice.C46877q r6) {
        /*
            r1 = this;
            java.lang.String r0 = "traceCreation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            java.lang.String r0 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            java.lang.String r0 = "lightweightExecutor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            java.lang.String r0 = "backgroundExecutor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            java.lang.String r0 = "asyncContentResolver"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            r1.<init>()
            r1.f37571c = r3
            r1.f37577k = r4
            r1.f37578l = r5
            r1.f37579m = r6
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.y r3 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.y
            r3.<init>()
            r1.f37572d = r3
            com.google.common.util.concurrent.dr r3 = new com.google.common.util.concurrent.dr
            r3.<init>(r4)
            r1.f37573e = r3
            com.google.common.util.concurrent.dr r3 = new com.google.common.util.concurrent.dr
            r3.<init>(r4)
            r1.f37580n = r3
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED"
            r3.<init>(r4)
            r1.f37574f = r3
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.t r4 = new com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.t
            r4.<init>(r3, r1)
            r1.f37575g = r4
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r1.f37576h = r3
            java.lang.String r3 = "CarConnectionStateObserver#init"
            com.google.apps.tiktok.tracing.ax r2 = r2.mo51613c(r3)
            r1.m27314e()     // Catch:{ all -> 0x0063 }
            r3 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            return
        L_0x0063:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r4 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a.C11622w.<init>(com.google.apps.tiktok.tracing.dh, android.content.Context, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, com.google.apps.tiktok.dataservice.q):void");
    }

    /* renamed from: e */
    private final void m27314e() {
        C46459k.m82829b(mo20089d(), "Failed to update connection state", new Object[0]);
    }

    /* renamed from: a */
    public final void mo20086a(C11610k kVar) {
        C11615p pVar = new C11615p(this, kVar);
        C60870cx l = C60856cj.m92903l(C47810es.m84977q(pVar), this.f37580n);
        C11616q qVar = new C11616q(kVar, this);
        C46459k.m82829b(C47638k.m84753d(l, C60922j.m93044g(l, C47810es.m84963c(qVar), this.f37573e)).mo51521b(new C11618s(new C11614o(this)), this.f37577k), "Failed to update listener and current state", new Object[0]);
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C69664n.m101061g(intent, "intent");
        m27314e();
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo20088c(C11610k kVar) {
        C11617r rVar = new C11617r(this, kVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(rVar), this.f37580n), "Failed to remove listener", new Object[0]);
    }

    /* renamed from: d */
    public final C60870cx mo20089d() {
        C60838bs g = this.f37579m.mo50872b(f37569i, f37570j, BuildConfig.FLAVOR, (String[]) null, BuildConfig.FLAVOR).f121591a.mo57272e(C47810es.m84970j(new C11621v(this)), this.f37578l).mo57275g();
        C69664n.m101060f(g, "private fun updateCurren…    .finishToFuture()\n  }");
        return g;
    }
}
