package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.google.android.apps.search.googleapp.compliance.p10144a.C133550as;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.t */
/* compiled from: PG */
public final class C137960t implements C137940a {

    /* renamed from: b */
    private static final C58974d f375336b = C58974d.m91134h("LocalDataService");

    /* renamed from: a */
    public final C71422aw f375337a;

    /* renamed from: c */
    private final C42876ab f375338c;

    /* renamed from: d */
    private final C42876ab f375339d;

    /* renamed from: e */
    private final C42876ab f375340e;

    /* renamed from: f */
    private final C21370a f375341f;

    /* renamed from: g */
    private final long f375342g;

    /* renamed from: h */
    private final long f375343h;

    /* renamed from: i */
    private final Executor f375344i;

    /* renamed from: j */
    private final C47770dh f375345j;

    /* renamed from: k */
    private final boolean f375346k;

    /* renamed from: l */
    private final C133550as f375347l;

    public C137960t(C42876ab abVar, C42876ab abVar2, C42876ab abVar3, C21370a aVar, long j, long j2, Executor executor, C71422aw awVar, C47770dh dhVar, boolean z, C133550as asVar) {
        C69664n.m101061g(abVar, "localSearchesDataStore");
        C69664n.m101061g(abVar2, "previousQueryDataStore");
        C69664n.m101061g(abVar3, "userSettingsDataStore");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f375338c = abVar;
        this.f375339d = abVar2;
        this.f375340e = abVar3;
        this.f375341f = aVar;
        this.f375342g = j;
        this.f375343h = j2;
        this.f375344i = executor;
        this.f375337a = awVar;
        this.f375345j = dhVar;
        this.f375346k = z;
        this.f375347l = asVar;
    }

    /* renamed from: j */
    private final Object m224276j(C42876ab abVar, C69626l lVar, C69577g gVar) {
        C60870cx a = abVar.mo46039a(new C137956p(lVar), this.f375344i);
        C69664n.m101060f(a, "updater: (T) -> T) {\n   …) }, lightweightExecutor)");
        Object c = C71663i.m104690c(a, gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* renamed from: a */
    public final C60870cx mo114052a() {
        return C71663i.m104688a(C71803m.m105042c(this.f375337a, (C69585o) null, (C71424ay) null, new C137944d(this, (C69577g) null), 3));
    }

    /* renamed from: b */
    public final C60870cx mo114053b() {
        return C71663i.m104688a(C71803m.m105042c(this.f375337a, (C69585o) null, (C71424ay) null, new C137947g(this, (C69577g) null), 3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r5);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114054c(boolean r5) {
        /*
            r4 = this;
            com.google.apps.tiktok.tracing.dh r0 = r4.f375345j
            java.lang.String r1 = "setIsSignedOutSearchCustomizationEnabled"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            kotlinx.coroutines.aw r1 = r4.f375337a     // Catch:{ all -> 0x0018 }
            com.google.android.apps.search.googleapp.search.suggest.a.b.m r2 = new com.google.android.apps.search.googleapp.search.suggest.a.b.m     // Catch:{ all -> 0x0018 }
            r3 = 0
            r2.<init>(r4, r5, r3)     // Catch:{ all -> 0x0018 }
            r5 = 3
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r5)     // Catch:{ all -> 0x0018 }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return
        L_0x0018:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114054c(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114055d(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137943c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.suggest.a.b.c r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137943c) r0
            int r1 = r0.f375295c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375295c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.b.c r0 = new com.google.android.apps.search.googleapp.search.suggest.a.b.c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f375293a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375295c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.storage.protostore.ab r5 = r4.f375338c
            com.google.common.util.concurrent.cx r5 = r5.mo46042d()
            java.lang.String r2 = "localSearchesDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f375295c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r0 = "localSearchesDataStore.data.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114055d(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.a.b.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.apps.search.googleapp.search.suggest.a.b.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.apps.search.googleapp.search.suggest.a.b.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114056e(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137945e
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.search.suggest.a.b.e r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137945e) r0
            int r1 = r0.f375301d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375301d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.b.e r0 = new com.google.android.apps.search.googleapp.search.suggest.a.b.e
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f375299b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375301d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r10)     // Catch:{ Exception -> 0x002b }
            goto L_0x00c1
        L_0x002b:
            r10 = move-exception
            goto L_0x00aa
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0036:
            java.lang.Object r2 = r0.f375298a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0055
        L_0x003c:
            p5462h.C69714l.m101134b(r10)
            com.google.android.libraries.storage.protostore.ab r10 = r9.f375339d
            com.google.common.util.concurrent.cx r10 = r10.mo46042d()
            java.lang.String r2 = "previousQueryDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            r0.f375298a = r9
            r0.f375301d = r4
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)
            if (r10 == r1) goto L_0x00c9
            r2 = r9
        L_0x0055:
            com.google.android.apps.search.googleapp.search.suggest.a.b.y r10 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y) r10
            int r5 = r10.f375354a
            r4 = r4 & r5
            if (r4 == 0) goto L_0x00c1
            long r4 = r10.f375356c
            r6 = r2
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r6 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r6
            com.google.android.libraries.f.a r7 = r6.f375341f
            long r7 = r7.mo26870b()
            long r7 = r7 - r4
            j$.time.Duration r4 = p3186j$.time.Duration.ofMillis(r7)
            long r4 = r4.getSeconds()
            long r6 = r6.f375343h
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0095
            com.google.protobuf.bn r10 = r10.toBuilder()
            com.google.android.apps.search.googleapp.search.suggest.a.b.x r10 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137964x) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.android.apps.search.googleapp.search.suggest.a.b.y r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y) r0
            int r1 = r0.f375354a
            r1 = r1 | 4
            r0.f375354a = r1
            r0.f375357d = r4
            com.google.protobuf.bv r10 = r10.build()
            java.lang.String r0 = "previousQueryData.toBuil…yElapsedTimeSecs).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            return r10
        L_0x0095:
            r10 = r2
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r10 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r10     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.storage.protostore.ab r10 = r10.f375339d     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.googleapp.search.suggest.a.b.f r4 = com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137946f.f375302a     // Catch:{ Exception -> 0x002b }
            r5 = 0
            r0.f375298a = r5     // Catch:{ Exception -> 0x002b }
            r0.f375301d = r3     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r2 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r2     // Catch:{ Exception -> 0x002b }
            java.lang.Object r10 = r2.m224276j(r10, r4, r0)     // Catch:{ Exception -> 0x002b }
            if (r10 != r1) goto L_0x00c1
            return r1
        L_0x00aa:
            com.google.common.f.a.d r0 = f375336b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.Throwable r10 = r10.getCause()
            com.google.common.f.x r10 = r0.mo56382g(r10)
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            java.lang.String r0 = "Failed to clear previous query data."
            r10.mo56386p(r0)
        L_0x00c1:
            com.google.android.apps.search.googleapp.search.suggest.a.b.y r10 = com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y.f375352e
            java.lang.String r0 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            return r10
        L_0x00c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114056e(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114057f(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137948h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.googleapp.search.suggest.a.b.h r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137948h) r0
            int r1 = r0.f375308d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375308d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.b.h r0 = new com.google.android.apps.search.googleapp.search.suggest.a.b.h
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f375306b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375308d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r7)
            goto L_0x00ab
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            java.lang.Object r2 = r0.f375305a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0062
        L_0x0039:
            p5462h.C69714l.m101134b(r7)
            boolean r7 = r6.f375346k
            if (r7 == 0) goto L_0x0091
            com.google.android.apps.search.googleapp.compliance.a.as r7 = r6.f375347l
            com.google.android.apps.search.googleapp.compliance.a.r r2 = r7.f363867a
            com.google.android.libraries.storage.protostore.ab r2 = r2.f363899d
            com.google.common.util.concurrent.cx r2 = r2.mo46042d()
            com.google.apps.tiktok.tracing.contrib.b.f r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r2)
            com.google.android.apps.search.googleapp.compliance.a.aq r5 = com.google.android.apps.search.googleapp.compliance.p10144a.C133548aq.f363866a
            java.util.concurrent.Executor r7 = r7.f363868b
            com.google.apps.tiktok.tracing.contrib.b.f r7 = r2.mo51515h(r5, r7)
            r0.f375305a = r6
            r0.f375308d = r4
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r2 = r6
        L_0x0062:
            com.google.android.apps.search.googleapp.compliance.a.ar r7 = (com.google.android.apps.search.googleapp.compliance.p10144a.C133549ar) r7
            if (r7 == 0) goto L_0x0092
            boolean r5 = r7.mo111258b()
            if (r5 == r4) goto L_0x006d
            goto L_0x0092
        L_0x006d:
            com.google.android.apps.search.googleapp.search.suggest.a.b.aa r0 = com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137941aa.f375287c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.a.b.z r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137966z) r0
            boolean r7 = r7.mo111257a()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.googleapp.search.suggest.a.b.aa r1 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137941aa) r1
            int r2 = r1.f375289a
            r2 = r2 | r4
            r1.f375289a = r2
            r1.f375290b = r7
            com.google.protobuf.bv r7 = r0.build()
            java.lang.String r0 = "newBuilder()\n          .…led())\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            return r7
        L_0x0091:
            r2 = r6
        L_0x0092:
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r2 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r2
            com.google.android.libraries.storage.protostore.ab r7 = r2.f375340e
            com.google.common.util.concurrent.cx r7 = r7.mo46042d()
            java.lang.String r2 = "userSettingsDataStore.data"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r2 = 0
            r0.f375305a = r2
            r0.f375308d = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            java.lang.String r0 = "userSettingsDataStore.data.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114057f(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.a.b.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.android.apps.search.googleapp.search.suggest.a.b.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.android.apps.search.googleapp.search.suggest.a.b.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057 A[Catch:{ Exception -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114058g(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137950j
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.search.suggest.a.b.j r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137950j) r0
            int r1 = r0.f375314d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375314d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.b.j r0 = new com.google.android.apps.search.googleapp.search.suggest.a.b.j
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f375312b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375314d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p5462h.C69714l.m101134b(r10)     // Catch:{ Exception -> 0x002a }
            goto L_0x0086
        L_0x002a:
            r10 = move-exception
            goto L_0x006f
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0034:
            java.lang.Object r2 = r0.f375311a
            p5462h.C69714l.m101134b(r10)     // Catch:{ Exception -> 0x002a }
            goto L_0x0049
        L_0x003a:
            p5462h.C69714l.m101134b(r10)
            r0.f375311a = r9     // Catch:{ Exception -> 0x002a }
            r0.f375314d = r4     // Catch:{ Exception -> 0x002a }
            java.lang.Object r10 = r9.mo114055d(r0)     // Catch:{ Exception -> 0x002a }
            if (r10 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r2 = r9
        L_0x0049:
            com.google.android.apps.search.googleapp.search.suggest.a.b.w r10 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137963w) r10     // Catch:{ Exception -> 0x002a }
            int r10 = r10.f375351b     // Catch:{ Exception -> 0x002a }
            long r4 = (long) r10     // Catch:{ Exception -> 0x002a }
            r6 = r2
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r6 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r6     // Catch:{ Exception -> 0x002a }
            long r6 = r6.f375342g     // Catch:{ Exception -> 0x002a }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0086
            r4 = r2
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r4 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r4     // Catch:{ Exception -> 0x002a }
            com.google.android.libraries.storage.protostore.ab r4 = r4.f375338c     // Catch:{ Exception -> 0x002a }
            com.google.android.apps.search.googleapp.search.suggest.a.b.k r5 = new com.google.android.apps.search.googleapp.search.suggest.a.b.k     // Catch:{ Exception -> 0x002a }
            r5.<init>(r10)     // Catch:{ Exception -> 0x002a }
            r10 = 0
            r0.f375311a = r10     // Catch:{ Exception -> 0x002a }
            r0.f375314d = r3     // Catch:{ Exception -> 0x002a }
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r2 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r2     // Catch:{ Exception -> 0x002a }
            java.lang.Object r10 = r2.m224276j(r4, r5, r0)     // Catch:{ Exception -> 0x002a }
            if (r10 != r1) goto L_0x0086
            return r1
        L_0x006f:
            com.google.common.f.a.d r0 = f375336b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.Throwable r10 = r10.getCause()
            com.google.common.f.x r10 = r0.mo56382g(r10)
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            java.lang.String r0 = "Failed to increment number of local searches."
            r10.mo56386p(r0)
        L_0x0086:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114058g(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114059h(boolean r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137954n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.search.suggest.a.b.n r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137954n) r0
            int r1 = r0.f375324c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375324c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.b.n r0 = new com.google.android.apps.search.googleapp.search.suggest.a.b.n
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f375322a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375324c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r6)     // Catch:{ Exception -> 0x0027 }
            goto L_0x005b
        L_0x0027:
            r5 = move-exception
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.storage.protostore.ab r6 = r4.f375340e     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.googleapp.search.suggest.a.b.o r2 = new com.google.android.apps.search.googleapp.search.suggest.a.b.o     // Catch:{ Exception -> 0x0027 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0027 }
            r0.f375324c = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r5 = r4.m224276j(r6, r2, r0)     // Catch:{ Exception -> 0x0027 }
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x0044:
            com.google.common.f.a.d r6 = f375336b
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.Throwable r5 = r5.getCause()
            com.google.common.f.x r5 = r6.mo56382g(r5)
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            java.lang.String r6 = "Failed to set signed-out search customization value."
            r5.mo56386p(r6)
        L_0x005b:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114059h(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114060i(java.lang.String r5, long r6, p5462h.p5466c.C69577g r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137958r
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.search.suggest.a.b.r r0 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137958r) r0
            int r1 = r0.f375333c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f375333c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.a.b.r r0 = new com.google.android.apps.search.googleapp.search.suggest.a.b.r
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f375331a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f375333c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r8)     // Catch:{ Exception -> 0x0027 }
            goto L_0x005b
        L_0x0027:
            r5 = move-exception
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.storage.protostore.ab r8 = r4.f375339d     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.googleapp.search.suggest.a.b.s r2 = new com.google.android.apps.search.googleapp.search.suggest.a.b.s     // Catch:{ Exception -> 0x0027 }
            r2.<init>(r5, r6)     // Catch:{ Exception -> 0x0027 }
            r0.f375333c = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r5 = r4.m224276j(r8, r2, r0)     // Catch:{ Exception -> 0x0027 }
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x0044:
            com.google.common.f.a.d r6 = f375336b
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.Throwable r5 = r5.getCause()
            com.google.common.f.x r5 = r6.mo56382g(r5)
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            java.lang.String r6 = "Failed to update previous query data."
            r5.mo56386p(r6)
        L_0x005b:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t.mo114060i(java.lang.String, long, h.c.g):java.lang.Object");
    }
}
