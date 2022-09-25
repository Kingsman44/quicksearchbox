package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126874e;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127485o;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.C127586a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127637b;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127671c;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127617d;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127620g;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127621h;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127625l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34012ab;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34072ch;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34073ci;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34091d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34115x;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae */
/* compiled from: PG */
public final class C127643ae extends C127625l implements C127671c {

    /* renamed from: a */
    public static final C59071e f351379a = C59071e.m91331h();

    /* renamed from: b */
    public static final Duration f351380b = Duration.ofMillis(64000);

    /* renamed from: u */
    private static final Duration f351381u = Duration.ofMillis(1000);

    /* renamed from: c */
    public final C71422aw f351382c;

    /* renamed from: d */
    public final Executor f351383d;

    /* renamed from: e */
    public final C71422aw f351384e;

    /* renamed from: f */
    public final Executor f351385f;

    /* renamed from: g */
    public final C21370a f351386g;

    /* renamed from: h */
    public final C127485o f351387h;

    /* renamed from: i */
    public final C126874e f351388i;

    /* renamed from: j */
    public final C127579l f351389j;

    /* renamed from: k */
    public final C127586a f351390k;

    /* renamed from: l */
    public final C37215b f351391l;

    /* renamed from: m */
    public final C121090b f351392m;

    /* renamed from: n */
    public Duration f351393n = f351381u;

    /* renamed from: o */
    public C60870cx f351394o;

    /* renamed from: p */
    public C71643cp f351395p;

    /* renamed from: q */
    public final C71788b f351396q = new C71799m();

    /* renamed from: r */
    public final C47632e f351397r = new C47632e();

    /* renamed from: s */
    public C70868g f351398s;

    /* renamed from: v */
    private final C34091d f351399v;

    /* renamed from: w */
    private final C127649e f351400w;

    /* renamed from: x */
    private final KeyguardManager f351401x;

    /* renamed from: y */
    private final PowerManager f351402y;

    /* renamed from: z */
    private final C127653i f351403z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C127643ae(kotlinx.coroutines.C71422aw r17, p5462h.p5466c.C69585o r18, java.util.concurrent.Executor r19, kotlinx.coroutines.C71422aw r20, java.util.concurrent.Executor r21, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34091d r22, com.google.android.libraries.p1730f.C21370a r23, com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127485o r24, com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126874e r25, com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127649e r26, com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l r27, android.app.KeyguardManager r28, android.os.PowerManager r29, com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.C127586a r30, com.google.android.libraries.search.p2871b.C37215b r31, com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b r32, com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127653i r33) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
            java.lang.String r0 = "lightweightScope"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r0)
            java.lang.String r0 = "lightweightContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            java.lang.String r0 = "lightweightExecutor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r0)
            java.lang.String r0 = "backgroundScope"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)
            java.lang.String r0 = "backgroundExecutor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            java.lang.String r0 = "stub"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            java.lang.String r0 = "clock"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)
            java.lang.String r0 = "entryPointStub"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            java.lang.String r0 = "appActionsContextStub"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.lang.String r0 = "invocationResourceCleanup"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            java.lang.String r0 = "keyguardManager"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            java.lang.String r0 = "powerManager"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            java.lang.String r0 = "settingsChangeObservable"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r0)
            java.lang.String r0 = "appFlowLogger"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r0)
            java.lang.String r0 = "localeSettingsAccessor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r0)
            r0 = r16
            r0.<init>(r2)
            r0.f351382c = r1
            r0.f351383d = r3
            r0.f351384e = r4
            r0.f351385f = r5
            r0.f351399v = r6
            r0.f351386g = r7
            r0.f351387h = r8
            r0.f351388i = r9
            r1 = r26
            r0.f351400w = r1
            r0.f351389j = r10
            r0.f351401x = r11
            r0.f351402y = r12
            r0.f351390k = r13
            r0.f351391l = r14
            r0.f351392m = r15
            r1 = r33
            r0.f351403z = r1
            j$.time.Duration r1 = f351381u
            r0.f351393n = r1
            kotlinx.coroutines.j.m r1 = new kotlinx.coroutines.j.m
            r1.<init>()
            r0.f351396q = r1
            com.google.apps.tiktok.tracing.contrib.b.e r1 = new com.google.apps.tiktok.tracing.contrib.b.e
            r1.<init>()
            r0.f351397r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.<init>(kotlinx.coroutines.aw, h.c.o, java.util.concurrent.Executor, kotlinx.coroutines.aw, java.util.concurrent.Executor, com.google.android.libraries.search.assistant.invocation.o.a.d, com.google.android.libraries.f.a, com.google.android.apps.search.assistant.surfaces.voice.f.a.o, com.google.android.apps.search.assistant.surfaces.voice.a.a.e, com.google.android.apps.search.assistant.surfaces.voice.g.g.b.e, com.google.android.apps.search.assistant.surfaces.voice.g.c.l, android.app.KeyguardManager, android.os.PowerManager, com.google.android.apps.search.assistant.surfaces.voice.g.f.a, com.google.android.libraries.search.b.b, com.google.android.apps.search.assistant.platform.h.f.b, com.google.android.apps.search.assistant.surfaces.voice.g.g.b.i):void");
    }

    /* renamed from: i */
    public static final e m208655i(e eVar) {
        C34043bf bfVar = C34043bf.ENTRYPOINT_UNKNOWN;
        e eVar2 = e.a;
        int ordinal = eVar.ordinal();
        if (ordinal == 75) {
            return e.bn;
        }
        if (ordinal == 76) {
            return e.bo;
        }
        if (ordinal == 89) {
            return e.aM;
        }
        if (ordinal == 93) {
            return e.aQ;
        }
        if (ordinal == 95) {
            return e.aS;
        }
        if (ordinal == 98) {
            return e.bs;
        }
        if (ordinal != 124) {
            return ordinal != 125 ? eVar : e.br;
        }
        return e.bq;
    }

    /* renamed from: a */
    public final C60870cx mo108160a(C127613a aVar) {
        C69664n.m101061g(aVar, "connectReason");
        return C71663i.m104692e(this.f351382c, (C71424ay) null, new C127662r(this, aVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo108161b(C127637b bVar, List list) {
        C69664n.m101061g(bVar, "disconnectReason");
        C69664n.m101061g(list, "fcfFailureReasons");
        this.f351393n = f351381u;
        C60870cx cxVar = this.f351394o;
        if (C69664n.m101066l(cxVar != null ? Boolean.valueOf(cxVar.cancel(false)) : null, true)) {
            C59052c cVar = (C59052c) f351379a.mo56224b();
            cVar.mo56379ah(new C59094n(37558));
            cVar.mo56386p("Retrying job successfully cancelled.");
            this.f351394o = null;
        }
        C71643cp cpVar = this.f351395p;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        this.f351395p = null;
        return mo108162e(bVar, list);
    }

    /* renamed from: d */
    public final Object mo108153d(C127617d dVar) {
        C70868g gVar = this.f351398s;
        if (gVar != null) {
            C34115x xVar = (C34115x) C34117z.f90863d.createBuilder();
            C69664n.m101060f(xVar, "newBuilder()");
            C34012ab a = C69664n.m101061g(xVar, "builder");
            a.mo39186b(C34037b.CLIENT_MAIN_ASSISTANT);
            C34072ch chVar = (C34072ch) C34073ci.f90785f.createBuilder();
            C69664n.m101060f(chVar, "newBuilder()");
            C69664n.m101061g(chVar, "builder");
            if ((dVar.f351338a & 1) != 0) {
                String str = dVar.f351339b;
                C69664n.m101060f(str, "request.id");
                C69664n.m101061g(str, "value");
                chVar.copyOnWrite();
                C34073ci ciVar = (C34073ci) chVar.instance;
                str.getClass();
                ciVar.f90787a |= 1;
                ciVar.f90788b = str;
            }
            if ((dVar.f351338a & 2) != 0) {
                C34065ca caVar = dVar.f351340c;
                if (caVar == null) {
                    caVar = C34065ca.f90770i;
                }
                C69664n.m101060f(caVar, "request.resourceConfig");
                C69664n.m101061g(caVar, "value");
                chVar.copyOnWrite();
                C34073ci ciVar2 = (C34073ci) chVar.instance;
                caVar.getClass();
                ciVar2.f90790d = caVar;
                ciVar2.f90787a |= 4;
            }
            if ((dVar.f351338a & 4) != 0) {
                C34093db dbVar = dVar.f351341d;
                if (dbVar == null) {
                    dbVar = C34093db.f90828c;
                }
                C69664n.m101060f(dbVar, "request.sessionParameters");
                C69664n.m101061g(dbVar, "value");
                chVar.copyOnWrite();
                C34073ci ciVar3 = (C34073ci) chVar.instance;
                dbVar.getClass();
                ciVar3.f90791e = dbVar;
                ciVar3.f90787a |= 8;
            }
            C62942bv build = chVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C34073ci ciVar4 = (C34073ci) build;
            C69664n.m101061g(ciVar4, "value");
            C34115x xVar2 = a.f90662a;
            xVar2.copyOnWrite();
            C34117z zVar = (C34117z) xVar2.instance;
            ciVar4.getClass();
            zVar.f90866b = ciVar4;
            zVar.f90865a = 3;
            gVar.mo20123c(a.mo39185a());
            C59052c cVar = (C59052c) f351379a.mo56224b();
            cVar.mo56379ah(new C59094n(37552));
            cVar.mo56386p("Self Trigger Request Complete");
            C127620g gVar2 = (C127620g) C127621h.f351344a.createBuilder();
            C69664n.m101060f(gVar2, "newBuilder()");
            C69664n.m101061g(gVar2, "builder");
            C62942bv build2 = gVar2.build();
            C69664n.m101060f(build2, "_builder.build()");
            return (C127621h) build2;
        }
        C59052c cVar2 = (C59052c) f351379a.mo56225c();
        cVar2.mo56379ah(new C59094n(37553));
        cVar2.mo56386p("Self Trigger request received but client not connected, should not happen");
        throw new IllegalStateException("Client not connected, self triggering failed");
    }

    /* renamed from: e */
    public final C60870cx mo108162e(C127637b bVar, List list) {
        C69664n.m101061g(bVar, "disconnectReason");
        C69664n.m101061g(list, "fcfFailureReasons");
        return C71663i.m104692e(this.f351382c, (C71424ay) null, new C127664t(this, bVar, list, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2 A[SYNTHETIC, Splitter:B:30:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0152 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108163f(com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127663s
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.s r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127663s) r2
            int r3 = r2.f351481g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f351481g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.s r2 = new com.google.android.apps.search.assistant.surfaces.voice.g.g.b.s
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f351479e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f351481g
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x006c
            if (r4 == r8) goto L_0x0059
            if (r4 == r7) goto L_0x0045
            if (r4 == r6) goto L_0x003e
            if (r4 != r5) goto L_0x0036
            p5462h.C69714l.m101134b(r0)
            goto L_0x0153
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003e:
            java.lang.Object r4 = r2.f351475a
            p5462h.C69714l.m101134b(r0)
            goto L_0x012e
        L_0x0045:
            java.lang.Object r4 = r2.f351478d
            java.lang.Object r7 = r2.f351477c
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.q r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127661q) r7
            java.lang.Object r8 = r2.f351476b
            kotlinx.coroutines.j.b r8 = (kotlinx.coroutines.p5584j.C71788b) r8
            java.lang.Object r10 = r2.f351475a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0113
        L_0x0056:
            r0 = move-exception
            goto L_0x0157
        L_0x0059:
            java.lang.Object r4 = r2.f351477c
            kotlinx.coroutines.j.b r4 = (kotlinx.coroutines.p5584j.C71788b) r4
            java.lang.Object r8 = r2.f351476b
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.C127613a) r8
            java.lang.Object r10 = r2.f351475a
            p5462h.C69714l.m101134b(r0)
            r16 = r8
            r8 = r4
            r4 = r16
            goto L_0x0083
        L_0x006c:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f351396q
            r2.f351475a = r1
            r4 = r18
            r2.f351476b = r4
            r2.f351477c = r0
            r2.f351481g = r8
            java.lang.Object r8 = r0.mo63025b(r9, r2)
            if (r8 == r3) goto L_0x015b
            r8 = r0
            r10 = r1
        L_0x0083:
            com.google.common.f.e r0 = f351379a     // Catch:{ all -> 0x0056 }
            com.google.common.f.x r11 = r0.mo56224b()     // Catch:{ all -> 0x0056 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0056 }
            java.lang.String r12 = "Connect Reason: %s"
            java.lang.String r13 = r4.name()     // Catch:{ all -> 0x0056 }
            com.google.common.f.n r14 = new com.google.common.f.n     // Catch:{ all -> 0x0056 }
            r15 = 37548(0x92ac, float:5.2616E-41)
            r14.<init>(r15)     // Catch:{ all -> 0x0056 }
            r11.mo56379ah(r14)     // Catch:{ all -> 0x0056 }
            r11.mo56389s(r12, r13)     // Catch:{ all -> 0x0056 }
            r11 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r11     // Catch:{ all -> 0x0056 }
            io.grpc.i.g r11 = r11.f351398s     // Catch:{ all -> 0x0056 }
            if (r11 == 0) goto L_0x00c2
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0056 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0056 }
            java.lang.String r2 = "Connection is already active, ignoring connect signal"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0056 }
            r4 = 37550(0x92ae, float:5.2619E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x0056 }
            r0.mo56379ah(r3)     // Catch:{ all -> 0x0056 }
            r0.mo56386p(r2)     // Catch:{ all -> 0x0056 }
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x0056 }
            r8.mo63026c(r9)
            return r0
        L_0x00c2:
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0056 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0056 }
            java.lang.String r11 = "Connecting to Triggering Service."
            com.google.common.f.n r12 = new com.google.common.f.n     // Catch:{ all -> 0x0056 }
            r13 = 37549(0x92ad, float:5.2617E-41)
            r12.<init>(r13)     // Catch:{ all -> 0x0056 }
            r0.mo56379ah(r12)     // Catch:{ all -> 0x0056 }
            r0.mo56386p(r11)     // Catch:{ all -> 0x0056 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.q r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.g.b.q     // Catch:{ all -> 0x0056 }
            r11 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r11     // Catch:{ all -> 0x0056 }
            r0.<init>(r11, r4)     // Catch:{ all -> 0x0056 }
            r4 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r4     // Catch:{ all -> 0x0056 }
            com.google.android.libraries.search.assistant.invocation.o.a.d r4 = r4.f351399v     // Catch:{ all -> 0x0056 }
            io.grpc.i.aj r11 = com.google.apps.tiktok.tracing.contrib.grpc.C47686k.m84827a(r0)     // Catch:{ all -> 0x0056 }
            io.grpc.i.aj r4 = r4.mo39212b(r11)     // Catch:{ all -> 0x0056 }
            r11 = r4
            io.grpc.i.g r11 = (p5488io.grpc.p5533i.C70868g) r11     // Catch:{ all -> 0x0056 }
            r12 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r12     // Catch:{ all -> 0x0056 }
            r12.f351398s = r11     // Catch:{ all -> 0x0056 }
            r11 = r10
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r11     // Catch:{ all -> 0x0056 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.e r11 = r11.f351400w     // Catch:{ all -> 0x0056 }
            com.google.common.util.concurrent.cx r11 = r11.mo108166a()     // Catch:{ all -> 0x0056 }
            r2.f351475a = r10     // Catch:{ all -> 0x0056 }
            r2.f351476b = r8     // Catch:{ all -> 0x0056 }
            r2.f351477c = r0     // Catch:{ all -> 0x0056 }
            r2.f351478d = r4     // Catch:{ all -> 0x0056 }
            r2.f351481g = r7     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r2)     // Catch:{ all -> 0x0056 }
            if (r7 == r3) goto L_0x0156
            r16 = r7
            r7 = r0
            r0 = r16
        L_0x0113:
            io.grpc.i.g r4 = (p5488io.grpc.p5533i.C70868g) r4     // Catch:{ all -> 0x0056 }
            r4.mo20123c(r0)     // Catch:{ all -> 0x0056 }
            r8.mo63026c(r9)
            kotlinx.coroutines.z r0 = r7.f351471c
            r2.f351475a = r10
            r2.f351476b = r9
            r2.f351477c = r9
            r2.f351478d = r9
            r2.f351481g = r6
            java.lang.Object r0 = r0.mo62825a(r2)
            if (r0 == r3) goto L_0x0156
            r4 = r10
        L_0x012e:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r4
            com.google.android.libraries.search.b.b r0 = r4.f351391l
            com.google.android.libraries.search.b.i.f r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97271iR
            com.google.net.a.a.b r7 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r6 = r6.mo40805c(r7)
            com.google.common.util.concurrent.cx r0 = r0.mo19974a(r6)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "Failed while logging appflow."
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r7, r6)
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.i r0 = r4.f351403z
            r2.f351475a = r9
            r2.f351481g = r5
            java.lang.Object r0 = r0.mo108167a(r2)
            if (r0 != r3) goto L_0x0153
            return r3
        L_0x0153:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0156:
            return r3
        L_0x0157:
            r8.mo63026c(r9)
            throw r0
        L_0x015b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.mo108163f(com.google.android.apps.search.assistant.surfaces.voice.g.g.a, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108164g(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127665u
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.u r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127665u) r0
            int r1 = r0.f351492c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351492c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.u r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.g.b.u
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f351490a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351492c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.platform.h.f.b r5 = r4.f351392m
            com.google.common.util.concurrent.cx r5 = r5.mo105044b()
            java.lang.String r2 = "localeSettingsAccessor.primaryAssistantLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f351492c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 == r1) goto L_0x0074
        L_0x0045:
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r5 = r5.toLanguageTag()
            java.lang.String r0 = "currLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            int r1 = r5.length()
            if (r1 != 0) goto L_0x0070
            com.google.common.f.e r5 = f351379a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 37551(0x92af, float:5.262E-41)
            r1.<init>(r2)
            r5.mo56379ah(r1)
            java.lang.String r1 = "Primary locale is not received. Hardcoding to en-US"
            r5.mo56386p(r1)
            java.lang.String r5 = "en-US"
        L_0x0070:
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.mo108164g(h.c.g):java.lang.Object");
    }

    /* renamed from: h */
    public final boolean mo108165h() {
        return !this.f351402y.isInteractive() || this.f351401x.isKeyguardLocked();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094 A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[SYNTHETIC, Splitter:B:35:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108152c(com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127630q r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127670z
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.z r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127670z) r0
            int r1 = r0.f351507e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351507e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.z r0 = new com.google.android.apps.search.assistant.surfaces.voice.g.g.b.z
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f351505c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351507e
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            java.lang.Object r12 = r0.f351504b
            io.grpc.i.g r12 = (p5488io.grpc.p5533i.C70868g) r12
            java.lang.Object r0 = r0.f351503a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x0036 }
            goto L_0x00de
        L_0x0036:
            r12 = move-exception
            goto L_0x011b
        L_0x0039:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0041:
            java.lang.Object r12 = r0.f351504b
            kotlinx.coroutines.j.b r12 = (kotlinx.coroutines.p5584j.C71788b) r12
            java.lang.Object r2 = r0.f351503a
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae) r2
            p5462h.C69714l.m101134b(r13)
            goto L_0x0090
        L_0x004d:
            p5462h.C69714l.m101134b(r13)
            com.google.common.f.e r13 = f351379a
            com.google.common.f.x r2 = r13.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            int r7 = r12.f351357a
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.b r7 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b.m208619a(r7)
            if (r7 != 0) goto L_0x0062
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.b r7 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b.UNRECOGNIZED
        L_0x0062:
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 37554(0x92b2, float:5.2624E-41)
            r8.<init>(r9)
            r2.mo56379ah(r8)
            java.lang.String r8 = "starting updateConfig, reason: %s"
            r2.mo56389s(r8, r7)
            int r12 = r12.f351357a
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b.m208619a(r12)
            if (r12 != 0) goto L_0x007c
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b.UNRECOGNIZED
        L_0x007c:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.b r2 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127615b.UNKNOWN
            if (r12 == r2) goto L_0x011f
            kotlinx.coroutines.j.b r12 = r11.f351396q
            r0.f351503a = r11
            r0.f351504b = r12
            r0.f351507e = r5
            java.lang.Object r13 = r12.mo63025b(r6, r0)
            if (r13 != r1) goto L_0x008f
            return r1
        L_0x008f:
            r2 = r11
        L_0x0090:
            io.grpc.i.g r13 = r2.f351398s     // Catch:{ all -> 0x0118 }
            if (r13 != 0) goto L_0x00c8
            com.google.common.f.e r13 = f351379a     // Catch:{ all -> 0x0118 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0118 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "Client is currently disconnected as it is ineligible, ignoring config updates"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x0118 }
            r2 = 37556(0x92b4, float:5.2627E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x0118 }
            r13.mo56379ah(r1)     // Catch:{ all -> 0x0118 }
            r13.mo56386p(r0)     // Catch:{ all -> 0x0118 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.u r13 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127634u.f351359b     // Catch:{ all -> 0x0118 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x0118 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.t r13 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127633t) r13     // Catch:{ all -> 0x0118 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)     // Catch:{ all -> 0x0118 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.w r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")     // Catch:{ all -> 0x0118 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.a r0 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127614a.UPDATE_IGNORED_CLIENT_DISCONNECTED     // Catch:{ all -> 0x0118 }
            r13.mo108159b(r0)     // Catch:{ all -> 0x0118 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.u r13 = r13.mo108158a()     // Catch:{ all -> 0x0118 }
            r12.mo63026c(r6)
            return r13
        L_0x00c8:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.e r2 = r2.f351400w     // Catch:{ all -> 0x0118 }
            com.google.common.util.concurrent.cx r2 = r2.mo108166a()     // Catch:{ all -> 0x0118 }
            r0.f351503a = r12     // Catch:{ all -> 0x0118 }
            r0.f351504b = r13     // Catch:{ all -> 0x0118 }
            r0.f351507e = r4     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)     // Catch:{ all -> 0x0118 }
            if (r0 == r1) goto L_0x0117
            r10 = r0
            r0 = r12
            r12 = r13
            r13 = r10
        L_0x00de:
            com.google.android.libraries.search.assistant.invocation.o.a.z r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34117z) r13     // Catch:{ all -> 0x0036 }
            com.google.common.f.e r1 = f351379a     // Catch:{ all -> 0x0036 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0036 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "Updated config based on request %s"
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x0036 }
            r5 = 37555(0x92b3, float:5.2626E-41)
            r4.<init>(r5)     // Catch:{ all -> 0x0036 }
            r1.mo56379ah(r4)     // Catch:{ all -> 0x0036 }
            r1.mo56389s(r2, r13)     // Catch:{ all -> 0x0036 }
            r12.mo20123c(r13)     // Catch:{ all -> 0x0036 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.u r12 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127634u.f351359b     // Catch:{ all -> 0x0036 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x0036 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.t r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127633t) r12     // Catch:{ all -> 0x0036 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r3)     // Catch:{ all -> 0x0036 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.w r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")     // Catch:{ all -> 0x0036 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.a r13 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127614a.UPDATE_HANDLED     // Catch:{ all -> 0x0036 }
            r12.mo108159b(r13)     // Catch:{ all -> 0x0036 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.a.u r12 = r12.mo108158a()     // Catch:{ all -> 0x0036 }
            r0.mo63026c(r6)
            return r12
        L_0x0117:
            return r1
        L_0x0118:
            r13 = move-exception
            r0 = r12
            r12 = r13
        L_0x011b:
            r0.mo63026c(r6)
            throw r12
        L_0x011f:
            com.google.common.f.x r12 = r13.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r13 = new com.google.common.f.n
            r0 = 37557(0x92b5, float:5.2629E-41)
            r13.<init>(r0)
            r12.mo56379ah(r13)
            java.lang.String r13 = "UNRECOGNIZED is not valid configUpdate reason"
            r12.mo56386p(r13)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.mo108152c(com.google.android.apps.search.assistant.surfaces.voice.g.g.a.q, h.c.g):java.lang.Object");
    }
}
